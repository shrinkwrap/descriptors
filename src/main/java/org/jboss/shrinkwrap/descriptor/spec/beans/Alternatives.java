package org.jboss.shrinkwrap.descriptor.spec.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * An alternative class or stereotype
 * 
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
      "classes",
      "stereotypes" })
@XmlRootElement(name = "alternatives")
public class Alternatives
{
   @XmlElement(name = "class")
   protected List<String> classes;

   @XmlElement(name = "stereotype")
   protected List<String> stereotypes;

   public List<String> getClasses()
   {
      if (classes == null)
      {
         classes = new ArrayList<String>();
      }
      return this.classes;
   }

   public List<String> getStereotypes()
   {
      if (stereotypes == null)
      {
         stereotypes = new ArrayList<String>();
      }
      return this.stereotypes;
   }
}
