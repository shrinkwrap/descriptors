package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface EjbRelationshipRoleType<T> extends Child<T>
{
   public EjbRelationshipRoleType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public EjbRelationshipRoleType<T> setEjbRelationshipRoleName(String ejbRelationshipRoleName);

   @NodeInfo(xmlName = "ejb-relationship-role-name")
   public String getEjbRelationshipRoleName();

   public EjbRelationshipRoleType<T> setMultiplicity(MultiplicityType multiplicity);

   public EjbRelationshipRoleType<T> setMultiplicity(String multiplicity);

   @NodeInfo(xmlName = "multiplicity")
   public String getMultiplicity();

   @NodeInfo(xmlName = "cascade-delete")
   public EjbRelationshipRoleType<T> cascadeDelete();

   @NodeInfo(xmlName = "relationship-role-source")
   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource();

   @NodeInfo(xmlName = "cmr-field")
   public CmrFieldType<EjbRelationshipRoleType<T>> cmrField();
}
