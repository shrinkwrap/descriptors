package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.resourceadapters.api.ResourceAdapterType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.BeanValidationGroupsType;
import org.jboss.resourceadapters.impl.BeanValidationGroupsTypeImpl;
import org.jboss.resourceadapters.api.ConfigPropertyType;
import org.jboss.resourceadapters.impl.ConfigPropertyTypeImpl;
import org.jboss.resourceadapters.api.TransactionSupportType;
import org.jboss.resourceadapters.api.ConnectionDefinitionsType;
import org.jboss.resourceadapters.impl.ConnectionDefinitionsTypeImpl;
import org.jboss.resourceadapters.api.AdminObjectsType;
import org.jboss.resourceadapters.impl.AdminObjectsTypeImpl;

/**
 * This class implements the <code> resource-adapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:31.029-07:00
 */
public class ResourceAdapterTypeImpl<T> implements Child<T>, ResourceAdapterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceAdapterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ResourceAdapterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: xsd:token ElementType : archive
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>archive</code> element
    * @param archive the value for the element <code>archive</code> 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> archive(String archive)
   {
      childNode.getOrCreate("archive").text(archive);
      return this;
   }

   /**
    * Returns the <code>archive</code> element
    * @return the node defined for the element <code>archive</code> 
    */
   public String getArchive()
   {
      return childNode.getTextValueForPatternName("archive");
   }

   /**
    * Removes the <code>archive</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeArchive()
   {
      childNode.removeChildren("archive");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:bean-validation-groupsType ElementType : bean-validation-groups
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-validation-groups</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-validation-groups</code> element will be returned.
    * @return  a new or existing instance of <code>BeanValidationGroupsType<ResourceAdapterType<T>></code> 
    */
   public BeanValidationGroupsType<ResourceAdapterType<T>> getOrCreateBeanValidationGroups()
   {
      Node node = childNode.getOrCreate("bean-validation-groups");
      BeanValidationGroupsType<ResourceAdapterType<T>> beanValidationGroups = new BeanValidationGroupsTypeImpl<ResourceAdapterType<T>>(this, "bean-validation-groups", childNode, node);
      return beanValidationGroups;
   }

   /**
    * Removes the <code>bean-validation-groups</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeBeanValidationGroups()
   {
      childNode.removeChildren("bean-validation-groups");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: xsd:token ElementType : bootstrap-context
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>bootstrap-context</code> element
    * @param bootstrapContext the value for the element <code>bootstrap-context</code> 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> bootstrapContext(String bootstrapContext)
   {
      childNode.getOrCreate("bootstrap-context").text(bootstrapContext);
      return this;
   }

   /**
    * Returns the <code>bootstrap-context</code> element
    * @return the node defined for the element <code>bootstrap-context</code> 
    */
   public String getBootstrapContext()
   {
      return childNode.getTextValueForPatternName("bootstrap-context");
   }

   /**
    * Removes the <code>bootstrap-context</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeBootstrapContext()
   {
      childNode.removeChildren("bootstrap-context");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ResourceAdapterType<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ConfigPropertyTypeImpl<ResourceAdapterType<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ResourceAdapterType<T>></code> 
    */
   public ConfigPropertyType<ResourceAdapterType<T>> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<ResourceAdapterType<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ResourceAdapterType<T>>> getAllConfigProperty()
   {
      List<ConfigPropertyType<ResourceAdapterType<T>>> list = new ArrayList<ConfigPropertyType<ResourceAdapterType<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<ResourceAdapterType<T>>  type = new ConfigPropertyTypeImpl<ResourceAdapterType<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ResourceAdapterType<T>></code> 
    */
   public ResourceAdapterType<T> removeAllConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:transaction-supportType ElementType : transaction-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> transactionSupport(TransactionSupportType transactionSupport)
   {
      childNode.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> transactionSupport(String transactionSupport)
   {
      childNode.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public TransactionSupportType getTransactionSupport()
   {
      return TransactionSupportType.getFromStringValue(childNode.getTextValueForPatternName("transaction-support"));
   }

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public String  getTransactionSupportAsString()
   {
      return childNode.getTextValueForPatternName("transaction-support");
   }

   /**
    * Removes the <code>transaction-support</code> attribute 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeTransactionSupport()
   {
      childNode.removeAttribute("transaction-support");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:connection-definitionsType ElementType : connection-definitions
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definitions</code> element with the given value will be created.
    * Otherwise, the existing <code>connection-definitions</code> element will be returned.
    * @return  a new or existing instance of <code>ConnectionDefinitionsType<ResourceAdapterType<T>></code> 
    */
   public ConnectionDefinitionsType<ResourceAdapterType<T>> getOrCreateConnectionDefinitions()
   {
      Node node = childNode.getOrCreate("connection-definitions");
      ConnectionDefinitionsType<ResourceAdapterType<T>> connectionDefinitions = new ConnectionDefinitionsTypeImpl<ResourceAdapterType<T>>(this, "connection-definitions", childNode, node);
      return connectionDefinitions;
   }

   /**
    * Removes the <code>connection-definitions</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeConnectionDefinitions()
   {
      childNode.removeChildren("connection-definitions");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:admin-objectsType ElementType : admin-objects
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>admin-objects</code> element with the given value will be created.
    * Otherwise, the existing <code>admin-objects</code> element will be returned.
    * @return  a new or existing instance of <code>AdminObjectsType<ResourceAdapterType<T>></code> 
    */
   public AdminObjectsType<ResourceAdapterType<T>> getOrCreateAdminObjects()
   {
      Node node = childNode.getOrCreate("admin-objects");
      AdminObjectsType<ResourceAdapterType<T>> adminObjects = new AdminObjectsTypeImpl<ResourceAdapterType<T>>(this, "admin-objects", childNode, node);
      return adminObjects;
   }

   /**
    * Removes the <code>admin-objects</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeAdminObjects()
   {
      childNode.removeChildren("admin-objects");
      return this;
   }
}
