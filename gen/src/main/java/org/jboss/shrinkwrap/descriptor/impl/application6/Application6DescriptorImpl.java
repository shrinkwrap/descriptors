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
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class Application6DescriptorImpl extends NodeProviderImplBase implements Application6Descriptor<Application6DescriptorImpl>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private Node model;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private String applicationName;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private String initializeInOrder;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private ModuleType<Application6DescriptorImpl> module;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private SecurityRoleType<Application6DescriptorImpl> securityRole;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private String libraryDirectory;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private EnvEntryType<Application6DescriptorImpl> envEntry;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private EjbRefType<Application6DescriptorImpl> ejbRef;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private EjbLocalRefType<Application6DescriptorImpl> ejbLocalRef;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private ResourceRefType<Application6DescriptorImpl> resourceRef;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private ResourceEnvRefType<Application6DescriptorImpl> resourceEnvRef;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private MessageDestinationRefType<Application6DescriptorImpl> messageDestinationRef;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private PersistenceContextRefType<Application6DescriptorImpl> persistenceContextRef;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private PersistenceUnitRefType<Application6DescriptorImpl> persistenceUnitRef;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private MessageDestinationType<Application6DescriptorImpl> messageDestination;
   // maxOccurs = -   // isGeneric = false   // isAttribute = false
   private DataSourceType<Application6DescriptorImpl> dataSource;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false
   private IconType<Application6DescriptorImpl> icon;

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
   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setApplicationName(String applicationName)   {
      this.applicationName = applicationName;
      model.getOrCreate("application-name").text(applicationName);
      return this;
   }

   public String getApplicationName()
   {
      return model.textValue("application-name");
   }

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setInitializeInOrder(String initializeInOrder)   {
      this.initializeInOrder = initializeInOrder;
      model.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   public String getInitializeInOrder()
   {
      return model.textValue("initialize-in-order");
   }

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setModule(ModuleType<Application6DescriptorImpl> module)   {
      this.module = module;
      model.getOrCreate("module").text(module);
      return this;
   }

   public ModuleType<Application6DescriptorImpl> getModule()
   {
      if( module == null)
      {
          module = new ModuleTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return module;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setSecurityRole(SecurityRoleType<Application6DescriptorImpl> securityRole)   {
      this.securityRole = securityRole;
      model.getOrCreate("security-role").text(securityRole);
      return this;
   }

   public SecurityRoleType<Application6DescriptorImpl> getSecurityRole()
   {
      if( securityRole == null)
      {
          securityRole = new SecurityRoleTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return securityRole;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setLibraryDirectory(String libraryDirectory)   {
      this.libraryDirectory = libraryDirectory;
      model.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   public String getLibraryDirectory()
   {
      return model.textValue("library-directory");
   }

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setEnvEntry(EnvEntryType<Application6DescriptorImpl> envEntry)   {
      this.envEntry = envEntry;
      model.getOrCreate("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<Application6DescriptorImpl> getEnvEntry()
   {
      if( envEntry == null)
      {
          envEntry = new EnvEntryTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return envEntry;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setEjbRef(EjbRefType<Application6DescriptorImpl> ejbRef)   {
      this.ejbRef = ejbRef;
      model.getOrCreate("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<Application6DescriptorImpl> getEjbRef()
   {
      if( ejbRef == null)
      {
          ejbRef = new EjbRefTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return ejbRef;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setEjbLocalRef(EjbLocalRefType<Application6DescriptorImpl> ejbLocalRef)   {
      this.ejbLocalRef = ejbLocalRef;
      model.getOrCreate("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<Application6DescriptorImpl> getEjbLocalRef()
   {
      if( ejbLocalRef == null)
      {
          ejbLocalRef = new EjbLocalRefTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return ejbLocalRef;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setResourceRef(ResourceRefType<Application6DescriptorImpl> resourceRef)   {
      this.resourceRef = resourceRef;
      model.getOrCreate("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<Application6DescriptorImpl> getResourceRef()
   {
      if( resourceRef == null)
      {
          resourceRef = new ResourceRefTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return resourceRef;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setResourceEnvRef(ResourceEnvRefType<Application6DescriptorImpl> resourceEnvRef)   {
      this.resourceEnvRef = resourceEnvRef;
      model.getOrCreate("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<Application6DescriptorImpl> getResourceEnvRef()
   {
      if( resourceEnvRef == null)
      {
          resourceEnvRef = new ResourceEnvRefTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return resourceEnvRef;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setMessageDestinationRef(MessageDestinationRefType<Application6DescriptorImpl> messageDestinationRef)   {
      this.messageDestinationRef = messageDestinationRef;
      model.getOrCreate("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<Application6DescriptorImpl> getMessageDestinationRef()
   {
      if( messageDestinationRef == null)
      {
          messageDestinationRef = new MessageDestinationRefTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return messageDestinationRef;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setPersistenceContextRef(PersistenceContextRefType<Application6DescriptorImpl> persistenceContextRef)   {
      this.persistenceContextRef = persistenceContextRef;
      model.getOrCreate("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<Application6DescriptorImpl> getPersistenceContextRef()
   {
      if( persistenceContextRef == null)
      {
          persistenceContextRef = new PersistenceContextRefTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return persistenceContextRef;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setPersistenceUnitRef(PersistenceUnitRefType<Application6DescriptorImpl> persistenceUnitRef)   {
      this.persistenceUnitRef = persistenceUnitRef;
      model.getOrCreate("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<Application6DescriptorImpl> getPersistenceUnitRef()
   {
      if( persistenceUnitRef == null)
      {
          persistenceUnitRef = new PersistenceUnitRefTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return persistenceUnitRef;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setMessageDestination(MessageDestinationType<Application6DescriptorImpl> messageDestination)   {
      this.messageDestination = messageDestination;
      model.getOrCreate("message-destination").text(messageDestination);
      return this;
   }

   public MessageDestinationType<Application6DescriptorImpl> getMessageDestination()
   {
      if( messageDestination == null)
      {
          messageDestination = new MessageDestinationTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return messageDestination;
   }


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setDataSource(DataSourceType<Application6DescriptorImpl> dataSource)   {
      this.dataSource = dataSource;
      model.getOrCreate("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<Application6DescriptorImpl> getDataSource()
   {
      if( dataSource == null)
      {
          dataSource = new DataSourceTypeImpl<Application6DescriptorImpl>(this, "", model);
      }
      return dataSource;
   }


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   public Application6DescriptorImpl setDescription(String ... values)
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
      List<Node> nodes = model.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   public Application6DescriptorImpl setDisplayName(String ... values)
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
      List<Node> nodes = model.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public Application6DescriptorImpl setIcon(IconType<Application6DescriptorImpl> icon)
   {
      model.create("icon").text(icon);
      return this;
   }

   public IconType<Application6DescriptorImpl> getIcon()
   {
      return new IconTypeImpl<Application6DescriptorImpl>(this, "", model);
   }

   public List<IconType<Application6DescriptorImpl>> getIconList()
   {
      List<IconType<Application6DescriptorImpl>> list = new ArrayList<IconType<Application6DescriptorImpl>>();
      List<Node> nodeList = model.get(IconTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         IconType<Application6DescriptorImpl>  type = new IconTypeImpl<Application6DescriptorImpl>(this, "", model, node);
         list.add(type);
      }
      return list;
   }



}
