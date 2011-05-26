package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ParamValueType<T> extends Child<T>
{
   public ParamValueType<T> setDescription(String description);

   public String getDescription();

   public ParamValueType<T> setParamName(String paramName);

   public String getParamName();

   public ParamValueType<T> setParamValue(String paramValue);

   public String getParamValue();
}
