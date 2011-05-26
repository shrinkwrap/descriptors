package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ResourceBaseGroup<T> extends Child<T>
{
   public ResourceBaseGroup<T> setMappedName(String mappedName);

   public String getMappedName();

   public ResourceBaseGroup<T> setInjectionTarget(InjectionTargetType<T> injectionTarget);

   public InjectionTargetType<ResourceBaseGroup<T>> getInjectionTarget();
}
