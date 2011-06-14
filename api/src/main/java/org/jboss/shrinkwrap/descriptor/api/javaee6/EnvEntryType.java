package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public interface EnvEntryType<T> extends Child<T>
{

   public EnvEntryType<T> setLookupName(String lookupName);
   public EnvEntryType<T> removeLookupName();

   public String getLookupName();


   public EnvEntryType<T> setMappedName(String mappedName);
   public EnvEntryType<T> removeMappedName();

   public String getMappedName();


   public EnvEntryType<T> removeAllInjectionTarget();

   public InjectionTargetType<EnvEntryType<T>> injectionTarget();
   public List<InjectionTargetType<EnvEntryType<T>>> getInjectionTargetList();



   public EnvEntryType<T> setDescription(String description);
   public EnvEntryType<T> setDescriptionList(String ... values);
   public EnvEntryType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public EnvEntryType<T> setEnvEntryName(String envEntryName);
   public EnvEntryType<T> removeEnvEntryName();

   public String getEnvEntryName();



   public EnvEntryType<T> setEnvEntryType(String envEntryType);
   public EnvEntryType<T> removeEnvEntryType();

   public String getEnvEntryType();



   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);
   public EnvEntryType<T> removeEnvEntryValue();

   public String getEnvEntryValue();

}
