package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ResourceBaseGroup<T> extends Child<T>
{
   public ResourceBaseGroup<T> mappedName(String mappedName);

   public InjectionTargetType<ResourceBaseGroup<T>> injectionTarget();
}
