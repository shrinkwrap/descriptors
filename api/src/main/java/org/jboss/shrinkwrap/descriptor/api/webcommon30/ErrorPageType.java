package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ErrorPageType<T> extends Child<T>
{
   public ErrorPageType<T> setLocation(String location);

   @NodeInfo(xmlName = "location")
   public String getLocation();

   public ErrorPageType<T> setErrorCode(Integer errorCode);

   @NodeInfo(xmlName = "error-code")
   public Integer getErrorCode();

   public ErrorPageType<T> setExceptionType(Class<?> exceptionType);

   public ErrorPageType<T> setExceptionType(String exceptionType);

   @NodeInfo(xmlName = "exception-type")
   public String getExceptionType();
}
