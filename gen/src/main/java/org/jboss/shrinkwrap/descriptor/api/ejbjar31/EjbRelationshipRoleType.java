package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface EjbRelationshipRoleType<T> extends Child<T>
{

   public EjbRelationshipRoleType<T> setDescription(String description);
   public String getDescription();


   public EjbRelationshipRoleType<T> setEjbRelationshipRoleName(String ejbRelationshipRoleName);
   public String getEjbRelationshipRoleName();


   public EjbRelationshipRoleType<T> setMultiplicity(String multiplicity);
   public String getMultiplicity();


   public EjbRelationshipRoleType<T> setCascadeDelete(Boolean cascadeDelete);
   public Boolean getCascadeDelete();


   public EjbRelationshipRoleType<T> setRelationshipRoleSource(RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource);
   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> getRelationshipRoleSource();



   public EjbRelationshipRoleType<T> setCmrField(CmrFieldType<EjbRelationshipRoleType<T>> cmrField);
   public CmrFieldType<EjbRelationshipRoleType<T>> getCmrField();

}
