package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ClusterConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.LocalBindingType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PortComponentType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.RemoteBindingType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ServiceBeanType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The service element holds all of the information specific about a service
 * bean which is a JBoss proprietary extension to EJB3 creating multithreaded, singleton
 * services. Service beans are the EJB3 analogy for JMX MBeans.
 *
 */
public class ServiceBeanTypeImpl<T> implements Child<T>, ServiceBeanType<T>
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

   public ServiceBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ServiceBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   public ServiceBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ServiceBeanType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public ServiceBeanType<T> removeAllDescription()
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
   public ServiceBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public ServiceBeanType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public ServiceBeanType<T> removeAllDisplayName()
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
   public ServiceBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<ServiceBeanType<T>> icon()
   {
      return new IconTypeImpl<ServiceBeanType<T>>(this, "icon", childNode);
   }

   public List<IconType<ServiceBeanType<T>>> getIconList()
   {
      List<IconType<ServiceBeanType<T>>> list = new ArrayList<IconType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<ServiceBeanType<T>> type = new IconTypeImpl<ServiceBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   public EnvEntryType<ServiceBeanType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<ServiceBeanType<T>>(this, "env-entry", childNode);
   }

   public List<EnvEntryType<ServiceBeanType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<ServiceBeanType<T>>> list = new ArrayList<EnvEntryType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<ServiceBeanType<T>> type = new EnvEntryTypeImpl<ServiceBeanType<T>>(this, "env-entry", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   public EjbRefType<ServiceBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<ServiceBeanType<T>>(this, "ejb-ref", childNode);
   }

   public List<EjbRefType<ServiceBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<ServiceBeanType<T>>> list = new ArrayList<EjbRefType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<ServiceBeanType<T>> type = new EjbRefTypeImpl<ServiceBeanType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<ServiceBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<ServiceBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   public List<EjbLocalRefType<ServiceBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<ServiceBeanType<T>>> list = new ArrayList<EjbLocalRefType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<ServiceBeanType<T>> type = new EjbLocalRefTypeImpl<ServiceBeanType<T>>(this, "ejb-local-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   public ResourceRefType<ServiceBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<ServiceBeanType<T>>(this, "resource-ref", childNode);
   }

   public List<ResourceRefType<ServiceBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<ServiceBeanType<T>>> list = new ArrayList<ResourceRefType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<ServiceBeanType<T>> type = new ResourceRefTypeImpl<ServiceBeanType<T>>(this, "resource-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<ServiceBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<ServiceBeanType<T>>(this, "resource-env-ref", childNode);
   }

   public List<ResourceEnvRefType<ServiceBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<ServiceBeanType<T>>> list = new ArrayList<ResourceEnvRefType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<ServiceBeanType<T>> type = new ResourceEnvRefTypeImpl<ServiceBeanType<T>>(this,
               "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<ServiceBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<ServiceBeanType<T>>(this, "message-destination-ref", childNode);
   }

   public List<MessageDestinationRefType<ServiceBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<ServiceBeanType<T>>> list = new ArrayList<MessageDestinationRefType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<ServiceBeanType<T>> type = new MessageDestinationRefTypeImpl<ServiceBeanType<T>>(
               this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<ServiceBeanType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<ServiceBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   public List<PersistenceContextRefType<ServiceBeanType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<ServiceBeanType<T>>> list = new ArrayList<PersistenceContextRefType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<ServiceBeanType<T>> type = new PersistenceContextRefTypeImpl<ServiceBeanType<T>>(
               this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<ServiceBeanType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<ServiceBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   public List<PersistenceUnitRefType<ServiceBeanType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<ServiceBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<ServiceBeanType<T>> type = new PersistenceUnitRefTypeImpl<ServiceBeanType<T>>(this,
               "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   public LifecycleCallbackType<ServiceBeanType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<ServiceBeanType<T>>(this, "post-construct", childNode);
   }

   public List<LifecycleCallbackType<ServiceBeanType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<ServiceBeanType<T>>> list = new ArrayList<LifecycleCallbackType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<ServiceBeanType<T>> type = new LifecycleCallbackTypeImpl<ServiceBeanType<T>>(this,
               "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   public LifecycleCallbackType<ServiceBeanType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<ServiceBeanType<T>>(this, "pre-destroy", childNode);
   }

   public List<LifecycleCallbackType<ServiceBeanType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<ServiceBeanType<T>>> list = new ArrayList<LifecycleCallbackType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<ServiceBeanType<T>> type = new LifecycleCallbackTypeImpl<ServiceBeanType<T>>(this,
               "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllServiceRef()
   {
      childNode.remove("service-ref");
      return this;
   }

   public ServiceRefType<ServiceBeanType<T>> serviceRef()
   {
      return new ServiceRefTypeImpl<ServiceBeanType<T>>(this, "service-ref", childNode);
   }

   public List<ServiceRefType<ServiceBeanType<T>>> getServiceRefList()
   {
      List<ServiceRefType<ServiceBeanType<T>>> list = new ArrayList<ServiceRefType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for (Node node : nodeList)
      {
         ServiceRefType<ServiceBeanType<T>> type = new ServiceRefTypeImpl<ServiceBeanType<T>>(this, "service-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public ServiceBeanType<T> removeEjbName()
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
   public ServiceBeanType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public ServiceBeanType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : business-local
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setBusinessLocal(String businessLocal)
   {
      childNode.create("business-local").text(businessLocal);
      return this;
   }

   public ServiceBeanType<T> setBusinessLocalList(String... values)
   {
      for (String name : values)
      {
         setBusinessLocal(name);
      }
      return this;
   }

   public ServiceBeanType<T> removeAllBusinessLocal()
   {
      childNode.remove("business-local");
      return this;
   }

   public List<String> getBusinessLocalList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("business-local");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : business-remote
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setBusinessRemote(String businessRemote)
   {
      childNode.create("business-remote").text(businessRemote);
      return this;
   }

   public ServiceBeanType<T> setBusinessRemoteList(String... values)
   {
      for (String name : values)
      {
         setBusinessRemote(name);
      }
      return this;
   }

   public ServiceBeanType<T> removeAllBusinessRemote()
   {
      childNode.remove("business-remote");
      return this;
   }

   public List<String> getBusinessRemoteList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("business-remote");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setEjbClass(String ejbClass)
   {
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   public ServiceBeanType<T> removeEjbClass()
   {
      childNode.remove("ejb-class");
      return this;
   }

   public String getEjbClass()
   {
      return childNode.textValue("ejb-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   public SecurityIdentityType<ServiceBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<ServiceBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<ServiceBeanType<T>>(
            this, "security-identity", childNode, node);
      return securityIdentity;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : object-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setObjectName(String objectName)
   {
      childNode.getOrCreate("object-name").text(objectName);
      return this;
   }

   public ServiceBeanType<T> removeObjectName()
   {
      childNode.remove("object-name");
      return this;
   }

   public String getObjectName()
   {
      return childNode.textValue("object-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : management
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setManagement(String management)
   {
      childNode.getOrCreate("management").text(management);
      return this;
   }

   public ServiceBeanType<T> removeManagement()
   {
      childNode.remove("management");
      return this;
   }

   public String getManagement()
   {
      return childNode.textValue("management");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : xmbean
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setXmbean(String xmbean)
   {
      childNode.getOrCreate("xmbean").text(xmbean);
      return this;
   }

   public ServiceBeanType<T> removeXmbean()
   {
      childNode.remove("xmbean");
      return this;
   }

   public String getXmbean()
   {
      return childNode.textValue("xmbean");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-binding
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllLocalBinding()
   {
      childNode.remove("local-binding");
      return this;
   }

   public LocalBindingType<ServiceBeanType<T>> localBinding()
   {
      return new LocalBindingTypeImpl<ServiceBeanType<T>>(this, "local-binding", childNode);
   }

   public List<LocalBindingType<ServiceBeanType<T>>> getLocalBindingList()
   {
      List<LocalBindingType<ServiceBeanType<T>>> list = new ArrayList<LocalBindingType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("local-binding");
      for (Node node : nodeList)
      {
         LocalBindingType<ServiceBeanType<T>> type = new LocalBindingTypeImpl<ServiceBeanType<T>>(this,
               "local-binding", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : remote-binding
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllRemoteBinding()
   {
      childNode.remove("remote-binding");
      return this;
   }

   public RemoteBindingType<ServiceBeanType<T>> remoteBinding()
   {
      return new RemoteBindingTypeImpl<ServiceBeanType<T>>(this, "remote-binding", childNode);
   }

   public List<RemoteBindingType<ServiceBeanType<T>>> getRemoteBindingList()
   {
      List<RemoteBindingType<ServiceBeanType<T>>> list = new ArrayList<RemoteBindingType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("remote-binding");
      for (Node node : nodeList)
      {
         RemoteBindingType<ServiceBeanType<T>> type = new RemoteBindingTypeImpl<ServiceBeanType<T>>(this,
               "remote-binding", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setJndiName(String jndiName)
   {
      childNode.getOrCreate("jndi-name").text(jndiName);
      return this;
   }

   public ServiceBeanType<T> removeJndiName()
   {
      childNode.remove("jndi-name");
      return this;
   }

   public String getJndiName()
   {
      return childNode.textValue("jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : home-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setHomeJndiName(String homeJndiName)
   {
      childNode.getOrCreate("home-jndi-name").text(homeJndiName);
      return this;
   }

   public ServiceBeanType<T> removeHomeJndiName()
   {
      childNode.remove("home-jndi-name");
      return this;
   }

   public String getHomeJndiName()
   {
      return childNode.textValue("home-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setLocalJndiName(String localJndiName)
   {
      childNode.getOrCreate("local-jndi-name").text(localJndiName);
      return this;
   }

   public ServiceBeanType<T> removeLocalJndiName()
   {
      childNode.remove("local-jndi-name");
      return this;
   }

   public String getLocalJndiName()
   {
      return childNode.textValue("local-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-binding-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setJndiBindingPolicy(String jndiBindingPolicy)
   {
      childNode.getOrCreate("jndi-binding-policy").text(jndiBindingPolicy);
      return this;
   }

   public ServiceBeanType<T> removeJndiBindingPolicy()
   {
      childNode.remove("jndi-binding-policy");
      return this;
   }

   public String getJndiBindingPolicy()
   {
      return childNode.textValue("jndi-binding-policy");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : clustered
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setClustered(Boolean clustered)
   {
      childNode.getOrCreate("clustered").text(clustered);
      return this;
   }

   public ServiceBeanType<T> removeClustered()
   {
      childNode.remove("clustered");
      return this;
   }

   public Boolean isClustered()
   {
      return Strings.isTrue(childNode.textValue("clustered"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cluster-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeClusterConfig()
   {
      childNode.remove("cluster-config");
      return this;
   }

   public ClusterConfigType<ServiceBeanType<T>> clusterConfig()
   {
      Node node = childNode.getOrCreate("cluster-config");
      ClusterConfigType<ServiceBeanType<T>> clusterConfig = new ClusterConfigTypeImpl<ServiceBeanType<T>>(this,
            "cluster-config", childNode, node);
      return clusterConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setSecurityDomain(String securityDomain)
   {
      childNode.getOrCreate("security-domain").text(securityDomain);
      return this;
   }

   public ServiceBeanType<T> removeSecurityDomain()
   {
      childNode.remove("security-domain");
      return this;
   }

   public String getSecurityDomain()
   {
      return childNode.textValue("security-domain");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-attributes
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeMethodAttributes()
   {
      childNode.remove("method-attributes");
      return this;
   }

   public MethodAttributesType<ServiceBeanType<T>> methodAttributes()
   {
      Node node = childNode.getOrCreate("method-attributes");
      MethodAttributesType<ServiceBeanType<T>> methodAttributes = new MethodAttributesTypeImpl<ServiceBeanType<T>>(
            this, "method-attributes", childNode, node);
      return methodAttributes;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : depends
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setDepends(String depends)
   {
      childNode.create("depends").text(depends);
      return this;
   }

   public ServiceBeanType<T> setDependsList(String... values)
   {
      for (String name : values)
      {
         setDepends(name);
      }
      return this;
   }

   public ServiceBeanType<T> removeAllDepends()
   {
      childNode.remove("depends");
      return this;
   }

   public List<String> getDependsList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("depends");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : annotation
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllAnnotation()
   {
      childNode.remove("annotation");
      return this;
   }

   public AnnotationType<ServiceBeanType<T>> annotation()
   {
      return new AnnotationTypeImpl<ServiceBeanType<T>>(this, "annotation", childNode);
   }

   public List<AnnotationType<ServiceBeanType<T>>> getAnnotationList()
   {
      List<AnnotationType<ServiceBeanType<T>>> list = new ArrayList<AnnotationType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("annotation");
      for (Node node : nodeList)
      {
         AnnotationType<ServiceBeanType<T>> type = new AnnotationTypeImpl<ServiceBeanType<T>>(this, "annotation",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeIgnoreDependency()
   {
      childNode.remove("ignore-dependency");
      return this;
   }

   public IgnoreDependencyType<ServiceBeanType<T>> ignoreDependency()
   {
      Node node = childNode.getOrCreate("ignore-dependency");
      IgnoreDependencyType<ServiceBeanType<T>> ignoreDependency = new IgnoreDependencyTypeImpl<ServiceBeanType<T>>(
            this, "ignore-dependency", childNode, node);
      return ignoreDependency;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : aop-domain-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setAopDomainName(String aopDomainName)
   {
      childNode.getOrCreate("aop-domain-name").text(aopDomainName);
      return this;
   }

   public ServiceBeanType<T> removeAopDomainName()
   {
      childNode.remove("aop-domain-name");
      return this;
   }

   public String getAopDomainName()
   {
      return childNode.textValue("aop-domain-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pool-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removePoolConfig()
   {
      childNode.remove("pool-config");
      return this;
   }

   public PoolConfigType<ServiceBeanType<T>> poolConfig()
   {
      Node node = childNode.getOrCreate("pool-config");
      PoolConfigType<ServiceBeanType<T>> poolConfig = new PoolConfigTypeImpl<ServiceBeanType<T>>(this, "pool-config",
            childNode, node);
      return poolConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : concurrent
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> setConcurrent(Boolean concurrent)
   {
      childNode.getOrCreate("concurrent").text(concurrent);
      return this;
   }

   public ServiceBeanType<T> removeConcurrent()
   {
      childNode.remove("concurrent");
      return this;
   }

   public Boolean isConcurrent()
   {
      return Strings.isTrue(childNode.textValue("concurrent"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeAllJndiRef()
   {
      childNode.remove("jndi-ref");
      return this;
   }

   public JndiRefType<ServiceBeanType<T>> jndiRef()
   {
      return new JndiRefTypeImpl<ServiceBeanType<T>>(this, "jndi-ref", childNode);
   }

   public List<JndiRefType<ServiceBeanType<T>>> getJndiRefList()
   {
      List<JndiRefType<ServiceBeanType<T>>> list = new ArrayList<JndiRefType<ServiceBeanType<T>>>();
      List<Node> nodeList = childNode.get("jndi-ref");
      for (Node node : nodeList)
      {
         JndiRefType<ServiceBeanType<T>> type = new JndiRefTypeImpl<ServiceBeanType<T>>(this, "jndi-ref", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-component
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removePortComponent()
   {
      childNode.remove("port-component");
      return this;
   }

   public PortComponentType<ServiceBeanType<T>> portComponent()
   {
      Node node = childNode.getOrCreate("port-component");
      PortComponentType<ServiceBeanType<T>> portComponent = new PortComponentTypeImpl<ServiceBeanType<T>>(this,
            "port-component", childNode, node);
      return portComponent;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-timeout-identity
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServiceBeanType<T> removeEjbTimeoutIdentity()
   {
      childNode.remove("ejb-timeout-identity");
      return this;
   }

   public SecurityIdentityType<ServiceBeanType<T>> ejbTimeoutIdentity()
   {
      Node node = childNode.getOrCreate("ejb-timeout-identity");
      SecurityIdentityType<ServiceBeanType<T>> ejbTimeoutIdentity = new SecurityIdentityTypeImpl<ServiceBeanType<T>>(
            this, "ejb-timeout-identity", childNode, node);
      return ejbTimeoutIdentity;
   }

}
