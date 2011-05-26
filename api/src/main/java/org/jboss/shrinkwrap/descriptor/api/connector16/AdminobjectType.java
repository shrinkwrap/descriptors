package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AdminobjectType<T> extends Child<T>
{
   public AdminobjectType<T> setAdminobjectInterface(String adminobjectInterface);

   public String getAdminobjectInterface();

   public AdminobjectType<T> setAdminobjectClazz(String adminobjectClass);

   public String getAdminobjectClazz();

   public AdminobjectType<T> setConfigProperty(ConfigPropertyType<T> configProperty);

   public ConfigPropertyType<AdminobjectType<T>> getConfigProperty();
}
