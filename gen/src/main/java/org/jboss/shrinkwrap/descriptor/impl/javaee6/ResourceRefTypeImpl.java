package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class ResourceRefTypeImpl<T> implements Child<T>, ResourceRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String resRefName;
   private String resType;
   private String resAuth;
   private String resSharingScope;

   private String lookupName;
   private String mappedName;
   private InjectionTargetType<ResourceRefType<T>> injectionTarget;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ResourceRefTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("resource-ref");   }


   public T up()
   {
      return t;
   }



   public ResourceRefType<T> setLookupName(String lookupName)
   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return lookupName;
   }


   public ResourceRefType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }


   public ResourceRefType<T> setInjectionTarget(InjectionTargetType<ResourceRefType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<ResourceRefType<T>> getInjectionTarget()
   {
      if( injectionTarget == null)
      {
          injectionTarget = new InjectionTargetTypeImpl<ResourceRefType<T>>(this, "", childNode);
      }
      return injectionTarget;
   }



   public ResourceRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public ResourceRefType<T> setResRefName(String resRefName)
   {
      this.resRefName = resRefName;
      childNode.getOrCreate("res-ref-name").text(resRefName);
      return this;
   }

   public String getResRefName()
   {
      return resRefName;
   }



   public ResourceRefType<T> setResType(String resType)
   {
      this.resType = resType;
      childNode.getOrCreate("res-type").text(resType);
      return this;
   }

   public String getResType()
   {
      return resType;
   }



   public ResourceRefType<T> setResAuth(String resAuth)
   {
      this.resAuth = resAuth;
      childNode.getOrCreate("res-auth").text(resAuth);
      return this;
   }

   public String getResAuth()
   {
      return resAuth;
   }



   public ResourceRefType<T> setResSharingScope(String resSharingScope)
   {
      this.resSharingScope = resSharingScope;
      childNode.getOrCreate("res-sharing-scope").text(resSharingScope);
      return this;
   }

   public String getResSharingScope()
   {
      return resSharingScope;
   }

}
