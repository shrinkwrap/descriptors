package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ContainerTransactionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class ContainerTransactionTypeImpl<T> implements Child<T>, ContainerTransactionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private MethodType<ContainerTransactionType<T>> method;
   private String transAttribute;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ContainerTransactionTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("container-transaction");   }


   public T up()
   {
      return t;
   }



   public ContainerTransactionType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public ContainerTransactionType<T> setMethod(MethodType<ContainerTransactionType<T>> method)
   {
      this.method = method;
      childNode.getOrCreate("method").text(method);
      return this;
   }

   public MethodType<ContainerTransactionType<T>> getMethod()
   {
      if( method == null)
      {
          method = new MethodTypeImpl<ContainerTransactionType<T>>(this, "", childNode);
      }
      return method;
   }




   public ContainerTransactionType<T> setTransAttribute(String transAttribute)
   {
      this.transAttribute = transAttribute;
      childNode.getOrCreate("trans-attribute").text(transAttribute);
      return this;
   }

   public String getTransAttribute()
   {
      return transAttribute;
   }

}
