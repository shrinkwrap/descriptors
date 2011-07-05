package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * This type is a general type that can be used to declare
 * parameter/value lists.
 *
 *
 *
 */
public interface ParamValueType<T> extends Child<T>
{

   public ParamValueType<T> setDescription(String description);

   public ParamValueType<T> setDescriptionList(String... values);

   public ParamValueType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public ParamValueType<T> setParamName(String paramName);

   public ParamValueType<T> removeParamName();

   public String getParamName();

   public ParamValueType<T> setParamValue(String paramValue);

   public ParamValueType<T> removeParamValue();

   public String getParamValue();

}
