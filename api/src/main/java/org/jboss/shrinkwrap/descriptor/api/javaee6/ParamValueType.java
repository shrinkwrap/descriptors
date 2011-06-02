package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ParamValueType<T> extends Child<T>
{
   public ParamValueType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public ParamValueType<T> setParamName(String paramName);

   @NodeInfo(xmlName = "param-name")
   public String getParamName();

   public ParamValueType<T> setParamValue(String paramValue);

   @NodeInfo(xmlName = "param-value")
   public String getParamValue();
}
