package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 *
 * The interceptorsType element declares one or more interceptor
 * classes used by components within this ejb-jar or .war. The declaration
 * consists of :
 *
 * - An optional description.
 * - One or more interceptor elements.
 *
 *
 *
 */
public class InterceptorsTypeImpl<T> implements Child<T>, InterceptorsType<T>
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

   public InterceptorsTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public InterceptorsTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InterceptorsType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public InterceptorsType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public InterceptorsType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InterceptorsType<T> removeAllInterceptor()
   {
      childNode.remove("interceptor");
      return this;
   }

   public InterceptorType<InterceptorsType<T>> interceptor()
   {
      return new InterceptorTypeImpl<InterceptorsType<T>>(this, "interceptor", childNode);
   }

   public List<InterceptorType<InterceptorsType<T>>> getInterceptorList()
   {
      List<InterceptorType<InterceptorsType<T>>> list = new ArrayList<InterceptorType<InterceptorsType<T>>>();
      List<Node> nodeList = childNode.get("interceptor");
      for (Node node : nodeList)
      {
         InterceptorType<InterceptorsType<T>> type = new InterceptorTypeImpl<InterceptorsType<T>>(this, "interceptor",
               childNode, node);
         list.add(type);
      }
      return list;
   }

}
