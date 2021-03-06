package org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01_wsdl.service;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01_wsdl.ServiceGroup;
import org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01_wsdl.ServiceGroupEntry;
import org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01_wsdl.ServiceGroupRegistration;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2013-04-11T11:24:42.497-04:00
 * Generated source version: 2.6.3
 * 
 */
@WebServiceClient(name = "ServiceGroupService", 
                  wsdlLocation = "/schema/org/cagrid/wsrf/servicegroup/WS-ServiceGroup_service.wsdl",
                  targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.wsdl/service") 
public class ServiceGroupService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.wsdl/service", "ServiceGroupService");
    public final static QName ServiceGroupPort = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.wsdl/service", "ServiceGroupPort");
    public final static QName ServiceGroupRegistrationPort = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.wsdl/service", "ServiceGroupRegistrationPort");
    public final static QName ServiceGroupEntryPort = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.wsdl/service", "ServiceGroupEntryPort");
    static {
        URL url = ServiceGroupService.class.getResource("/schema/org/cagrid/wsrf/servicegroup/WS-ServiceGroup_service.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ServiceGroupService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/schema/org/cagrid/wsrf/servicegroup/WS-ServiceGroup_service.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public ServiceGroupService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceGroupService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceGroupService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ServiceGroup
     */
    @WebEndpoint(name = "ServiceGroupPort")
    public ServiceGroup getServiceGroupPort() {
        return super.getPort(ServiceGroupPort, ServiceGroup.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceGroup
     */
    @WebEndpoint(name = "ServiceGroupPort")
    public ServiceGroup getServiceGroupPort(WebServiceFeature... features) {
        return super.getPort(ServiceGroupPort, ServiceGroup.class, features);
    }
    /**
     *
     * @return
     *     returns ServiceGroupRegistration
     */
    @WebEndpoint(name = "ServiceGroupRegistrationPort")
    public ServiceGroupRegistration getServiceGroupRegistrationPort() {
        return super.getPort(ServiceGroupRegistrationPort, ServiceGroupRegistration.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceGroupRegistration
     */
    @WebEndpoint(name = "ServiceGroupRegistrationPort")
    public ServiceGroupRegistration getServiceGroupRegistrationPort(WebServiceFeature... features) {
        return super.getPort(ServiceGroupRegistrationPort, ServiceGroupRegistration.class, features);
    }
    /**
     *
     * @return
     *     returns ServiceGroupEntry
     */
    @WebEndpoint(name = "ServiceGroupEntryPort")
    public ServiceGroupEntry getServiceGroupEntryPort() {
        return super.getPort(ServiceGroupEntryPort, ServiceGroupEntry.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceGroupEntry
     */
    @WebEndpoint(name = "ServiceGroupEntryPort")
    public ServiceGroupEntry getServiceGroupEntryPort(WebServiceFeature... features) {
        return super.getPort(ServiceGroupEntryPort, ServiceGroupEntry.class, features);
    }

}
