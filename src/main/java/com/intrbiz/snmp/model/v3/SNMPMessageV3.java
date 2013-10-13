package com.intrbiz.snmp.model.v3;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPV3Context;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v2.PDU;
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

    public SNMPMessageV3(byte[] in, SNMPContext ctx) throws IOException
    {
        super(in, ctx);
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
    public PDU getPdu()
    {
        return this.getScopedPdu().getPdu();
    }

    @Override
    public int getId()
    {
        return this.header.getId();
    }

    public DEREncodable encode(SNMPContext ctx) throws IOException
    {
        // we need a V3 context
        SNMPV3Context v3ctx = (SNMPV3Context) ctx;
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(new DERInteger(this.version.getTag()));
        vec.add(this.header.encode(ctx));
        // security parameters
        vec.add(SNMPUtil.encodeByteString(this.securityParameters.encodeToBytes(ctx)));
        // data
        if (this.header.isPriv())
            vec.add(SNMPUtil.encodeByteString(v3ctx.getPrivacyProvider().encrypt(this, this.scopedPdu.encodeToBytes(ctx))));
        else
            vec.add(this.scopedPdu.encode(ctx));
        return new DERSequence(vec);
    }

    public void decode(DERObject obj, SNMPContext ctx) throws IOException
    {
        // we need a V3 context
        SNMPV3Context v3ctx = (SNMPV3Context) ctx;
        DERSequence seq = (DERSequence) obj;
        this.version = SNMPVersion.fromTag(SNMPUtil.decodeInt(seq, 0));
        this.header = new HeaderData((DERObject) SNMPUtil.decodeValue(seq, 1), ctx);
        // decode the security params
        if (this.header.getSecurityModel() == 3)
            this.securityParameters = new USMSecurityParameters(SNMPUtil.decodeByteString(seq, 2), ctx);
        else
            throw new IOException("Currently only USM security model is supported");
        // decode the PDU wrapper
        if (this.header.isPriv())
            this.scopedPdu = new ScopedPDU(v3ctx.getPrivacyProvider().decrypt(this, SNMPUtil.decodeByteString(seq, 3)), ctx);
        else
            this.scopedPdu = new ScopedPDU((DERObject) SNMPUtil.decodeValue(seq, 3), ctx);
        // check the validity of this message
        boolean authentic = v3ctx.getAuthProvider().authenticateMessage(this);
        Logger.getLogger(SNMPMessageV3.class).debug("Message is authentic: " + authentic);
        if (!authentic) throw new IOException("Message is not authentic!");
    }

    /**
     * Encode and authenticate this message
     */
    @Override
    public byte[] encodeToBytes(SNMPContext ctx) throws IOException
    {
        if (this.header.isAuth())
        {
            // ensure the auth params are zeroed
            ((USMSecurityParameters) this.securityParameters).setAuthenticationParameters(new byte[12]);
            // encode the message
            byte[] encoded = super.encodeToBytes(ctx);
            // authenticate the message
            return ((SNMPV3Context) ctx).getAuthProvider().hashMessage(this, encoded);
        }
        return super.encodeToBytes(ctx);
    }

    public String toString()
    {
        return "SNMPMessage[\n" + " version: " + this.version + ";\n" + " header:" + this.header + ";\n" + " securityParameters: " + this.securityParameters + ";\n" + " scopedPdu: " + this.scopedPdu + ";\n" + "]";
    }
}
