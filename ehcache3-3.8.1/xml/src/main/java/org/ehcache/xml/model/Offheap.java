
package org.ehcache.xml.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@SuppressWarnings({
    "unchecked",
    "serial"
})
public class Offheap
    extends JAXBElement<MemoryType>
{

    protected final static QName NAME = new QName("http://www.ehcache.org/v3", "offheap");

    public Offheap(MemoryType value) {
        super(NAME, ((Class) MemoryType.class), null, value);
    }

    public Offheap() {
        super(NAME, ((Class) MemoryType.class), null, null);
    }

}
