package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface ResourceRefType<T> extends Child<T>
{

   public ResourceRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   public ResourceRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   public ResourceRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<ResourceRefType<T>> getInjectionTarget();

   public List<InjectionTargetType<ResourceRefType<T>>> getInjectionTargetList();

   public ResourceRefType<T> setDescription(String description);

   public ResourceRefType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public ResourceRefType<T> setResRefName(String resRefName);

   public String getResRefName();

   public ResourceRefType<T> setResType(String resType);

   public String getResType();

   public ResourceRefType<T> setResAuth(String resAuth);

   public String getResAuth();

   public ResourceRefType<T> setResSharingScope(String resSharingScope);

   public String getResSharingScope();

}
