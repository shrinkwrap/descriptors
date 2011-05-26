package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface EjbJarType<T> extends Child<T>, DescriptionGroup<T>
{
   public EjbJarType<T> setModuleName(String moduleName);

   public String getModuleName();

   public EjbJarType<T> setEnterpriseBeans(EnterpriseBeansType<T> enterpriseBeans);

   public EnterpriseBeansType<EjbJarType<T>> getEnterpriseBeans();

   public EjbJarType<T> setInterceptors(InterceptorsType<T> interceptors);

   public InterceptorsType<EjbJarType<T>> getInterceptors();

   public EjbJarType<T> setRelationships(RelationshipsType<T> relationships);

   public RelationshipsType<EjbJarType<T>> getRelationships();

   public EjbJarType<T> setAssemblyDescriptor(AssemblyDescriptorType<T> assemblyDescriptor);

   public AssemblyDescriptorType<EjbJarType<T>> getAssemblyDescriptor();

   public EjbJarType<T> setEjbClientJar(String ejbClientJar);

   public String getEjbClientJar();
}
