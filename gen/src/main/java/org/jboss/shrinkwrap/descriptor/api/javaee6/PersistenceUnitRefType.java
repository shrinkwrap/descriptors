package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface PersistenceUnitRefType<T> extends Child<T>
{

   public PersistenceUnitRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public PersistenceUnitRefType<T> setInjectionTarget(InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget);
   public InjectionTargetType<PersistenceUnitRefType<T>> getInjectionTarget();


   public PersistenceUnitRefType<T> setDescription(String description);
   public String getDescription();


   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName);
   public String getPersistenceUnitRefName();


   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName);
   public String getPersistenceUnitName();
}
