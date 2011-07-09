package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The handler-chains element defines the handlerchains associated with this
 * service or service endpoint.
 *
 *
 *
 */
public class ServiceRefHandlerChainsTypeImpl<T> implements Child<T>, ServiceRefHandlerChainsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ServiceRefHandlerChainsTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ServiceRefHandlerChainsTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : handler-chain
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceRefHandlerChainsType<T> removeAllHandlerChain()
   {
      childNode.remove("handler-chain");
      return this;
   }

   public ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>> handlerChain()
   {
      return new ServiceRefHandlerChainTypeImpl<ServiceRefHandlerChainsType<T>>(this, "handler-chain", childNode);
   }

   public List<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>> getHandlerChainList()
   {
      List<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>> list = new ArrayList<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>>();
      List<Node> nodeList = childNode.get("handler-chain");
      for (Node node : nodeList)
      {
         ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>> type = new ServiceRefHandlerChainTypeImpl<ServiceRefHandlerChainsType<T>>(
               this, "handler-chain", childNode, node);
         list.add(type);
      }
      return list;
   }

}
