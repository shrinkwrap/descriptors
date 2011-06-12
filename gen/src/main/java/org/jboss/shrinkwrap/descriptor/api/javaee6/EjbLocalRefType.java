package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface EjbLocalRefType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbLocalRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbLocalRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public EjbLocalRefType<T> setInjectionTarget(InjectionTargetType<EjbLocalRefType<T>> injectionTarget);

   public InjectionTargetType<EjbLocalRefType<T>> getInjectionTarget();
   public List<InjectionTargetType<EjbLocalRefType<T>>> getInjectionTargetList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public EjbLocalRefType<T> setDescription(String description);
   public EjbLocalRefType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbLocalRefType<T> setEjbRefName(String ejbRefName);

   public String getEjbRefName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbLocalRefType<T> setEjbRefType(String ejbRefType);

   public String getEjbRefType();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbLocalRefType<T> setLocalHome(String localHome);

   public String getLocalHome();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbLocalRefType<T> setLocal(String local);

   public String getLocal();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public EjbLocalRefType<T> setEjbLink(String ejbLink);

   public String getEjbLink();

}
