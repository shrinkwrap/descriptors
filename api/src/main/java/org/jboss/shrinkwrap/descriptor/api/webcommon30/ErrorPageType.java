package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The error-pageType contains a mapping between an error code
 * or exception type to the path of a resource in the web
 * application.
 *
 * Error-page declarations using the exception-type element in
 * the deployment descriptor must be unique up to the class name of
 * the exception-type. Similarly, error-page declarations using the
 * status-code element must be unique in the deployment descriptor
 * up to the status code.
 *
 * Used in: web-app
 *
 *
 *
 */
public interface ErrorPageType<T> extends Child<T>
{

   public ErrorPageType<T> setLocation(String location);

   public ErrorPageType<T> removeLocation();

   public String getLocation();

   public ErrorPageType<T> setErrorCode(Integer errorCode);

   public ErrorPageType<T> removeErrorCode();

   public Integer getErrorCode();

   public ErrorPageType<T> setExceptionType(String exceptionType);

   public ErrorPageType<T> removeExceptionType();

   public String getExceptionType();

}
