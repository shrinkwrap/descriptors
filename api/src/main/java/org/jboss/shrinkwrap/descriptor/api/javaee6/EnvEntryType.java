package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface EnvEntryType<T> extends Child<T>
{
   public EnvEntryType<T> setLookupName(String lookupName);

   @NodeInfo(xmlName = "lookup-name")
   public String getLookupName();

   public EnvEntryType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   @NodeInfo(xmlName = "injection-target")
   public InjectionTargetType<EnvEntryType<T>> injectionTarget();

   public EnvEntryType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public EnvEntryType<T> setEnvEntryName(String envEntryName);

   @NodeInfo(xmlName = "env-entry-name")
   public String getEnvEntryName();

   public EnvEntryType<T> setEnvEntryType(String envEntryType);

   @NodeInfo(xmlName = "env-entry-type")
   public String getEnvEntryType();

   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);

   @NodeInfo(xmlName = "env-entry-value")
   public String getEnvEntryValue();
}
