package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface PersistenceUnitRefType<T> extends Child<T>, ResourceBaseGroup<T>

{
   public PersistenceUnitRefType<T> setDescription(String description);

   public String getDescription();

   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName);

   public String getPersistenceUnitRefName();

   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public String getPersistenceUnitName();
}
