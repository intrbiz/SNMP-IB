package com.intrbiz.snmp.model.v3;

import java.io.IOException;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPContextResolver;
import com.intrbiz.snmp.SNMPV3Context;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.model.PDU;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.util.SNMPUtil;

public class SNMPMessageV3 extends SNMPMessage
{
    private SNMPVersion version;

    private HeaderData header;

    private SecurityParameters securityParameters;

    private ScopedPDU scopedPdu;

    public SNMPMessageV3()
    {
        super();
        this.version = SNMPVersion.V3;
        this.header = new HeaderData();
        this.securityParameters = new USMSecurityParameters();
        this.scopedPdu = new ScopedPDU();
    }

    public SNMPMessageV3(byte[] in, SNMPContextResolver res) throws IOException
    {
        super(in, res);
    }

    @Override
    public SNMPVersion getVersion()
    {
        return version;
    }

    public void setVersion(SNMPVersion version)
    {
        this.version = version;
    }

    public HeaderData getHeader()
    {
        return header;
    }

    public void setHeader(HeaderData header)
    {
        this.header = header;
    }

    public SecurityParameters getSecurityParameters()
    {
        return securityParameters;
    }

    public void setSecurityParameters(SecurityParameters securityParameters)
    {
        this.securityParameters = securityParameters;
    }

    public ScopedPDU getScopedPdu()
    {
        return scopedPdu;
    }

    public void setScopedPdu(ScopedPDU scopedPdu)
    {
        this.scopedPdu = scopedPdu;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends PDU> T getPdu()
    {
        return (T) this.getScopedPdu().getPdu();
    }

    @Override
    public int getId()
    {
        return this.header.getId();
    }
    
    /**
     * Encode the message,
     */
    @Override
    public DEREncodable encode(SNMPContext<?> ctx) throws IOException
    {
        // we need a V3 context
        this.context = ctx;
        SNMPV3Context v3ctx = (SNMPV3Context) ctx;
        // prepare
        // ensure the security parameters have engine boots and time set
        if (this.header.isUserSecurityModel())
        {
            ((USMSecurityParameters) this.securityParameters).setAuthoritativeEngineBoots(v3ctx.getEngineBoots());
            ((USMSecurityParameters) this.securityParameters).setAuthoritativeEngineTime(v3ctx.computeCurrentEngineTime());
        }
        // encode
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(new DERInteger(this.version.getTag()));
        vec.add(this.header.encode());
        // security parameters
        vec.add(SNMPUtil.encodeByteString(this.securityParameters.encodeToBytes()));
        // data
        if (this.header.isPriv())
        {
            vec.add(SNMPUtil.encodeByteString(v3ctx.getPrivacyProvider().encrypt(this, this.scopedPdu.encodeToBytes())));
        }
        else
        {
            vec.add(this.scopedPdu.encode());
        }
        return new DERSequence(vec);
    }

    @Override
    public byte[] encodeToBytes(SNMPContext<?> ctx) throws IOException
    {
        // we need a V3 context
        this.context = ctx;
        SNMPV3Context v3ctx = (SNMPV3Context) ctx;
        // authenticate
        if (this.header.isAuth())
        {
            // ensure the auth params are zeroed
            ((USMSecurityParameters) this.securityParameters).setAuthenticationParameters(new byte[12]);
            // authenticate the message
            return v3ctx.getAuthProvider().hashMessage(this, super.encodeToBytes(ctx));
        }
        return super.encodeToBytes(ctx);
    }

    /**
     * Decode the message, but do not decrypt it if the message has privacy protection
     */
    public void decode(DERObject obj, SNMPContextResolver res) throws IOException
    {
        DERSequence seq = (DERSequence) obj;
        this.version = SNMPVersion.fromTag(SNMPUtil.decodeInt(seq, 0));
        this.header = new HeaderData((DERObject) SNMPUtil.decodeValue(seq, 1));
        // decode the security params
        if (this.header.isUserSecurityModel())
        {
            this.securityParameters = new USMSecurityParameters(SNMPUtil.decodeByteString(seq, 2));
        }
        else
        {
            throw new IOException("Currently only USM security model is supported");
        }
        // resolve the context
        SNMPV3Context v3ctx = (SNMPV3Context) res.lookupContext(this.header.getId(), ((USMSecurityParameters) this.securityParameters).getAuthoritativeEngineId());
        if (v3ctx == null) throw new IOException("Failed to resolve SNMP V3 context, cannot continue to decode the message, engine id: " + Arrays.toString(((USMSecurityParameters) this.securityParameters).getAuthoritativeEngineId()));
        this.context = v3ctx;
        // decode the PDU
        // NOTE: decryption is applied in a different phase
        if (this.header.isPriv())
        {
            this.scopedPdu = new ScopedPDU(v3ctx.getPrivacyProvider().decrypt(this, SNMPUtil.decodeByteString(seq, 3)));
        }
        else
        {
            this.scopedPdu = new ScopedPDU((DERObject) SNMPUtil.decodeValue(seq, 3));
        }
    }
    
    public void authenticateMessage() throws IOException
    {
        SNMPV3Context v3ctx = (SNMPV3Context) this.context;
        // check the validity of this message
        if (v3ctx.getAuthProvider().getAuthMode() != SNMPAuthMode.NONE)
        {
            // check the message hash
            if (!this.header.isAuth()) throw new IOException("Got unauthenticated message but an authenticated message was expected.");
            boolean authentic = v3ctx.getAuthProvider().authenticateMessage(this);
            Logger.getLogger(SNMPMessageV3.class).debug("Message is authentic: " + authentic);
            if (!authentic) throw new IOException("Message is not authentic!");
        }
    }

    public String toString()
    {
        return "SNMPMessage[\n" + " version: " + this.version + ";\n" + " header:" + this.header + ";\n" + " securityParameters: " + this.securityParameters + ";\n" + " scopedPdu: " + this.scopedPdu + ";\n" + "]";
    }
}
