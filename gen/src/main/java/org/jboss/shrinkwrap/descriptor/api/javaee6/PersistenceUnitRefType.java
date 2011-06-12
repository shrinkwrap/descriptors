package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface PersistenceUnitRefType<T> extends Child<T>
{

   public PersistenceUnitRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   public PersistenceUnitRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<PersistenceUnitRefType<T>> getInjectionTarget();

   public List<InjectionTargetType<PersistenceUnitRefType<T>>> getInjectionTargetList();

   public PersistenceUnitRefType<T> setDescription(String description);

   public PersistenceUnitRefType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName);

   public String getPersistenceUnitRefName();

   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public String getPersistenceUnitName();

}
