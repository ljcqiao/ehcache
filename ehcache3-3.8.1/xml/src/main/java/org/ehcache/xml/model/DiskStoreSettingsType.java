
package org.ehcache.xml.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disk-store-settings-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disk-store-settings-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="thread-pool" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="writer-concurrency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" /&gt;
 *       &lt;attribute name="disk-segments" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="16" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disk-store-settings-type")
public class DiskStoreSettingsType {

    @XmlAttribute(name = "thread-pool")
    protected String threadPool;
    @XmlAttribute(name = "writer-concurrency")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger writerConcurrency;
    @XmlAttribute(name = "disk-segments")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger diskSegments;

    /**
     * Gets the value of the threadPool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadPool() {
        return threadPool;
    }

    /**
     * Sets the value of the threadPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadPool(String value) {
        this.threadPool = value;
    }

    /**
     * Gets the value of the writerConcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWriterConcurrency() {
        if (writerConcurrency == null) {
            return new BigInteger("1");
        } else {
            return writerConcurrency;
        }
    }

    /**
     * Sets the value of the writerConcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWriterConcurrency(BigInteger value) {
        this.writerConcurrency = value;
    }

    /**
     * Gets the value of the diskSegments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiskSegments() {
        if (diskSegments == null) {
            return new BigInteger("16");
        } else {
            return diskSegments;
        }
    }

    /**
     * Sets the value of the diskSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiskSegments(BigInteger value) {
        this.diskSegments = value;
    }

    public DiskStoreSettingsType withThreadPool(String value) {
        setThreadPool(value);
        return this;
    }

    public DiskStoreSettingsType withWriterConcurrency(BigInteger value) {
        setWriterConcurrency(value);
        return this;
    }

    public DiskStoreSettingsType withDiskSegments(BigInteger value) {
        setDiskSegments(value);
        return this;
    }

}
