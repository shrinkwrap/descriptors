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
 * Generation date :2011-06-22T14:39:12.971-04:00
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
   public Application6Descriptor setInitializeInOrder(String initializeInOrder)
   {
      model.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   public Application6Descriptor removeInitializeInOrder()
   {
      model.remove("initialize-in-order");
      return this;
   }

   public String getInitializeInOrder()
   {
      return model.textValue("initialize-in-order");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeModule()
   {
      model.remove("module");
      return this;
   }

   public ModuleType<Application6Descriptor> module()
   {
      Node node = model.getOrCreate(ModuleTypeImpl.nodeName);
      ModuleType<Application6Descriptor> module = new ModuleTypeImpl<Application6Descriptor>(this, "", model, node);
      return module;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeSecurityRole()
   {
      model.remove("security-role");
      return this;
   }

   public SecurityRoleType<Application6Descriptor> securityRole()
   {
      Node node = model.getOrCreate(SecurityRoleTypeImpl.nodeName);
      SecurityRoleType<Application6Descriptor> securityRole = new SecurityRoleTypeImpl<Application6Descriptor>(this,
            "", model, node);
      return securityRole;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : library-directory
   // isComplexType: false   maxOccurs: -   isAttribute: false
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
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeEnvEntry()
   {
      model.remove("env-entry");
      return this;
   }

   public EnvEntryType<Application6Descriptor> envEntry()
   {
      Node node = model.getOrCreate(EnvEntryTypeImpl.nodeName);
      EnvEntryType<Application6Descriptor> envEntry = new EnvEntryTypeImpl<Application6Descriptor>(this, "", model,
            node);
      return envEntry;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeEjbRef()
   {
      model.remove("ejb-ref");
      return this;
   }

   public EjbRefType<Application6Descriptor> ejbRef()
   {
      Node node = model.getOrCreate(EjbRefTypeImpl.nodeName);
      EjbRefType<Application6Descriptor> ejbRef = new EjbRefTypeImpl<Application6Descriptor>(this, "", model, node);
      return ejbRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeEjbLocalRef()
   {
      model.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<Application6Descriptor> ejbLocalRef()
   {
      Node node = model.getOrCreate(EjbLocalRefTypeImpl.nodeName);
      EjbLocalRefType<Application6Descriptor> ejbLocalRef = new EjbLocalRefTypeImpl<Application6Descriptor>(this, "",
            model, node);
      return ejbLocalRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeResourceRef()
   {
      model.remove("resource-ref");
      return this;
   }

   public ResourceRefType<Application6Descriptor> resourceRef()
   {
      Node node = model.getOrCreate(ResourceRefTypeImpl.nodeName);
      ResourceRefType<Application6Descriptor> resourceRef = new ResourceRefTypeImpl<Application6Descriptor>(this, "",
            model, node);
      return resourceRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeResourceEnvRef()
   {
      model.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<Application6Descriptor> resourceEnvRef()
   {
      Node node = model.getOrCreate(ResourceEnvRefTypeImpl.nodeName);
      ResourceEnvRefType<Application6Descriptor> resourceEnvRef = new ResourceEnvRefTypeImpl<Application6Descriptor>(
            this, "", model, node);
      return resourceEnvRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeMessageDestinationRef()
   {
      model.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<Application6Descriptor> messageDestinationRef()
   {
      Node node = model.getOrCreate(MessageDestinationRefTypeImpl.nodeName);
      MessageDestinationRefType<Application6Descriptor> messageDestinationRef = new MessageDestinationRefTypeImpl<Application6Descriptor>(
            this, "", model, node);
      return messageDestinationRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removePersistenceContextRef()
   {
      model.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<Application6Descriptor> persistenceContextRef()
   {
      Node node = model.getOrCreate(PersistenceContextRefTypeImpl.nodeName);
      PersistenceContextRefType<Application6Descriptor> persistenceContextRef = new PersistenceContextRefTypeImpl<Application6Descriptor>(
            this, "", model, node);
      return persistenceContextRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removePersistenceUnitRef()
   {
      model.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<Application6Descriptor> persistenceUnitRef()
   {
      Node node = model.getOrCreate(PersistenceUnitRefTypeImpl.nodeName);
      PersistenceUnitRefType<Application6Descriptor> persistenceUnitRef = new PersistenceUnitRefTypeImpl<Application6Descriptor>(
            this, "", model, node);
      return persistenceUnitRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeMessageDestination()
   {
      model.remove("message-destination");
      return this;
   }

   public MessageDestinationType<Application6Descriptor> messageDestination()
   {
      Node node = model.getOrCreate(MessageDestinationTypeImpl.nodeName);
      MessageDestinationType<Application6Descriptor> messageDestination = new MessageDestinationTypeImpl<Application6Descriptor>(
            this, "", model, node);
      return messageDestination;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6Descriptor removeDataSource()
   {
      model.remove("data-source");
      return this;
   }

   public DataSourceType<Application6Descriptor> dataSource()
   {
      Node node = model.getOrCreate(DataSourceTypeImpl.nodeName);
      DataSourceType<Application6Descriptor> dataSource = new DataSourceTypeImpl<Application6Descriptor>(this, "",
            model, node);
      return dataSource;
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
      return new IconTypeImpl<Application6Descriptor>(this, "", model);
   }

   public List<IconType<Application6Descriptor>> getIconList()
   {
      List<IconType<Application6Descriptor>> list = new ArrayList<IconType<Application6Descriptor>>();
      List<Node> nodeList = model.get(IconTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         IconType<Application6Descriptor> type = new IconTypeImpl<Application6Descriptor>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

}
