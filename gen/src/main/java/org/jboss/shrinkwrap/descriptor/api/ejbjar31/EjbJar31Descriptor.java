package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 */
public interface EjbJar31Descriptor extends Descriptor, DescriptorNamespace<EjbJar31Descriptor>
{

   public EjbJar31Descriptor setDescription(String description);

   public EjbJar31Descriptor setDescriptionList(String... values);

   public EjbJar31Descriptor removeAllDescription();

   public List<String> getDescriptionList();

   public EjbJar31Descriptor setDisplayName(String displayName);

   public EjbJar31Descriptor setDisplayNameList(String... values);

   public EjbJar31Descriptor removeAllDisplayName();

   public List<String> getDisplayNameList();

   public EjbJar31Descriptor removeAllIcon();

   public IconType<EjbJar31Descriptor> icon();

   public List<IconType<EjbJar31Descriptor>> getIconList();

   public EjbJar31Descriptor setModuleName(String moduleName);

   public EjbJar31Descriptor removeModuleName();

   public String getModuleName();

   public EjbJar31Descriptor removeEnterpriseBeans();

   public EnterpriseBeansType<EjbJar31Descriptor> enterpriseBeans();

   public EjbJar31Descriptor removeInterceptors();

   public InterceptorsType<EjbJar31Descriptor> interceptors();

   public EjbJar31Descriptor removeRelationships();

   public RelationshipsType<EjbJar31Descriptor> relationships();

   public EjbJar31Descriptor removeAssemblyDescriptor();

   public AssemblyDescriptorType<EjbJar31Descriptor> assemblyDescriptor();

   public EjbJar31Descriptor setEjbClientJar(String ejbClientJar);

   public EjbJar31Descriptor removeEjbClientJar();

   public String getEjbClientJar();

}
