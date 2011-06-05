package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface PersistenceContextRefType<T> extends Child<T>
{

   public PersistenceContextRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public PersistenceContextRefType<T> setInjectionTarget(InjectionTargetType<PersistenceContextRefType<T>> injectionTarget);
   public InjectionTargetType<PersistenceContextRefType<T>> getInjectionTarget();


   public PersistenceContextRefType<T> setDescription(String description);
   public String getDescription();


   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName);
   public String getPersistenceContextRefName();


   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName);
   public String getPersistenceUnitName();


   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType);
   public String getPersistenceContextType();


   public PersistenceContextRefType<T> setPersistenceProperty(PropertyType<PersistenceContextRefType<T>> persistenceProperty);
   public PropertyType<PersistenceContextRefType<T>> getPersistenceProperty();

}
