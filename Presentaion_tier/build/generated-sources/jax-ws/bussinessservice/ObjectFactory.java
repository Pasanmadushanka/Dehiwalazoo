
package bussinessservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bussinessservice package. 
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

    private final static QName _Addanimal_QNAME = new QName("http://BussinessService/", "Addanimal");
    private final static QName _AddanimalResponse_QNAME = new QName("http://BussinessService/", "AddanimalResponse");
    private final static QName _AdminLogin_QNAME = new QName("http://BussinessService/", "AdminLogin");
    private final static QName _AdminLoginResponse_QNAME = new QName("http://BussinessService/", "AdminLoginResponse");
    private final static QName _Animalsnames_QNAME = new QName("http://BussinessService/", "Animalsnames");
    private final static QName _AnimalsnamesResponse_QNAME = new QName("http://BussinessService/", "AnimalsnamesResponse");
    private final static QName _Deleteanimal_QNAME = new QName("http://BussinessService/", "Deleteanimal");
    private final static QName _DeleteanimalResponse_QNAME = new QName("http://BussinessService/", "DeleteanimalResponse");
    private final static QName _Searchanimals_QNAME = new QName("http://BussinessService/", "Searchanimals");
    private final static QName _SearchanimalsResponse_QNAME = new QName("http://BussinessService/", "SearchanimalsResponse");
    private final static QName _SendingMessage_QNAME = new QName("http://BussinessService/", "SendingMessage");
    private final static QName _SendingMessageResponse_QNAME = new QName("http://BussinessService/", "SendingMessageResponse");
    private final static QName _Updateanimal_QNAME = new QName("http://BussinessService/", "updateanimal");
    private final static QName _UpdateanimalResponse_QNAME = new QName("http://BussinessService/", "updateanimalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bussinessservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Addanimal }
     * 
     */
    public Addanimal createAddanimal() {
        return new Addanimal();
    }

    /**
     * Create an instance of {@link AddanimalResponse }
     * 
     */
    public AddanimalResponse createAddanimalResponse() {
        return new AddanimalResponse();
    }

    /**
     * Create an instance of {@link AdminLogin }
     * 
     */
    public AdminLogin createAdminLogin() {
        return new AdminLogin();
    }

    /**
     * Create an instance of {@link AdminLoginResponse }
     * 
     */
    public AdminLoginResponse createAdminLoginResponse() {
        return new AdminLoginResponse();
    }

    /**
     * Create an instance of {@link Animalsnames }
     * 
     */
    public Animalsnames createAnimalsnames() {
        return new Animalsnames();
    }

    /**
     * Create an instance of {@link AnimalsnamesResponse }
     * 
     */
    public AnimalsnamesResponse createAnimalsnamesResponse() {
        return new AnimalsnamesResponse();
    }

    /**
     * Create an instance of {@link Deleteanimal }
     * 
     */
    public Deleteanimal createDeleteanimal() {
        return new Deleteanimal();
    }

    /**
     * Create an instance of {@link DeleteanimalResponse }
     * 
     */
    public DeleteanimalResponse createDeleteanimalResponse() {
        return new DeleteanimalResponse();
    }

    /**
     * Create an instance of {@link Searchanimals }
     * 
     */
    public Searchanimals createSearchanimals() {
        return new Searchanimals();
    }

    /**
     * Create an instance of {@link SearchanimalsResponse }
     * 
     */
    public SearchanimalsResponse createSearchanimalsResponse() {
        return new SearchanimalsResponse();
    }

    /**
     * Create an instance of {@link SendingMessage }
     * 
     */
    public SendingMessage createSendingMessage() {
        return new SendingMessage();
    }

    /**
     * Create an instance of {@link SendingMessageResponse }
     * 
     */
    public SendingMessageResponse createSendingMessageResponse() {
        return new SendingMessageResponse();
    }

    /**
     * Create an instance of {@link Updateanimal }
     * 
     */
    public Updateanimal createUpdateanimal() {
        return new Updateanimal();
    }

    /**
     * Create an instance of {@link UpdateanimalResponse }
     * 
     */
    public UpdateanimalResponse createUpdateanimalResponse() {
        return new UpdateanimalResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addanimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "Addanimal")
    public JAXBElement<Addanimal> createAddanimal(Addanimal value) {
        return new JAXBElement<Addanimal>(_Addanimal_QNAME, Addanimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddanimalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "AddanimalResponse")
    public JAXBElement<AddanimalResponse> createAddanimalResponse(AddanimalResponse value) {
        return new JAXBElement<AddanimalResponse>(_AddanimalResponse_QNAME, AddanimalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "AdminLogin")
    public JAXBElement<AdminLogin> createAdminLogin(AdminLogin value) {
        return new JAXBElement<AdminLogin>(_AdminLogin_QNAME, AdminLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "AdminLoginResponse")
    public JAXBElement<AdminLoginResponse> createAdminLoginResponse(AdminLoginResponse value) {
        return new JAXBElement<AdminLoginResponse>(_AdminLoginResponse_QNAME, AdminLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Animalsnames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "Animalsnames")
    public JAXBElement<Animalsnames> createAnimalsnames(Animalsnames value) {
        return new JAXBElement<Animalsnames>(_Animalsnames_QNAME, Animalsnames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnimalsnamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "AnimalsnamesResponse")
    public JAXBElement<AnimalsnamesResponse> createAnimalsnamesResponse(AnimalsnamesResponse value) {
        return new JAXBElement<AnimalsnamesResponse>(_AnimalsnamesResponse_QNAME, AnimalsnamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deleteanimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "Deleteanimal")
    public JAXBElement<Deleteanimal> createDeleteanimal(Deleteanimal value) {
        return new JAXBElement<Deleteanimal>(_Deleteanimal_QNAME, Deleteanimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteanimalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "DeleteanimalResponse")
    public JAXBElement<DeleteanimalResponse> createDeleteanimalResponse(DeleteanimalResponse value) {
        return new JAXBElement<DeleteanimalResponse>(_DeleteanimalResponse_QNAME, DeleteanimalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Searchanimals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "Searchanimals")
    public JAXBElement<Searchanimals> createSearchanimals(Searchanimals value) {
        return new JAXBElement<Searchanimals>(_Searchanimals_QNAME, Searchanimals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchanimalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "SearchanimalsResponse")
    public JAXBElement<SearchanimalsResponse> createSearchanimalsResponse(SearchanimalsResponse value) {
        return new JAXBElement<SearchanimalsResponse>(_SearchanimalsResponse_QNAME, SearchanimalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendingMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "SendingMessage")
    public JAXBElement<SendingMessage> createSendingMessage(SendingMessage value) {
        return new JAXBElement<SendingMessage>(_SendingMessage_QNAME, SendingMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendingMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "SendingMessageResponse")
    public JAXBElement<SendingMessageResponse> createSendingMessageResponse(SendingMessageResponse value) {
        return new JAXBElement<SendingMessageResponse>(_SendingMessageResponse_QNAME, SendingMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updateanimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "updateanimal")
    public JAXBElement<Updateanimal> createUpdateanimal(Updateanimal value) {
        return new JAXBElement<Updateanimal>(_Updateanimal_QNAME, Updateanimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateanimalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BussinessService/", name = "updateanimalResponse")
    public JAXBElement<UpdateanimalResponse> createUpdateanimalResponse(UpdateanimalResponse value) {
        return new JAXBElement<UpdateanimalResponse>(_UpdateanimalResponse_QNAME, UpdateanimalResponse.class, null, value);
    }

}
