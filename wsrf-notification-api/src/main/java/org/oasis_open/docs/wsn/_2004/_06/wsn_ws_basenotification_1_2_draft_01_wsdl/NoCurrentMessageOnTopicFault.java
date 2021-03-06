
package org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01_wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.3
 * 2013-04-11T11:06:15.618-04:00
 * Generated source version: 2.6.3
 */

@WebFault(name = "NoCurrentMessageOnTopicFault", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
public class NoCurrentMessageOnTopicFault extends Exception {
    
    private org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.NoCurrentMessageOnTopicFaultType noCurrentMessageOnTopicFault;

    public NoCurrentMessageOnTopicFault() {
        super();
    }
    
    public NoCurrentMessageOnTopicFault(String message) {
        super(message);
    }
    
    public NoCurrentMessageOnTopicFault(String message, Throwable cause) {
        super(message, cause);
    }

    public NoCurrentMessageOnTopicFault(String message, org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.NoCurrentMessageOnTopicFaultType noCurrentMessageOnTopicFault) {
        super(message);
        this.noCurrentMessageOnTopicFault = noCurrentMessageOnTopicFault;
    }

    public NoCurrentMessageOnTopicFault(String message, org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.NoCurrentMessageOnTopicFaultType noCurrentMessageOnTopicFault, Throwable cause) {
        super(message, cause);
        this.noCurrentMessageOnTopicFault = noCurrentMessageOnTopicFault;
    }

    public org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.NoCurrentMessageOnTopicFaultType getFaultInfo() {
        return this.noCurrentMessageOnTopicFault;
    }
}
