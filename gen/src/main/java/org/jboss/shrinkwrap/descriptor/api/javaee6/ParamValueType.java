package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface ParamValueType<T> extends Child<T>
{

   public ParamValueType<T> setDescription(String description);
   public ParamValueType<T> setDescriptionList(String ... values);
   public ParamValueType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public ParamValueType<T> setParamName(String paramName);
   public ParamValueType<T> removeParamName();

   public String getParamName();



   public ParamValueType<T> setParamValue(String paramValue);
   public ParamValueType<T> removeParamValue();

   public String getParamValue();

}
