
package com.in28minutes.courses;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CoursePortService", targetNamespace = "http://in28minutes.com/courses", wsdlLocation = "http://localhost:8080/ws/courses.wsdl")
public class CoursePortService
    extends Service
{

    private final static URL COURSEPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException COURSEPORTSERVICE_EXCEPTION;
    private final static QName COURSEPORTSERVICE_QNAME = new QName("http://in28minutes.com/courses", "CoursePortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/courses.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COURSEPORTSERVICE_WSDL_LOCATION = url;
        COURSEPORTSERVICE_EXCEPTION = e;
    }

    public CoursePortService() {
        super(__getWsdlLocation(), COURSEPORTSERVICE_QNAME);
    }

    public CoursePortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COURSEPORTSERVICE_QNAME, features);
    }

    public CoursePortService(URL wsdlLocation) {
        super(wsdlLocation, COURSEPORTSERVICE_QNAME);
    }

    public CoursePortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COURSEPORTSERVICE_QNAME, features);
    }

    public CoursePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CoursePortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CoursePort
     */
    @WebEndpoint(name = "CoursePortSoap11")
    public CoursePort getCoursePortSoap11() {
        return super.getPort(new QName("http://in28minutes.com/courses", "CoursePortSoap11"), CoursePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CoursePort
     */
    @WebEndpoint(name = "CoursePortSoap11")
    public CoursePort getCoursePortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://in28minutes.com/courses", "CoursePortSoap11"), CoursePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COURSEPORTSERVICE_EXCEPTION!= null) {
            throw COURSEPORTSERVICE_EXCEPTION;
        }
        return COURSEPORTSERVICE_WSDL_LOCATION;
    }

}
