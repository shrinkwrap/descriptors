package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface EjbRelationType<T> extends Child<T>
{
   public EjbRelationType<T> setDescription(String description);

   public String getDescription();

   public EjbRelationType<T> setEjbRelationName(String ejbRelationName);

   public String getEjbRelationName();

   public EjbRelationType<T> setEjbRelationshipRole(EjbRelationshipRoleType<T> ejbRelationshipRole);

   public EjbRelationshipRoleType<EjbRelationType<T>> getEjbRelationshipRole();

   public EjbRelationType<T> setEjbRelationshipRole(EjbRelationshipRoleType<T> ejbRelationshipRole);

   public EjbRelationshipRoleType<EjbRelationType<T>> getEjbRelationshipRole();
}
