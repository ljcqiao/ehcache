
package org.ehcache.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for service-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="service-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ehcache.org/v3}service-creation-configuration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service-type", propOrder = {
    "serviceCreationConfiguration"
})
public class ServiceType {

    @XmlAnyElement
    protected Element serviceCreationConfiguration;

    /**
     * Gets the value of the serviceCreationConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getServiceCreationConfiguration() {
        return serviceCreationConfiguration;
    }

    /**
     * Sets the value of the serviceCreationConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setServiceCreationConfiguration(Element value) {
        this.serviceCreationConfiguration = value;
    }

    public ServiceType withServiceCreationConfiguration(Element value) {
        setServiceCreationConfiguration(value);
        return this;
    }

}
