package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJarType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class EjbJarTypeImpl<T> implements Child<T>, EjbJarType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String moduleName;
   private EnterpriseBeansType<EjbJarType<T>> enterpriseBeans;
   private InterceptorsType<EjbJarType<T>> interceptors;
   private RelationshipsType<EjbJarType<T>> relationships;
   private AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor;
   private String ejbClientJar;

   private String description;
   private String displayName;
   private IconType<EjbJarType<T>> icon;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EjbJarTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("");   }


   public T up()
   {
      return t;
   }



   public EjbJarType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public EjbJarType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public EjbJarType<T> setIcon(IconType<EjbJarType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<EjbJarType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<EjbJarType<T>>(this, "", childNode);
      }
      return icon;
   }



   public EjbJarType<T> setModuleName(String moduleName)
   {
      this.moduleName = moduleName;
      childNode.getOrCreate("module-name").text(moduleName);
      return this;
   }

   public String getModuleName()
   {
      return moduleName;
   }



   public EjbJarType<T> setEnterpriseBeans(EnterpriseBeansType<EjbJarType<T>> enterpriseBeans)
   {
      this.enterpriseBeans = enterpriseBeans;
      childNode.getOrCreate("enterprise-beans").text(enterpriseBeans);
      return this;
   }

   public EnterpriseBeansType<EjbJarType<T>> getEnterpriseBeans()
   {
      if( enterpriseBeans == null)
      {
          enterpriseBeans = new EnterpriseBeansTypeImpl<EjbJarType<T>>(this, "", childNode);
      }
      return enterpriseBeans;
   }




   public EjbJarType<T> setInterceptors(InterceptorsType<EjbJarType<T>> interceptors)
   {
      this.interceptors = interceptors;
      childNode.getOrCreate("interceptors").text(interceptors);
      return this;
   }

   public InterceptorsType<EjbJarType<T>> getInterceptors()
   {
      if( interceptors == null)
      {
          interceptors = new InterceptorsTypeImpl<EjbJarType<T>>(this, "", childNode);
      }
      return interceptors;
   }




   public EjbJarType<T> setRelationships(RelationshipsType<EjbJarType<T>> relationships)
   {
      this.relationships = relationships;
      childNode.getOrCreate("relationships").text(relationships);
      return this;
   }

   public RelationshipsType<EjbJarType<T>> getRelationships()
   {
      if( relationships == null)
      {
          relationships = new RelationshipsTypeImpl<EjbJarType<T>>(this, "", childNode);
      }
      return relationships;
   }




   public EjbJarType<T> setAssemblyDescriptor(AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor)
   {
      this.assemblyDescriptor = assemblyDescriptor;
      childNode.getOrCreate("assembly-descriptor").text(assemblyDescriptor);
      return this;
   }

   public AssemblyDescriptorType<EjbJarType<T>> getAssemblyDescriptor()
   {
      if( assemblyDescriptor == null)
      {
          assemblyDescriptor = new AssemblyDescriptorTypeImpl<EjbJarType<T>>(this, "", childNode);
      }
      return assemblyDescriptor;
   }




   public EjbJarType<T> setEjbClientJar(String ejbClientJar)
   {
      this.ejbClientJar = ejbClientJar;
      childNode.getOrCreate("ejb-client-jar").text(ejbClientJar);
      return this;
   }

   public String getEjbClientJar()
   {
      return ejbClientJar;
   }

}
