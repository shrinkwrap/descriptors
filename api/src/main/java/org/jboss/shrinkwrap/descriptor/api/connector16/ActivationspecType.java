package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ActivationspecType<T> extends Child<T>
{
   public ActivationspecType<T> setActivationspecClazz(String activationspecClass);

   public String getActivationspecClazz();

   public ActivationspecType<T> setRequiredConfigProperty(RequiredConfigPropertyType<T> requiredConfigProperty);

   public RequiredConfigPropertyType<ActivationspecType<T>> getRequiredConfigProperty();

   public ActivationspecType<T> setConfigProperty(ConfigPropertyType<T> configProperty);

   public ConfigPropertyType<ActivationspecType<T>> getConfigProperty();
}
