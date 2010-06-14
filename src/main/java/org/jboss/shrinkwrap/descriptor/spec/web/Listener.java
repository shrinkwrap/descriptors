package org.jboss.shrinkwrap.descriptor.spec.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listenerType", propOrder = {
      "clazz"
})
public class Listener extends AbstractServletArtifact
{
   @XmlElement(name = "listener-class", required = true)
   protected String clazz;

   public Listener() {}
   
   public Listener(String clazz)
   {
      this.clazz = clazz;
   }
   
   public String getClazz()
   {
      return clazz;
   }

   public void setClazz(String clazz)
   {
      this.clazz = clazz;
   }
}
