package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface ResourceRefType<T> extends Child<T>
{

   public ResourceRefType<T> setLookupName(String lookupName);
   public String getLookupName();

   public ResourceRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public ResourceRefType<T> setInjectionTarget(InjectionTargetType<ResourceRefType<T>> injectionTarget);
   public InjectionTargetType<ResourceRefType<T>> getInjectionTarget();


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
