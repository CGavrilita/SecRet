
package serversidepackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serversidepackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StoreUserRow_QNAME = new QName("http://ServerSidePackage/", "storeUserRow");
    private final static QName _HelloResponse_QNAME = new QName("http://ServerSidePackage/", "helloResponse");
    private final static QName _StoreUserRowResponse_QNAME = new QName("http://ServerSidePackage/", "storeUserRowResponse");
    private final static QName _Hello_QNAME = new QName("http://ServerSidePackage/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serversidepackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link StoreUserRowResponse }
     * 
     */
    public StoreUserRowResponse createStoreUserRowResponse() {
        return new StoreUserRowResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link StoreUserRow }
     * 
     */
    public StoreUserRow createStoreUserRow() {
        return new StoreUserRow();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link Row }
     * 
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreUserRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerSidePackage/", name = "storeUserRow")
    public JAXBElement<StoreUserRow> createStoreUserRow(StoreUserRow value) {
        return new JAXBElement<StoreUserRow>(_StoreUserRow_QNAME, StoreUserRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerSidePackage/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreUserRowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerSidePackage/", name = "storeUserRowResponse")
    public JAXBElement<StoreUserRowResponse> createStoreUserRowResponse(StoreUserRowResponse value) {
        return new JAXBElement<StoreUserRowResponse>(_StoreUserRowResponse_QNAME, StoreUserRowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerSidePackage/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
