package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface ErrorPageType<T> extends Child<T>
{
   public ErrorPageType<T> setLocation(String location);
   public String getLocation();

   public ErrorPageType<T> setErrorCode(Integer errorCode);
   public Integer getErrorCode();

   public ErrorPageType<T> setExceptionType(String exceptionType);
   public String getExceptionType();
}
