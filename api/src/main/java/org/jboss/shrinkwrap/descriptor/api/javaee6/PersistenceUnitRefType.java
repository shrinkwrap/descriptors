package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface PersistenceUnitRefType<T> extends Child<T>
{
   public PersistenceUnitRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public PersistenceUnitRefType<T> setInjectionTarget(InjectionTargetType<T> injectionTarget);
   public InjectionTargetType<T> getInjectionTarget();

   public PersistenceUnitRefType<T> setDescription(String description);
   public String getDescription();

   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName);
   public String getPersistenceUnitRefName();

   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName);
   public String getPersistenceUnitName();
}
