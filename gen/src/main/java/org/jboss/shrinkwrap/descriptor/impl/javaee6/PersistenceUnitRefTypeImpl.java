package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class PersistenceUnitRefTypeImpl<T> implements Child<T>, PersistenceUnitRefType<T>
{
   public final static String nodeName = "persistence-unit-ref";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String persistenceUnitRefName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String persistenceUnitName;

   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String mappedName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PersistenceUnitRefTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public PersistenceUnitRefTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public PersistenceUnitRefType<T> setMappedName(String mappedName)   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public PersistenceUnitRefType<T> setInjectionTarget(InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<PersistenceUnitRefType<T>> getInjectionTarget()
   {
      return new InjectionTargetTypeImpl<PersistenceUnitRefType<T>>(this, "", childNode);
   }

   public List<InjectionTargetType<PersistenceUnitRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<PersistenceUnitRefType<T>>> list = new ArrayList<InjectionTargetType<PersistenceUnitRefType<T>>>();
      List<Node> nodeList = childNode.get(InjectionTargetTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         InjectionTargetType<PersistenceUnitRefType<T>>  type = new InjectionTargetTypeImpl<PersistenceUnitRefType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public PersistenceUnitRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public PersistenceUnitRefType<T> setDescription(String ... values)
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

   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName)   {
      this.persistenceUnitRefName = persistenceUnitRefName;
      childNode.getOrCreate("persistence-unit-ref-name").text(persistenceUnitRefName);
      return this;
   }

   public String getPersistenceUnitRefName()
   {
      return childNode.textValue("persistence-unit-ref-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName)   {
      this.persistenceUnitName = persistenceUnitName;
      childNode.getOrCreate("persistence-unit-name").text(persistenceUnitName);
      return this;
   }

   public String getPersistenceUnitName()
   {
      return childNode.textValue("persistence-unit-name");
   }

}
