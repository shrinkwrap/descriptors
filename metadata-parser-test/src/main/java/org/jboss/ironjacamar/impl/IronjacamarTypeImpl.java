package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.IronjacamarType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.BeanValidationGroupsType;
import org.jboss.ironjacamar.impl.BeanValidationGroupsTypeImpl;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.impl.ConfigPropertyTypeImpl;
import org.jboss.ironjacamar.api.TransactionSupportType;
import org.jboss.ironjacamar.api.ConnectionDefinitionsType;
import org.jboss.ironjacamar.impl.ConnectionDefinitionsTypeImpl;
import org.jboss.ironjacamar.api.AdminObjectsType;
import org.jboss.ironjacamar.impl.AdminObjectsTypeImpl;

/**
 * This class implements the <code> ironjacamarType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public class IronjacamarTypeImpl<T> implements Child<T>, IronjacamarType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public IronjacamarTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public IronjacamarTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarType ElementName: ironjacamar:bean-validation-groupsType ElementType : bean-validation-groups
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-validation-groups</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-validation-groups</code> element will be returned.
    * @return  a new or existing instance of <code>BeanValidationGroupsType<IronjacamarType<T>></code> 
    */
   public BeanValidationGroupsType<IronjacamarType<T>> getOrCreateBeanValidationGroups()
   {
      Node node = childNode.getOrCreate("bean-validation-groups");
      BeanValidationGroupsType<IronjacamarType<T>> beanValidationGroups = new BeanValidationGroupsTypeImpl<IronjacamarType<T>>(this, "bean-validation-groups", childNode, node);
      return beanValidationGroups;
   }

   /**
    * Removes the <code>bean-validation-groups</code> element 
    * @return the current instance of <code>IronjacamarType<T></code> 
    */
   public IronjacamarType<T> removeBeanValidationGroups()
   {
      childNode.removeChildren("bean-validation-groups");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarType ElementName: xsd:token ElementType : bootstrap-context
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>bootstrap-context</code> element
    * @param bootstrapContext the value for the element <code>bootstrap-context</code> 
    * @return the current instance of <code>IronjacamarType<T></code> 
    */
   public IronjacamarType<T> bootstrapContext(String bootstrapContext)
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
    * @return the current instance of <code>IronjacamarType<T></code> 
    */
   public IronjacamarType<T> removeBootstrapContext()
   {
      childNode.removeChildren("bootstrap-context");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarType ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<IronjacamarType<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ConfigPropertyTypeImpl<IronjacamarType<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<IronjacamarType<T>></code> 
    */
   public ConfigPropertyType<IronjacamarType<T>> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<IronjacamarType<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<IronjacamarType<T>>> getAllConfigProperty()
   {
      List<ConfigPropertyType<IronjacamarType<T>>> list = new ArrayList<ConfigPropertyType<IronjacamarType<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<IronjacamarType<T>>  type = new ConfigPropertyTypeImpl<IronjacamarType<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<IronjacamarType<T>></code> 
    */
   public IronjacamarType<T> removeAllConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarType ElementName: ironjacamar:transaction-supportType ElementType : transaction-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>IronjacamarType<T></code> 
    */
   public IronjacamarType<T> transactionSupport(TransactionSupportType transactionSupport)
   {
      childNode.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>IronjacamarType<T></code> 
    */
   public IronjacamarType<T> transactionSupport(String transactionSupport)
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
    * @return the current instance of <code>IronjacamarType<T></code> 
    */
   public IronjacamarType<T> removeTransactionSupport()
   {
      childNode.removeAttribute("transaction-support");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarType ElementName: ironjacamar:connection-definitionsType ElementType : connection-definitions
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definitions</code> element with the given value will be created.
    * Otherwise, the existing <code>connection-definitions</code> element will be returned.
    * @return  a new or existing instance of <code>ConnectionDefinitionsType<IronjacamarType<T>></code> 
    */
   public ConnectionDefinitionsType<IronjacamarType<T>> getOrCreateConnectionDefinitions()
   {
      Node node = childNode.getOrCreate("connection-definitions");
      ConnectionDefinitionsType<IronjacamarType<T>> connectionDefinitions = new ConnectionDefinitionsTypeImpl<IronjacamarType<T>>(this, "connection-definitions", childNode, node);
      return connectionDefinitions;
   }

   /**
    * Removes the <code>connection-definitions</code> element 
    * @return the current instance of <code>IronjacamarType<T></code> 
    */
   public IronjacamarType<T> removeConnectionDefinitions()
   {
      childNode.removeChildren("connection-definitions");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarType ElementName: ironjacamar:admin-objectsType ElementType : admin-objects
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>admin-objects</code> element with the given value will be created.
    * Otherwise, the existing <code>admin-objects</code> element will be returned.
    * @return  a new or existing instance of <code>AdminObjectsType<IronjacamarType<T>></code> 
    */
   public AdminObjectsType<IronjacamarType<T>> getOrCreateAdminObjects()
   {
      Node node = childNode.getOrCreate("admin-objects");
      AdminObjectsType<IronjacamarType<T>> adminObjects = new AdminObjectsTypeImpl<IronjacamarType<T>>(this, "admin-objects", childNode, node);
      return adminObjects;
   }

   /**
    * Removes the <code>admin-objects</code> element 
    * @return the current instance of <code>IronjacamarType<T></code> 
    */
   public IronjacamarType<T> removeAdminObjects()
   {
      childNode.removeChildren("admin-objects");
      return this;
   }
}
