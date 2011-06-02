package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface HandlerChainType<T> extends Child<T>
{
   @NodeInfo(xmlName = "handler")
   public HandlerType<HandlerChainType<T>> handler();

   public HandlerChainType<T> setServiceNamePattern(String serviceNamePattern);

   @NodeInfo(xmlName = "service-name-pattern")
   public String getServiceNamePattern();

   public HandlerChainType<T> setPortNamePattern(String portNamePattern);

   @NodeInfo(xmlName = "port-name-pattern")
   public String getPortNamePattern();

   public HandlerChainType<T> setProtocolBindings(String protocolBindings);

   @NodeInfo(xmlName = "protocol-bindings")
   public String getProtocolBindings();
}
