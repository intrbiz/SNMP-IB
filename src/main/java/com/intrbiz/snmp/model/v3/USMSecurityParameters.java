package com.intrbiz.snmp.model.v3;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPV3Context;
import com.intrbiz.snmp.util.SNMPUtil;

public class USMSecurityParameters extends SecurityParameters
{
    private byte[] authoritativeEngineId;

    private int authoritativeEngineBoots;

    private int authoritativeEngineTime;

    private String userName;

    private byte[] authenticationParameters;

    private byte[] privacyParameters;

    public USMSecurityParameters()
    {
        super();
        this.userName = "";
        this.authenticationParameters = new byte[0];
        this.privacyParameters = new byte[0];
    }

    public USMSecurityParameters(byte[] data, SNMPContext ctx) throws IOException
    {
        super(data, ctx);
    }

    public byte[] getAuthoritativeEngineId()
    {
        return authoritativeEngineId;
    }

    public void setAuthoritativeEngineId(byte[] authoritativeEngineId)
    {
        this.authoritativeEngineId = authoritativeEngineId;
    }

    public int getAuthoritativeEngineBoots()
    {
        return authoritativeEngineBoots;
    }

    public void setAuthoritativeEngineBoots(int authoritativeEngineBoots)
    {
        this.authoritativeEngineBoots = authoritativeEngineBoots;
    }

    public int getAuthoritativeEngineTime()
    {
        return authoritativeEngineTime;
    }

    public void setAuthoritativeEngineTime(int authoritativeEngineTime)
    {
        this.authoritativeEngineTime = authoritativeEngineTime;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public byte[] getAuthenticationParameters()
    {
        return authenticationParameters;
    }

    public void setAuthenticationParameters(byte[] authenticationParameters)
    {
        this.authenticationParameters = authenticationParameters;
    }

    public byte[] getPrivacyParameters()
    {
        return privacyParameters;
    }

    public void setPrivacyParameters(byte[] privacyParameters)
    {
        this.privacyParameters = privacyParameters;
    }

    @Override
    public DEREncodable encode(SNMPContext ctx) throws IOException
    {
        if (ctx != null)
        {
            // update this model with engine boots, engine time
            SNMPV3Context v3ctx = (SNMPV3Context) ctx;
            this.authoritativeEngineBoots = v3ctx.getEngineBoots();
            this.authoritativeEngineTime  = v3ctx.getEngineTime();
        }
        // encode
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(SNMPUtil.encodeByteString(this.authoritativeEngineId));
        vec.add(new DERInteger(this.authoritativeEngineBoots));
        vec.add(new DERInteger(this.authoritativeEngineTime));
        vec.add(SNMPUtil.encodeString(this.userName));
        vec.add(SNMPUtil.encodeByteString(this.authenticationParameters));
        vec.add(SNMPUtil.encodeByteString(this.privacyParameters));
        return new DERSequence(vec);
    }

    @Override
    public void decode(DERObject obj, SNMPContext ctx) throws IOException
    {
        DERSequence seq = (DERSequence) obj;
        this.authoritativeEngineId = SNMPUtil.decodeByteString(seq, 0);
        this.authoritativeEngineBoots = SNMPUtil.decodeInt(seq, 1);
        this.authoritativeEngineTime = SNMPUtil.decodeInt(seq, 2);
        this.userName = SNMPUtil.decodeString(seq, 3);
        this.authenticationParameters = SNMPUtil.decodeByteString(seq, 4);
        this.privacyParameters = SNMPUtil.decodeByteString(seq, 5);
    }

    public String toString()
    {
        return " USMSecurityParameters[\n" + 
               "  authoritativeEngineId: " + SNMPUtil.dumpArray(this.authoritativeEngineId) + ";\n" + 
               "  authoritativeEngineBoots: " + this.authoritativeEngineBoots + ";\n" + 
               "  authoritativeEngineTime: " + this.authoritativeEngineTime + ";\n" + 
               "  userName: " + this.userName + ";\n" + 
               "  authenticationParameters: " + SNMPUtil.dumpArray(this.authenticationParameters) + ";\n" + 
               "  privacyParameters: " + SNMPUtil.dumpArray(this.privacyParameters) + ";\n" + 
               "]";
    }
}
