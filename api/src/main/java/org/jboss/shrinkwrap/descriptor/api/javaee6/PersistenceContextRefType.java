package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
 */
public interface PersistenceContextRefType<T> extends Child<T>
{

   public PersistenceContextRefType<T> setMappedName(String mappedName);

   public PersistenceContextRefType<T> removeMappedName();

   public String getMappedName();

   public PersistenceContextRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<PersistenceContextRefType<T>> injectionTarget();

   public List<InjectionTargetType<PersistenceContextRefType<T>>> getInjectionTargetList();

   public PersistenceContextRefType<T> setDescription(String description);

   public PersistenceContextRefType<T> setDescriptionList(String... values);

   public PersistenceContextRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName);

   public PersistenceContextRefType<T> removePersistenceContextRefName();

   public String getPersistenceContextRefName();

   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public PersistenceContextRefType<T> removePersistenceUnitName();

   public String getPersistenceUnitName();

   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType);

   public PersistenceContextRefType<T> removePersistenceContextType();

   public String getPersistenceContextType();

   public PersistenceContextRefType<T> removeAllPersistenceProperty();

   public PropertyType<PersistenceContextRefType<T>> persistenceProperty();

   public List<PropertyType<PersistenceContextRefType<T>>> getPersistencePropertyList();

}
