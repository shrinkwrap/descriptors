package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface EjbRelationType<T> extends Child<T>
{
   public EjbRelationType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public EjbRelationType<T> setEjbRelationName(String ejbRelationName);

   @NodeInfo(xmlName = "ejb-relation-name")
   public String getEjbRelationName();

   @NodeInfo(xmlName = "ejb-relationship-role")
   public EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole();

}
