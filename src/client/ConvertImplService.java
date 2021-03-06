
package client;

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
@WebServiceClient(name = "ConvertImplService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8888/ws/hello?wsdl")
public class ConvertImplService
    extends Service
{

    private final static URL CONVERTIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONVERTIMPLSERVICE_EXCEPTION;
    private final static QName CONVERTIMPLSERVICE_QNAME = new QName("http://ws/", "ConvertImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/ws/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERTIMPLSERVICE_WSDL_LOCATION = url;
        CONVERTIMPLSERVICE_EXCEPTION = e;
    }

    public ConvertImplService() {
        super(__getWsdlLocation(), CONVERTIMPLSERVICE_QNAME);
    }

    public ConvertImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERTIMPLSERVICE_QNAME, features);
    }

    public ConvertImplService(URL wsdlLocation) {
        super(wsdlLocation, CONVERTIMPLSERVICE_QNAME);
    }

    public ConvertImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERTIMPLSERVICE_QNAME, features);
    }

    public ConvertImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConvertImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Convert
     */
    @WebEndpoint(name = "ConvertImplPort")
    public Convert getConvertImplPort() {
        return super.getPort(new QName("http://ws/", "ConvertImplPort"), Convert.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Convert
     */
    @WebEndpoint(name = "ConvertImplPort")
    public Convert getConvertImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "ConvertImplPort"), Convert.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERTIMPLSERVICE_EXCEPTION!= null) {
            throw CONVERTIMPLSERVICE_EXCEPTION;
        }
        return CONVERTIMPLSERVICE_WSDL_LOCATION;
    }

}
