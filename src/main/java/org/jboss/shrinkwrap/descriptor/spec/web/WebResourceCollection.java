package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "web-resource-collectionType", propOrder = {
      "name",
      "descriptions",
      "urlPatterns",
      "httpMethods"
})
public class WebResourceCollection
{
   @XmlElement(name = "web-resource-name", required = true)
   protected String name;
   
   @XmlElement(name = "description")
   protected List<LocalizedText> descriptions;
   
   @XmlElement(name = "url-pattern", required = true)
   protected List<String> urlPatterns;
   
   @XmlElement(name = "http-method")
   protected List<String> httpMethods;

   public WebResourceCollection() {}
   
   public WebResourceCollection(String name) {
      this.name = name;
   }
   
   public WebResourceCollection(String name, String[] urlPatterns, String... httpMethods)
   {
      this.name = name;
      for (String p : urlPatterns) {
         getUrlPatterns().add(p);
      }
      for (String m : httpMethods) {
         getHttpMethods().add(m);
      }
   }
   
   public String getName()
   {
      return name;
   }

   public void setName(String webResourceName)
   {
      this.name = webResourceName;
   }
   
   public List<LocalizedText> getDescriptions()
   {
      if (descriptions == null)
      {
         descriptions = new ArrayList<LocalizedText>();
      }
      return descriptions;
   }

   public List<String> getUrlPatterns()
   {
      if (urlPatterns == null) {
         urlPatterns = new ArrayList<String>();
      }
      return urlPatterns;
   }

   public List<String> getHttpMethods()
   {
      if (httpMethods == null) {
         httpMethods = new ArrayList<String>();
      }
      return httpMethods;
   }

}
