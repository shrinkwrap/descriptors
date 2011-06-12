package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface ResourceEnvRefType<T> extends Child<T>
{

   public ResourceEnvRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   public ResourceEnvRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   public ResourceEnvRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<ResourceEnvRefType<T>> getInjectionTarget();

   public List<InjectionTargetType<ResourceEnvRefType<T>>> getInjectionTargetList();

   public ResourceEnvRefType<T> setDescription(String description);

   public ResourceEnvRefType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName);

   public String getResourceEnvRefName();

   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType);

   public String getResourceEnvRefType();

}
