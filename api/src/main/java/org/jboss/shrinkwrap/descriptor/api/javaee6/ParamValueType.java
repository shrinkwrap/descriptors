package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface ParamValueType<T> extends Child<T>
{
   public ParamValueType<T> setDescription(String description);
   public String getDescription();

   public ParamValueType<T> setParamName(String paramName);
   public String getParamName();

   public ParamValueType<T> setParamValue(String paramValue);
   public String getParamValue();
}
