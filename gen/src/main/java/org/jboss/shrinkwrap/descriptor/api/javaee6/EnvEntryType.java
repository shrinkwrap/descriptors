package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface EnvEntryType<T> extends Child<T>
{

   public EnvEntryType<T> setLookupName(String lookupName);

   public String getLookupName();

   public EnvEntryType<T> setMappedName(String mappedName);

   public String getMappedName();

   public EnvEntryType<T> removeAllInjectionTarget();

   public InjectionTargetType<EnvEntryType<T>> getInjectionTarget();

   public List<InjectionTargetType<EnvEntryType<T>>> getInjectionTargetList();

   public EnvEntryType<T> setDescription(String description);

   public EnvEntryType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public EnvEntryType<T> setEnvEntryName(String envEntryName);

   public String getEnvEntryName();

   public EnvEntryType<T> setEnvEntryType(String envEntryType);

   public String getEnvEntryType();

   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);

   public String getEnvEntryValue();

}
