package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface HandlerChainType<T> extends Child<T>
{

   public HandlerChainType<T> setHandler(HandlerType<HandlerChainType<T>> handler);
   public HandlerType<HandlerChainType<T>> getHandler();



   public HandlerChainType<T> setServiceNamePattern(String serviceNamePattern);
   public String getServiceNamePattern();


   public HandlerChainType<T> setPortNamePattern(String portNamePattern);
   public String getPortNamePattern();

//
//   public HandlerChainType<T> setProtocolBindings(ProtocolBindingListType<HandlerChainType<T>> protocolBindings);
//   public ProtocolBindingListType<HandlerChainType<T>> getProtocolBindings();

}
