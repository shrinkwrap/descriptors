package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface EjbLocalRefType<T> extends Child<T>
{
   public EjbLocalRefType<T> setLookupName(String lookupName);

   @NodeInfo(xmlName = "lookup-name")
   public String getLookupName();

   public EjbLocalRefType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   @NodeInfo(xmlName = "injection-target")
   public InjectionTargetType<EjbLocalRefType<T>> injectionTarget();

   public EjbLocalRefType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public EjbLocalRefType<T> setEjbRefName(String ejbRefName);

   @NodeInfo(xmlName = "ejb-ref-name")
   public String getEjbRefName();

   public EjbLocalRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);

   public EjbLocalRefType<T> setEjbRefType(String ejbRefType);

   @NodeInfo(xmlName = "ejb-ref-type")
   public String getEjbRefType();

   public EjbLocalRefType<T> setLocalHome(String localHome);

   @NodeInfo(xmlName = "local-home")
   public String getLocalHome();

   public EjbLocalRefType<T> setLocal(String local);

   @NodeInfo(xmlName = "local")
   public String getLocal();

   public EjbLocalRefType<T> setEjbLink(String ejbLink);

   @NodeInfo(xmlName = "ejb-link")
   public String getEjbLink();
}
