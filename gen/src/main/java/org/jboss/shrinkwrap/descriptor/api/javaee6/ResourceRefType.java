package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface ResourceRefType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ResourceRefType<T> setInjectionTarget(InjectionTargetType<ResourceRefType<T>> injectionTarget);

   public InjectionTargetType<ResourceRefType<T>> getInjectionTarget();
   public List<InjectionTargetType<ResourceRefType<T>>> getInjectionTargetList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ResourceRefType<T> setDescription(String description);
   public ResourceRefType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceRefType<T> setResRefName(String resRefName);

   public String getResRefName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceRefType<T> setResType(String resType);

   public String getResType();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceRefType<T> setResAuth(String resAuth);

   public String getResAuth();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceRefType<T> setResSharingScope(String resSharingScope);

   public String getResSharingScope();

}
