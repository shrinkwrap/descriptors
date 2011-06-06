package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJar31Descriptor;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class EjbJar31DescriptorImpl extends NodeProviderImplBase implements EjbJar31Descriptor<EjbJar31DescriptorImpl>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private Node model;
   private String moduleName;
   private EnterpriseBeansType<EjbJar31DescriptorImpl> enterpriseBeans;
   private InterceptorsType<EjbJar31DescriptorImpl> interceptors;
   private RelationshipsType<EjbJar31DescriptorImpl> relationships;
   private AssemblyDescriptorType<EjbJar31DescriptorImpl> assemblyDescriptor;
   private String ejbClientJar;
   private String description;
   private String displayName;
   private IconType<EjbJar31DescriptorImpl> icon;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EjbJar31DescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("ejb-jar"));
   }

   public EjbJar31DescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
   }

   // -------------------------------------------------------------------------------------||
   // Methods -----------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }

   protected DescriptorExporter getExporter()
   {
      return new XMLExporter();
   }

   public EjbJar31DescriptorImpl setModuleName(String moduleName)
   {
      this.moduleName = moduleName;
      model.getOrCreate("module-name").text(moduleName);
      return this;
   }

   public String getModuleName()
   {
      return moduleName;
   }


   public EjbJar31DescriptorImpl setEnterpriseBeans(EnterpriseBeansType<EjbJar31DescriptorImpl> enterpriseBeans)
   {
      this.enterpriseBeans = enterpriseBeans;
      model.getOrCreate("enterprise-beans").text(enterpriseBeans);
      return this;
   }

   public EnterpriseBeansType<EjbJar31DescriptorImpl> getEnterpriseBeans()
   {
      if( enterpriseBeans == null)
      {
          enterpriseBeans = new EnterpriseBeansTypeImpl<EjbJar31DescriptorImpl>(this, "", model);
      }
      return enterpriseBeans;
   }



   public EjbJar31DescriptorImpl setInterceptors(InterceptorsType<EjbJar31DescriptorImpl> interceptors)
   {
      this.interceptors = interceptors;
      model.getOrCreate("interceptors").text(interceptors);
      return this;
   }

   public InterceptorsType<EjbJar31DescriptorImpl> getInterceptors()
   {
      if( interceptors == null)
      {
          interceptors = new InterceptorsTypeImpl<EjbJar31DescriptorImpl>(this, "", model);
      }
      return interceptors;
   }



   public EjbJar31DescriptorImpl setRelationships(RelationshipsType<EjbJar31DescriptorImpl> relationships)
   {
      this.relationships = relationships;
      model.getOrCreate("relationships").text(relationships);
      return this;
   }

   public RelationshipsType<EjbJar31DescriptorImpl> getRelationships()
   {
      if( relationships == null)
      {
          relationships = new RelationshipsTypeImpl<EjbJar31DescriptorImpl>(this, "", model);
      }
      return relationships;
   }



   public EjbJar31DescriptorImpl setAssemblyDescriptor(AssemblyDescriptorType<EjbJar31DescriptorImpl> assemblyDescriptor)
   {
      this.assemblyDescriptor = assemblyDescriptor;
      model.getOrCreate("assembly-descriptor").text(assemblyDescriptor);
      return this;
   }

   public AssemblyDescriptorType<EjbJar31DescriptorImpl> getAssemblyDescriptor()
   {
      if( assemblyDescriptor == null)
      {
          assemblyDescriptor = new AssemblyDescriptorTypeImpl<EjbJar31DescriptorImpl>(this, "", model);
      }
      return assemblyDescriptor;
   }



   public EjbJar31DescriptorImpl setEjbClientJar(String ejbClientJar)
   {
      this.ejbClientJar = ejbClientJar;
      model.getOrCreate("ejb-client-jar").text(ejbClientJar);
      return this;
   }

   public String getEjbClientJar()
   {
      return ejbClientJar;
   }


   public EjbJar31DescriptorImpl setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public EjbJar31DescriptorImpl setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public EjbJar31DescriptorImpl setIcon(IconType<EjbJar31DescriptorImpl> icon)
   {
      model.create("icon").text(icon);
      return this;
   }

   public IconType<EjbJar31DescriptorImpl> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<EjbJar31DescriptorImpl>(this, "", model);
      }
      return icon;
   }



}
