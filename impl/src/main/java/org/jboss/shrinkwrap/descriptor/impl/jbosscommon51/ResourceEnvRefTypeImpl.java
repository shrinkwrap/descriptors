package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 */
public class ResourceEnvRefTypeImpl<T> implements Child<T>, ResourceEnvRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ResourceEnvRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ResourceEnvRefTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> setJndiName(String jndiName)
   {
      childNode.getOrCreate("jndi-name").text(jndiName);
      return this;
   }

   public ResourceEnvRefType<T> removeJndiName()
   {
      childNode.remove("jndi-name");
      return this;
   }

   public String getJndiName()
   {
      return childNode.textValue("jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public ResourceEnvRefType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   public InjectionTargetType<ResourceEnvRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<ResourceEnvRefType<T>>(this, "injection-target", childNode);
   }

   public List<InjectionTargetType<ResourceEnvRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<ResourceEnvRefType<T>>> list = new ArrayList<InjectionTargetType<ResourceEnvRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<ResourceEnvRefType<T>> type = new InjectionTargetTypeImpl<ResourceEnvRefType<T>>(this,
               "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> ignoreDependency()
   {
      childNode.getOrCreate("ignore-dependency");
      return this;
   }

   public Boolean isIgnoreDependency()
   {
      return childNode.getSingle("ignore-dependency") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ResourceEnvRefType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public ResourceEnvRefType<T> removeAllDescription()
   {
      childNode.remove("description");
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

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName)
   {
      childNode.getOrCreate("resource-env-ref-name").text(resourceEnvRefName);
      return this;
   }

   public ResourceEnvRefType<T> removeResourceEnvRefName()
   {
      childNode.remove("resource-env-ref-name");
      return this;
   }

   public String getResourceEnvRefName()
   {
      return childNode.textValue("resource-env-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType)
   {
      childNode.getOrCreate("resource-env-ref-type").text(resourceEnvRefType);
      return this;
   }

   public ResourceEnvRefType<T> removeResourceEnvRefType()
   {
      childNode.remove("resource-env-ref-type");
      return this;
   }

   public String getResourceEnvRefType()
   {
      return childNode.textValue("resource-env-ref-type");
   }

}
