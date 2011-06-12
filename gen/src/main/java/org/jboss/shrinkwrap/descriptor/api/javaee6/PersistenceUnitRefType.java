package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface PersistenceUnitRefType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public PersistenceUnitRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public PersistenceUnitRefType<T> setInjectionTarget(InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget);

   public InjectionTargetType<PersistenceUnitRefType<T>> getInjectionTarget();
   public List<InjectionTargetType<PersistenceUnitRefType<T>>> getInjectionTargetList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public PersistenceUnitRefType<T> setDescription(String description);
   public PersistenceUnitRefType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName);

   public String getPersistenceUnitRefName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName);

   public String getPersistenceUnitName();

}
