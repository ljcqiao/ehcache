
package org.ehcache.xml.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistable-memory-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistable-memory-type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.ehcache.org/v3&gt;memory-type"&gt;
 *       &lt;attribute name="persistent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistable-memory-type")
public class PersistableMemoryType
    extends MemoryType
{

    @XmlAttribute(name = "persistent")
    protected Boolean persistent;

    /**
     * Gets the value of the persistent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPersistent() {
        if (persistent == null) {
            return false;
        } else {
            return persistent;
        }
    }

    /**
     * Sets the value of the persistent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistent(Boolean value) {
        this.persistent = value;
    }

    public PersistableMemoryType withPersistent(Boolean value) {
        setPersistent(value);
        return this;
    }

    @Override
    public PersistableMemoryType withValue(BigInteger value) {
        setValue(value);
        return this;
    }

    @Override
    public PersistableMemoryType withUnit(MemoryUnit value) {
        setUnit(value);
        return this;
    }

}
