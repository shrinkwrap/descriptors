package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface InjectionTargetType<T> extends Child<T>
{
   public InjectionTargetType<T> setInjectionTargetClazz(String injectionTargetClass);

   public String getInjectionTargetClazz();

   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName);

   public String getInjectionTargetName();
}
