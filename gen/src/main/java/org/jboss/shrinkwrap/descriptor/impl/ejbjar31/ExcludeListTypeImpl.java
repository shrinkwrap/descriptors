package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ExcludeListType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class ExcludeListTypeImpl<T> implements Child<T>, ExcludeListType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private MethodType<ExcludeListType<T>> method;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ExcludeListTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("exclude-list");   }


   public T up()
   {
      return t;
   }



   public ExcludeListType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public ExcludeListType<T> setMethod(MethodType<ExcludeListType<T>> method)
   {
      childNode.create("method").text(method);
      return this;
   }

   public MethodType<ExcludeListType<T>> getMethod()
   {
      if( method == null)
      {
          method = new MethodTypeImpl<ExcludeListType<T>>(this, "", childNode);
      }
      return method;
   }


}
