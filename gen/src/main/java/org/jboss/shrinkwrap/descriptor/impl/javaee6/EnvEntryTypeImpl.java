package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class EnvEntryTypeImpl<T> implements Child<T>, EnvEntryType<T>
{
   public final static String nodeName = "env-entry";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String envEntryName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String envEntryType;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String envEntryValue;

   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String lookupName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String mappedName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private InjectionTargetType<EnvEntryType<T>> injectionTarget;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EnvEntryTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EnvEntryTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EnvEntryType<T> setLookupName(String lookupName)   {
      this.lookupName = lookupName;
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EnvEntryType<T> setMappedName(String mappedName)   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public EnvEntryType<T> setInjectionTarget(InjectionTargetType<EnvEntryType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<EnvEntryType<T>> getInjectionTarget()
   {
      return new InjectionTargetTypeImpl<EnvEntryType<T>>(this, "", childNode);
   }

   public List<InjectionTargetType<EnvEntryType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<EnvEntryType<T>>> list = new ArrayList<InjectionTargetType<EnvEntryType<T>>>();
      List<Node> nodeList = childNode.get(InjectionTargetTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         InjectionTargetType<EnvEntryType<T>>  type = new InjectionTargetTypeImpl<EnvEntryType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public EnvEntryType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public EnvEntryType<T> setDescription(String ... values)
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

   public EnvEntryType<T> setEnvEntryName(String envEntryName)   {
      this.envEntryName = envEntryName;
      childNode.getOrCreate("env-entry-name").text(envEntryName);
      return this;
   }

   public String getEnvEntryName()
   {
      return childNode.textValue("env-entry-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EnvEntryType<T> setEnvEntryType(String envEntryType)   {
      this.envEntryType = envEntryType;
      childNode.getOrCreate("env-entry-type").text(envEntryType);
      return this;
   }

   public String getEnvEntryType()
   {
      return childNode.textValue("env-entry-type");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public EnvEntryType<T> setEnvEntryValue(String envEntryValue)   {
      this.envEntryValue = envEntryValue;
      childNode.getOrCreate("env-entry-value").text(envEntryValue);
      return this;
   }

   public String getEnvEntryValue()
   {
      return childNode.textValue("env-entry-value");
   }

}
