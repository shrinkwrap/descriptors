package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface EjbJarType<T> extends Child<T>, DescriptionGroup<T>

{
   public EjbJarType<T> setModuleName(String moduleName);

   public String getModuleName();

   public EnterpriseBeansType<EjbJarType<T>> setEnterpriseBeans(EnterpriseBeansType<T> enterpriseBeans);

   public EnterpriseBeansType<EjbJarType<T>> getEnterpriseBeans();

   public InterceptorsType<EjbJarType<T>> setInterceptors(InterceptorsType<T> interceptors);

   public InterceptorsType<EjbJarType<T>> getInterceptors();

   public RelationshipsType<EjbJarType<T>> setRelationships(RelationshipsType<T> relationships);

   public RelationshipsType<EjbJarType<T>> getRelationships();

   public AssemblyDescriptorType<EjbJarType<T>> setAssemblyDescriptor(AssemblyDescriptorType<T> assemblyDescriptor);

   public AssemblyDescriptorType<EjbJarType<T>> getAssemblyDescriptor();

   public EjbJarType<T> setEjbClientJar(String ejbClientJar);

   public String getEjbClientJar();
}
