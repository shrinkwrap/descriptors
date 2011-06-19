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
 * Generation date :2011-06-19T19:10:14.736-04:00
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



   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceContextRefType<T> setMappedName(String mappedName)   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public PersistenceContextRefType<T> removeMappedName()
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
   public PersistenceContextRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   public InjectionTargetType<PersistenceContextRefType<T>> injectionTarget()
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



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceContextRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public PersistenceContextRefType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
         return this;
   }

   public PersistenceContextRefType<T> removeAllDescription()
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
   // Element type : persistence-context-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName)   {
      childNode.getOrCreate("persistence-context-ref-name").text(persistenceContextRefName);
      return this;
   }

   public PersistenceContextRefType<T> removePersistenceContextRefName()
   {
      childNode.remove("persistence-context-ref-name");
      return this;
   }

   public String getPersistenceContextRefName()
   {
      return childNode.textValue("persistence-context-ref-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName)   {
      childNode.getOrCreate("persistence-unit-name").text(persistenceUnitName);
      return this;
   }

   public PersistenceContextRefType<T> removePersistenceUnitName()
   {
      childNode.remove("persistence-unit-name");
      return this;
   }

   public String getPersistenceUnitName()
   {
      return childNode.textValue("persistence-unit-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType)   {
      childNode.getOrCreate("persistence-context-type").text(persistenceContextType);
      return this;
   }

   public PersistenceContextRefType<T> removePersistenceContextType()
   {
      childNode.remove("persistence-context-type");
      return this;
   }

   public String getPersistenceContextType()
   {
      return childNode.textValue("persistence-context-type");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : persistence-property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceContextRefType<T> removeAllPersistenceProperty()
   {
      childNode.remove("persistence-property");
      return this;
   }

   public PropertyType<PersistenceContextRefType<T>> persistenceProperty()
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
