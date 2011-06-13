package org.jboss.shrinkwrap.descriptor.impl.application6;

import java.util.ArrayList;
import java.util.List;

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
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public class Application6DescriptorImpl extends NodeProviderImplBase
      implements
         Application6Descriptor<Application6DescriptorImpl>
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
   // Element type : application-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl setApplicationName(String applicationName)
   {
      model.getOrCreate("application-name").text(applicationName);
      return this;
   }

   public Application6DescriptorImpl removeApplicationName()
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
   public Application6DescriptorImpl setInitializeInOrder(String initializeInOrder)
   {
      model.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   public Application6DescriptorImpl removeInitializeInOrder()
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
   public Application6DescriptorImpl removeModule()
   {
      model.remove("module");
      return this;
   }

   public ModuleType<Application6DescriptorImpl> module()
   {
      Node node = model.getOrCreate(ModuleTypeImpl.nodeName);
      ModuleType<Application6DescriptorImpl> module = new ModuleTypeImpl<Application6DescriptorImpl>(this, "", model,
            node);
      return module;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removeSecurityRole()
   {
      model.remove("security-role");
      return this;
   }

   public SecurityRoleType<Application6DescriptorImpl> securityRole()
   {
      Node node = model.getOrCreate(SecurityRoleTypeImpl.nodeName);
      SecurityRoleType<Application6DescriptorImpl> securityRole = new SecurityRoleTypeImpl<Application6DescriptorImpl>(
            this, "", model, node);
      return securityRole;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : library-directory
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl setLibraryDirectory(String libraryDirectory)
   {
      model.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   public Application6DescriptorImpl removeLibraryDirectory()
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
   public Application6DescriptorImpl removeEnvEntry()
   {
      model.remove("env-entry");
      return this;
   }

   public EnvEntryType<Application6DescriptorImpl> envEntry()
   {
      Node node = model.getOrCreate(EnvEntryTypeImpl.nodeName);
      EnvEntryType<Application6DescriptorImpl> envEntry = new EnvEntryTypeImpl<Application6DescriptorImpl>(this, "",
            model, node);
      return envEntry;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removeEjbRef()
   {
      model.remove("ejb-ref");
      return this;
   }

   public EjbRefType<Application6DescriptorImpl> ejbRef()
   {
      Node node = model.getOrCreate(EjbRefTypeImpl.nodeName);
      EjbRefType<Application6DescriptorImpl> ejbRef = new EjbRefTypeImpl<Application6DescriptorImpl>(this, "", model,
            node);
      return ejbRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removeEjbLocalRef()
   {
      model.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<Application6DescriptorImpl> ejbLocalRef()
   {
      Node node = model.getOrCreate(EjbLocalRefTypeImpl.nodeName);
      EjbLocalRefType<Application6DescriptorImpl> ejbLocalRef = new EjbLocalRefTypeImpl<Application6DescriptorImpl>(
            this, "", model, node);
      return ejbLocalRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removeResourceRef()
   {
      model.remove("resource-ref");
      return this;
   }

   public ResourceRefType<Application6DescriptorImpl> resourceRef()
   {
      Node node = model.getOrCreate(ResourceRefTypeImpl.nodeName);
      ResourceRefType<Application6DescriptorImpl> resourceRef = new ResourceRefTypeImpl<Application6DescriptorImpl>(
            this, "", model, node);
      return resourceRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removeResourceEnvRef()
   {
      model.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<Application6DescriptorImpl> resourceEnvRef()
   {
      Node node = model.getOrCreate(ResourceEnvRefTypeImpl.nodeName);
      ResourceEnvRefType<Application6DescriptorImpl> resourceEnvRef = new ResourceEnvRefTypeImpl<Application6DescriptorImpl>(
            this, "", model, node);
      return resourceEnvRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removeMessageDestinationRef()
   {
      model.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<Application6DescriptorImpl> messageDestinationRef()
   {
      Node node = model.getOrCreate(MessageDestinationRefTypeImpl.nodeName);
      MessageDestinationRefType<Application6DescriptorImpl> messageDestinationRef = new MessageDestinationRefTypeImpl<Application6DescriptorImpl>(
            this, "", model, node);
      return messageDestinationRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removePersistenceContextRef()
   {
      model.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<Application6DescriptorImpl> persistenceContextRef()
   {
      Node node = model.getOrCreate(PersistenceContextRefTypeImpl.nodeName);
      PersistenceContextRefType<Application6DescriptorImpl> persistenceContextRef = new PersistenceContextRefTypeImpl<Application6DescriptorImpl>(
            this, "", model, node);
      return persistenceContextRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removePersistenceUnitRef()
   {
      model.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<Application6DescriptorImpl> persistenceUnitRef()
   {
      Node node = model.getOrCreate(PersistenceUnitRefTypeImpl.nodeName);
      PersistenceUnitRefType<Application6DescriptorImpl> persistenceUnitRef = new PersistenceUnitRefTypeImpl<Application6DescriptorImpl>(
            this, "", model, node);
      return persistenceUnitRef;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removeMessageDestination()
   {
      model.remove("message-destination");
      return this;
   }

   public MessageDestinationType<Application6DescriptorImpl> messageDestination()
   {
      Node node = model.getOrCreate(MessageDestinationTypeImpl.nodeName);
      MessageDestinationType<Application6DescriptorImpl> messageDestination = new MessageDestinationTypeImpl<Application6DescriptorImpl>(
            this, "", model, node);
      return messageDestination;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl removeDataSource()
   {
      model.remove("data-source");
      return this;
   }

   public DataSourceType<Application6DescriptorImpl> dataSource()
   {
      Node node = model.getOrCreate(DataSourceTypeImpl.nodeName);
      DataSourceType<Application6DescriptorImpl> dataSource = new DataSourceTypeImpl<Application6DescriptorImpl>(this,
            "", model, node);
      return dataSource;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Application6DescriptorImpl setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   public Application6DescriptorImpl setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public Application6DescriptorImpl removeAllDescription()
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
   public Application6DescriptorImpl setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   public Application6DescriptorImpl setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public Application6DescriptorImpl removeAllDisplayName()
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
   public Application6DescriptorImpl removeAllIcon()
   {
      model.remove("icon");
      return this;
   }

   public IconType<Application6DescriptorImpl> icon()
   {
      return new IconTypeImpl<Application6DescriptorImpl>(this, "", model);
   }

   public List<IconType<Application6DescriptorImpl>> getIconList()
   {
      List<IconType<Application6DescriptorImpl>> list = new ArrayList<IconType<Application6DescriptorImpl>>();
      List<Node> nodeList = model.get(IconTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         IconType<Application6DescriptorImpl> type = new IconTypeImpl<Application6DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }

}
