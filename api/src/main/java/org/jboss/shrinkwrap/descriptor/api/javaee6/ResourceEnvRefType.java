package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ResourceEnvRefType<T> extends Child<T>, ResourceGroup<T>
{
   public ResourceEnvRefType<T> setDescription(String description);

   public String getDescription();

   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName);

   public String getResourceEnvRefName();

   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType);

   public String getResourceEnvRefType();
}
