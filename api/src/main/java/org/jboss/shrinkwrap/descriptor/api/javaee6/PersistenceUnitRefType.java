package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface PersistenceUnitRefType<T> extends Child<T>, ResourceBaseGroup<T>
{
   public PersistenceUnitRefType<T> Description(String Description);

   public PersistenceUnitRefType<T> PersistenceUnitRefName(String PersistenceUnitRefName);

   public PersistenceUnitRefType<T> PersistenceUnitName(String PersistenceUnitName);
}