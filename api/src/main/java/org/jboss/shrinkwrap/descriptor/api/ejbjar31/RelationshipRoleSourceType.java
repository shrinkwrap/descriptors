package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface RelationshipRoleSourceType<T> extends Child<T>
{
   public RelationshipRoleSourceType<T> setDescription(String description);

   public String getDescription();

   public RelationshipRoleSourceType<T> setEjbName(String ejbName);

   public String getEjbName();
}
