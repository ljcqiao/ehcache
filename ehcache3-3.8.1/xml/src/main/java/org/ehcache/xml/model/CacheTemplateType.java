
package org.ehcache.xml.model;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * <p>Java class for cache-template-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cache-template-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ehcache.org/v3}base-cache-type"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cache-template-type")
public class CacheTemplateType
    extends BaseCacheType
{

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public CacheTemplateType withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public CacheTemplateType withKeyType(CacheEntryType value) {
        setKeyType(value);
        return this;
    }

    @Override
    public CacheTemplateType withValueType(CacheEntryType value) {
        setValueType(value);
        return this;
    }

    @Override
    public CacheTemplateType withExpiry(ExpiryType value) {
        setExpiry(value);
        return this;
    }

    @Override
    public CacheTemplateType withEvictionAdvisor(String value) {
        setEvictionAdvisor(value);
        return this;
    }

    @Override
    public CacheTemplateType withLoaderWriter(CacheLoaderWriterType value) {
        setLoaderWriter(value);
        return this;
    }

    @Override
    public CacheTemplateType withResilience(String value) {
        setResilience(value);
        return this;
    }

    @Override
    public CacheTemplateType withListeners(ListenersType value) {
        setListeners(value);
        return this;
    }

    @Override
    public CacheTemplateType withHeap(Heap value) {
        setHeap(value);
        return this;
    }

    @Override
    public CacheTemplateType withResources(ResourcesType value) {
        setResources(value);
        return this;
    }

    @Override
    public CacheTemplateType withHeapStoreSettings(SizeofType value) {
        setHeapStoreSettings(value);
        return this;
    }

    @Override
    public CacheTemplateType withDiskStoreSettings(DiskStoreSettingsType value) {
        setDiskStoreSettings(value);
        return this;
    }

    @Override
    public CacheTemplateType withServiceConfiguration(Element... values) {
        if (values!= null) {
            for (Element value: values) {
                getServiceConfiguration().add(value);
            }
        }
        return this;
    }

    @Override
    public CacheTemplateType withServiceConfiguration(Collection<Element> values) {
        if (values!= null) {
            getServiceConfiguration().addAll(values);
        }
        return this;
    }

}
