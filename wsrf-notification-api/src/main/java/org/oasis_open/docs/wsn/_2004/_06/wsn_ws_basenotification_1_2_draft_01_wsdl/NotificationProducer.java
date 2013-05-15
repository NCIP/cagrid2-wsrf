package org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01_wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2013-04-11T11:06:15.775-04:00
 * Generated source version: 2.6.3
 * 
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.wsdl", name = "NotificationProducer")
@XmlSeeAlso({org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.ObjectFactory.class, org.xmlsoap.schemas.ws._2004._03.addressing.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01.ObjectFactory.class})
public interface NotificationProducer {

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetCurrentMessageResponse", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", partName = "GetCurrentMessageResponse")
    @WebMethod(operationName = "GetCurrentMessage", action = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification/GetCurrentMessage")
    public org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.GetCurrentMessageResponse getCurrentMessage(
        @WebParam(partName = "GetCurrentMessageRequest", name = "GetCurrentMessage", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
        org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.GetCurrentMessage getCurrentMessageRequest
    ) throws ResourceUnknownFault, InvalidTopicExpressionFault, NoCurrentMessageOnTopicFault, TopicNotSupportedFault;

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetResourcePropertyResponse", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", partName = "GetResourcePropertyResponse")
    @WebMethod(operationName = "GetResourceProperty", action = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties/GetResourceProperty")
    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.GetResourcePropertyResponse getResourceProperty(
        @WebParam(partName = "GetResourcePropertyRequest", name = "GetResourceProperty", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd")
        javax.xml.namespace.QName getResourcePropertyRequest
    ) throws org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.ResourceUnknownFault, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.InvalidResourcePropertyQNameFault;

    @WebResult(name = "SubscriptionReference", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
    @RequestWrapper(localName = "Subscribe", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.Subscribe")
    @WebMethod(operationName = "Subscribe", action = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification/Subscribe")
    @ResponseWrapper(localName = "SubscribeResponse", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.SubscribeResponse")
    public org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType subscribe(
        @WebParam(name = "ConsumerReference", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
        org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType consumerReference,
        @WebParam(name = "TopicExpression", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
        org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.TopicExpressionType topicExpression,
        @WebParam(name = "UseNotify", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
        java.lang.Boolean useNotify,
        @WebParam(name = "Precondition", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
        org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.QueryExpressionType precondition,
        @WebParam(name = "Selector", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
        org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.QueryExpressionType selector,
        @WebParam(name = "SubscriptionPolicy", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
        java.lang.Object subscriptionPolicy,
        @WebParam(name = "InitialTerminationTime", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
        java.util.Calendar initialTerminationTime
    ) throws ResourceUnknownFault, SubscribeCreationFailedFault, InvalidTopicExpressionFault, TopicPathDialectUnknownFault, TopicNotSupportedFault;
}