package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface InjectionTargetType<T> extends Child<T>
{
   public InjectionTargetType<T> injectionTargetClass(String injectionTargetClass);
   public InjectionTargetType<T> injectionTargetName(String injectionTargetName);
}
