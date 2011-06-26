package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;

/**
 * This class is a generated class.
 * Generation date :2011-06-26T17:25:18.735-04:00
 *
 * Original Documentation:
 *
 * [
 * The persistence-unit-ref element contains a declaration
 * of Deployment Component's reference to a persistence unit
 * associated within a Deployment Component's
 * environment. It consists of:
 *
 * - an optional description
 * - the persistence unit reference name
 * - an optional persistence unit name. If not specified,
 * the default persistence unit is assumed.
 * - optional injection targets
 *
 * Examples:
 *
 * <persistence-unit-ref>
 * <persistence-unit-ref-name>myPersistenceUnit
 * </persistence-unit-ref-name>
 * </persistence-unit-ref>
 *
 * <persistence-unit-ref>
 * <persistence-unit-ref-name>myPersistenceUnit
 * </persistence-unit-ref-name>
 * <persistence-unit-name>PersistenceUnit1
 * </persistence-unit-name>
 * </persistence-unit-ref>
 *
 *
 *
 *
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



   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnitRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }
   public PersistenceUnitRefType<T> removeMappedName()
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
   public PersistenceUnitRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   public InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget()
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



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnitRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public PersistenceUnitRefType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public PersistenceUnitRefType<T> removeAllDescription()
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
   // Element type : persistence-unit-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName)
   {
      childNode.getOrCreate("persistence-unit-ref-name").text(persistenceUnitRefName);
      return this;
   }
   public PersistenceUnitRefType<T> removePersistenceUnitRefName()
   {
      childNode.remove("persistence-unit-ref-name");
      return this;
   }

   public String getPersistenceUnitRefName()
   {
      return childNode.textValue("persistence-unit-ref-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName)
   {
      childNode.getOrCreate("persistence-unit-name").text(persistenceUnitName);
      return this;
   }
   public PersistenceUnitRefType<T> removePersistenceUnitName()
   {
      childNode.remove("persistence-unit-name");
      return this;
   }

   public String getPersistenceUnitName()
   {
      return childNode.textValue("persistence-unit-name");
   }

}
