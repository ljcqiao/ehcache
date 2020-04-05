
package org.ehcache.xml.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for base-cache-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="base-cache-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key-type" type="{http://www.ehcache.org/v3}cache-entry-type" minOccurs="0"/&gt;
 *         &lt;element name="value-type" type="{http://www.ehcache.org/v3}cache-entry-type" minOccurs="0"/&gt;
 *         &lt;element name="expiry" type="{http://www.ehcache.org/v3}expiry-type" minOccurs="0"/&gt;
 *         &lt;element name="eviction-advisor" type="{http://www.ehcache.org/v3}fqcn-type" minOccurs="0"/&gt;
 *         &lt;element name="loader-writer" type="{http://www.ehcache.org/v3}cache-loader-writer-type" minOccurs="0"/&gt;
 *         &lt;element name="resilience" type="{http://www.ehcache.org/v3}fqcn-type" minOccurs="0"/&gt;
 *         &lt;element name="listeners" type="{http://www.ehcache.org/v3}listeners-type" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.ehcache.org/v3}heap"/&gt;
 *           &lt;element name="resources" type="{http://www.ehcache.org/v3}resources-type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="heap-store-settings" type="{http://www.ehcache.org/v3}sizeof-type" minOccurs="0"/&gt;
 *         &lt;element name="disk-store-settings" type="{http://www.ehcache.org/v3}disk-store-settings-type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ehcache.org/v3}service-configuration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "base-cache-type", propOrder = {
    "keyType",
    "valueType",
    "expiry",
    "evictionAdvisor",
    "loaderWriter",
    "resilience",
    "listeners",
    "heap",
    "resources",
    "heapStoreSettings",
    "diskStoreSettings",
    "serviceConfiguration"
})
@XmlSeeAlso({
    CacheType.class,
    CacheTemplateType.class
})
public abstract class BaseCacheType {

    @XmlElement(name = "key-type", defaultValue = "java.lang.Object")
    protected CacheEntryType keyType;
    @XmlElement(name = "value-type", defaultValue = "java.lang.Object")
    protected CacheEntryType valueType;
    protected ExpiryType expiry;
    @XmlElement(name = "eviction-advisor")
    protected String evictionAdvisor;
    @XmlElement(name = "loader-writer")
    protected CacheLoaderWriterType loaderWriter;
    protected String resilience;
    protected ListenersType listeners;
    @XmlElementRef(name = "heap", namespace = "http://www.ehcache.org/v3", type = Heap.class, required = false)
    protected Heap heap;
    protected ResourcesType resources;
    @XmlElement(name = "heap-store-settings")
    protected SizeofType heapStoreSettings;
    @XmlElement(name = "disk-store-settings")
    protected DiskStoreSettingsType diskStoreSettings;
    @XmlAnyElement
    protected List<Element> serviceConfiguration;

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link CacheEntryType }
     *     
     */
    public CacheEntryType getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CacheEntryType }
     *     
     */
    public void setKeyType(CacheEntryType value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link CacheEntryType }
     *     
     */
    public CacheEntryType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CacheEntryType }
     *     
     */
    public void setValueType(CacheEntryType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryType }
     *     
     */
    public ExpiryType getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryType }
     *     
     */
    public void setExpiry(ExpiryType value) {
        this.expiry = value;
    }

    /**
     * Gets the value of the evictionAdvisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvictionAdvisor() {
        return evictionAdvisor;
    }

    /**
     * Sets the value of the evictionAdvisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvictionAdvisor(String value) {
        this.evictionAdvisor = value;
    }

    /**
     * Gets the value of the loaderWriter property.
     * 
     * @return
     *     possible object is
     *     {@link CacheLoaderWriterType }
     *     
     */
    public CacheLoaderWriterType getLoaderWriter() {
        return loaderWriter;
    }

    /**
     * Sets the value of the loaderWriter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CacheLoaderWriterType }
     *     
     */
    public void setLoaderWriter(CacheLoaderWriterType value) {
        this.loaderWriter = value;
    }

    /**
     * Gets the value of the resilience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResilience() {
        return resilience;
    }

    /**
     * Sets the value of the resilience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResilience(String value) {
        this.resilience = value;
    }

    /**
     * Gets the value of the listeners property.
     * 
     * @return
     *     possible object is
     *     {@link ListenersType }
     *     
     */
    public ListenersType getListeners() {
        return listeners;
    }

    /**
     * Sets the value of the listeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListenersType }
     *     
     */
    public void setListeners(ListenersType value) {
        this.listeners = value;
    }

    /**
     * 
     *               Shortcut for configuring a heap Cache.
     *             
     * 
     * @return
     *     possible object is
     *     {@link Heap }
     *     
     */
    public Heap getHeap() {
        return heap;
    }

    /**
     * Sets the value of the heap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heap }
     *     
     */
    public void setHeap(Heap value) {
        this.heap = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcesType }
     *     
     */
    public ResourcesType getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcesType }
     *     
     */
    public void setResources(ResourcesType value) {
        this.resources = value;
    }

    /**
     * Gets the value of the heapStoreSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SizeofType }
     *     
     */
    public SizeofType getHeapStoreSettings() {
        return heapStoreSettings;
    }

    /**
     * Sets the value of the heapStoreSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeofType }
     *     
     */
    public void setHeapStoreSettings(SizeofType value) {
        this.heapStoreSettings = value;
    }

    /**
     * Gets the value of the diskStoreSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DiskStoreSettingsType }
     *     
     */
    public DiskStoreSettingsType getDiskStoreSettings() {
        return diskStoreSettings;
    }

    /**
     * Sets the value of the diskStoreSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiskStoreSettingsType }
     *     
     */
    public void setDiskStoreSettings(DiskStoreSettingsType value) {
        this.diskStoreSettings = value;
    }

    /**
     * Gets the value of the serviceConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getServiceConfiguration() {
        if (serviceConfiguration == null) {
            serviceConfiguration = new ArrayList<Element>();
        }
        return this.serviceConfiguration;
    }

    public BaseCacheType withKeyType(CacheEntryType value) {
        setKeyType(value);
        return this;
    }

    public BaseCacheType withValueType(CacheEntryType value) {
        setValueType(value);
        return this;
    }

    public BaseCacheType withExpiry(ExpiryType value) {
        setExpiry(value);
        return this;
    }

    public BaseCacheType withEvictionAdvisor(String value) {
        setEvictionAdvisor(value);
        return this;
    }

    public BaseCacheType withLoaderWriter(CacheLoaderWriterType value) {
        setLoaderWriter(value);
        return this;
    }

    public BaseCacheType withResilience(String value) {
        setResilience(value);
        return this;
    }

    public BaseCacheType withListeners(ListenersType value) {
        setListeners(value);
        return this;
    }

    public BaseCacheType withHeap(Heap value) {
        setHeap(value);
        return this;
    }

    public BaseCacheType withResources(ResourcesType value) {
        setResources(value);
        return this;
    }

    public BaseCacheType withHeapStoreSettings(SizeofType value) {
        setHeapStoreSettings(value);
        return this;
    }

    public BaseCacheType withDiskStoreSettings(DiskStoreSettingsType value) {
        setDiskStoreSettings(value);
        return this;
    }

    public BaseCacheType withServiceConfiguration(Element... values) {
        if (values!= null) {
            for (Element value: values) {
                getServiceConfiguration().add(value);
            }
        }
        return this;
    }

    public BaseCacheType withServiceConfiguration(Collection<Element> values) {
        if (values!= null) {
            getServiceConfiguration().addAll(values);
        }
        return this;
    }

}
