package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class LifecycleCallbackTypeImpl<T> implements Child<T>, LifecycleCallbackType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String lifecycleCallbackClass;
   private String lifecycleCallbackMethod;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LifecycleCallbackTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("post-construct");   }


   public T up()
   {
      return t;
   }



   public LifecycleCallbackType<T> setLifecycleCallbackClass(String lifecycleCallbackClass)
   {
      this.lifecycleCallbackClass = lifecycleCallbackClass;
      childNode.getOrCreate("lifecycle-callback-class").text(lifecycleCallbackClass);
      return this;
   }

   public String getLifecycleCallbackClass()
   {
      return lifecycleCallbackClass;
   }



   public LifecycleCallbackType<T> setLifecycleCallbackMethod(String lifecycleCallbackMethod)
   {
      this.lifecycleCallbackMethod = lifecycleCallbackMethod;
      childNode.getOrCreate("lifecycle-callback-method").text(lifecycleCallbackMethod);
      return this;
   }

   public String getLifecycleCallbackMethod()
   {
      return lifecycleCallbackMethod;
   }

}
