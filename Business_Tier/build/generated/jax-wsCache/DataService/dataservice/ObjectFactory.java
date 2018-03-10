
package dataservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dataservice package. 
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

    private final static QName _AdminLogin_QNAME = new QName("http://DataService/", "AdminLogin");
    private final static QName _AdminLoginResponse_QNAME = new QName("http://DataService/", "AdminLoginResponse");
    private final static QName _Allanimalnames_QNAME = new QName("http://DataService/", "Allanimalnames");
    private final static QName _AllanimalnamesResponse_QNAME = new QName("http://DataService/", "AllanimalnamesResponse");
    private final static QName _Addanimal_QNAME = new QName("http://DataService/", "addanimal");
    private final static QName _AddanimalResponse_QNAME = new QName("http://DataService/", "addanimalResponse");
    private final static QName _Deleteanimal_QNAME = new QName("http://DataService/", "deleteanimal");
    private final static QName _DeleteanimalResponse_QNAME = new QName("http://DataService/", "deleteanimalResponse");
    private final static QName _Searchanimal_QNAME = new QName("http://DataService/", "searchanimal");
    private final static QName _SearchanimalResponse_QNAME = new QName("http://DataService/", "searchanimalResponse");
    private final static QName _Updateanimal_QNAME = new QName("http://DataService/", "updateanimal");
    private final static QName _UpdateanimalResponse_QNAME = new QName("http://DataService/", "updateanimalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dataservice
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link Allanimalnames }
     * 
     */
    public Allanimalnames createAllanimalnames() {
        return new Allanimalnames();
    }

    /**
     * Create an instance of {@link AllanimalnamesResponse }
     * 
     */
    public AllanimalnamesResponse createAllanimalnamesResponse() {
        return new AllanimalnamesResponse();
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
     * Create an instance of {@link Searchanimal }
     * 
     */
    public Searchanimal createSearchanimal() {
        return new Searchanimal();
    }

    /**
     * Create an instance of {@link SearchanimalResponse }
     * 
     */
    public SearchanimalResponse createSearchanimalResponse() {
        return new SearchanimalResponse();
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
     * Create an instance of {@link Animal }
     * 
     */
    public Animal createAnimal() {
        return new Animal();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "AdminLogin")
    public JAXBElement<AdminLogin> createAdminLogin(AdminLogin value) {
        return new JAXBElement<AdminLogin>(_AdminLogin_QNAME, AdminLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "AdminLoginResponse")
    public JAXBElement<AdminLoginResponse> createAdminLoginResponse(AdminLoginResponse value) {
        return new JAXBElement<AdminLoginResponse>(_AdminLoginResponse_QNAME, AdminLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Allanimalnames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Allanimalnames")
    public JAXBElement<Allanimalnames> createAllanimalnames(Allanimalnames value) {
        return new JAXBElement<Allanimalnames>(_Allanimalnames_QNAME, Allanimalnames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllanimalnamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "AllanimalnamesResponse")
    public JAXBElement<AllanimalnamesResponse> createAllanimalnamesResponse(AllanimalnamesResponse value) {
        return new JAXBElement<AllanimalnamesResponse>(_AllanimalnamesResponse_QNAME, AllanimalnamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addanimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "addanimal")
    public JAXBElement<Addanimal> createAddanimal(Addanimal value) {
        return new JAXBElement<Addanimal>(_Addanimal_QNAME, Addanimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddanimalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "addanimalResponse")
    public JAXBElement<AddanimalResponse> createAddanimalResponse(AddanimalResponse value) {
        return new JAXBElement<AddanimalResponse>(_AddanimalResponse_QNAME, AddanimalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deleteanimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "deleteanimal")
    public JAXBElement<Deleteanimal> createDeleteanimal(Deleteanimal value) {
        return new JAXBElement<Deleteanimal>(_Deleteanimal_QNAME, Deleteanimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteanimalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "deleteanimalResponse")
    public JAXBElement<DeleteanimalResponse> createDeleteanimalResponse(DeleteanimalResponse value) {
        return new JAXBElement<DeleteanimalResponse>(_DeleteanimalResponse_QNAME, DeleteanimalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Searchanimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "searchanimal")
    public JAXBElement<Searchanimal> createSearchanimal(Searchanimal value) {
        return new JAXBElement<Searchanimal>(_Searchanimal_QNAME, Searchanimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchanimalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "searchanimalResponse")
    public JAXBElement<SearchanimalResponse> createSearchanimalResponse(SearchanimalResponse value) {
        return new JAXBElement<SearchanimalResponse>(_SearchanimalResponse_QNAME, SearchanimalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updateanimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "updateanimal")
    public JAXBElement<Updateanimal> createUpdateanimal(Updateanimal value) {
        return new JAXBElement<Updateanimal>(_Updateanimal_QNAME, Updateanimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateanimalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "updateanimalResponse")
    public JAXBElement<UpdateanimalResponse> createUpdateanimalResponse(UpdateanimalResponse value) {
        return new JAXBElement<UpdateanimalResponse>(_UpdateanimalResponse_QNAME, UpdateanimalResponse.class, null, value);
    }

}
