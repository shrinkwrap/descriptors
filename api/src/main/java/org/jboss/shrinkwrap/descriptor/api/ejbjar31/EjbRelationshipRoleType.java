package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface EjbRelationshipRoleType<T> extends Child<T>
{
   public EjbRelationshipRoleType<T> setDescription(String description);
   public String getDescription();

   public EjbRelationshipRoleType<T> setEjbRelationshipRoleName(String ejbRelationshipRoleName);
   public String getEjbRelationshipRoleName();

   public EjbRelationshipRoleType<T> setMultiplicity(MultiplicityType multiplicity);
   public MultiplicityType getMultiplicity();

   public EjbRelationshipRoleType<T> cascadeDelete();

   public EjbRelationshipRoleType<T> setRelationshipRoleSource(RelationshipRoleSourceType<T> relationshipRoleSource);
   public RelationshipRoleSourceType<T> getRelationshipRoleSource();

   public EjbRelationshipRoleType<T> setCmrField(CmrFieldType<T> cmrField);
   public CmrFieldType<T> getCmrField();
}
