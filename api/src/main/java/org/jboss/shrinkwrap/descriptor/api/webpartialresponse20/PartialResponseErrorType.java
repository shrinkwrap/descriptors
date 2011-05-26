package org.jboss.shrinkwrap.descriptor.api.webpartialresponse20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface PartialResponseErrorType<T> extends Child<T>
{
   public PartialResponseErrorType<T> setErrorName(String errorName);

   public String getErrorName();

   public PartialResponseErrorType<T> setErrorMessage(String errorMessage);

   public String getErrorMessage();
}
