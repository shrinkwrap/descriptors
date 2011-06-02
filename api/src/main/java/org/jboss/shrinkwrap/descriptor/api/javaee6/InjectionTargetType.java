package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface InjectionTargetType<T> extends Child<T>
{
   public InjectionTargetType<T> setInjectionTargetClass(Class<?> injectionTargetClass);

   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass);

   @NodeInfo(xmlName = "injection-target-class")
   public String getInjectionTargetClass();

   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName);

   @NodeInfo(xmlName = "injection-target-name")
   public String getInjectionTargetName();
}
