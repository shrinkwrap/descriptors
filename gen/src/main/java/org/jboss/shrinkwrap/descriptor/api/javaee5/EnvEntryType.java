package org.jboss.shrinkwrap.descriptor.api.javaee5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The env-entryType is used to declare an application's
 * environment entry. The declaration consists of an optional
 * description, the name of the environment entry, a type
 * (optional if the value is injected, otherwise required), and
 * an optional value.
 *
 * It also includes optional elements to define injection of
 * the named resource into fields or JavaBeans properties.
 *
 * If a value is not specified and injection is requested,
 * no injection will occur and no entry of the specified name
 * will be created. This allows an initial value to be
 * specified in the source code without being incorrectly
 * changed when no override has been specified.
 *
 * If a value is not specified and no injection is requested,
 * a value must be supplied during deployment.
 *
 * This type is used by env-entry elements.
 *
 *
 *
 */
public interface EnvEntryType<T> extends Child<T>
{

   public EnvEntryType<T> setMappedName(String mappedName);

   public EnvEntryType<T> removeMappedName();

   public String getMappedName();

   public EnvEntryType<T> removeAllInjectionTarget();

   public InjectionTargetType<EnvEntryType<T>> injectionTarget();

   public List<InjectionTargetType<EnvEntryType<T>>> getInjectionTargetList();

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
