
package org.ehcache.xml.multi.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ehcache.xml.multi.model package. 
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

    private final static QName _ConfigurationsConfigurationVariant_QNAME = new QName("http://www.ehcache.org/v3/multi", "variant");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ehcache.xml.multi.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Configurations }
     * 
     */
    public Configurations createConfigurations() {
        return new Configurations();
    }

    /**
     * Create an instance of {@link Configurations.Configuration }
     * 
     */
    public Configurations.Configuration createConfigurationsConfiguration() {
        return new Configurations.Configuration();
    }

    /**
     * Create an instance of {@link Configurations.Configuration.Variant }
     * 
     */
    public Configurations.Configuration.Variant createConfigurationsConfigurationVariant() {
        return new Configurations.Configuration.Variant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configurations.Configuration.Variant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ehcache.org/v3/multi", name = "variant", scope = Configurations.Configuration.class)
    public JAXBElement<Configurations.Configuration.Variant> createConfigurationsConfigurationVariant(Configurations.Configuration.Variant value) {
        return new JAXBElement<Configurations.Configuration.Variant>(_ConfigurationsConfigurationVariant_QNAME, Configurations.Configuration.Variant.class, Configurations.Configuration.class, value);
    }

}
