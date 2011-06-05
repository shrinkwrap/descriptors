package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerChainType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class HandlerChainTypeImpl<T> implements Child<T>, HandlerChainType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private HandlerType<HandlerChainType<T>> handler;
   private String serviceNamePattern;
   private String portNamePattern;
//   private ProtocolBindingListType<HandlerChainType<T>> protocolBindings;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public HandlerChainTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("handler-chain");   }


   public T up()
   {
      return t;
   }



   public HandlerChainType<T> setHandler(HandlerType<HandlerChainType<T>> handler)
   {
      this.handler = handler;
      childNode.getOrCreate("handler").text(handler);
      return this;
   }

   public HandlerType<HandlerChainType<T>> getHandler()
   {
      if( handler == null)
      {
          handler = new HandlerTypeImpl<HandlerChainType<T>>(this, "", childNode);
      }
      return handler;
   }




   public HandlerChainType<T> setServiceNamePattern(String serviceNamePattern)
   {
      this.serviceNamePattern = serviceNamePattern;
      childNode.getOrCreate("service-name-pattern").text(serviceNamePattern);
      return this;
   }

   public String getServiceNamePattern()
   {
      return serviceNamePattern;
   }



   public HandlerChainType<T> setPortNamePattern(String portNamePattern)
   {
      this.portNamePattern = portNamePattern;
      childNode.getOrCreate("port-name-pattern").text(portNamePattern);
      return this;
   }

   public String getPortNamePattern()
   {
      return portNamePattern;
   }

//
//
//   public HandlerChainType<T> setProtocolBindings(ProtocolBindingListType<HandlerChainType<T>> protocolBindings)
//   {
//      this.protocolBindings = protocolBindings;
//      childNode.getOrCreate("protocol-bindings").text(protocolBindings);
//      return this;
//   }
//
//   public ProtocolBindingListType<HandlerChainType<T>> getProtocolBindings()
//   {
//      if( protocolBindings == null)
//      {
//          protocolBindings = new ProtocolBindingListTypeImpl<HandlerChainType<T>>(this, "", childNode);
//      }
//      return protocolBindings;
//   }


}
