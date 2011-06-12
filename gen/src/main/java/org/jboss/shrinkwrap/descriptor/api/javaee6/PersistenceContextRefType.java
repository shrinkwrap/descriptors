package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface PersistenceContextRefType<T> extends Child<T>
{

   public PersistenceContextRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   public PersistenceContextRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<PersistenceContextRefType<T>> getInjectionTarget();

   public List<InjectionTargetType<PersistenceContextRefType<T>>> getInjectionTargetList();

   public PersistenceContextRefType<T> setDescription(String description);

   public PersistenceContextRefType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName);

   public String getPersistenceContextRefName();

   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public String getPersistenceUnitName();

   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType);

   public String getPersistenceContextType();

   public PersistenceContextRefType<T> removeAllPersistenceProperty();

   public PropertyType<PersistenceContextRefType<T>> getPersistenceProperty();

   public List<PropertyType<PersistenceContextRefType<T>>> getPersistencePropertyList();

}
