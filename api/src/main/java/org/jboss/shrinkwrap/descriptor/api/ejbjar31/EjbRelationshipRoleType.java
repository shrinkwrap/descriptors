package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface EjbRelationshipRoleType<T> extends Child<T>
{
   public EjbRelationshipRoleType<T> setDescription(String description);

   public String getDescription();

   public EjbRelationshipRoleType<T> setEjbRelationshipRoleName(String ejbRelationshipRoleName);

   public String getEjbRelationshipRoleName();

   public EjbRelationshipRoleType<T> setMultiplicity(String multiplicity);

   public String getMultiplicity();

   public void CascadeDelete();

   public EjbRelationshipRoleType<T> setRelationshipRoleSource(RelationshipRoleSourceType<T> relationshipRoleSource);

   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> getRelationshipRoleSource();

   public EjbRelationshipRoleType<T> setCmrField(CmrFieldType<T> cmrField);

   public CmrFieldType<EjbRelationshipRoleType<T>> getCmrField();
}
