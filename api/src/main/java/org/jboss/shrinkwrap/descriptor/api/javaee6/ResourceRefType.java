package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface ResourceRefType<T> extends Child<T>, ResourceGroup<T>

{
   public ResourceRefType<T> setDescription(String description);

   public String getDescription();

   public ResourceRefType<T> setResRefName(String resRefName);

   public String getResRefName();

   public ResourceRefType<T> setResType(String resType);

   public String getResType();

   public ResourceRefType<T> setResAuth(ResAuthType resAuth);

   public ResAuthType getResAuth();

   public ResourceRefType<T> setResSharingScope(ResSharingScopeType resSharingScope);

   public ResSharingScopeType getResSharingScope();
}
