package org.jboss.shrinkwrap.descriptor.api.webservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface HandlerChainType<T> extends Child<T>
{
   public HandlerChainType<T> serviceNamePattern(String serviceNamePattern);

   public HandlerChainType<T> portNamePattern(String portNamePattern);

   public HandlerChainType<T> protocolBindings(String protocolBindings);

   public HandlerType<HandlerChainType<T>> handler();
}
