package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.UserDataConstraintType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class UserDataConstraintTypeImpl<T> implements Child<T>, UserDataConstraintType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String transportGuarantee;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public UserDataConstraintTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("user-data-constraint");   }


   public T up()
   {
      return t;
   }



   public UserDataConstraintType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public UserDataConstraintType<T> setTransportGuarantee(String transportGuarantee)
   {
      this.transportGuarantee = transportGuarantee;
      childNode.getOrCreate("transport-guarantee").text(transportGuarantee);
      return this;
   }

   public String getTransportGuarantee()
   {
      return transportGuarantee;
   }

}
