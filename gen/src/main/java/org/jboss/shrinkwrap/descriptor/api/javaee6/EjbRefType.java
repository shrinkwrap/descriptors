package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface EjbRefType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public EjbRefType<T> setInjectionTarget(InjectionTargetType<EjbRefType<T>> injectionTarget);

   public InjectionTargetType<EjbRefType<T>> getInjectionTarget();
   public List<InjectionTargetType<EjbRefType<T>>> getInjectionTargetList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public EjbRefType<T> setDescription(String description);
   public EjbRefType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbRefType<T> setEjbRefName(String ejbRefName);

   public String getEjbRefName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbRefType<T> setEjbRefType(String ejbRefType);

   public String getEjbRefType();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbRefType<T> setHome(String home);

   public String getHome();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbRefType<T> setRemote(String remote);

   public String getRemote();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbRefType<T> setEjbLink(String ejbLink);

   public String getEjbLink();

}
