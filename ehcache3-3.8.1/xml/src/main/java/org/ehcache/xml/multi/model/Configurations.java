
package org.ehcache.xml.multi.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="configuration"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *                   &lt;element ref="{http://www.ehcache.org/v3}config"/&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="variant"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://www.ehcache.org/v3}config"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="identity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "configuration"
})
@XmlRootElement(name = "configurations")
public class Configurations {

    protected List<Configurations.Configuration> configuration;

    /**
     * Gets the value of the configuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Configurations.Configuration }
     * 
     * 
     */
    public List<Configurations.Configuration> getConfiguration() {
        if (configuration == null) {
            configuration = new ArrayList<Configurations.Configuration>();
        }
        return this.configuration;
    }

    public Configurations withConfiguration(Configurations.Configuration... values) {
        if (values!= null) {
            for (Configurations.Configuration value: values) {
                getConfiguration().add(value);
            }
        }
        return this;
    }

    public Configurations withConfiguration(Collection<Configurations.Configuration> values) {
        if (values!= null) {
            getConfiguration().addAll(values);
        }
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
     *         &lt;element ref="{http://www.ehcache.org/v3}config"/&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="variant"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://www.ehcache.org/v3}config"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="identity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "configOrVariant"
    })
    public static class Configuration {

        @XmlElementRef(name = "variant", namespace = "http://www.ehcache.org/v3/multi", type = JAXBElement.class, required = false)
        @XmlAnyElement
        protected List<Object> configOrVariant;
        @XmlAttribute(name = "identity", required = true)
        protected String identity;

        /**
         * Gets the value of the configOrVariant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the configOrVariant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfigOrVariant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Configurations.Configuration.Variant }{@code >}
         * {@link Element }
         * 
         * 
         */
        public List<Object> getConfigOrVariant() {
            if (configOrVariant == null) {
                configOrVariant = new ArrayList<Object>();
            }
            return this.configOrVariant;
        }

        /**
         * Gets the value of the identity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentity() {
            return identity;
        }

        /**
         * Sets the value of the identity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentity(String value) {
            this.identity = value;
        }

        public Configurations.Configuration withConfigOrVariant(Object... values) {
            if (values!= null) {
                for (Object value: values) {
                    getConfigOrVariant().add(value);
                }
            }
            return this;
        }

        public Configurations.Configuration withConfigOrVariant(Collection<Object> values) {
            if (values!= null) {
                getConfigOrVariant().addAll(values);
            }
            return this;
        }

        public Configurations.Configuration withIdentity(String value) {
            setIdentity(value);
            return this;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://www.ehcache.org/v3}config"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "config"
        })
        public static class Variant {

            @XmlAnyElement
            protected Element config;
            @XmlAttribute(name = "type", required = true)
            protected String type;

            /**
             * Gets the value of the config property.
             * 
             * @return
             *     possible object is
             *     {@link Element }
             *     
             */
            public Element getConfig() {
                return config;
            }

            /**
             * Sets the value of the config property.
             * 
             * @param value
             *     allowed object is
             *     {@link Element }
             *     
             */
            public void setConfig(Element value) {
                this.config = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            public Configurations.Configuration.Variant withConfig(Element value) {
                setConfig(value);
                return this;
            }

            public Configurations.Configuration.Variant withType(String value) {
                setType(value);
                return this;
            }

        }

    }

}
