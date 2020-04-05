
package org.ehcache.xml.model;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for cache-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cache-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ehcache.org/v3}base-cache-type"&gt;
 *       &lt;attribute name="alias" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="uses-template" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cache-type")
public class CacheType
    extends BaseCacheType
{

    @XmlAttribute(name = "alias", required = true)
    protected String alias;
    @XmlAttribute(name = "uses-template")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object usesTemplate;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the usesTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUsesTemplate() {
        return usesTemplate;
    }

    /**
     * Sets the value of the usesTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUsesTemplate(Object value) {
        this.usesTemplate = value;
    }

    public CacheType withAlias(String value) {
        setAlias(value);
        return this;
    }

    public CacheType withUsesTemplate(Object value) {
        setUsesTemplate(value);
        return this;
    }

    @Override
    public CacheType withKeyType(CacheEntryType value) {
        setKeyType(value);
        return this;
    }

    @Override
    public CacheType withValueType(CacheEntryType value) {
        setValueType(value);
        return this;
    }

    @Override
    public CacheType withExpiry(ExpiryType value) {
        setExpiry(value);
        return this;
    }

    @Override
    public CacheType withEvictionAdvisor(String value) {
        setEvictionAdvisor(value);
        return this;
    }

    @Override
    public CacheType withLoaderWriter(CacheLoaderWriterType value) {
        setLoaderWriter(value);
        return this;
    }

    @Override
    public CacheType withResilience(String value) {
        setResilience(value);
        return this;
    }

    @Override
    public CacheType withListeners(ListenersType value) {
        setListeners(value);
        return this;
    }

    @Override
    public CacheType withHeap(Heap value) {
        setHeap(value);
        return this;
    }

    @Override
    public CacheType withResources(ResourcesType value) {
        setResources(value);
        return this;
    }

    @Override
    public CacheType withHeapStoreSettings(SizeofType value) {
        setHeapStoreSettings(value);
        return this;
    }

    @Override
    public CacheType withDiskStoreSettings(DiskStoreSettingsType value) {
        setDiskStoreSettings(value);
        return this;
    }

    @Override
    public CacheType withServiceConfiguration(Element... values) {
        if (values!= null) {
            for (Element value: values) {
                getServiceConfiguration().add(value);
            }
        }
        return this;
    }

    @Override
    public CacheType withServiceConfiguration(Collection<Element> values) {
        if (values!= null) {
            getServiceConfiguration().addAll(values);
        }
        return this;
    }

}
