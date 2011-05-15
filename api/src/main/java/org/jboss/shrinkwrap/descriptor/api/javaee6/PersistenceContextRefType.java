package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface PersistenceContextRefType<T> extends Child<T>, ResourceGroup<T>
{
   public PersistenceContextRefType<T> description(String Description);

   public PersistenceContextRefType<T> persistenceContextRefName(String PersistenceContextRefName);

   public PersistenceContextRefType<T> persistenceUnitName(String PersistenceUnitName);

   public PersistenceContextRefType<T> persistenceContextType(PersistenceContextTypeType PersistenceContextType);

   public PersistenceContextRefType<T> persistenceProperty(PropertyType[] persistenceProperties);
}
