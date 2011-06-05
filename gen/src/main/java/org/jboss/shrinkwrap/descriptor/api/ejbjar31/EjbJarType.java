package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface EjbJarType<T> extends Child<T>
{

   public EjbJarType<T> setDescription(String description);
   public String getDescription();

   public EjbJarType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public EjbJarType<T> setIcon(IconType<EjbJarType<T>> icon);
   public IconType<EjbJarType<T>> getIcon();


   public EjbJarType<T> setModuleName(String moduleName);
   public String getModuleName();


   public EjbJarType<T> setEnterpriseBeans(EnterpriseBeansType<EjbJarType<T>> enterpriseBeans);
   public EnterpriseBeansType<EjbJarType<T>> getEnterpriseBeans();



   public EjbJarType<T> setInterceptors(InterceptorsType<EjbJarType<T>> interceptors);
   public InterceptorsType<EjbJarType<T>> getInterceptors();



   public EjbJarType<T> setRelationships(RelationshipsType<EjbJarType<T>> relationships);
   public RelationshipsType<EjbJarType<T>> getRelationships();



   public EjbJarType<T> setAssemblyDescriptor(AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor);
   public AssemblyDescriptorType<EjbJarType<T>> getAssemblyDescriptor();



   public EjbJarType<T> setEjbClientJar(String ejbClientJar);
   public String getEjbClientJar();
}
