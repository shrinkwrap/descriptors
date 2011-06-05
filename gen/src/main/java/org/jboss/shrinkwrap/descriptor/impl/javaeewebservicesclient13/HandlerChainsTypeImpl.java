package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerChainType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.HandlerChainsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class HandlerChainsTypeImpl<T> implements Child<T>, HandlerChainsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private HandlerChainType<HandlerChainsType<T>> handlerChain;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public HandlerChainsTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("handler-chains");   }


   public T up()
   {
      return t;
   }



   public HandlerChainsType<T> setHandlerChain(HandlerChainType<HandlerChainsType<T>> handlerChain)
   {
      this.handlerChain = handlerChain;
      childNode.getOrCreate("handler-chain").text(handlerChain);
      return this;
   }

   public HandlerChainType<HandlerChainsType<T>> getHandlerChain()
   {
      if( handlerChain == null)
      {
          handlerChain = new HandlerChainTypeImpl<HandlerChainsType<T>>(this, "", childNode);
      }
      return handlerChain;
   }


}
