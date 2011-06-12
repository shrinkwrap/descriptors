package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface EjbRefType<T> extends Child<T>
{

   public EjbRefType<T> setLookupName(String lookupName);

   public String getLookupName();

   public EjbRefType<T> setMappedName(String mappedName);

   public String getMappedName();

   public EjbRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<EjbRefType<T>> getInjectionTarget();

   public List<InjectionTargetType<EjbRefType<T>>> getInjectionTargetList();

   public EjbRefType<T> setDescription(String description);

   public EjbRefType<T> setDescription(String... values);

   public List<String> getDescriptionList();

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
