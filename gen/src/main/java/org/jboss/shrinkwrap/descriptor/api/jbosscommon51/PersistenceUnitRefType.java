package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 */
public interface PersistenceUnitRefType<T> extends Child<T>
{

   public PersistenceUnitRefType<T> setJndiName(String jndiName);

   public PersistenceUnitRefType<T> removeJndiName();

   public String getJndiName();

   public PersistenceUnitRefType<T> setMappedName(String mappedName);

   public PersistenceUnitRefType<T> removeMappedName();

   public String getMappedName();

   public PersistenceUnitRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget();

   public List<InjectionTargetType<PersistenceUnitRefType<T>>> getInjectionTargetList();

   public PersistenceUnitRefType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

   public PersistenceUnitRefType<T> setDescription(String description);

   public PersistenceUnitRefType<T> setDescriptionList(String... values);

   public PersistenceUnitRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName);

   public PersistenceUnitRefType<T> removePersistenceUnitRefName();

   public String getPersistenceUnitRefName();

   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public PersistenceUnitRefType<T> removePersistenceUnitName();

   public String getPersistenceUnitName();

}
