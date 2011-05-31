package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface ResourceEnvRefType<T> extends Child<T>
{
   public ResourceEnvRefType<T> setLookupName(String lookupName);
   public String getLookupName();

   public ResourceEnvRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public ResourceEnvRefType<T> setInjectionTarget(InjectionTargetType<T> injectionTarget);
   public InjectionTargetType<T> getInjectionTarget();

   public ResourceEnvRefType<T> setDescription(String description);
   public String getDescription();

   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName);
   public String getResourceEnvRefName();

   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType);
   public String getResourceEnvRefType();
}
