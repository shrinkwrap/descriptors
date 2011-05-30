package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface ResourceBaseGroup<T>
{
   public T setMappedName(String mappedName);
   public String getMappedName();

   public T setInjectionTarget(InjectionTargetType<T> injectionTarget);
   public InjectionTargetType<ResourceBaseGroup<T>> getInjectionTarget();
}
