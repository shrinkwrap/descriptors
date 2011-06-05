package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class RelationshipsTypeImpl<T> implements Child<T>, RelationshipsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private EjbRelationType<RelationshipsType<T>> ejbRelation;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public RelationshipsTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("relationships");   }


   public T up()
   {
      return t;
   }



   public RelationshipsType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public RelationshipsType<T> setEjbRelation(EjbRelationType<RelationshipsType<T>> ejbRelation)
   {
      this.ejbRelation = ejbRelation;
      childNode.getOrCreate("ejb-relation").text(ejbRelation);
      return this;
   }

   public EjbRelationType<RelationshipsType<T>> getEjbRelation()
   {
      if( ejbRelation == null)
      {
          ejbRelation = new EjbRelationTypeImpl<RelationshipsType<T>>(this, "", childNode);
      }
      return ejbRelation;
   }


}
