
package org.ehcache.xml.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for sizeof-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sizeof-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="max-object-graph-size" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="max-object-size" type="{http://www.ehcache.org/v3}memory-type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sizeof-type", propOrder = {
    "maxObjectGraphSize",
    "maxObjectSize"
})
public class SizeofType {

    @XmlElement(name = "max-object-graph-size", defaultValue = "1000")
    protected SizeofType.MaxObjectGraphSize maxObjectGraphSize;
    @XmlElement(name = "max-object-size", defaultValue = "9223372036854775807")
    protected MemoryType maxObjectSize;

    /**
     * Gets the value of the maxObjectGraphSize property.
     * 
     * @return
     *     possible object is
     *     {@link SizeofType.MaxObjectGraphSize }
     *     
     */
    public SizeofType.MaxObjectGraphSize getMaxObjectGraphSize() {
        return maxObjectGraphSize;
    }

    /**
     * Sets the value of the maxObjectGraphSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeofType.MaxObjectGraphSize }
     *     
     */
    public void setMaxObjectGraphSize(SizeofType.MaxObjectGraphSize value) {
        this.maxObjectGraphSize = value;
    }

    /**
     * Gets the value of the maxObjectSize property.
     * 
     * @return
     *     possible object is
     *     {@link MemoryType }
     *     
     */
    public MemoryType getMaxObjectSize() {
        return maxObjectSize;
    }

    /**
     * Sets the value of the maxObjectSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryType }
     *     
     */
    public void setMaxObjectSize(MemoryType value) {
        this.maxObjectSize = value;
    }

    public SizeofType withMaxObjectGraphSize(SizeofType.MaxObjectGraphSize value) {
        setMaxObjectGraphSize(value);
        return this;
    }

    public SizeofType withMaxObjectSize(MemoryType value) {
        setMaxObjectSize(value);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MaxObjectGraphSize {

        @XmlValue
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger value;

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

        public SizeofType.MaxObjectGraphSize withValue(BigInteger value) {
            setValue(value);
            return this;
        }

    }

}
