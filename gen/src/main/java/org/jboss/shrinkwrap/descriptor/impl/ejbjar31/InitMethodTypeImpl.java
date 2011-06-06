package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InitMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class InitMethodTypeImpl<T> implements Child<T>, InitMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private NamedMethodType<InitMethodType<T>> createMethod;
   private NamedMethodType<InitMethodType<T>> beanMethod;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public InitMethodTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("init-method");   }


   public T up()
   {
      return t;
   }



   public InitMethodType<T> setCreateMethod(NamedMethodType<InitMethodType<T>> createMethod)
   {
      this.createMethod = createMethod;
      childNode.getOrCreate("create-method").text(createMethod);
      return this;
   }

   public NamedMethodType<InitMethodType<T>> getCreateMethod()
   {
      if( createMethod == null)
      {
          createMethod = new NamedMethodTypeImpl<InitMethodType<T>>(this, "", childNode);
      }
      return createMethod;
   }




   public InitMethodType<T> setBeanMethod(NamedMethodType<InitMethodType<T>> beanMethod)
   {
      this.beanMethod = beanMethod;
      childNode.getOrCreate("bean-method").text(beanMethod);
      return this;
   }

   public NamedMethodType<InitMethodType<T>> getBeanMethod()
   {
      if( beanMethod == null)
      {
          beanMethod = new NamedMethodTypeImpl<InitMethodType<T>>(this, "", childNode);
      }
      return beanMethod;
   }


}
