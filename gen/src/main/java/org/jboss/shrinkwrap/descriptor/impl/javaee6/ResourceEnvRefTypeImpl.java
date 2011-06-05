package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class ResourceEnvRefTypeImpl<T> implements Child<T>, ResourceEnvRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String resourceEnvRefName;
   private String resourceEnvRefType;

   private String lookupName;
   private String mappedName;
   private InjectionTargetType<ResourceEnvRefType<T>> injectionTarget;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ResourceEnvRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("resource-env-ref");   }


   public T up()
   {
      return t;
   }



   public ResourceEnvRefType<T> setLookupName(String lookupName)
   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return lookupName;
   }


   public ResourceEnvRefType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }


   public ResourceEnvRefType<T> setInjectionTarget(InjectionTargetType<ResourceEnvRefType<T>> injectionTarget)
   {
      this.injectionTarget = injectionTarget;
      childNode.getOrCreate("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<ResourceEnvRefType<T>> getInjectionTarget()
   {
      if( injectionTarget == null)
      {
          injectionTarget = new InjectionTargetTypeImpl<ResourceEnvRefType<T>>(this, "", childNode);
      }
      return injectionTarget;
   }



   public ResourceEnvRefType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName)
   {
      this.resourceEnvRefName = resourceEnvRefName;
      childNode.getOrCreate("resource-env-ref-name").text(resourceEnvRefName);
      return this;
   }

   public String getResourceEnvRefName()
   {
      return resourceEnvRefName;
   }



   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType)
   {
      this.resourceEnvRefType = resourceEnvRefType;
      childNode.getOrCreate("resource-env-ref-type").text(resourceEnvRefType);
      return this;
   }

   public String getResourceEnvRefType()
   {
      return resourceEnvRefType;
   }

}
