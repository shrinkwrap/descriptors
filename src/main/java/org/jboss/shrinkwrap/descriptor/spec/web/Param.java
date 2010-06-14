package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "param-valueType", propOrder = {
      "descriptions",
      "name",
      "value"
})
public class Param
{
   @XmlElement(name = "description")
   protected List<LocalizedText> descriptions;
   
   @XmlElement(name = "param-name", required = true)
   protected String name;
   
   @XmlElement(name = "param-value", required = true)
   protected String value;

   public Param() {}
   
   public Param(String name, String value)
   {
      this.name = name;
      this.value = value;
   }
   
   public List<LocalizedText> getDescriptions()
   {
      if (descriptions == null)
      {
         descriptions = new ArrayList<LocalizedText>();
      }
      return descriptions;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }

   public String getValue()
   {
      return value;
   }

   public void setValue(String value)
   {
      this.value = value;
   }
   
   
}
