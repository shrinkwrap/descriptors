package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface EjbRelationType<T> extends Child<T>
{
   public EjbRelationType<T> setDescription(String description);
   public String getDescription();

   public EjbRelationType<T> setEjbRelationName(String ejbRelationName);
   public String getEjbRelationName();

   public EjbRelationType<T> setEjbRelationshipRole(EjbRelationshipRoleType<T> ejbRelationshipRole);
   public EjbRelationshipRoleType<T> getEjbRelationshipRole();

}
