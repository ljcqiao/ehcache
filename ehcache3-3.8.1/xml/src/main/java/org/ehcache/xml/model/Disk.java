
package org.ehcache.xml.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@SuppressWarnings({
    "unchecked",
    "serial"
})
public class Disk
    extends JAXBElement<PersistableMemoryType>
{

    protected final static QName NAME = new QName("http://www.ehcache.org/v3", "disk");

    public Disk(PersistableMemoryType value) {
        super(NAME, ((Class) PersistableMemoryType.class), null, value);
    }

    public Disk() {
        super(NAME, ((Class) PersistableMemoryType.class), null, null);
    }

}
