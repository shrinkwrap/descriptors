package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ResourceRefType<T> extends Child<T>, ResourceGroup<T>
{
   public ResourceRefType<T> description(String description);

   public ResourceRefType<T> resRefName(String resRefName);

   public ResourceRefType<T> resType(String resType);

   public ResourceRefType<T> resAuth(String resAuth);

   public ResourceRefType<T> resSharingScope(ResSharingScopeType resSharingScope);
}
