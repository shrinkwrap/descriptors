package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface PersistenceContextRefType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public PersistenceContextRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public PersistenceContextRefType<T> setInjectionTarget(InjectionTargetType<PersistenceContextRefType<T>> injectionTarget);

   public InjectionTargetType<PersistenceContextRefType<T>> getInjectionTarget();
   public List<InjectionTargetType<PersistenceContextRefType<T>>> getInjectionTargetList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public PersistenceContextRefType<T> setDescription(String description);
   public PersistenceContextRefType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName);

   public String getPersistenceContextRefName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public String getPersistenceUnitName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType);

   public String getPersistenceContextType();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public PersistenceContextRefType<T> setPersistenceProperty(PropertyType<PersistenceContextRefType<T>> persistenceProperty);

   public PropertyType<PersistenceContextRefType<T>> getPersistenceProperty();
   public List<PropertyType<PersistenceContextRefType<T>>> getPersistencePropertyList();


}
