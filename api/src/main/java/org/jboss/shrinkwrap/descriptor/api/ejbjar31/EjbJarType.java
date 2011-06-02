package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface EjbJarType<T> extends Child<T>
{
   public EjbJarType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public EjbJarType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<EjbJarType<T>> icon();

   public EjbJarType<T> setModuleName(String moduleName);

   @NodeInfo(xmlName = "module-name")
   public String getModuleName();

   @NodeInfo(xmlName = "enterprise-beans")
   public EnterpriseBeansType<EjbJarType<T>> enterpriseBeans();

   @NodeInfo(xmlName = "interceptors")
   public InterceptorsType<EjbJarType<T>> interceptors();

   @NodeInfo(xmlName = "relationships")
   public RelationshipsType<EjbJarType<T>> relationships();

   @NodeInfo(xmlName = "assembly-descriptor")
   public AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor();

   public EjbJarType<T> setEjbClientJar(String ejbClientJar);

   @NodeInfo(xmlName = "ejb-client-jar")
   public String getEjbClientJar();
}
