package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface EjbLocalRefType<T> extends Child<T>
{

   public EjbLocalRefType<T> setLookupName(String lookupName);
   public String getLookupName();

   public EjbLocalRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public EjbLocalRefType<T> setInjectionTarget(InjectionTargetType<EjbLocalRefType<T>> injectionTarget);
   public InjectionTargetType<EjbLocalRefType<T>> getInjectionTarget();


   public EjbLocalRefType<T> setDescription(String description);
   public String getDescription();


   public EjbLocalRefType<T> setEjbRefName(String ejbRefName);
   public String getEjbRefName();


   public EjbLocalRefType<T> setEjbRefType(String ejbRefType);
   public String getEjbRefType();


   public EjbLocalRefType<T> setLocalHome(String localHome);
   public String getLocalHome();


   public EjbLocalRefType<T> setLocal(String local);
   public String getLocal();


   public EjbLocalRefType<T> setEjbLink(String ejbLink);
   public String getEjbLink();
}
