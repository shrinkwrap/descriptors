package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
 */
public interface ResourceRefType<T> extends Child<T>
{

   public ResourceRefType<T> setLookupName(String lookupName);

   public ResourceRefType<T> removeLookupName();

   public String getLookupName();

   public ResourceRefType<T> setMappedName(String mappedName);

   public ResourceRefType<T> removeMappedName();

   public String getMappedName();

   public ResourceRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<ResourceRefType<T>> injectionTarget();

   public List<InjectionTargetType<ResourceRefType<T>>> getInjectionTargetList();

   public ResourceRefType<T> setDescription(String description);

   public ResourceRefType<T> setDescriptionList(String... values);

   public ResourceRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public ResourceRefType<T> setResRefName(String resRefName);

   public ResourceRefType<T> removeResRefName();

   public String getResRefName();

   public ResourceRefType<T> setResType(String resType);

   public ResourceRefType<T> removeResType();

   public String getResType();

   public ResourceRefType<T> setResAuth(String resAuth);

   public ResourceRefType<T> removeResAuth();

   public String getResAuth();

   public ResourceRefType<T> setResSharingScope(String resSharingScope);

   public ResourceRefType<T> removeResSharingScope();

   public String getResSharingScope();

}
