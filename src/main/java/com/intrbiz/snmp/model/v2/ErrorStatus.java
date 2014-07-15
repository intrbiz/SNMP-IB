package com.intrbiz.snmp.model.v2;


public enum ErrorStatus
{
    NO_ERROR,
    TOO_BIG,
    NO_SUCH_NAME,
    BAD_VALUE,
    READ_ONLY,
    GENERR,
    NO_ACCESS,
    WRONG_TYPE,
    WRONG_LENGTH,
    WRONG_ENCODING,
    WRONG_VALUE,
    NO_CREATION,
    INCONSISTENT_VALUE,
    RESOURCE_UNAVAILABLE,
    COMMIT_FAILED,
    UNDO_FAILED,
    AUTHORIZATION_ERROR,
    NOT_WRITABLE,
    INCONSISTENT_NAME;
    
    public int getCode()
    {
        return this.ordinal();
    }
    
    public static ErrorStatus valueOf(int code)
    {
        for (ErrorStatus es : ErrorStatus.values())
        {
            if (es.getCode() == code) return es;
        }
        return null;
    }
}
