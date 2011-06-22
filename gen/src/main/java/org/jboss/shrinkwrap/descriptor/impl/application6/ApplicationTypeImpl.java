package org.jboss.shrinkwrap.descriptor.impl.application6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application6.ApplicationType;
import org.jboss.shrinkwrap.descriptor.api.application6.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T14:39:12.971-04:00
 *
 * Original Documentation:
 *
 *
 * The applicationType defines the structure of the
 * application.
 *
 *
 *
 */
public class ApplicationTypeImpl<T> implements Child<T>, ApplicationType<T>
{
   public final static String nodeName = "";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ApplicationTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ApplicationTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   public ApplicationType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ApplicationType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public ApplicationType<T> removeAllDescription()
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
   public ApplicationType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public ApplicationType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public ApplicationType<T> removeAllDisplayName()
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
   public ApplicationType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<ApplicationType<T>> icon()
   {
      return new IconTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<IconType<ApplicationType<T>>> getIconList()
   {
      List<IconType<ApplicationType<T>>> list = new ArrayList<IconType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         IconType<ApplicationType<T>> type = new IconTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : application-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> setApplicationName(String applicationName)
   {
      childNode.getOrCreate("application-name").text(applicationName);
      return this;
   }

   public ApplicationType<T> removeApplicationName()
   {
      childNode.remove("application-name");
      return this;
   }

   public String getApplicationName()
   {
      return childNode.textValue("application-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : initialize-in-order
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> setInitializeInOrder(String initializeInOrder)
   {
      childNode.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   public ApplicationType<T> removeInitializeInOrder()
   {
      childNode.remove("initialize-in-order");
      return this;
   }

   public String getInitializeInOrder()
   {
      return childNode.textValue("initialize-in-order");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllModule()
   {
      childNode.remove("module");
      return this;
   }

   public ModuleType<ApplicationType<T>> module()
   {
      return new ModuleTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<ModuleType<ApplicationType<T>>> getModuleList()
   {
      List<ModuleType<ApplicationType<T>>> list = new ArrayList<ModuleType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(ModuleTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ModuleType<ApplicationType<T>> type = new ModuleTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllSecurityRole()
   {
      childNode.remove("security-role");
      return this;
   }

   public SecurityRoleType<ApplicationType<T>> securityRole()
   {
      return new SecurityRoleTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<SecurityRoleType<ApplicationType<T>>> getSecurityRoleList()
   {
      List<SecurityRoleType<ApplicationType<T>>> list = new ArrayList<SecurityRoleType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(SecurityRoleTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SecurityRoleType<ApplicationType<T>> type = new SecurityRoleTypeImpl<ApplicationType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : library-directory
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> setLibraryDirectory(String libraryDirectory)
   {
      childNode.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   public ApplicationType<T> removeLibraryDirectory()
   {
      childNode.remove("library-directory");
      return this;
   }

   public String getLibraryDirectory()
   {
      return childNode.textValue("library-directory");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   public EnvEntryType<ApplicationType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<EnvEntryType<ApplicationType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<ApplicationType<T>>> list = new ArrayList<EnvEntryType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(EnvEntryTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EnvEntryType<ApplicationType<T>> type = new EnvEntryTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   public EjbRefType<ApplicationType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<EjbRefType<ApplicationType<T>>> getEjbRefList()
   {
      List<EjbRefType<ApplicationType<T>>> list = new ArrayList<EjbRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(EjbRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EjbRefType<ApplicationType<T>> type = new EjbRefTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<ApplicationType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<EjbLocalRefType<ApplicationType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<ApplicationType<T>>> list = new ArrayList<EjbLocalRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(EjbLocalRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         EjbLocalRefType<ApplicationType<T>> type = new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   public ResourceRefType<ApplicationType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<ResourceRefType<ApplicationType<T>>> getResourceRefList()
   {
      List<ResourceRefType<ApplicationType<T>>> list = new ArrayList<ResourceRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(ResourceRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ResourceRefType<ApplicationType<T>> type = new ResourceRefTypeImpl<ApplicationType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<ApplicationType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<ResourceEnvRefType<ApplicationType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<ApplicationType<T>>> list = new ArrayList<ResourceEnvRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(ResourceEnvRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ResourceEnvRefType<ApplicationType<T>> type = new ResourceEnvRefTypeImpl<ApplicationType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<ApplicationType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<MessageDestinationRefType<ApplicationType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<ApplicationType<T>>> list = new ArrayList<MessageDestinationRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(MessageDestinationRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MessageDestinationRefType<ApplicationType<T>> type = new MessageDestinationRefTypeImpl<ApplicationType<T>>(
               this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<ApplicationType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<PersistenceContextRefType<ApplicationType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<ApplicationType<T>>> list = new ArrayList<PersistenceContextRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceContextRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         PersistenceContextRefType<ApplicationType<T>> type = new PersistenceContextRefTypeImpl<ApplicationType<T>>(
               this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<PersistenceUnitRefType<ApplicationType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<ApplicationType<T>>> list = new ArrayList<PersistenceUnitRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceUnitRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<ApplicationType<T>> type = new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllMessageDestination()
   {
      childNode.remove("message-destination");
      return this;
   }

   public MessageDestinationType<ApplicationType<T>> messageDestination()
   {
      return new MessageDestinationTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<MessageDestinationType<ApplicationType<T>>> getMessageDestinationList()
   {
      List<MessageDestinationType<ApplicationType<T>>> list = new ArrayList<MessageDestinationType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(MessageDestinationTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         MessageDestinationType<ApplicationType<T>> type = new MessageDestinationTypeImpl<ApplicationType<T>>(this, "",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   public DataSourceType<ApplicationType<T>> dataSource()
   {
      return new DataSourceTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<DataSourceType<ApplicationType<T>>> getDataSourceList()
   {
      List<DataSourceType<ApplicationType<T>>> list = new ArrayList<DataSourceType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(DataSourceTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         DataSourceType<ApplicationType<T>> type = new DataSourceTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

}
