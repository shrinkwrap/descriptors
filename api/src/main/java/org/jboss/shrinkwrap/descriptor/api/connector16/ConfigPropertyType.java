package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ConfigPropertyType<T> extends Child<T>
{
   public ConfigPropertyType<T> setDescription(String description);

   public String getDescription();

   public ConfigPropertyType<T> setConfigPropertyName(String configPropertyName);

   public String getConfigPropertyName();

   public ConfigPropertyType<T> setConfigPropertyType(String configPropertyType);

   public String getConfigPropertyType();

   public ConfigPropertyType<T> setConfigPropertyValue(String configPropertyValue);

   public String getConfigPropertyValue();

   public ConfigPropertyType<T> setConfigPropertyIgnore(Boolean configPropertyIgnore);

   public Boolean getConfigPropertyIgnore();

   public ConfigPropertyType<T> setConfigPropertySupportsDynamicUpdates(Boolean configPropertySupportsDynamicUpdates);

   public Boolean getConfigPropertySupportsDynamicUpdates();

   public ConfigPropertyType<T> setConfigPropertyConfidential(Boolean configPropertyConfidential);

   public Boolean getConfigPropertyConfidential();
}
