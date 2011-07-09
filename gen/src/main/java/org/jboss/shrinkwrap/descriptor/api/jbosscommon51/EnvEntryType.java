package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryTypeValuesType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 */
public interface EnvEntryType<T> extends Child<T>
{

   public EnvEntryType<T> setJndiName(String jndiName);

   public EnvEntryType<T> removeJndiName();

   public String getJndiName();

   public EnvEntryType<T> setMappedName(String mappedName);

   public EnvEntryType<T> removeMappedName();

   public String getMappedName();

   public EnvEntryType<T> removeAllInjectionTarget();

   public InjectionTargetType<EnvEntryType<T>> injectionTarget();

   public List<InjectionTargetType<EnvEntryType<T>>> getInjectionTargetList();

   public EnvEntryType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

   public EnvEntryType<T> setDescription(String description);

   public EnvEntryType<T> setDescriptionList(String... values);

   public EnvEntryType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public EnvEntryType<T> setEnvEntryName(String envEntryName);

   public EnvEntryType<T> removeEnvEntryName();

   public String getEnvEntryName();

   public EnvEntryType<T> setEnvEntryType(EnvEntryTypeValuesType envEntryType);

   public EnvEntryType<T> setEnvEntryType(String envEntryType);

   public EnvEntryTypeValuesType getEnvEntryType();

   public String getEnvEntryTypeAsString();

   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);

   public EnvEntryType<T> removeEnvEntryValue();

   public String getEnvEntryValue();

}
