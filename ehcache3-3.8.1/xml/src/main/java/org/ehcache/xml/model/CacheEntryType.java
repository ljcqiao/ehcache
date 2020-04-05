
package org.ehcache.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for cache-entry-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cache-entry-type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.ehcache.org/v3&gt;fqcn-type"&gt;
 *       &lt;attribute name="serializer" type="{http://www.ehcache.org/v3}fqcn-type" /&gt;
 *       &lt;attribute name="copier" type="{http://www.ehcache.org/v3}fqcn-type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cache-entry-type", propOrder = {
    "value"
})
public class CacheEntryType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "serializer")
    protected String serializer;
    @XmlAttribute(name = "copier")
    protected String copier;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the serializer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerializer() {
        return serializer;
    }

    /**
     * Sets the value of the serializer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerializer(String value) {
        this.serializer = value;
    }

    /**
     * Gets the value of the copier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopier() {
        return copier;
    }

    /**
     * Sets the value of the copier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopier(String value) {
        this.copier = value;
    }

    public CacheEntryType withValue(String value) {
        setValue(value);
        return this;
    }

    public CacheEntryType withSerializer(String value) {
        setSerializer(value);
        return this;
    }

    public CacheEntryType withCopier(String value) {
        setCopier(value);
        return this;
    }

}
