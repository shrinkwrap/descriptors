package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.CacheConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ClusterConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.LocalBindingType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PortComponentType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.RemoteBindingType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SessionBeanType;
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
 * The session element holds information specific to jboss and not declared
 * in ejb-jar.xml about a session bean, such as jndi name, container configuration, and
 * resource managers. (see tags for details) The bean should already be declared in
 * ejb-jar.xml, with the same ejb-name. Used in: enterprise-beans
 *
 */
public class SessionBeanTypeImpl<T> implements Child<T>, SessionBeanType<T>
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

   public SessionBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SessionBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   public SessionBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public SessionBeanType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public SessionBeanType<T> removeAllDescription()
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
   public SessionBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public SessionBeanType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public SessionBeanType<T> removeAllDisplayName()
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
   public SessionBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<SessionBeanType<T>> icon()
   {
      return new IconTypeImpl<SessionBeanType<T>>(this, "icon", childNode);
   }

   public List<IconType<SessionBeanType<T>>> getIconList()
   {
      List<IconType<SessionBeanType<T>>> list = new ArrayList<IconType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<SessionBeanType<T>> type = new IconTypeImpl<SessionBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   public EnvEntryType<SessionBeanType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<SessionBeanType<T>>(this, "env-entry", childNode);
   }

   public List<EnvEntryType<SessionBeanType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<SessionBeanType<T>>> list = new ArrayList<EnvEntryType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<SessionBeanType<T>> type = new EnvEntryTypeImpl<SessionBeanType<T>>(this, "env-entry", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   public EjbRefType<SessionBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<SessionBeanType<T>>(this, "ejb-ref", childNode);
   }

   public List<EjbRefType<SessionBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<SessionBeanType<T>>> list = new ArrayList<EjbRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<SessionBeanType<T>> type = new EjbRefTypeImpl<SessionBeanType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<SessionBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<SessionBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   public List<EjbLocalRefType<SessionBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<SessionBeanType<T>>> list = new ArrayList<EjbLocalRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<SessionBeanType<T>> type = new EjbLocalRefTypeImpl<SessionBeanType<T>>(this, "ejb-local-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   public ResourceRefType<SessionBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<SessionBeanType<T>>(this, "resource-ref", childNode);
   }

   public List<ResourceRefType<SessionBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<SessionBeanType<T>>> list = new ArrayList<ResourceRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<SessionBeanType<T>> type = new ResourceRefTypeImpl<SessionBeanType<T>>(this, "resource-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<SessionBeanType<T>>(this, "resource-env-ref", childNode);
   }

   public List<ResourceEnvRefType<SessionBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<SessionBeanType<T>>> list = new ArrayList<ResourceEnvRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<SessionBeanType<T>> type = new ResourceEnvRefTypeImpl<SessionBeanType<T>>(this,
               "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<SessionBeanType<T>>(this, "message-destination-ref", childNode);
   }

   public List<MessageDestinationRefType<SessionBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<SessionBeanType<T>>> list = new ArrayList<MessageDestinationRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<SessionBeanType<T>> type = new MessageDestinationRefTypeImpl<SessionBeanType<T>>(
               this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<SessionBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   public List<PersistenceContextRefType<SessionBeanType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<SessionBeanType<T>>> list = new ArrayList<PersistenceContextRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<SessionBeanType<T>> type = new PersistenceContextRefTypeImpl<SessionBeanType<T>>(
               this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   public List<PersistenceUnitRefType<SessionBeanType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<SessionBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<SessionBeanType<T>> type = new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(this,
               "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   public LifecycleCallbackType<SessionBeanType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "post-construct", childNode);
   }

   public List<LifecycleCallbackType<SessionBeanType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
               "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   public LifecycleCallbackType<SessionBeanType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "pre-destroy", childNode);
   }

   public List<LifecycleCallbackType<SessionBeanType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
               "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllServiceRef()
   {
      childNode.remove("service-ref");
      return this;
   }

   public ServiceRefType<SessionBeanType<T>> serviceRef()
   {
      return new ServiceRefTypeImpl<SessionBeanType<T>>(this, "service-ref", childNode);
   }

   public List<ServiceRefType<SessionBeanType<T>>> getServiceRefList()
   {
      List<ServiceRefType<SessionBeanType<T>>> list = new ArrayList<ServiceRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for (Node node : nodeList)
      {
         ServiceRefType<SessionBeanType<T>> type = new ServiceRefTypeImpl<SessionBeanType<T>>(this, "service-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public SessionBeanType<T> removeEjbName()
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
   public SessionBeanType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public SessionBeanType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   public SecurityIdentityType<SessionBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<SessionBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<SessionBeanType<T>>(
            this, "security-identity", childNode, node);
      return securityIdentity;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-binding
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllLocalBinding()
   {
      childNode.remove("local-binding");
      return this;
   }

   public LocalBindingType<SessionBeanType<T>> localBinding()
   {
      return new LocalBindingTypeImpl<SessionBeanType<T>>(this, "local-binding", childNode);
   }

   public List<LocalBindingType<SessionBeanType<T>>> getLocalBindingList()
   {
      List<LocalBindingType<SessionBeanType<T>>> list = new ArrayList<LocalBindingType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("local-binding");
      for (Node node : nodeList)
      {
         LocalBindingType<SessionBeanType<T>> type = new LocalBindingTypeImpl<SessionBeanType<T>>(this,
               "local-binding", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : remote-binding
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeAllRemoteBinding()
   {
      childNode.remove("remote-binding");
      return this;
   }

   public RemoteBindingType<SessionBeanType<T>> remoteBinding()
   {
      return new RemoteBindingTypeImpl<SessionBeanType<T>>(this, "remote-binding", childNode);
   }

   public List<RemoteBindingType<SessionBeanType<T>>> getRemoteBindingList()
   {
      List<RemoteBindingType<SessionBeanType<T>>> list = new ArrayList<RemoteBindingType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("remote-binding");
      for (Node node : nodeList)
      {
         RemoteBindingType<SessionBeanType<T>> type = new RemoteBindingTypeImpl<SessionBeanType<T>>(this,
               "remote-binding", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : business-local
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> setBusinessLocal(String businessLocal)
   {
      childNode.create("business-local").text(businessLocal);
      return this;
   }

   public SessionBeanType<T> setBusinessLocalList(String... values)
   {
      for (String name : values)
      {
         setBusinessLocal(name);
      }
      return this;
   }

   public SessionBeanType<T> removeAllBusinessLocal()
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
   public SessionBeanType<T> setBusinessRemote(String businessRemote)
   {
      childNode.create("business-remote").text(businessRemote);
      return this;
   }

   public SessionBeanType<T> setBusinessRemoteList(String... values)
   {
      for (String name : values)
      {
         setBusinessRemote(name);
      }
      return this;
   }

   public SessionBeanType<T> removeAllBusinessRemote()
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
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> setJndiName(String jndiName)
   {
      childNode.getOrCreate("jndi-name").text(jndiName);
      return this;
   }

   public SessionBeanType<T> removeJndiName()
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
   public SessionBeanType<T> setHomeJndiName(String homeJndiName)
   {
      childNode.getOrCreate("home-jndi-name").text(homeJndiName);
      return this;
   }

   public SessionBeanType<T> removeHomeJndiName()
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
   public SessionBeanType<T> setLocalJndiName(String localJndiName)
   {
      childNode.getOrCreate("local-jndi-name").text(localJndiName);
      return this;
   }

   public SessionBeanType<T> removeLocalJndiName()
   {
      childNode.remove("local-jndi-name");
      return this;
   }

   public String getLocalJndiName()
   {
      return childNode.textValue("local-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-home-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> setLocalHomeJndiName(String localHomeJndiName)
   {
      childNode.getOrCreate("local-home-jndi-name").text(localHomeJndiName);
      return this;
   }

   public SessionBeanType<T> removeLocalHomeJndiName()
   {
      childNode.remove("local-home-jndi-name");
      return this;
   }

   public String getLocalHomeJndiName()
   {
      return childNode.textValue("local-home-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-binding-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> setJndiBindingPolicy(String jndiBindingPolicy)
   {
      childNode.getOrCreate("jndi-binding-policy").text(jndiBindingPolicy);
      return this;
   }

   public SessionBeanType<T> removeJndiBindingPolicy()
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
   public SessionBeanType<T> setClustered(Boolean clustered)
   {
      childNode.getOrCreate("clustered").text(clustered);
      return this;
   }

   public SessionBeanType<T> removeClustered()
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
   public SessionBeanType<T> removeClusterConfig()
   {
      childNode.remove("cluster-config");
      return this;
   }

   public ClusterConfigType<SessionBeanType<T>> clusterConfig()
   {
      Node node = childNode.getOrCreate("cluster-config");
      ClusterConfigType<SessionBeanType<T>> clusterConfig = new ClusterConfigTypeImpl<SessionBeanType<T>>(this,
            "cluster-config", childNode, node);
      return clusterConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> setSecurityDomain(String securityDomain)
   {
      childNode.getOrCreate("security-domain").text(securityDomain);
      return this;
   }

   public SessionBeanType<T> removeSecurityDomain()
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
   public SessionBeanType<T> removeMethodAttributes()
   {
      childNode.remove("method-attributes");
      return this;
   }

   public MethodAttributesType<SessionBeanType<T>> methodAttributes()
   {
      Node node = childNode.getOrCreate("method-attributes");
      MethodAttributesType<SessionBeanType<T>> methodAttributes = new MethodAttributesTypeImpl<SessionBeanType<T>>(
            this, "method-attributes", childNode, node);
      return methodAttributes;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : depends
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> setDepends(String depends)
   {
      childNode.create("depends").text(depends);
      return this;
   }

   public SessionBeanType<T> setDependsList(String... values)
   {
      for (String name : values)
      {
         setDepends(name);
      }
      return this;
   }

   public SessionBeanType<T> removeAllDepends()
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
   public SessionBeanType<T> removeAllAnnotation()
   {
      childNode.remove("annotation");
      return this;
   }

   public AnnotationType<SessionBeanType<T>> annotation()
   {
      return new AnnotationTypeImpl<SessionBeanType<T>>(this, "annotation", childNode);
   }

   public List<AnnotationType<SessionBeanType<T>>> getAnnotationList()
   {
      List<AnnotationType<SessionBeanType<T>>> list = new ArrayList<AnnotationType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("annotation");
      for (Node node : nodeList)
      {
         AnnotationType<SessionBeanType<T>> type = new AnnotationTypeImpl<SessionBeanType<T>>(this, "annotation",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeIgnoreDependency()
   {
      childNode.remove("ignore-dependency");
      return this;
   }

   public IgnoreDependencyType<SessionBeanType<T>> ignoreDependency()
   {
      Node node = childNode.getOrCreate("ignore-dependency");
      IgnoreDependencyType<SessionBeanType<T>> ignoreDependency = new IgnoreDependencyTypeImpl<SessionBeanType<T>>(
            this, "ignore-dependency", childNode, node);
      return ignoreDependency;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : aop-domain-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> setAopDomainName(String aopDomainName)
   {
      childNode.getOrCreate("aop-domain-name").text(aopDomainName);
      return this;
   }

   public SessionBeanType<T> removeAopDomainName()
   {
      childNode.remove("aop-domain-name");
      return this;
   }

   public String getAopDomainName()
   {
      return childNode.textValue("aop-domain-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cache-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeCacheConfig()
   {
      childNode.remove("cache-config");
      return this;
   }

   public CacheConfigType<SessionBeanType<T>> cacheConfig()
   {
      Node node = childNode.getOrCreate("cache-config");
      CacheConfigType<SessionBeanType<T>> cacheConfig = new CacheConfigTypeImpl<SessionBeanType<T>>(this,
            "cache-config", childNode, node);
      return cacheConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pool-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removePoolConfig()
   {
      childNode.remove("pool-config");
      return this;
   }

   public PoolConfigType<SessionBeanType<T>> poolConfig()
   {
      Node node = childNode.getOrCreate("pool-config");
      PoolConfigType<SessionBeanType<T>> poolConfig = new PoolConfigTypeImpl<SessionBeanType<T>>(this, "pool-config",
            childNode, node);
      return poolConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : concurrent
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> setConcurrent(Boolean concurrent)
   {
      childNode.getOrCreate("concurrent").text(concurrent);
      return this;
   }

   public SessionBeanType<T> removeConcurrent()
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
   public SessionBeanType<T> removeAllJndiRef()
   {
      childNode.remove("jndi-ref");
      return this;
   }

   public JndiRefType<SessionBeanType<T>> jndiRef()
   {
      return new JndiRefTypeImpl<SessionBeanType<T>>(this, "jndi-ref", childNode);
   }

   public List<JndiRefType<SessionBeanType<T>>> getJndiRefList()
   {
      List<JndiRefType<SessionBeanType<T>>> list = new ArrayList<JndiRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("jndi-ref");
      for (Node node : nodeList)
      {
         JndiRefType<SessionBeanType<T>> type = new JndiRefTypeImpl<SessionBeanType<T>>(this, "jndi-ref", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-component
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removePortComponent()
   {
      childNode.remove("port-component");
      return this;
   }

   public PortComponentType<SessionBeanType<T>> portComponent()
   {
      Node node = childNode.getOrCreate("port-component");
      PortComponentType<SessionBeanType<T>> portComponent = new PortComponentTypeImpl<SessionBeanType<T>>(this,
            "port-component", childNode, node);
      return portComponent;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-timeout-identity
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> removeEjbTimeoutIdentity()
   {
      childNode.remove("ejb-timeout-identity");
      return this;
   }

   public SecurityIdentityType<SessionBeanType<T>> ejbTimeoutIdentity()
   {
      Node node = childNode.getOrCreate("ejb-timeout-identity");
      SecurityIdentityType<SessionBeanType<T>> ejbTimeoutIdentity = new SecurityIdentityTypeImpl<SessionBeanType<T>>(
            this, "ejb-timeout-identity", childNode, node);
      return ejbTimeoutIdentity;
   }

}
