package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface ParamValueType<T> extends Child<T>
{

   public ParamValueType<T> setDescription(String description);

   public ParamValueType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public ParamValueType<T> setParamName(String paramName);

   public String getParamName();

   public ParamValueType<T> setParamValue(String paramValue);

   public String getParamValue();

}
