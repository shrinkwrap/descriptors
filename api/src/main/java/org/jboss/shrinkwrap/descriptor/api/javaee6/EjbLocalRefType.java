package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public interface EjbLocalRefType<T> extends Child<T>
{

   public EjbLocalRefType<T> setLookupName(String lookupName);
   public EjbLocalRefType<T> removeLookupName();

   public String getLookupName();


   public EjbLocalRefType<T> setMappedName(String mappedName);
   public EjbLocalRefType<T> removeMappedName();

   public String getMappedName();


   public EjbLocalRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<EjbLocalRefType<T>> injectionTarget();
   public List<InjectionTargetType<EjbLocalRefType<T>>> getInjectionTargetList();



   public EjbLocalRefType<T> setDescription(String description);
   public EjbLocalRefType<T> setDescriptionList(String ... values);
   public EjbLocalRefType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public EjbLocalRefType<T> setEjbRefName(String ejbRefName);
   public EjbLocalRefType<T> removeEjbRefName();

   public String getEjbRefName();



   public EjbLocalRefType<T> setEjbRefType(String ejbRefType);
   public EjbLocalRefType<T> removeEjbRefType();

   public String getEjbRefType();



   public EjbLocalRefType<T> setLocalHome(String localHome);
   public EjbLocalRefType<T> removeLocalHome();

   public String getLocalHome();



   public EjbLocalRefType<T> setLocal(String local);
   public EjbLocalRefType<T> removeLocal();

   public String getLocal();



   public EjbLocalRefType<T> setEjbLink(String ejbLink);
   public EjbLocalRefType<T> removeEjbLink();

   public String getEjbLink();

}
