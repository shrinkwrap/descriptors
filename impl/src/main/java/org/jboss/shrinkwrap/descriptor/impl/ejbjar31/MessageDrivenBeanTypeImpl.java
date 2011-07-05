package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TransactionTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The message-driven element declares a message-driven
 * bean. The declaration consists of:
 *
 * - an optional description
 * - an optional display name
 * - an optional icon element that contains a small and a large
 * icon file name.
 * - a name assigned to the enterprise bean in
 * the deployment descriptor
 * - an optional mapped-name element that can be used to provide
 * vendor-specific deployment information such as the physical
 * jndi-name of destination from which this message-driven bean
 * should consume. This element is not required to be supported
 * by all implementations. Any use of this element is non-portable.
 * - the message-driven bean's implementation class
 * - an optional declaration of the bean's messaging
 * type
 * - an optional declaration of the bean's timeout method for
 * handling programmatically created timers
 * - an optional declaration of timers to be automatically created at
 * deployment time
 * - the optional message-driven bean's transaction management
 * type. If it is not defined, it is defaulted to Container.
 * - an optional declaration of the bean's
 * message-destination-type
 * - an optional declaration of the bean's
 * message-destination-link
 * - an optional declaration of the message-driven bean's
 * activation configuration properties
 * - an optional list of the message-driven bean class and/or
 * superclass around-invoke methods.
 * - an optional list of the message-driven bean class and/or
 * superclass around-timeout methods.
 * - an optional declaration of the bean's environment
 * entries
 * - an optional declaration of the bean's EJB references
 * - an optional declaration of the bean's local EJB
 * references
 * - an optional declaration of the bean's web service
 * references
 * - an optional declaration of the security role
 * references
 * - an optional declaration of the security
 * identity to be used for the execution of the bean's
 * methods
 * - an optional declaration of the bean's
 * resource manager connection factory
 * references
 * - an optional declaration of the bean's resource
 * environment references.
 * - an optional declaration of the bean's message
 * destination references
 *
 *
 *
 */
public class MessageDrivenBeanTypeImpl<T> implements Child<T>, MessageDrivenBeanType<T>
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

   public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public MessageDrivenBeanType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public MessageDrivenBeanType<T> removeAllDescription()
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
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public MessageDrivenBeanType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public MessageDrivenBeanType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<MessageDrivenBeanType<T>> icon()
   {
      return new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon", childNode);
   }

   public List<IconType<MessageDrivenBeanType<T>>> getIconList()
   {
      List<IconType<MessageDrivenBeanType<T>>> list = new ArrayList<IconType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<MessageDrivenBeanType<T>> type = new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   public EnvEntryType<MessageDrivenBeanType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<MessageDrivenBeanType<T>>(this, "env-entry", childNode);
   }

   public List<EnvEntryType<MessageDrivenBeanType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<MessageDrivenBeanType<T>>> list = new ArrayList<EnvEntryType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<MessageDrivenBeanType<T>> type = new EnvEntryTypeImpl<MessageDrivenBeanType<T>>(this,
               "env-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   public EjbRefType<MessageDrivenBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref", childNode);
   }

   public List<EjbRefType<MessageDrivenBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<MessageDrivenBeanType<T>> type = new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   public List<EjbLocalRefType<MessageDrivenBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbLocalRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<MessageDrivenBeanType<T>> type = new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   public ResourceRefType<MessageDrivenBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-ref", childNode);
   }

   public List<ResourceRefType<MessageDrivenBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<MessageDrivenBeanType<T>> type = new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "resource-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-env-ref", childNode);
   }

   public List<ResourceEnvRefType<MessageDrivenBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceEnvRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<MessageDrivenBeanType<T>> type = new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(this, "message-destination-ref", childNode);
   }

   public List<MessageDestinationRefType<MessageDrivenBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<MessageDrivenBeanType<T>>> list = new ArrayList<MessageDestinationRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<MessageDrivenBeanType<T>> type = new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(
               this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<MessageDrivenBeanType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   public List<PersistenceContextRefType<MessageDrivenBeanType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<MessageDrivenBeanType<T>>> list = new ArrayList<PersistenceContextRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<MessageDrivenBeanType<T>> type = new PersistenceContextRefTypeImpl<MessageDrivenBeanType<T>>(
               this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<MessageDrivenBeanType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   public List<PersistenceUnitRefType<MessageDrivenBeanType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<MessageDrivenBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<MessageDrivenBeanType<T>> type = new PersistenceUnitRefTypeImpl<MessageDrivenBeanType<T>>(
               this, "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   public LifecycleCallbackType<MessageDrivenBeanType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "post-construct", childNode);
   }

   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<MessageDrivenBeanType<T>>> list = new ArrayList<LifecycleCallbackType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<MessageDrivenBeanType<T>> type = new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(
               this, "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   public LifecycleCallbackType<MessageDrivenBeanType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "pre-destroy", childNode);
   }

   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<MessageDrivenBeanType<T>>> list = new ArrayList<LifecycleCallbackType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<MessageDrivenBeanType<T>> type = new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(
               this, "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   public DataSourceType<MessageDrivenBeanType<T>> dataSource()
   {
      return new DataSourceTypeImpl<MessageDrivenBeanType<T>>(this, "data-source", childNode);
   }

   public List<DataSourceType<MessageDrivenBeanType<T>>> getDataSourceList()
   {
      List<DataSourceType<MessageDrivenBeanType<T>>> list = new ArrayList<DataSourceType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<MessageDrivenBeanType<T>> type = new DataSourceTypeImpl<MessageDrivenBeanType<T>>(this,
               "data-source", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public MessageDrivenBeanType<T> removeEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   public String getEjbName()
   {
      return childNode.textValue("ejb-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public MessageDrivenBeanType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> setEjbClass(String ejbClass)
   {
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   public MessageDrivenBeanType<T> removeEjbClass()
   {
      childNode.remove("ejb-class");
      return this;
   }

   public String getEjbClass()
   {
      return childNode.textValue("ejb-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : messaging-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> setMessagingType(String messagingType)
   {
      childNode.getOrCreate("messaging-type").text(messagingType);
      return this;
   }

   public MessageDrivenBeanType<T> removeMessagingType()
   {
      childNode.remove("messaging-type");
      return this;
   }

   public String getMessagingType()
   {
      return childNode.textValue("messaging-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : timeout-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeTimeoutMethod()
   {
      childNode.remove("timeout-method");
      return this;
   }

   public NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod()
   {
      Node node = childNode.getOrCreate("timeout-method");
      NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod = new NamedMethodTypeImpl<MessageDrivenBeanType<T>>(this,
            "timeout-method", childNode, node);
      return timeoutMethod;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : timer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllTimer()
   {
      childNode.remove("timer");
      return this;
   }

   public TimerType<MessageDrivenBeanType<T>> timer()
   {
      return new TimerTypeImpl<MessageDrivenBeanType<T>>(this, "timer", childNode);
   }

   public List<TimerType<MessageDrivenBeanType<T>>> getTimerList()
   {
      List<TimerType<MessageDrivenBeanType<T>>> list = new ArrayList<TimerType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("timer");
      for (Node node : nodeList)
      {
         TimerType<MessageDrivenBeanType<T>> type = new TimerTypeImpl<MessageDrivenBeanType<T>>(this, "timer",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : transaction-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> setTransactionType(TransactionTypeType transactionType)
   {
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }

   public MessageDrivenBeanType<T> setTransactionType(String transactionType)
   {
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }

   public TransactionTypeType getTransactionType()
   {
      return TransactionTypeType.getFromStringValue(childNode.textValue("transaction-type"));
   }

   public String getTransactionTypeAsString()
   {
      return childNode.textValue("transaction-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType)
   {
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   public MessageDrivenBeanType<T> removeMessageDestinationType()
   {
      childNode.remove("message-destination-type");
      return this;
   }

   public String getMessageDestinationType()
   {
      return childNode.textValue("message-destination-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink)
   {
      childNode.getOrCreate("message-destination-link").text(messageDestinationLink);
      return this;
   }

   public MessageDrivenBeanType<T> removeMessageDestinationLink()
   {
      childNode.remove("message-destination-link");
      return this;
   }

   public String getMessageDestinationLink()
   {
      return childNode.textValue("message-destination-link");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeActivationConfig()
   {
      childNode.remove("activation-config");
      return this;
   }

   public ActivationConfigType<MessageDrivenBeanType<T>> activationConfig()
   {
      Node node = childNode.getOrCreate("activation-config");
      ActivationConfigType<MessageDrivenBeanType<T>> activationConfig = new ActivationConfigTypeImpl<MessageDrivenBeanType<T>>(
            this, "activation-config", childNode, node);
      return activationConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : around-invoke
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllAroundInvoke()
   {
      childNode.remove("around-invoke");
      return this;
   }

   public AroundInvokeType<MessageDrivenBeanType<T>> aroundInvoke()
   {
      return new AroundInvokeTypeImpl<MessageDrivenBeanType<T>>(this, "around-invoke", childNode);
   }

   public List<AroundInvokeType<MessageDrivenBeanType<T>>> getAroundInvokeList()
   {
      List<AroundInvokeType<MessageDrivenBeanType<T>>> list = new ArrayList<AroundInvokeType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("around-invoke");
      for (Node node : nodeList)
      {
         AroundInvokeType<MessageDrivenBeanType<T>> type = new AroundInvokeTypeImpl<MessageDrivenBeanType<T>>(this,
               "around-invoke", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : around-timeout
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllAroundTimeout()
   {
      childNode.remove("around-timeout");
      return this;
   }

   public AroundTimeoutType<MessageDrivenBeanType<T>> aroundTimeout()
   {
      return new AroundTimeoutTypeImpl<MessageDrivenBeanType<T>>(this, "around-timeout", childNode);
   }

   public List<AroundTimeoutType<MessageDrivenBeanType<T>>> getAroundTimeoutList()
   {
      List<AroundTimeoutType<MessageDrivenBeanType<T>>> list = new ArrayList<AroundTimeoutType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("around-timeout");
      for (Node node : nodeList)
      {
         AroundTimeoutType<MessageDrivenBeanType<T>> type = new AroundTimeoutTypeImpl<MessageDrivenBeanType<T>>(this,
               "around-timeout", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeAllSecurityRoleRef()
   {
      childNode.remove("security-role-ref");
      return this;
   }

   public SecurityRoleRefType<MessageDrivenBeanType<T>> securityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<MessageDrivenBeanType<T>>(this, "security-role-ref", childNode);
   }

   public List<SecurityRoleRefType<MessageDrivenBeanType<T>>> getSecurityRoleRefList()
   {
      List<SecurityRoleRefType<MessageDrivenBeanType<T>>> list = new ArrayList<SecurityRoleRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for (Node node : nodeList)
      {
         SecurityRoleRefType<MessageDrivenBeanType<T>> type = new SecurityRoleRefTypeImpl<MessageDrivenBeanType<T>>(
               this, "security-role-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDrivenBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   public SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<MessageDrivenBeanType<T>>(
            this, "security-identity", childNode, node);
      return securityIdentity;
   }

}
