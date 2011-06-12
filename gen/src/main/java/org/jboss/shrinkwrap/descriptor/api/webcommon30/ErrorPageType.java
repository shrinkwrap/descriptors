package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface ErrorPageType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ErrorPageType<T> setLocation(String location);

   public String getLocation();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ErrorPageType<T> setErrorCode(Integer errorCode);

   public Integer getErrorCode();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ErrorPageType<T> setExceptionType(String exceptionType);

   public String getExceptionType();

}
