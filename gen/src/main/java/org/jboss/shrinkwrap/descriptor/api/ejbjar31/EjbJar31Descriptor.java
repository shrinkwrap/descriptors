package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface EjbJar31Descriptor<T> extends Descriptor
{

   public T setDescription(String description);
   public String getDescription();

   public T setDisplayName(String displayName);
   public String getDisplayName();

   public T setIcon(IconType<T> icon);
   public IconType<T> getIcon();


   public T setModuleName(String moduleName);
   public String getModuleName();

   public T setEnterpriseBeans(EnterpriseBeansType<T> enterpriseBeans);
   public EnterpriseBeansType<T> getEnterpriseBeans();


   public T setInterceptors(InterceptorsType<T> interceptors);
   public InterceptorsType<T> getInterceptors();


   public T setRelationships(RelationshipsType<T> relationships);
   public RelationshipsType<T> getRelationships();


   public T setAssemblyDescriptor(AssemblyDescriptorType<T> assemblyDescriptor);
   public AssemblyDescriptorType<T> getAssemblyDescriptor();


   public T setEjbClientJar(String ejbClientJar);
   public String getEjbClientJar();
}
