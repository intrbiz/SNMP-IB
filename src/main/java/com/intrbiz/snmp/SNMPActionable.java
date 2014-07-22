package com.intrbiz.snmp;

import java.io.IOException;

import com.intrbiz.snmp.handler.OnCollatedTable;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnResponse;
import com.intrbiz.snmp.handler.OnTable;
import com.intrbiz.snmp.handler.OnValue;

/**
 * Actions which can be performed against an SNMP agent
 */
public interface SNMPActionable<T>
{
    // Get

    T get(OnResponse pduCallback, String... OIDs) throws IOException;
    
    T get(OnResponse pduCallback, OnError errorCallback, String... OIDs) throws IOException;
    
    T getValue(String oid, OnValue valueCallback) throws IOException;
    
    T getValue(String OIDs, OnValue valueCallback, OnError errorCallback) throws IOException;

    T get(String OID, OnResponse pduCallback) throws IOException;
    
    T get(String OID, OnResponse pduCallback, OnError errorCallback) throws IOException;
    
    T get(String[] OIDs, OnResponse pduCallback) throws IOException;

    T get(String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException;

    // Get Next
    
    T getNext(OnResponse pduCallback, String... OIDs) throws IOException;

    T getNext(OnResponse pduCallback, OnError errorCallback, String... OIDs) throws IOException;
    
    T getNext(String OID, OnResponse pduCallback) throws IOException;

    T getNext(String OID, OnResponse pduCallback, OnError errorCallback) throws IOException;
    
    T getNext(String[] OIDs, OnResponse pduCallback) throws IOException;

    T getNext(String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException;

    // Get Bulk
    
    T getBulk(OnResponse pduCallback, String... OIDs) throws IOException;

    T getBulk(OnResponse pduCallback, OnError errorCallback, String... OIDs) throws IOException;
    
    T getBulk(String OID, OnResponse pduCallback) throws IOException;

    T getBulk(String OID, OnResponse pduCallback, OnError errorCallback) throws IOException;
    
    T getBulk(String[] OIDs, OnResponse pduCallback) throws IOException;

    T getBulk(String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException;
    
    T getBulk(OnResponse pduCallback, int maxRepetitions, String... OIDs) throws IOException;

    T getBulk(OnResponse pduCallback, OnError errorCallback, int maxRepetitions, String... OIDs) throws IOException;
    
    T getBulk(int maxRepetitions, String OID, OnResponse pduCallback) throws IOException;

    T getBulk(int maxRepetitions, String OID, OnResponse pduCallback, OnError errorCallback) throws IOException;
    
    T getBulk(int maxRepetitions, String[] OIDs, OnResponse pduCallback) throws IOException;

    T getBulk(int maxRepetitions, String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException;
    
    T getBulk(OnResponse pduCallback, int nonRepeaters, int maxRepetitions, String... OIDs) throws IOException;

    T getBulk(OnResponse pduCallback, OnError errorCallback, int nonRepeaters, int maxRepetitions, String... OIDs) throws IOException;
    
    T getBulk(int nonRepeaters, int maxRepetitions, String[] OIDs, OnResponse pduCallback) throws IOException;

    T getBulk(int nonRepeaters, int maxRepetitions, String[] OIDs, OnResponse pduCallback, OnError errorCallback) throws IOException;

    // Walk
    
    T getTableBulk(String baseOID, int maxRepetitions, OnTable tableCallback) throws IOException;

    T getTableBulk(String baseOID, int maxRepetitions, OnTable tableCallback, OnError errorCallback) throws IOException;
    
    T getTableBulk(String baseOID, OnTable tableCallback) throws IOException;

    T getTableBulk(String baseOID, OnTable tableCallback, OnError errorCallback) throws IOException;
    
    T getTable(String baseOID, OnTable tableCallback) throws IOException;

    T getTable(String baseOID, OnTable tableCallback, OnError errorCallback) throws IOException;
    
    T getCollatedTableBulk(String[] baseOIDs, int maxRepetitions, OnCollatedTable tablesCallback) throws IOException;
    
    T getCollatedTableBulk(String[] baseOIDs, int maxRepetitions, OnCollatedTable tablesCallback, OnError errorCallback) throws IOException;
    
    T getCollatedTableBulk(String[] baseOIDs, OnCollatedTable tablesCallback) throws IOException;
    
    T getCollatedTableBulk(String[] baseOIDs, OnCollatedTable tablesCallback, OnError errorCallback) throws IOException;
    
    T getCollatedTable(String[] baseOIDs, int maxRepetitions, OnCollatedTable tablesCallback) throws IOException;
    
    T getCollatedTable(String[] baseOIDs, int maxRepetitions, OnCollatedTable tablesCallback, OnError errorCallback) throws IOException;
}
