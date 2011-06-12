package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public class LifecycleCallbackTypeImpl<T> implements Child<T>, LifecycleCallbackType<T>
{
   public final static String nodeName = "post-construct";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LifecycleCallbackTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public LifecycleCallbackTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   // Element type : lifecycle-callback-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public LifecycleCallbackType<T> setLifecycleCallbackClass(String lifecycleCallbackClass)
   {
      childNode.getOrCreate("lifecycle-callback-class").text(lifecycleCallbackClass);
      return this;
   }

   public String getLifecycleCallbackClass()
   {
      return childNode.textValue("lifecycle-callback-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : lifecycle-callback-method
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public LifecycleCallbackType<T> setLifecycleCallbackMethod(String lifecycleCallbackMethod)
   {
      childNode.getOrCreate("lifecycle-callback-method").text(lifecycleCallbackMethod);
      return this;
   }

   public String getLifecycleCallbackMethod()
   {
      return childNode.textValue("lifecycle-callback-method");
   }

}
