package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface EjbRefType<T> extends Child<T>
{
   public EjbRefType<T> setLookupName(String lookupName);

   @NodeInfo(xmlName = "lookup-name")
   public String getLookupName();

   public EjbRefType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   @NodeInfo(xmlName = "injection-target")
   public InjectionTargetType<EjbRefType<T>> injectionTarget();

   public EjbRefType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public EjbRefType<T> setEjbRefName(String ejbRefName);

   @NodeInfo(xmlName = "ejb-ref-name")
   public String getEjbRefName();

   public EjbRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);

   public EjbRefType<T> setEjbRefType(String ejbRefType);

   @NodeInfo(xmlName = "ejb-ref-type")
   public String getEjbRefType();

   public EjbRefType<T> setHome(String home);

   @NodeInfo(xmlName = "home")
   public String getHome();

   public EjbRefType<T> setRemote(String remote);

   @NodeInfo(xmlName = "remote")
   public String getRemote();

   public EjbRefType<T> setEjbLink(String ejbLink);

   @NodeInfo(xmlName = "ejb-link")
   public String getEjbLink();
}
