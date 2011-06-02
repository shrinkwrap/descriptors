package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface MethodType<T> extends Child<T>
{
   public MethodType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public MethodType<T> setEjbName(String ejbName);

   @NodeInfo(xmlName = "ejb-name")
   public String getEjbName();

   public MethodType<T> setMethodIntf(MethodIntfType methodIntf);

   public MethodType<T> setMethodIntf(String methodIntf);

   @NodeInfo(xmlName = "method-intf")
   public String getMethodIntf();

   public MethodType<T> setMethodName(String methodName);

   @NodeInfo(xmlName = "method-name")
   public String getMethodName();

   @NodeInfo(xmlName = "method-params")
   public MethodParamsType<MethodType<T>> methodParams();
}
