package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface EnvEntryType<T> extends Child<T>, ResourceGroup<T>
{
   public EnvEntryType<T> description(String description);

   public EnvEntryType<T> envEntryName(String envEntryName);

   public EnvEntryType<T> envEntryType(String envEntryType);

   public EnvEntryType<T> envEntryValue(String envEntryValue);
}
