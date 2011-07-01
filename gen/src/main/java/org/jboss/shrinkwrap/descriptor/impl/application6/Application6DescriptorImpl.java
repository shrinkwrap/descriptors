package org.jboss.shrinkwrap.descriptor.impl.application6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.application6.Application6Descriptor;
import org.jboss.shrinkwrap.descriptor.api.application6.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
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
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 */
public class Application6DescriptorImpl extends NodeProviderImplBase
      implements
         DescriptorNamespace<Application6Descriptor>,
         Application6Descriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public Application6DescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("application"));
   }

   public Application6DescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
   }

   // -------------------------------------------------------------------------------------||
   // Methods -----------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }

   protected DescriptorExporter getExporter()
   {
      return new XMLExporter();
   }

   // -------------------------------------------------------------------------------------||
   // Namespace ---------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public Application6Descriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation",
            "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application_6.xsd");
      return this;
   }

   public Application6Descriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   public Application6Descriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name : nameSpaceKeys)
      {
         model.attributes().remove(name);
      }
      return this;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : application-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor setApplicationName(String applicationName)
   {
      model.getOrCreate("application-name").text(applicationName);
      return this;
   }

   public Application6Descriptor removeApplicationName()
   {
      model.remove("application-name");
      return this;
   }

   public String getApplicationName()
   {
      return model.textValue("application-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : initialize-in-order
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor setInitializeInOrder(GenericBooleanType initializeInOrder)
   {
      model.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   public Application6Descriptor setInitializeInOrder(String initializeInOrder)
   {
      model.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   public GenericBooleanType getInitializeInOrder()
   {
      return GenericBooleanType.getFromStringValue(model.textValue("initialize-in-order"));
   }

   public String getInitializeInOrderAsString()
   {
      return model.textValue("initialize-in-order");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllModule()
   {
      model.remove("module");
      return this;
   }

   public ModuleType<Application6Descriptor> module()
   {
      return new ModuleTypeImpl<Application6Descriptor>(this, "module", model);
   }

   public List<ModuleType<Application6Descriptor>> getModuleList()
   {
      List<ModuleType<Application6Descriptor>> list = new ArrayList<ModuleType<Application6Descriptor>>();
      List<Node> nodeList = model.get("module");
      for (Node node : nodeList)
      {
         ModuleType<Application6Descriptor> type = new ModuleTypeImpl<Application6Descriptor>(this, "module", model,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllSecurityRole()
   {
      model.remove("security-role");
      return this;
   }

   public SecurityRoleType<Application6Descriptor> securityRole()
   {
      return new SecurityRoleTypeImpl<Application6Descriptor>(this, "security-role", model);
   }

   public List<SecurityRoleType<Application6Descriptor>> getSecurityRoleList()
   {
      List<SecurityRoleType<Application6Descriptor>> list = new ArrayList<SecurityRoleType<Application6Descriptor>>();
      List<Node> nodeList = model.get("security-role");
      for (Node node : nodeList)
      {
         SecurityRoleType<Application6Descriptor> type = new SecurityRoleTypeImpl<Application6Descriptor>(this,
               "security-role", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : library-directory
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor setLibraryDirectory(String libraryDirectory)
   {
      model.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   public Application6Descriptor removeLibraryDirectory()
   {
      model.remove("library-directory");
      return this;
   }

   public String getLibraryDirectory()
   {
      return model.textValue("library-directory");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllEnvEntry()
   {
      model.remove("env-entry");
      return this;
   }

   public EnvEntryType<Application6Descriptor> envEntry()
   {
      return new EnvEntryTypeImpl<Application6Descriptor>(this, "env-entry", model);
   }

   public List<EnvEntryType<Application6Descriptor>> getEnvEntryList()
   {
      List<EnvEntryType<Application6Descriptor>> list = new ArrayList<EnvEntryType<Application6Descriptor>>();
      List<Node> nodeList = model.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<Application6Descriptor> type = new EnvEntryTypeImpl<Application6Descriptor>(this, "env-entry",
               model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllEjbRef()
   {
      model.remove("ejb-ref");
      return this;
   }

   public EjbRefType<Application6Descriptor> ejbRef()
   {
      return new EjbRefTypeImpl<Application6Descriptor>(this, "ejb-ref", model);
   }

   public List<EjbRefType<Application6Descriptor>> getEjbRefList()
   {
      List<EjbRefType<Application6Descriptor>> list = new ArrayList<EjbRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<Application6Descriptor> type = new EjbRefTypeImpl<Application6Descriptor>(this, "ejb-ref", model,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllEjbLocalRef()
   {
      model.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<Application6Descriptor> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<Application6Descriptor>(this, "ejb-local-ref", model);
   }

   public List<EjbLocalRefType<Application6Descriptor>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<Application6Descriptor>> list = new ArrayList<EjbLocalRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<Application6Descriptor> type = new EjbLocalRefTypeImpl<Application6Descriptor>(this,
               "ejb-local-ref", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllResourceRef()
   {
      model.remove("resource-ref");
      return this;
   }

   public ResourceRefType<Application6Descriptor> resourceRef()
   {
      return new ResourceRefTypeImpl<Application6Descriptor>(this, "resource-ref", model);
   }

   public List<ResourceRefType<Application6Descriptor>> getResourceRefList()
   {
      List<ResourceRefType<Application6Descriptor>> list = new ArrayList<ResourceRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<Application6Descriptor> type = new ResourceRefTypeImpl<Application6Descriptor>(this,
               "resource-ref", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllResourceEnvRef()
   {
      model.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<Application6Descriptor> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<Application6Descriptor>(this, "resource-env-ref", model);
   }

   public List<ResourceEnvRefType<Application6Descriptor>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<Application6Descriptor>> list = new ArrayList<ResourceEnvRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<Application6Descriptor> type = new ResourceEnvRefTypeImpl<Application6Descriptor>(this,
               "resource-env-ref", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllMessageDestinationRef()
   {
      model.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<Application6Descriptor> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<Application6Descriptor>(this, "message-destination-ref", model);
   }

   public List<MessageDestinationRefType<Application6Descriptor>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<Application6Descriptor>> list = new ArrayList<MessageDestinationRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<Application6Descriptor> type = new MessageDestinationRefTypeImpl<Application6Descriptor>(
               this, "message-destination-ref", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllPersistenceContextRef()
   {
      model.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<Application6Descriptor> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<Application6Descriptor>(this, "persistence-context-ref", model);
   }

   public List<PersistenceContextRefType<Application6Descriptor>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<Application6Descriptor>> list = new ArrayList<PersistenceContextRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<Application6Descriptor> type = new PersistenceContextRefTypeImpl<Application6Descriptor>(
               this, "persistence-context-ref", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllPersistenceUnitRef()
   {
      model.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<Application6Descriptor> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<Application6Descriptor>(this, "persistence-unit-ref", model);
   }

   public List<PersistenceUnitRefType<Application6Descriptor>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<Application6Descriptor>> list = new ArrayList<PersistenceUnitRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<Application6Descriptor> type = new PersistenceUnitRefTypeImpl<Application6Descriptor>(
               this, "persistence-unit-ref", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllMessageDestination()
   {
      model.remove("message-destination");
      return this;
   }

   public MessageDestinationType<Application6Descriptor> messageDestination()
   {
      return new MessageDestinationTypeImpl<Application6Descriptor>(this, "message-destination", model);
   }

   public List<MessageDestinationType<Application6Descriptor>> getMessageDestinationList()
   {
      List<MessageDestinationType<Application6Descriptor>> list = new ArrayList<MessageDestinationType<Application6Descriptor>>();
      List<Node> nodeList = model.get("message-destination");
      for (Node node : nodeList)
      {
         MessageDestinationType<Application6Descriptor> type = new MessageDestinationTypeImpl<Application6Descriptor>(
               this, "message-destination", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeAllDataSource()
   {
      model.remove("data-source");
      return this;
   }

   public DataSourceType<Application6Descriptor> dataSource()
   {
      return new DataSourceTypeImpl<Application6Descriptor>(this, "data-source", model);
   }

   public List<DataSourceType<Application6Descriptor>> getDataSourceList()
   {
      List<DataSourceType<Application6Descriptor>> list = new ArrayList<DataSourceType<Application6Descriptor>>();
      List<Node> nodeList = model.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<Application6Descriptor> type = new DataSourceTypeImpl<Application6Descriptor>(this,
               "data-source", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   public Application6Descriptor setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public Application6Descriptor removeAllDescription()
   {
      model.remove("description");
      return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("description");
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
   public Application6Descriptor setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   public Application6Descriptor setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public Application6Descriptor removeAllDisplayName()
   {
      model.remove("display-name");
      return this;
   }

   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("display-name");
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
   public Application6Descriptor removeAllIcon()
   {
      model.remove("icon");
      return this;
   }

   public IconType<Application6Descriptor> icon()
   {
      return new IconTypeImpl<Application6Descriptor>(this, "icon", model);
   }

   public List<IconType<Application6Descriptor>> getIconList()
   {
      List<IconType<Application6Descriptor>> list = new ArrayList<IconType<Application6Descriptor>>();
      List<Node> nodeList = model.get("icon");
      for (Node node : nodeList)
      {
         IconType<Application6Descriptor> type = new IconTypeImpl<Application6Descriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

}
