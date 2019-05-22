
package cis.bir.publ._2014._07.datacontract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cis.bir.publ._2014._07.datacontract package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and domain
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ParametryWyszukiwaniaKrs_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Krs");
    private final static QName _ParametryWyszukiwaniaKrsy_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Krsy");
    private final static QName _ParametryWyszukiwaniaNip_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Nip");
    private final static QName _ParametryWyszukiwaniaNipy_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Nipy");
    private final static QName _ParametryWyszukiwaniaRegon_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Regon");
    private final static QName _ParametryWyszukiwaniaRegony14Zn_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Regony14zn");
    private final static QName _ParametryWyszukiwaniaRegony9Zn_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Regony9zn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cis.bir.publ._2014._07.datacontract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParametryWyszukiwania }
     * 
     */
    public cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania createParametryWyszukiwania() {
        return new cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Krs", scope = cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaKrs(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaKrs_QNAME, String.class, cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Krsy", scope = cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaKrsy(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaKrsy_QNAME, String.class, cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Nip", scope = cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaNip(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaNip_QNAME, String.class, cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Nipy", scope = cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaNipy(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaNipy_QNAME, String.class, cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Regon", scope = cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaRegon(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaRegon_QNAME, String.class, cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Regony14zn", scope = cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaRegony14Zn(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaRegony14Zn_QNAME, String.class, cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Regony9zn", scope = cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaRegony9Zn(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaRegony9Zn_QNAME, String.class, cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania.class, value);
    }

}
