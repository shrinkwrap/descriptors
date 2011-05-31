package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface EnvEntryType<T> extends Child<T>
{
   public EnvEntryType<T> setLookupName(String lookupName);
   public String getLookupName();

   public EnvEntryType<T> setMappedName(String mappedName);
   public String getMappedName();

   public EnvEntryType<T> setInjectionTarget(InjectionTargetType<T> injectionTarget);
   public InjectionTargetType<T> getInjectionTarget();

   public EnvEntryType<T> setDescription(String description);
   public String getDescription();

   public EnvEntryType<T> setEnvEntryName(String envEntryName);
   public String getEnvEntryName();

   public EnvEntryType<T> setEnvEntryType(String envEntryType);
   public String getEnvEntryType();

   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);
   public String getEnvEntryValue();
}
