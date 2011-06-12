package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface ResourceEnvRefType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceEnvRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceEnvRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ResourceEnvRefType<T> setInjectionTarget(InjectionTargetType<ResourceEnvRefType<T>> injectionTarget);

   public InjectionTargetType<ResourceEnvRefType<T>> getInjectionTarget();
   public List<InjectionTargetType<ResourceEnvRefType<T>>> getInjectionTargetList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ResourceEnvRefType<T> setDescription(String description);
   public ResourceEnvRefType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName);

   public String getResourceEnvRefName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType);

   public String getResourceEnvRefType();

}
