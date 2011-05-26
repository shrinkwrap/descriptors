package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface PersistenceContextRefType<T> extends Child<T>, ResourceBaseGroup<T>
{
   public PersistenceContextRefType<T> setDescription(String description);

   public String getDescription();

   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName);

   public String getPersistenceContextRefName();

   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public String getPersistenceUnitName();

   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType);

   public String getPersistenceContextType();

   public PersistenceContextRefType<T> setPersistenceProperty(PropertyType<T> persistenceProperty);

   public PropertyType<PersistenceContextRefType<T>> getPersistenceProperty();
}
