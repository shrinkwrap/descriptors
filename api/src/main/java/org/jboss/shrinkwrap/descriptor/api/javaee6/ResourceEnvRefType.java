package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ResourceEnvRefType<T> extends Child<T>, ResourceGroup<T>
{
   public ResourceEnvRefType<T> description(String description);

   public ResourceEnvRefType<T> resourceEnvRefName(String resourceEnvRefName);

   public ResourceEnvRefType<T> resourceEnvRefType(String resourceEnvRefType);
}
