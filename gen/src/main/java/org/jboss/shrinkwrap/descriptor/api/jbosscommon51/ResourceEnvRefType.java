package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 */
public interface ResourceEnvRefType<T> extends Child<T>
{

   public ResourceEnvRefType<T> setJndiName(String jndiName);

   public ResourceEnvRefType<T> removeJndiName();

   public String getJndiName();

   public ResourceEnvRefType<T> setMappedName(String mappedName);

   public ResourceEnvRefType<T> removeMappedName();

   public String getMappedName();

   public ResourceEnvRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<ResourceEnvRefType<T>> injectionTarget();

   public List<InjectionTargetType<ResourceEnvRefType<T>>> getInjectionTargetList();

   public ResourceEnvRefType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

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
