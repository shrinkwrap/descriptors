package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InitMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 */
public class InitMethodTypeImpl<T> implements Child<T>, InitMethodType<T>
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

   public InitMethodTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public InitMethodTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : create-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InitMethodType<T> removeCreateMethod()
   {
      childNode.remove("create-method");
      return this;
   }

   public NamedMethodType<InitMethodType<T>> createMethod()
   {
      Node node = childNode.getOrCreate("create-method");
      NamedMethodType<InitMethodType<T>> createMethod = new NamedMethodTypeImpl<InitMethodType<T>>(this,
            "create-method", childNode, node);
      return createMethod;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : bean-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InitMethodType<T> removeBeanMethod()
   {
      childNode.remove("bean-method");
      return this;
   }

   public NamedMethodType<InitMethodType<T>> beanMethod()
   {
      Node node = childNode.getOrCreate("bean-method");
      NamedMethodType<InitMethodType<T>> beanMethod = new NamedMethodTypeImpl<InitMethodType<T>>(this, "bean-method",
            childNode, node);
      return beanMethod;
   }

}
