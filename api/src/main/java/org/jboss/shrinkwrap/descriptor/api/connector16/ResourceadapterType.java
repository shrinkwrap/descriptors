package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ResourceadapterType<T> extends Child<T>
{
   public ResourceadapterType<T> setResourceadapterClazz(String resourceadapterClass);

   public String getResourceadapterClazz();

   public ResourceadapterType<T> setConfigProperty(ConfigPropertyType<T> configProperty);

   public ConfigPropertyType<ResourceadapterType<T>> getConfigProperty();

   public ResourceadapterType<T> setOutboundResourceadapter(OutboundResourceadapterType<T> outboundResourceadapter);

   public OutboundResourceadapterType<ResourceadapterType<T>> getOutboundResourceadapter();

   public ResourceadapterType<T> setInboundResourceadapter(InboundResourceadapterType<T> inboundResourceadapter);

   public InboundResourceadapterType<ResourceadapterType<T>> getInboundResourceadapter();

   public ResourceadapterType<T> setAdminobject(AdminobjectType<T> adminobject);

   public AdminobjectType<ResourceadapterType<T>> getAdminobject();

   public ResourceadapterType<T> setSecurityPermission(SecurityPermissionType<T> securityPermission);

   public SecurityPermissionType<ResourceadapterType<T>> getSecurityPermission();
}
