package org.jboss.shrinkwrap.descriptor.spec.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error-pageType", propOrder = {
      "errorCode",
      "exceptionClass",
      "location"
})
public class ErrorPage
{
   // FIXME this should be an enum
   // @see HttpServletResponse
   @XmlElement(name = "error-code")
   protected Integer errorCode;
   
   @XmlElement(name = "exception-type")
   protected String exceptionClass;
   
   @XmlElement(required = true)
   protected String location;

   public ErrorPage() {}
   
   public ErrorPage(int errorCode, String location)
   {
      this.errorCode = errorCode;
      this.location = location;
   }
   
   public ErrorPage(String exceptionClass, String location)
   {
      this.exceptionClass = exceptionClass;
      this.location = location;
   }
   
   public Integer getErrorCode()
   {
      return errorCode;
   }

   public void setErrorCode(Integer errorCode)
   {
      this.errorCode = errorCode;
   }

   public String getExceptionClass()
   {
      return exceptionClass;
   }

   public void setExceptionClass(String exceptionClazz)
   {
      this.exceptionClass = exceptionClazz;
   }

   public String getLocation()
   {
      return location;
   }

   public void setLocation(String location)
   {
      this.location = location;
   }
}
