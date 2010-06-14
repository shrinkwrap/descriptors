package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filterType", propOrder = {
      "name",
      "clazz",
      "initParams"
})
public class Filter extends AbstractServletArtifact
{
   @XmlElement(name = "filter-name")
   private String name;
   
   @XmlElement(name = "filter-class")
   private String clazz;
   
   @XmlElement(name = "init-param")
   private List<Param> initParams;

   public Filter() {}
   
   public Filter(String name, String clazz)
   {
      this.name = name;
      this.clazz = clazz;
   }
   
   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getClazz()
   {
      return clazz;
   }

   public void setClazz(String clazz)
   {
      this.clazz = clazz;
   }
   
   public List<Param> getInitParams()
   {
      if (initParams == null) {
         initParams = new ArrayList<Param>();
      }
      
      return initParams;
   }
   
}
