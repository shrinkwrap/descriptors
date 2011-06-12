package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class ResourceEnvRefTypeImpl<T> implements Child<T>, ResourceEnvRefType<T>
{
   public final static String nodeName = "resource-env-ref";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String resourceEnvRefName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String resourceEnvRefType;

   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String lookupName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String mappedName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private InjectionTargetType<ResourceEnvRefType<T>> injectionTarget;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ResourceEnvRefTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ResourceEnvRefTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ResourceEnvRefType<T> setLookupName(String lookupName)   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ResourceEnvRefType<T> setMappedName(String mappedName)   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ResourceEnvRefType<T> setInjectionTarget(InjectionTargetType<ResourceEnvRefType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<ResourceEnvRefType<T>> getInjectionTarget()
   {
      return new InjectionTargetTypeImpl<ResourceEnvRefType<T>>(this, "", childNode);
   }

   public List<InjectionTargetType<ResourceEnvRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<ResourceEnvRefType<T>>> list = new ArrayList<InjectionTargetType<ResourceEnvRefType<T>>>();
      List<Node> nodeList = childNode.get(InjectionTargetTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         InjectionTargetType<ResourceEnvRefType<T>>  type = new InjectionTargetTypeImpl<ResourceEnvRefType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ResourceEnvRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ResourceEnvRefType<T> setDescription(String ... values)
   {
      for(String name: values)
      {
         setDescription(description);
      }
         return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName)   {
      this.resourceEnvRefName = resourceEnvRefName;
      childNode.getOrCreate("resource-env-ref-name").text(resourceEnvRefName);
      return this;
   }

   public String getResourceEnvRefName()
   {
      return childNode.textValue("resource-env-ref-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType)   {
      this.resourceEnvRefType = resourceEnvRefType;
      childNode.getOrCreate("resource-env-ref-type").text(resourceEnvRefType);
      return this;
   }

   public String getResourceEnvRefType()
   {
      return childNode.textValue("resource-env-ref-type");
   }

}
