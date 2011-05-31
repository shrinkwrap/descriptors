package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface EjbRefType<T> extends Child<T>
{
   public EjbRefType<T> setLookupName(String lookupName);
   public String getLookupName();

   public EjbRefType<T> setMappedName(String mappedName);
   public String getMappedName();

   public EjbRefType<T> setInjectionTarget(InjectionTargetType<T> injectionTarget);
   public InjectionTargetType<T> getInjectionTarget();

   public EjbRefType<T> setDescription(String description);
   public String getDescription();

   public EjbRefType<T> setEjbRefName(String ejbRefName);
   public String getEjbRefName();

   public EjbRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);
   public EjbRefTypeType getEjbRefType();

   public EjbRefType<T> setHome(String home);
   public String getHome();

   public EjbRefType<T> setRemote(String remote);
   public String getRemote();

   public EjbRefType<T> setEjbLink(String ejbLink);
   public String getEjbLink();
}
