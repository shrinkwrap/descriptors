package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servlet-mappingType", propOrder = {
      "servletName",
      "urlPatterns"
})
public class ServletMapping
{
   protected String servletName;

   @XmlElement(name = "url-pattern")
   protected List<String> urlPatterns;

   public ServletMapping() {}
   
   public ServletMapping(String servletName, String... urlPatterns)
   {
      this.servletName = servletName;
      for (String urlPattern : urlPatterns)
      {
         getUrlPatterns().add(urlPattern);
      }
   }

   public String getServletName()
   {
      return servletName;
   }

   public void setServletName(String servletName)
   {
      this.servletName = servletName;
   }
   
   public List<String> getUrlPatterns()
   {
      if (urlPatterns == null)
      {
         urlPatterns = new ArrayList<String>();
      }
      return urlPatterns;
   }
}
