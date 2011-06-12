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
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String applicationName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String initializeInOrder;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ModuleType<ApplicationType<T>> module;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private SecurityRoleType<ApplicationType<T>> securityRole;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String libraryDirectory;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private EnvEntryType<ApplicationType<T>> envEntry;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private EjbRefType<ApplicationType<T>> ejbRef;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private EjbLocalRefType<ApplicationType<T>> ejbLocalRef;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ResourceRefType<ApplicationType<T>> resourceRef;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ResourceEnvRefType<ApplicationType<T>> resourceEnvRef;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private MessageDestinationRefType<ApplicationType<T>> messageDestinationRef;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private PersistenceContextRefType<ApplicationType<T>> persistenceContextRef;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private MessageDestinationType<ApplicationType<T>> messageDestination;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private DataSourceType<ApplicationType<T>> dataSource;

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private IconType<ApplicationType<T>> icon;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ApplicationTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ApplicationTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ApplicationType<T> setDescription(String ... values)
   {
      for(String name: values)
      {
         setDescription(description);
      }
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

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public ApplicationType<T> setDisplayName(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(displayName);
      }
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

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setIcon(IconType<ApplicationType<T>> icon)
   {
      childNode.create("icon").text(icon);
      return this;
   }

   public IconType<ApplicationType<T>> getIcon()
   {
      return new IconTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<IconType<ApplicationType<T>>> getIconList()
   {
      List<IconType<ApplicationType<T>>> list = new ArrayList<IconType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         IconType<ApplicationType<T>>  type = new IconTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setApplicationName(String applicationName)   {
      this.applicationName = applicationName;
      childNode.getOrCreate("application-name").text(applicationName);
      return this;
   }

   public String getApplicationName()
   {
      return childNode.textValue("application-name");
   }


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setInitializeInOrder(String initializeInOrder)   {
      this.initializeInOrder = initializeInOrder;
      childNode.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   public String getInitializeInOrder()
   {
      return childNode.textValue("initialize-in-order");
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setModule(ModuleType<ApplicationType<T>> module)
   {
      childNode.create("module").text(module);
      return this;
   }

   public ModuleType<ApplicationType<T>> getModule()
   {
      return new ModuleTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<ModuleType<ApplicationType<T>>> getModuleList()
   {
      List<ModuleType<ApplicationType<T>>> list = new ArrayList<ModuleType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(ModuleTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ModuleType<ApplicationType<T>>  type = new ModuleTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setSecurityRole(SecurityRoleType<ApplicationType<T>> securityRole)
   {
      childNode.create("security-role").text(securityRole);
      return this;
   }

   public SecurityRoleType<ApplicationType<T>> getSecurityRole()
   {
      return new SecurityRoleTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<SecurityRoleType<ApplicationType<T>>> getSecurityRoleList()
   {
      List<SecurityRoleType<ApplicationType<T>>> list = new ArrayList<SecurityRoleType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(SecurityRoleTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         SecurityRoleType<ApplicationType<T>>  type = new SecurityRoleTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setLibraryDirectory(String libraryDirectory)   {
      this.libraryDirectory = libraryDirectory;
      childNode.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   public String getLibraryDirectory()
   {
      return childNode.textValue("library-directory");
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setEnvEntry(EnvEntryType<ApplicationType<T>> envEntry)
   {
      childNode.create("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<ApplicationType<T>> getEnvEntry()
   {
      return new EnvEntryTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<EnvEntryType<ApplicationType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<ApplicationType<T>>> list = new ArrayList<EnvEntryType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(EnvEntryTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EnvEntryType<ApplicationType<T>>  type = new EnvEntryTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setEjbRef(EjbRefType<ApplicationType<T>> ejbRef)
   {
      childNode.create("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<ApplicationType<T>> getEjbRef()
   {
      return new EjbRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<EjbRefType<ApplicationType<T>>> getEjbRefList()
   {
      List<EjbRefType<ApplicationType<T>>> list = new ArrayList<EjbRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(EjbRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EjbRefType<ApplicationType<T>>  type = new EjbRefTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setEjbLocalRef(EjbLocalRefType<ApplicationType<T>> ejbLocalRef)
   {
      childNode.create("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<ApplicationType<T>> getEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<EjbLocalRefType<ApplicationType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<ApplicationType<T>>> list = new ArrayList<EjbLocalRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(EjbLocalRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         EjbLocalRefType<ApplicationType<T>>  type = new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setResourceRef(ResourceRefType<ApplicationType<T>> resourceRef)
   {
      childNode.create("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<ApplicationType<T>> getResourceRef()
   {
      return new ResourceRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<ResourceRefType<ApplicationType<T>>> getResourceRefList()
   {
      List<ResourceRefType<ApplicationType<T>>> list = new ArrayList<ResourceRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(ResourceRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ResourceRefType<ApplicationType<T>>  type = new ResourceRefTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setResourceEnvRef(ResourceEnvRefType<ApplicationType<T>> resourceEnvRef)
   {
      childNode.create("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<ApplicationType<T>> getResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<ResourceEnvRefType<ApplicationType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<ApplicationType<T>>> list = new ArrayList<ResourceEnvRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(ResourceEnvRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ResourceEnvRefType<ApplicationType<T>>  type = new ResourceEnvRefTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setMessageDestinationRef(MessageDestinationRefType<ApplicationType<T>> messageDestinationRef)
   {
      childNode.create("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<ApplicationType<T>> getMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<MessageDestinationRefType<ApplicationType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<ApplicationType<T>>> list = new ArrayList<MessageDestinationRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(MessageDestinationRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         MessageDestinationRefType<ApplicationType<T>>  type = new MessageDestinationRefTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setPersistenceContextRef(PersistenceContextRefType<ApplicationType<T>> persistenceContextRef)
   {
      childNode.create("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<ApplicationType<T>> getPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<PersistenceContextRefType<ApplicationType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<ApplicationType<T>>> list = new ArrayList<PersistenceContextRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceContextRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PersistenceContextRefType<ApplicationType<T>>  type = new PersistenceContextRefTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setPersistenceUnitRef(PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef)
   {
      childNode.create("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<ApplicationType<T>> getPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<PersistenceUnitRefType<ApplicationType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<ApplicationType<T>>> list = new ArrayList<PersistenceUnitRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(PersistenceUnitRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<ApplicationType<T>>  type = new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setMessageDestination(MessageDestinationType<ApplicationType<T>> messageDestination)
   {
      childNode.create("message-destination").text(messageDestination);
      return this;
   }

   public MessageDestinationType<ApplicationType<T>> getMessageDestination()
   {
      return new MessageDestinationTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<MessageDestinationType<ApplicationType<T>>> getMessageDestinationList()
   {
      List<MessageDestinationType<ApplicationType<T>>> list = new ArrayList<MessageDestinationType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(MessageDestinationTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         MessageDestinationType<ApplicationType<T>>  type = new MessageDestinationTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setDataSource(DataSourceType<ApplicationType<T>> dataSource)
   {
      childNode.create("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<ApplicationType<T>> getDataSource()
   {
      return new DataSourceTypeImpl<ApplicationType<T>>(this, "", childNode);
   }

   public List<DataSourceType<ApplicationType<T>>> getDataSourceList()
   {
      List<DataSourceType<ApplicationType<T>>> list = new ArrayList<DataSourceType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get(DataSourceTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         DataSourceType<ApplicationType<T>>  type = new DataSourceTypeImpl<ApplicationType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


}
