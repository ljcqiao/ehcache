
package org.ehcache.xml.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@SuppressWarnings({
    "unchecked",
    "serial"
})
public class Heap
    extends JAXBElement<ResourceType>
{

    protected final static QName NAME = new QName("http://www.ehcache.org/v3", "heap");

    public Heap(ResourceType value) {
        super(NAME, ((Class) ResourceType.class), null, value);
    }

    public Heap() {
        super(NAME, ((Class) ResourceType.class), null, null);
    }

}
