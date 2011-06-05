package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class EjbRelationTypeImpl<T> implements Child<T>, EjbRelationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String ejbRelationName;
   private EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EjbRelationTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("ejb-relation");   }


   public T up()
   {
      return t;
   }



   public EjbRelationType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public EjbRelationType<T> setEjbRelationName(String ejbRelationName)
   {
      this.ejbRelationName = ejbRelationName;
      childNode.getOrCreate("ejb-relation-name").text(ejbRelationName);
      return this;
   }

   public String getEjbRelationName()
   {
      return ejbRelationName;
   }



   public EjbRelationType<T> setEjbRelationshipRole(EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole)
   {
      this.ejbRelationshipRole = ejbRelationshipRole;
      childNode.getOrCreate("ejb-relationship-role").text(ejbRelationshipRole);
      return this;
   }

   public EjbRelationshipRoleType<EjbRelationType<T>> getEjbRelationshipRole()
   {
      if( ejbRelationshipRole == null)
      {
          ejbRelationshipRole = new EjbRelationshipRoleTypeImpl<EjbRelationType<T>>(this, "", childNode);
      }
      return ejbRelationshipRole;
   }



}
