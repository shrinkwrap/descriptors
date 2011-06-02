package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ResourceEnvRefType<T> extends Child<T>
{
   public ResourceEnvRefType<T> setLookupName(String lookupName);

   @NodeInfo(xmlName = "lookup-name")
   public String getLookupName();

   public ResourceEnvRefType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   @NodeInfo(xmlName = "injection-target")
   public InjectionTargetType<ResourceEnvRefType<T>> injectionTarget();

   public ResourceEnvRefType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName);

   @NodeInfo(xmlName = "resource-env-ref-name")
   public String getResourceEnvRefName();

   public ResourceEnvRefType<T> setResourceEnvRefType(Class<?> resourceEnvRefType);

   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType);

   @NodeInfo(xmlName = "resource-env-ref-type")
   public String getResourceEnvRefType();
}
