package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface ResourceBaseGroup<T> extends Child<T>
{
   public ResourceBaseGroup<T> setMappedName(String mappedName);

   public String getMappedName();

   public InjectionTargetType<ResourceBaseGroup<T>> setInjectionTarget(InjectionTargetType<T> injectionTarget);

   public InjectionTargetType<ResourceBaseGroup<T>> getInjectionTarget();
}
