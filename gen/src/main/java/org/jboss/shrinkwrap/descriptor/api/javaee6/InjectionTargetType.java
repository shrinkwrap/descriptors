package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface InjectionTargetType<T> extends Child<T>
{

   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass);
   public String getInjectionTargetClass();


   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName);
   public String getInjectionTargetName();
}