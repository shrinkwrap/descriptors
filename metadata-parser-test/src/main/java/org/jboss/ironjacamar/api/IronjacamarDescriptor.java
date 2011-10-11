package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.ironjacamar.api.BeanValidationGroupsType;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.api.TransactionSupportType;
import org.jboss.ironjacamar.api.ConnectionDefinitionsType;
import org.jboss.ironjacamar.api.AdminObjectsType;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     IronjacamarDescriptor descriptor = Descriptors.create(IronjacamarDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public interface IronjacamarDescriptor extends Descriptor, DescriptorNamespace<IronjacamarDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:bean-validation-groupsType ElementType : bean-validation-groups
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-validation-groups</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-validation-groups</code> element will be returned.
    * @return  a new or existing instance of <code>BeanValidationGroupsType<IronjacamarDescriptor></code> 
    */
   public BeanValidationGroupsType<IronjacamarDescriptor> getOrCreateBeanValidationGroups();

   /**
    * Removes the <code>bean-validation-groups</code> element 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeBeanValidationGroups();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: xsd:token ElementType : bootstrap-context
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>bootstrap-context</code> element
    * @param bootstrapContext the value for the element <code>bootstrap-context</code> 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor bootstrapContext(String bootstrapContext);

   /**
    * Returns the <code>bootstrap-context</code> element
    * @return the node defined for the element <code>bootstrap-context</code> 
    */
   public String getBootstrapContext();

   /**
    * Removes the <code>bootstrap-context</code> element 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeBootstrapContext();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<IronjacamarDescriptor> getOrCreateConfigProperty();

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<IronjacamarDescriptor></code> 
    */
   public ConfigPropertyType<IronjacamarDescriptor> createConfigProperty();

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<IronjacamarDescriptor>> getAllConfigProperty();

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<IronjacamarDescriptor></code> 
    */
   public IronjacamarDescriptor removeAllConfigProperty();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:transaction-supportType ElementType : transaction-support
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor transactionSupport(TransactionSupportType transactionSupport);
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor transactionSupport(String transactionSupport);

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
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeTransactionSupport();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:connection-definitionsType ElementType : connection-definitions
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definitions</code> element with the given value will be created.
    * Otherwise, the existing <code>connection-definitions</code> element will be returned.
    * @return  a new or existing instance of <code>ConnectionDefinitionsType<IronjacamarDescriptor></code> 
    */
   public ConnectionDefinitionsType<IronjacamarDescriptor> getOrCreateConnectionDefinitions();

   /**
    * Removes the <code>connection-definitions</code> element 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeConnectionDefinitions();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:admin-objectsType ElementType : admin-objects
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>admin-objects</code> element with the given value will be created.
    * Otherwise, the existing <code>admin-objects</code> element will be returned.
    * @return  a new or existing instance of <code>AdminObjectsType<IronjacamarDescriptor></code> 
    */
   public AdminObjectsType<IronjacamarDescriptor> getOrCreateAdminObjects();

   /**
    * Removes the <code>admin-objects</code> element 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeAdminObjects();
}
