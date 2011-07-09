package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.RemoveMethodType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 */
public class RemoveMethodTypeImpl<T> implements Child<T>, RemoveMethodType<T>
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

   public RemoveMethodTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public RemoveMethodTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : bean-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public RemoveMethodType<T> removeBeanMethod()
   {
      childNode.remove("bean-method");
      return this;
   }

   public NamedMethodType<RemoveMethodType<T>> beanMethod()
   {
      Node node = childNode.getOrCreate("bean-method");
      NamedMethodType<RemoveMethodType<T>> beanMethod = new NamedMethodTypeImpl<RemoveMethodType<T>>(this,
            "bean-method", childNode, node);
      return beanMethod;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : retain-if-exception
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public RemoveMethodType<T> setRetainIfException(Boolean retainIfException)
   {
      childNode.getOrCreate("retain-if-exception").text(retainIfException);
      return this;
   }

   public RemoveMethodType<T> removeRetainIfException()
   {
      childNode.remove("retain-if-exception");
      return this;
   }

   public Boolean isRetainIfException()
   {
      return Strings.isTrue(childNode.textValue("retain-if-exception"));
   }

}
