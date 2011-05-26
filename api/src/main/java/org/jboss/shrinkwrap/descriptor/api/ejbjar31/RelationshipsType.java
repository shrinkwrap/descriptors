package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface RelationshipsType<T> extends Child<T>
{
   public RelationshipsType<T> setDescription(String description);

   public String getDescription();

   public RelationshipsType<T> setEjbRelation(EjbRelationType<T> ejbRelation);

   public EjbRelationType<RelationshipsType<T>> getEjbRelation();
}
