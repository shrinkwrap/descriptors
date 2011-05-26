package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ResourceRefType<T> extends Child<T>, ResourceGroup<T>
{
   public ResourceRefType<T> setDescription(String description);

   public String getDescription();

   public ResourceRefType<T> setResRefName(String resRefName);

   public String getResRefName();

   public ResourceRefType<T> setResType(String resType);

   public String getResType();

   public ResourceRefType<T> setResAuth(String resAuth);

   public String getResAuth();

   public ResourceRefType<T> setResSharingScope(String resSharingScope);

   public String getResSharingScope();
}
