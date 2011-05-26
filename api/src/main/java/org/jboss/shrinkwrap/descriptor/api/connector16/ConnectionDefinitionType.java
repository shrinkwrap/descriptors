package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ConnectionDefinitionType<T> extends Child<T>
{
   public ConnectionDefinitionType<T> setManagedconnectionfactoryClazz(String managedconnectionfactoryClass);

   public String getManagedconnectionfactoryClazz();

   public ConnectionDefinitionType<T> setConfigProperty(ConfigPropertyType<T> configProperty);

   public ConfigPropertyType<ConnectionDefinitionType<T>> getConfigProperty();

   public ConnectionDefinitionType<T> setConnectionfactoryInterface(String connectionfactoryInterface);

   public String getConnectionfactoryInterface();

   public ConnectionDefinitionType<T> setConnectionfactoryImplClazz(String connectionfactoryImplClass);

   public String getConnectionfactoryImplClazz();

   public ConnectionDefinitionType<T> setConnectionInterface(String connectionInterface);

   public String getConnectionInterface();

   public ConnectionDefinitionType<T> setConnectionImplClazz(String connectionImplClass);

   public String getConnectionImplClazz();
}
