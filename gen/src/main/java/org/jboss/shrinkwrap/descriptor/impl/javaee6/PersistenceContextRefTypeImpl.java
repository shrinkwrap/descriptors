package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class PersistenceContextRefTypeImpl<T> implements Child<T>, PersistenceContextRefType<T>
{
   public final static String nodeName = "persistence-context-ref";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String persistenceContextRefName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String persistenceUnitName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String persistenceContextType;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private PropertyType<PersistenceContextRefType<T>> persistenceProperty;

   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String mappedName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private InjectionTargetType<PersistenceContextRefType<T>> injectionTarget;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PersistenceContextRefTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public PersistenceContextRefTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public PersistenceContextRefType<T> setMappedName(String mappedName)   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public PersistenceContextRefType<T> setInjectionTarget(InjectionTargetType<PersistenceContextRefType<T>> injectionTarget)
   {
      childNode.create("injection-target").text(injectionTarget);
      return this;
   }

   public InjectionTargetType<PersistenceContextRefType<T>> getInjectionTarget()
   {
      return new InjectionTargetTypeImpl<PersistenceContextRefType<T>>(this, "", childNode);
   }

   public List<InjectionTargetType<PersistenceContextRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<PersistenceContextRefType<T>>> list = new ArrayList<InjectionTargetType<PersistenceContextRefType<T>>>();
      List<Node> nodeList = childNode.get(InjectionTargetTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         InjectionTargetType<PersistenceContextRefType<T>>  type = new InjectionTargetTypeImpl<PersistenceContextRefType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public PersistenceContextRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public PersistenceContextRefType<T> setDescription(String ... values)
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

   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName)   {
      this.persistenceContextRefName = persistenceContextRefName;
      childNode.getOrCreate("persistence-context-ref-name").text(persistenceContextRefName);
      return this;
   }

   public String getPersistenceContextRefName()
   {
      return childNode.textValue("persistence-context-ref-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName)   {
      this.persistenceUnitName = persistenceUnitName;
      childNode.getOrCreate("persistence-unit-name").text(persistenceUnitName);
      return this;
   }

   public String getPersistenceUnitName()
   {
      return childNode.textValue("persistence-unit-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType)   {
      this.persistenceContextType = persistenceContextType;
      childNode.getOrCreate("persistence-context-type").text(persistenceContextType);
      return this;
   }

   public String getPersistenceContextType()
   {
      return childNode.textValue("persistence-context-type");
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public PersistenceContextRefType<T> setPersistenceProperty(PropertyType<PersistenceContextRefType<T>> persistenceProperty)
   {
      childNode.create("persistence-property").text(persistenceProperty);
      return this;
   }

   public PropertyType<PersistenceContextRefType<T>> getPersistenceProperty()
   {
      return new PropertyTypeImpl<PersistenceContextRefType<T>>(this, "", childNode);
   }

   public List<PropertyType<PersistenceContextRefType<T>>> getPersistencePropertyList()
   {
      List<PropertyType<PersistenceContextRefType<T>>> list = new ArrayList<PropertyType<PersistenceContextRefType<T>>>();
      List<Node> nodeList = childNode.get(PropertyTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PropertyType<PersistenceContextRefType<T>>  type = new PropertyTypeImpl<PersistenceContextRefType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


}
