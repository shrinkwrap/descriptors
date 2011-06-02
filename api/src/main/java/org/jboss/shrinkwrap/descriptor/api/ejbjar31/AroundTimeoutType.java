package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface AroundTimeoutType<T> extends Child<T>
{
   public AroundTimeoutType<T> setClazz(Class<?> clazz);

   public AroundTimeoutType<T> setClazz(String clazz);

   @NodeInfo(xmlName = "class")
   public String getClazz();

   public AroundTimeoutType<T> setMethodName(String methodName);

   @NodeInfo(xmlName = "method-name")
   public String getMethodName();
}
