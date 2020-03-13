package com.intrbiz.snmp.model.v3;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

import com.intrbiz.snmp.util.SNMPUtil;

public class USMSecurityParameters extends SecurityParameters
{
    public static int SECURITY_MODEL = 3;
    
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

    public USMSecurityParameters(byte[] data) throws IOException
    {
        super(data);
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
    public ASN1Encodable encode() throws IOException
    {
        // encode
        ASN1EncodableVector vec = new ASN1EncodableVector();
        vec.add(SNMPUtil.encodeByteString(this.authoritativeEngineId));
        vec.add(new ASN1Integer(this.authoritativeEngineBoots));
        vec.add(new ASN1Integer(this.authoritativeEngineTime));
        vec.add(SNMPUtil.encodeString(this.userName));
        vec.add(SNMPUtil.encodeByteString(this.authenticationParameters));
        vec.add(SNMPUtil.encodeByteString(this.privacyParameters));
        return new DERSequence(vec);
    }

    @Override
    public void decode(ASN1Primitive obj) throws IOException
    {
        ASN1Sequence seq = (ASN1Sequence) obj;
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
