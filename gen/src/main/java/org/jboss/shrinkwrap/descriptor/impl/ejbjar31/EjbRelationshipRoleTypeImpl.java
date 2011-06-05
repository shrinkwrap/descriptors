package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmrFieldType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipRoleSourceType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class EjbRelationshipRoleTypeImpl<T> implements Child<T>, EjbRelationshipRoleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String ejbRelationshipRoleName;
   private String multiplicity;
   private Boolean cascadeDelete;
   private RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource;
   private CmrFieldType<EjbRelationshipRoleType<T>> cmrField;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EjbRelationshipRoleTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("ejb-relationship-role");   }


   public T up()
   {
      return t;
   }



   public EjbRelationshipRoleType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public EjbRelationshipRoleType<T> setEjbRelationshipRoleName(String ejbRelationshipRoleName)
   {
      this.ejbRelationshipRoleName = ejbRelationshipRoleName;
      childNode.getOrCreate("ejb-relationship-role-name").text(ejbRelationshipRoleName);
      return this;
   }

   public String getEjbRelationshipRoleName()
   {
      return ejbRelationshipRoleName;
   }



   public EjbRelationshipRoleType<T> setMultiplicity(String multiplicity)
   {
      this.multiplicity = multiplicity;
      childNode.getOrCreate("multiplicity").text(multiplicity);
      return this;
   }

   public String getMultiplicity()
   {
      return multiplicity;
   }



   public EjbRelationshipRoleType<T> setCascadeDelete(Boolean cascadeDelete)
   {
      this.cascadeDelete = cascadeDelete;
      childNode.getOrCreate("cascade-delete").text(cascadeDelete);
      return this;
   }

   public Boolean getCascadeDelete()
   {
      return cascadeDelete;
   }



   public EjbRelationshipRoleType<T> setRelationshipRoleSource(RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource)
   {
      this.relationshipRoleSource = relationshipRoleSource;
      childNode.getOrCreate("relationship-role-source").text(relationshipRoleSource);
      return this;
   }

   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> getRelationshipRoleSource()
   {
      if( relationshipRoleSource == null)
      {
          relationshipRoleSource = new RelationshipRoleSourceTypeImpl<EjbRelationshipRoleType<T>>(this, "", childNode);
      }
      return relationshipRoleSource;
   }




   public EjbRelationshipRoleType<T> setCmrField(CmrFieldType<EjbRelationshipRoleType<T>> cmrField)
   {
      this.cmrField = cmrField;
      childNode.getOrCreate("cmr-field").text(cmrField);
      return this;
   }

   public CmrFieldType<EjbRelationshipRoleType<T>> getCmrField()
   {
      if( cmrField == null)
      {
          cmrField = new CmrFieldTypeImpl<EjbRelationshipRoleType<T>>(this, "", childNode);
      }
      return cmrField;
   }


}
