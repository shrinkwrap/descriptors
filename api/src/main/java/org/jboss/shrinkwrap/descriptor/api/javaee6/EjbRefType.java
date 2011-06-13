package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public interface EjbRefType<T> extends Child<T>
{

   public EjbRefType<T> setLookupName(String lookupName);

   public EjbRefType<T> removeLookupName();

   public String getLookupName();

   public EjbRefType<T> setMappedName(String mappedName);

   public EjbRefType<T> removeMappedName();

   public String getMappedName();

   public EjbRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<EjbRefType<T>> injectionTarget();

   public List<InjectionTargetType<EjbRefType<T>>> getInjectionTargetList();

   public EjbRefType<T> setDescription(String description);

   public EjbRefType<T> setDescriptionList(String... values);

   public EjbRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public EjbRefType<T> setEjbRefName(String ejbRefName);

   public EjbRefType<T> removeEjbRefName();

   public String getEjbRefName();

   public EjbRefType<T> setEjbRefType(String ejbRefType);

   public EjbRefType<T> removeEjbRefType();

   public String getEjbRefType();

   public EjbRefType<T> setHome(String home);

   public EjbRefType<T> removeHome();

   public String getHome();

   public EjbRefType<T> setRemote(String remote);

   public EjbRefType<T> removeRemote();

   public String getRemote();

   public EjbRefType<T> setEjbLink(String ejbLink);

   public EjbRefType<T> removeEjbLink();

   public String getEjbLink();

}
