package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface EnvEntryType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EnvEntryType<T> setLookupName(String lookupName);

   public String getLookupName();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EnvEntryType<T> setMappedName(String mappedName);

   public String getMappedName();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public EnvEntryType<T> setInjectionTarget(InjectionTargetType<EnvEntryType<T>> injectionTarget);

   public InjectionTargetType<EnvEntryType<T>> getInjectionTarget();
   public List<InjectionTargetType<EnvEntryType<T>>> getInjectionTargetList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public EnvEntryType<T> setDescription(String description);
   public EnvEntryType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EnvEntryType<T> setEnvEntryName(String envEntryName);

   public String getEnvEntryName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EnvEntryType<T> setEnvEntryType(String envEntryType);

   public String getEnvEntryType();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);

   public String getEnvEntryValue();

}
