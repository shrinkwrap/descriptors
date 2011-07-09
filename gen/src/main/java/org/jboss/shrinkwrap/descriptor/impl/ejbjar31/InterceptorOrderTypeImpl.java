package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorOrderType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The interceptor-orderType element describes a total ordering
 * of interceptor classes.
 *
 *
 *
 */
public class InterceptorOrderTypeImpl<T> implements Child<T>, InterceptorOrderType<T>
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

   public InterceptorOrderTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public InterceptorOrderTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : interceptor-class
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InterceptorOrderType<T> setInterceptorClass(String interceptorClass)
   {
      childNode.create("interceptor-class").text(interceptorClass);
      return this;
   }

   public InterceptorOrderType<T> setInterceptorClassList(String... values)
   {
      for (String name : values)
      {
         setInterceptorClass(name);
      }
      return this;
   }

   public InterceptorOrderType<T> removeAllInterceptorClass()
   {
      childNode.remove("interceptor-class");
      return this;
   }

   public List<String> getInterceptorClassList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("interceptor-class");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
