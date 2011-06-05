package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface EjbRelationType<T> extends Child<T>
{

   public EjbRelationType<T> setDescription(String description);
   public String getDescription();


   public EjbRelationType<T> setEjbRelationName(String ejbRelationName);
   public String getEjbRelationName();


   public EjbRelationType<T> setEjbRelationshipRole(EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole);
   public EjbRelationshipRoleType<EjbRelationType<T>> getEjbRelationshipRole();


}
