package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface AsyncMethodType<T> extends Child<T>
{
   public AsyncMethodType<T> setMethodName(String methodName);

   @NodeInfo(xmlName = "method-name")
   public String getMethodName();

   @NodeInfo(xmlName = "method-params")
   public MethodParamsType<AsyncMethodType<T>> methodParams();
}
