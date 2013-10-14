# SNMP-IB
A minimalist non-blocking SNMP V2c and V3 protocol library

## About
SNMP-IB is a minimalist non-blocking SNMP version 2c and 3 implementation.  It 
currently only implements a small subset of SNMP, enough to be able to pull 
information from things.

I started writing this as a way to get to understand SNMP better, I figured it 
calls its self simple it can't be that hard.  To an extent getting version 2c 
implemented was simple - I had a working implementation after an evenings work. 
Version 3 took a little longer, mainly getting my head around the bat shit 
crazy design by committee which is version 3.

I wanted the library to be clean and simple to use.  It makes use of Java NIO at 
the network level and as such is non-blocking, callback based.  One instance 
(and thread) is capable of efficiently communicating with many devices.

### What does it support
SNMP-IB currently offers: Get, GetNext, GetBulk and Set requests for both V2c 
and V3.  Only the user security model of V3 is supported.  With V3, MD5 and SHA1 
are supported for authentication and DES (56bit) and AES (128bit) are supported 
for privacy.

The code is currently experimental, it only implements the basics that I need 
at the moment. I'm planning to add more features going forward - trap handling 
etc - ByteBuffer based ASN.1/BER decoding and encoding (currently BouncyCastle 
is used for BER handling).

### Using SNMP-IB
A key design goal was creating a simple, clean API which is easy to use, the 
following will fetch the system description and uptime from two devices:

        // Create the transport which will be used to send our SNMP messages
        SNMPTransport transport = SNMPTransport.open();
        
        // A context represents an Agent we are going to contact, or which is going to contact us
        SNMPV2Context lcAgent  = transport.openV2Context("127.0.0.1").setCommunity("public");
        SNMPV2Context swAgent  = transport.openV2Context("172.30.12.1").setCommunity("public");
        
        // Use the context to send messages
        // The callback will be executed when a response to a request is received
        lcAgent.get(new ResponseHandler.LoggingHandler(), "1.3.6.1.2.1.1.1.0", "1.3.6.1.2.1.1.3.0");
        swAgent.get(new ResponseHandler.LoggingHandler(), "1.3.6.1.2.1.1.1.0", "1.3.6.1.2.1.1.3.0");
        
        // Run our transport to send and receive messages
        transport.run();

The SNMPContext is the key abstraction, to send requests to a device use the 
methods provided by the SNMPContext instance.

Have a look at the examples package and feel free to have a play around.


### Naming
The name amused me, it can mean a number of things: SNMP is bad, 
SNMP is bolloxed, SNMP implemented badly, etc.

## License
SNMP-IB
Copyright (c) 2005, Chris Ellis
All rights reserved.

SNMP-IB is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

SNMP-IB is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with SNMP-IB.  If not, see <http://www.gnu.org/licenses/>.


## Author
Chris Ellis

Twitter: @intrbiz

Web: balsa-framework.org or intrbiz.com

Copyright (c) Chris Ellis 2013