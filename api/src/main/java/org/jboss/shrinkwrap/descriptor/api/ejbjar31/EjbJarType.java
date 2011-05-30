package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface EjbJarType<T> extends Child<T>, DescriptionGroup<T>
{
   public EjbJarType<T> setModuleName(String moduleName);
   public String getModuleName();

   public EjbJarType<T> setEnterpriseBeans(EnterpriseBeansType<T> enterpriseBeans);
   public EnterpriseBeansType<T> getEnterpriseBeans();

   public EjbJarType<T> setInterceptors(InterceptorsType<T> interceptors);
   public InterceptorsType<T> getInterceptors();

   public EjbJarType<T> setRelationships(RelationshipsType<T> relationships);
   public RelationshipsType<T> getRelationships();

   public EjbJarType<T> setAssemblyDescriptor(AssemblyDescriptorType<T> assemblyDescriptor);
   public AssemblyDescriptorType<T> getAssemblyDescriptor();

   public EjbJarType<T> setEjbClientJar(String ejbClientJar);
   public String getEjbClientJar();
}
