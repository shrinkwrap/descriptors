package org.jboss.shrinkwrap.descriptor.spec.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;

/**
 * CDI bean descriptor
 * 
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
      "interceptors",
      "decorators",
      "alternatives",
      "extensions" })
@XmlRootElement(name = "beans")
public class Beans
{

   @XmlAnyElement(lax = true)
   protected List<Object> extensions;

   @XmlElementWrapper
   @XmlElement(name = "class")
   protected List<String> interceptors;

   @XmlElementWrapper
   @XmlElement(name = "class")
   protected List<String> decorators;

   protected Alternatives alternatives;

   public static String getNamespace()
   {
      return Beans.class.getPackage().getAnnotation(XmlSchema.class).namespace();
   }

   public List<Object> getExtensions()
   {
      if (extensions == null)
      {
         extensions = new ArrayList<Object>();
      }
      return this.extensions;
   }

   public List<String> getInterceptors()
   {
      if (interceptors == null)
      {
         interceptors = new ArrayList<String>();
      }
      return this.interceptors;
   }

   public List<String> getDecorators()
   {
      if (decorators == null)
      {
         decorators = new ArrayList<String>();
      }
      return this.decorators;
   }

   public Alternatives getAlternatives()
   {
      if (alternatives == null)
      {
         alternatives = new Alternatives();
      }
      return this.alternatives;
   }

   public String getSchemaLocation()
   {
      String namespace = Beans.getNamespace();
      return new StringBuilder().append(namespace).append(" ").append(namespace).append("/beans_1_0.xsd").toString();
   }
}
