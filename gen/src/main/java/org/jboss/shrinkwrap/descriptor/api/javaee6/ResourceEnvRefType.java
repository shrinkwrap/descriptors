package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public interface ResourceEnvRefType<T> extends Child<T>
{

   public ResourceEnvRefType<T> setLookupName(String lookupName);

   public ResourceEnvRefType<T> removeLookupName();

   public String getLookupName();

   public ResourceEnvRefType<T> setMappedName(String mappedName);

   public ResourceEnvRefType<T> removeMappedName();

   public String getMappedName();

   public ResourceEnvRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<ResourceEnvRefType<T>> injectionTarget();

   public List<InjectionTargetType<ResourceEnvRefType<T>>> getInjectionTargetList();

   public ResourceEnvRefType<T> setDescription(String description);

   public ResourceEnvRefType<T> setDescriptionList(String... values);

   public ResourceEnvRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName);

   public ResourceEnvRefType<T> removeResourceEnvRefName();

   public String getResourceEnvRefName();

   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType);

   public ResourceEnvRefType<T> removeResourceEnvRefType();

   public String getResourceEnvRefType();

}
