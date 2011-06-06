package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface EnvEntryType<T> extends Child<T>
{

   public EnvEntryType<T> setLookupName(String lookupName);
   public String getLookupName();

   public EnvEntryType<T> setMappedName(String mappedName);
   public String getMappedName();

   public EnvEntryType<T> setInjectionTarget(InjectionTargetType<EnvEntryType<T>> injectionTarget);
   public InjectionTargetType<EnvEntryType<T>> getInjectionTarget();


   public EnvEntryType<T> setDescription(String description);
   public String getDescription();


   public EnvEntryType<T> setEnvEntryName(String envEntryName);
   public String getEnvEntryName();


   public EnvEntryType<T> setEnvEntryType(String envEntryType);
   public String getEnvEntryType();


   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);
   public String getEnvEntryValue();
}
