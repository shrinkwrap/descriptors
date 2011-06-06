package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RemoveMethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class RemoveMethodTypeImpl<T> implements Child<T>, RemoveMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private NamedMethodType<RemoveMethodType<T>> beanMethod;
   private Boolean retainIfException;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public RemoveMethodTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("remove-method");   }


   public T up()
   {
      return t;
   }



   public RemoveMethodType<T> setBeanMethod(NamedMethodType<RemoveMethodType<T>> beanMethod)
   {
      this.beanMethod = beanMethod;
      childNode.getOrCreate("bean-method").text(beanMethod);
      return this;
   }

   public NamedMethodType<RemoveMethodType<T>> getBeanMethod()
   {
      if( beanMethod == null)
      {
          beanMethod = new NamedMethodTypeImpl<RemoveMethodType<T>>(this, "", childNode);
      }
      return beanMethod;
   }




   public RemoveMethodType<T> setRetainIfException(Boolean retainIfException)
   {
      this.retainIfException = retainIfException;
      childNode.getOrCreate("retain-if-exception").text(retainIfException);
      return this;
   }

   public Boolean getRetainIfException()
   {
      return retainIfException;
   }

}
