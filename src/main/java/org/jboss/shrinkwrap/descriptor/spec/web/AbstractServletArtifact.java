package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
      "descriptions",
      "displayNames" })
public abstract class AbstractServletArtifact
{
   @XmlElement(name = "description")
   protected List<LocalizedText> descriptions;
   
   @XmlElement(name = "display-name")
   protected List<LocalizedText> displayNames;

   public List<LocalizedText> getDescriptions()
   {
      if (descriptions == null)
      {
         descriptions = new ArrayList<LocalizedText>();
      }
      return descriptions;
   }

   public List<LocalizedText> getDisplayNames()
   {
      if (displayNames == null)
      {
         displayNames = new ArrayList<LocalizedText>();
      }
      return displayNames;
   }
}
