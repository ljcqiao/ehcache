
package org.ehcache.xml.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for resource-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource-type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
 *       &lt;attribute name="unit" type="{http://www.ehcache.org/v3}resource-unit" default="entries" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource-type", propOrder = {
    "value"
})
public class ResourceType {

    @XmlValue
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger value;
    @XmlAttribute(name = "unit")
    protected ResourceUnit unit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceUnit }
     *     
     */
    public ResourceUnit getUnit() {
        if (unit == null) {
            return ResourceUnit.ENTRIES;
        } else {
            return unit;
        }
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceUnit }
     *     
     */
    public void setUnit(ResourceUnit value) {
        this.unit = value;
    }

    public ResourceType withValue(BigInteger value) {
        setValue(value);
        return this;
    }

    public ResourceType withUnit(ResourceUnit value) {
        setUnit(value);
        return this;
    }

}
