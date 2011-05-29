package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface PersistenceContextRefType<T> extends Child<T>, ResourceBaseGroup<T>

{
   public PersistenceContextRefType<T> setDescription(String description);

   public String getDescription();

   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName);

   public String getPersistenceContextRefName();

   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public String getPersistenceUnitName();

   public PersistenceContextRefType<T> setPersistenceContextType(PersistenceContextTypeType persistenceContextType);

   public PersistenceContextTypeType getPersistenceContextType();

   public PropertyType<PersistenceContextRefType<T>> setPersistenceProperty(PropertyType<T> persistenceProperty);

   public PropertyType<PersistenceContextRefType<T>> getPersistenceProperty();
}
