package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The lifecycle-callback type specifies a method on a
 * class to be called when a lifecycle event occurs.
 * Note that each class may have only one lifecycle callback
 * method for any given event and that the method may not
 * be overloaded.
 *
 * If the lifefycle-callback-class element is missing then
 * the class defining the callback is assumed to be the
 * component class in scope at the place in the descriptor
 * in which the callback definition appears.
 *
 *
 *
 */
public class LifecycleCallbackTypeImpl<T> implements Child<T>, LifecycleCallbackType<T>
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

   public LifecycleCallbackTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public LifecycleCallbackTypeImpl(T t, String nodeName, Node node, Node childNode)
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

   public LifecycleCallbackType<T> removeLifecycleCallbackClass()
   {
      childNode.remove("lifecycle-callback-class");
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

   public LifecycleCallbackType<T> removeLifecycleCallbackMethod()
   {
      childNode.remove("lifecycle-callback-method");
      return this;
   }

   public String getLifecycleCallbackMethod()
   {
      return childNode.textValue("lifecycle-callback-method");
   }

}
