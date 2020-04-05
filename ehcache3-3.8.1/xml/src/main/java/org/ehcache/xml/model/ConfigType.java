
package org.ehcache.xml.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for config-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="config-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="service" type="{http://www.ehcache.org/v3}service-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="default-serializers" type="{http://www.ehcache.org/v3}serializer-type" minOccurs="0"/&gt;
 *         &lt;element name="default-copiers" type="{http://www.ehcache.org/v3}copier-type" minOccurs="0"/&gt;
 *         &lt;element name="persistence" type="{http://www.ehcache.org/v3}persistence-type" minOccurs="0"/&gt;
 *         &lt;element name="thread-pools" type="{http://www.ehcache.org/v3}thread-pools-type" minOccurs="0"/&gt;
 *         &lt;element name="event-dispatch" type="{http://www.ehcache.org/v3}thread-pool-reference-type" minOccurs="0"/&gt;
 *         &lt;element name="write-behind" type="{http://www.ehcache.org/v3}thread-pool-reference-type" minOccurs="0"/&gt;
 *         &lt;element name="heap-store" type="{http://www.ehcache.org/v3}sizeof-type" minOccurs="0"/&gt;
 *         &lt;element name="disk-store" type="{http://www.ehcache.org/v3}thread-pool-reference-type" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="cache" type="{http://www.ehcache.org/v3}cache-type"/&gt;
 *           &lt;element name="cache-template" type="{http://www.ehcache.org/v3}cache-template-type"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "config-type", propOrder = {
    "service",
    "defaultSerializers",
    "defaultCopiers",
    "persistence",
    "threadPools",
    "eventDispatch",
    "writeBehind",
    "heapStore",
    "diskStore",
    "cacheOrCacheTemplate"
})
public class ConfigType {

    protected List<ServiceType> service;
    @XmlElement(name = "default-serializers")
    protected SerializerType defaultSerializers;
    @XmlElement(name = "default-copiers")
    protected CopierType defaultCopiers;
    protected PersistenceType persistence;
    @XmlElement(name = "thread-pools")
    protected ThreadPoolsType threadPools;
    @XmlElement(name = "event-dispatch")
    protected ThreadPoolReferenceType eventDispatch;
    @XmlElement(name = "write-behind")
    protected ThreadPoolReferenceType writeBehind;
    @XmlElement(name = "heap-store")
    protected SizeofType heapStore;
    @XmlElement(name = "disk-store")
    protected ThreadPoolReferenceType diskStore;
    @XmlElements({
        @XmlElement(name = "cache", type = CacheType.class),
        @XmlElement(name = "cache-template", type = CacheTemplateType.class)
    })
    protected List<BaseCacheType> cacheOrCacheTemplate;

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceType>();
        }
        return this.service;
    }

    /**
     * Gets the value of the defaultSerializers property.
     * 
     * @return
     *     possible object is
     *     {@link SerializerType }
     *     
     */
    public SerializerType getDefaultSerializers() {
        return defaultSerializers;
    }

    /**
     * Sets the value of the defaultSerializers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerializerType }
     *     
     */
    public void setDefaultSerializers(SerializerType value) {
        this.defaultSerializers = value;
    }

    /**
     * Gets the value of the defaultCopiers property.
     * 
     * @return
     *     possible object is
     *     {@link CopierType }
     *     
     */
    public CopierType getDefaultCopiers() {
        return defaultCopiers;
    }

    /**
     * Sets the value of the defaultCopiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopierType }
     *     
     */
    public void setDefaultCopiers(CopierType value) {
        this.defaultCopiers = value;
    }

    /**
     * Gets the value of the persistence property.
     * 
     * @return
     *     possible object is
     *     {@link PersistenceType }
     *     
     */
    public PersistenceType getPersistence() {
        return persistence;
    }

    /**
     * Sets the value of the persistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersistenceType }
     *     
     */
    public void setPersistence(PersistenceType value) {
        this.persistence = value;
    }

    /**
     * Gets the value of the threadPools property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadPoolsType }
     *     
     */
    public ThreadPoolsType getThreadPools() {
        return threadPools;
    }

    /**
     * Sets the value of the threadPools property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadPoolsType }
     *     
     */
    public void setThreadPools(ThreadPoolsType value) {
        this.threadPools = value;
    }

    /**
     * Gets the value of the eventDispatch property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadPoolReferenceType }
     *     
     */
    public ThreadPoolReferenceType getEventDispatch() {
        return eventDispatch;
    }

    /**
     * Sets the value of the eventDispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadPoolReferenceType }
     *     
     */
    public void setEventDispatch(ThreadPoolReferenceType value) {
        this.eventDispatch = value;
    }

    /**
     * Gets the value of the writeBehind property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadPoolReferenceType }
     *     
     */
    public ThreadPoolReferenceType getWriteBehind() {
        return writeBehind;
    }

    /**
     * Sets the value of the writeBehind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadPoolReferenceType }
     *     
     */
    public void setWriteBehind(ThreadPoolReferenceType value) {
        this.writeBehind = value;
    }

    /**
     * Gets the value of the heapStore property.
     * 
     * @return
     *     possible object is
     *     {@link SizeofType }
     *     
     */
    public SizeofType getHeapStore() {
        return heapStore;
    }

    /**
     * Sets the value of the heapStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeofType }
     *     
     */
    public void setHeapStore(SizeofType value) {
        this.heapStore = value;
    }

    /**
     * Gets the value of the diskStore property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadPoolReferenceType }
     *     
     */
    public ThreadPoolReferenceType getDiskStore() {
        return diskStore;
    }

    /**
     * Sets the value of the diskStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadPoolReferenceType }
     *     
     */
    public void setDiskStore(ThreadPoolReferenceType value) {
        this.diskStore = value;
    }

    /**
     * Gets the value of the cacheOrCacheTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cacheOrCacheTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCacheOrCacheTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CacheType }
     * {@link CacheTemplateType }
     * 
     * 
     */
    public List<BaseCacheType> getCacheOrCacheTemplate() {
        if (cacheOrCacheTemplate == null) {
            cacheOrCacheTemplate = new ArrayList<BaseCacheType>();
        }
        return this.cacheOrCacheTemplate;
    }

    public ConfigType withService(ServiceType... values) {
        if (values!= null) {
            for (ServiceType value: values) {
                getService().add(value);
            }
        }
        return this;
    }

    public ConfigType withService(Collection<ServiceType> values) {
        if (values!= null) {
            getService().addAll(values);
        }
        return this;
    }

    public ConfigType withDefaultSerializers(SerializerType value) {
        setDefaultSerializers(value);
        return this;
    }

    public ConfigType withDefaultCopiers(CopierType value) {
        setDefaultCopiers(value);
        return this;
    }

    public ConfigType withPersistence(PersistenceType value) {
        setPersistence(value);
        return this;
    }

    public ConfigType withThreadPools(ThreadPoolsType value) {
        setThreadPools(value);
        return this;
    }

    public ConfigType withEventDispatch(ThreadPoolReferenceType value) {
        setEventDispatch(value);
        return this;
    }

    public ConfigType withWriteBehind(ThreadPoolReferenceType value) {
        setWriteBehind(value);
        return this;
    }

    public ConfigType withHeapStore(SizeofType value) {
        setHeapStore(value);
        return this;
    }

    public ConfigType withDiskStore(ThreadPoolReferenceType value) {
        setDiskStore(value);
        return this;
    }

    public ConfigType withCacheOrCacheTemplate(BaseCacheType... values) {
        if (values!= null) {
            for (BaseCacheType value: values) {
                getCacheOrCacheTemplate().add(value);
            }
        }
        return this;
    }

    public ConfigType withCacheOrCacheTemplate(Collection<BaseCacheType> values) {
        if (values!= null) {
            getCacheOrCacheTemplate().addAll(values);
        }
        return this;
    }

}
