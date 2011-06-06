package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipRoleSourceType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class RelationshipRoleSourceTypeImpl<T> implements Child<T>, RelationshipRoleSourceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String ejbName;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public RelationshipRoleSourceTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("relationship-role-source");   }


   public T up()
   {
      return t;
   }



   public RelationshipRoleSourceType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public RelationshipRoleSourceType<T> setEjbName(String ejbName)
   {
      this.ejbName = ejbName;
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public String getEjbName()
   {
      return ejbName;
   }

}
