package org.jboss.resourceadapters.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.resourceadapters.api.BeanValidationGroupsType;
import org.jboss.resourceadapters.api.ConfigPropertyType;
import org.jboss.resourceadapters.api.TransactionSupportType;
import org.jboss.resourceadapters.api.ConnectionDefinitionsType;
import org.jboss.resourceadapters.api.AdminObjectsType;
/**
 * This interface defines the contract for the <code> resource-adapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:31.029-07:00
 */
public interface ResourceAdapterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: xsd:token ElementType : archive
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>archive</code> element
    * @param archive the value for the element <code>archive</code> 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> archive(String archive);

   /**
    * Returns the <code>archive</code> element
    * @return the node defined for the element <code>archive</code> 
    */
   public String getArchive();

   /**
    * Removes the <code>archive</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeArchive();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:bean-validation-groupsType ElementType : bean-validation-groups
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-validation-groups</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-validation-groups</code> element will be returned.
    * @return  a new or existing instance of <code>BeanValidationGroupsType<ResourceAdapterType<T>></code> 
    */
   public BeanValidationGroupsType<ResourceAdapterType<T>> getOrCreateBeanValidationGroups();

   /**
    * Removes the <code>bean-validation-groups</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeBeanValidationGroups();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: xsd:token ElementType : bootstrap-context
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>bootstrap-context</code> element
    * @param bootstrapContext the value for the element <code>bootstrap-context</code> 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> bootstrapContext(String bootstrapContext);

   /**
    * Returns the <code>bootstrap-context</code> element
    * @return the node defined for the element <code>bootstrap-context</code> 
    */
   public String getBootstrapContext();

   /**
    * Removes the <code>bootstrap-context</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeBootstrapContext();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ResourceAdapterType<T>> getOrCreateConfigProperty();

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ResourceAdapterType<T>></code> 
    */
   public ConfigPropertyType<ResourceAdapterType<T>> createConfigProperty();

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ResourceAdapterType<T>>> getAllConfigProperty();

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ResourceAdapterType<T>></code> 
    */
   public ResourceAdapterType<T> removeAllConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:transaction-supportType ElementType : transaction-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> transactionSupport(TransactionSupportType transactionSupport);
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> transactionSupport(String transactionSupport);

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public TransactionSupportType getTransactionSupport();

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public String  getTransactionSupportAsString();

   /**
    * Removes the <code>transaction-support</code> attribute 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeTransactionSupport();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:connection-definitionsType ElementType : connection-definitions
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definitions</code> element with the given value will be created.
    * Otherwise, the existing <code>connection-definitions</code> element will be returned.
    * @return  a new or existing instance of <code>ConnectionDefinitionsType<ResourceAdapterType<T>></code> 
    */
   public ConnectionDefinitionsType<ResourceAdapterType<T>> getOrCreateConnectionDefinitions();

   /**
    * Removes the <code>connection-definitions</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeConnectionDefinitions();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdapterType ElementName: resourceadapters:admin-objectsType ElementType : admin-objects
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>admin-objects</code> element with the given value will be created.
    * Otherwise, the existing <code>admin-objects</code> element will be returned.
    * @return  a new or existing instance of <code>AdminObjectsType<ResourceAdapterType<T>></code> 
    */
   public AdminObjectsType<ResourceAdapterType<T>> getOrCreateAdminObjects();

   /**
    * Removes the <code>admin-objects</code> element 
    * @return the current instance of <code>ResourceAdapterType<T></code> 
    */
   public ResourceAdapterType<T> removeAdminObjects();
}
