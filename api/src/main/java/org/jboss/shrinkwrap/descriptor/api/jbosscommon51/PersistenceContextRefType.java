package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PropertyType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 */
public interface PersistenceContextRefType<T> extends Child<T>
{

   public PersistenceContextRefType<T> setJndiName(String jndiName);

   public PersistenceContextRefType<T> removeJndiName();

   public String getJndiName();

   public PersistenceContextRefType<T> setMappedName(String mappedName);

   public PersistenceContextRefType<T> removeMappedName();

   public String getMappedName();

   public PersistenceContextRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<PersistenceContextRefType<T>> injectionTarget();

   public List<InjectionTargetType<PersistenceContextRefType<T>>> getInjectionTargetList();

   public PersistenceContextRefType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

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

   public PersistenceContextRefType<T> setPersistenceContextType(PersistenceContextTypeType persistenceContextType);

   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType);

   public PersistenceContextTypeType getPersistenceContextType();

   public String getPersistenceContextTypeAsString();

   public PersistenceContextRefType<T> removeAllPersistenceProperty();

   public PropertyType<PersistenceContextRefType<T>> persistenceProperty();

   public List<PropertyType<PersistenceContextRefType<T>>> getPersistencePropertyList();

}
