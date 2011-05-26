package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface EnvEntryType<T> extends Child<T>, ResourceGroup<T>
{
   public EnvEntryType<T> setDescription(String description);

   public String getDescription();

   public EnvEntryType<T> setEnvEntryName(String envEntryName);

   public String getEnvEntryName();

   public EnvEntryType<T> setEnvEntryType(String envEntryType);

   public String getEnvEntryType();

   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);

   public String getEnvEntryValue();
}
