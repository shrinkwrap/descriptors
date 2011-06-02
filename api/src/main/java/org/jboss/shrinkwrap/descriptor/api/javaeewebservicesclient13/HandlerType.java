package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface HandlerType<T> extends Child<T>
{
   public HandlerType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public HandlerType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<HandlerType<T>> icon();

   public HandlerType<T> setHandlerName(String handlerName);

   @NodeInfo(xmlName = "handler-name")
   public String getHandlerName();

   public HandlerType<T> setHandlerClass(Class<?> handlerClass);

   public HandlerType<T> setHandlerClass(String handlerClass);

   @NodeInfo(xmlName = "handler-class")
   public String getHandlerClass();

   @NodeInfo(xmlName = "init-param")
   public ParamValueType<HandlerType<T>> initParam();

   public HandlerType<T> setSoapHeader(String soapHeader);

   @NodeInfo(xmlName = "soap-header")
   public String getSoapHeader();

   public HandlerType<T> setSoapRole(String soapRole);

   @NodeInfo(xmlName = "soap-role")
   public String getSoapRole();

   public HandlerType<T> setPortName(String portName);

   @NodeInfo(xmlName = "port-name")
   public String getPortName();
}
