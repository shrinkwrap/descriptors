package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface EjbRefType<T> extends Child<T>
{

   public EjbRefType<T> setLookupName(String lookupName);
   public String getLookupName();

   public EjbRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public EjbRefType<T> setInjectionTarget(InjectionTargetType<EjbRefType<T>> injectionTarget);
   public InjectionTargetType<EjbRefType<T>> getInjectionTarget();


   public EjbRefType<T> setDescription(String description);
   public String getDescription();


   public EjbRefType<T> setEjbRefName(String ejbRefName);
   public String getEjbRefName();


   public EjbRefType<T> setEjbRefType(String ejbRefType);
   public String getEjbRefType();


   public EjbRefType<T> setHome(String home);
   public String getHome();


   public EjbRefType<T> setRemote(String remote);
   public String getRemote();


   public EjbRefType<T> setEjbLink(String ejbLink);
   public String getEjbLink();
}
