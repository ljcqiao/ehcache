
package org.ehcache.xml.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listeners-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listeners-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listener" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="class" type="{http://www.ehcache.org/v3}fqcn-type"/&gt;
 *                   &lt;element name="event-firing-mode" type="{http://www.ehcache.org/v3}event-firing-type"/&gt;
 *                   &lt;element name="event-ordering-mode" type="{http://www.ehcache.org/v3}event-ordering-type"/&gt;
 *                   &lt;element name="events-to-fire-on" type="{http://www.ehcache.org/v3}event-type" maxOccurs="5"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dispatcher-thread-pool" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listeners-type", propOrder = {
    "listener"
})
public class ListenersType {

    protected List<ListenersType.Listener> listener;
    @XmlAttribute(name = "dispatcher-thread-pool")
    protected String dispatcherThreadPool;

    /**
     * Gets the value of the listener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListenersType.Listener }
     * 
     * 
     */
    public List<ListenersType.Listener> getListener() {
        if (listener == null) {
            listener = new ArrayList<ListenersType.Listener>();
        }
        return this.listener;
    }

    /**
     * Gets the value of the dispatcherThreadPool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatcherThreadPool() {
        return dispatcherThreadPool;
    }

    /**
     * Sets the value of the dispatcherThreadPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatcherThreadPool(String value) {
        this.dispatcherThreadPool = value;
    }

    public ListenersType withListener(ListenersType.Listener... values) {
        if (values!= null) {
            for (ListenersType.Listener value: values) {
                getListener().add(value);
            }
        }
        return this;
    }

    public ListenersType withListener(Collection<ListenersType.Listener> values) {
        if (values!= null) {
            getListener().addAll(values);
        }
        return this;
    }

    public ListenersType withDispatcherThreadPool(String value) {
        setDispatcherThreadPool(value);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="class" type="{http://www.ehcache.org/v3}fqcn-type"/&gt;
     *         &lt;element name="event-firing-mode" type="{http://www.ehcache.org/v3}event-firing-type"/&gt;
     *         &lt;element name="event-ordering-mode" type="{http://www.ehcache.org/v3}event-ordering-type"/&gt;
     *         &lt;element name="events-to-fire-on" type="{http://www.ehcache.org/v3}event-type" maxOccurs="5"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clazz",
        "eventFiringMode",
        "eventOrderingMode",
        "eventsToFireOn"
    })
    public static class Listener {

        @XmlElement(name = "class", required = true)
        protected String clazz;
        @XmlElement(name = "event-firing-mode", required = true)
        @XmlSchemaType(name = "string")
        protected EventFiringType eventFiringMode;
        @XmlElement(name = "event-ordering-mode", required = true)
        @XmlSchemaType(name = "string")
        protected EventOrderingType eventOrderingMode;
        @XmlElement(name = "events-to-fire-on", required = true)
        @XmlSchemaType(name = "string")
        protected List<EventType> eventsToFireOn;

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClazz(String value) {
            this.clazz = value;
        }

        /**
         * Gets the value of the eventFiringMode property.
         * 
         * @return
         *     possible object is
         *     {@link EventFiringType }
         *     
         */
        public EventFiringType getEventFiringMode() {
            return eventFiringMode;
        }

        /**
         * Sets the value of the eventFiringMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link EventFiringType }
         *     
         */
        public void setEventFiringMode(EventFiringType value) {
            this.eventFiringMode = value;
        }

        /**
         * Gets the value of the eventOrderingMode property.
         * 
         * @return
         *     possible object is
         *     {@link EventOrderingType }
         *     
         */
        public EventOrderingType getEventOrderingMode() {
            return eventOrderingMode;
        }

        /**
         * Sets the value of the eventOrderingMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link EventOrderingType }
         *     
         */
        public void setEventOrderingMode(EventOrderingType value) {
            this.eventOrderingMode = value;
        }

        /**
         * Gets the value of the eventsToFireOn property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventsToFireOn property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventsToFireOn().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventType }
         * 
         * 
         */
        public List<EventType> getEventsToFireOn() {
            if (eventsToFireOn == null) {
                eventsToFireOn = new ArrayList<EventType>();
            }
            return this.eventsToFireOn;
        }

        public ListenersType.Listener withClazz(String value) {
            setClazz(value);
            return this;
        }

        public ListenersType.Listener withEventFiringMode(EventFiringType value) {
            setEventFiringMode(value);
            return this;
        }

        public ListenersType.Listener withEventOrderingMode(EventOrderingType value) {
            setEventOrderingMode(value);
            return this;
        }

        public ListenersType.Listener withEventsToFireOn(EventType... values) {
            if (values!= null) {
                for (EventType value: values) {
                    getEventsToFireOn().add(value);
                }
            }
            return this;
        }

        public ListenersType.Listener withEventsToFireOn(Collection<EventType> values) {
            if (values!= null) {
                getEventsToFireOn().addAll(values);
            }
            return this;
        }

    }

}
