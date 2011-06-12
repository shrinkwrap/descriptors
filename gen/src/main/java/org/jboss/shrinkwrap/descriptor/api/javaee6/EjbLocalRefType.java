package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface EjbLocalRefType<T> extends Child<T>
{

   public EjbLocalRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   public EjbLocalRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   public EjbLocalRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<EjbLocalRefType<T>> getInjectionTarget();

   public List<InjectionTargetType<EjbLocalRefType<T>>> getInjectionTargetList();

   public EjbLocalRefType<T> setDescription(String description);

   public EjbLocalRefType<T> setDescription(String... values);

   public List<String> getDescriptionList();

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
