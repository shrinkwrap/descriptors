package org.jboss.shrinkwrap.descriptor.impl.application6; 

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
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
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
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class ApplicationTypeImpl<T> implements Child<T>, ApplicationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String applicationName;
   private String initializeInOrder;
   private ModuleType<ApplicationType<T>> module;
   private SecurityRoleType<ApplicationType<T>> securityRole;
   private String libraryDirectory;
   private EnvEntryType<ApplicationType<T>> envEntry;
   private EjbRefType<ApplicationType<T>> ejbRef;
   private EjbLocalRefType<ApplicationType<T>> ejbLocalRef;
   private ResourceRefType<ApplicationType<T>> resourceRef;
   private ResourceEnvRefType<ApplicationType<T>> resourceEnvRef;
   private MessageDestinationRefType<ApplicationType<T>> messageDestinationRef;
   private PersistenceContextRefType<ApplicationType<T>> persistenceContextRef;
   private PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef;
   private MessageDestinationType<ApplicationType<T>> messageDestination;
   private DataSourceType<ApplicationType<T>> dataSource;

   private String description;
   private String displayName;
   private IconType<ApplicationType<T>> icon;
   private ServiceRefType<ApplicationType<T>> serviceRef;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ApplicationTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("");   }


   public T up()
   {
      return t;
   }



   public ApplicationType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public ApplicationType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public ApplicationType<T> setIcon(IconType<ApplicationType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<ApplicationType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return icon;
   }



   public ApplicationType<T> setServiceRef(ServiceRefType<ApplicationType<T>> serviceRef)
   {
      this.serviceRef = serviceRef;
      childNode.getOrCreate("service-ref").text(serviceRef);
      return this;
   }

   public ServiceRefType<ApplicationType<T>> getServiceRef()
   {
      if( serviceRef == null)
      {
          serviceRef = new ServiceRefTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return serviceRef;
   }



   public ApplicationType<T> setApplicationName(String applicationName)
   {
      this.applicationName = applicationName;
      childNode.getOrCreate("application-name").text(applicationName);
      return this;
   }

   public String getApplicationName()
   {
      return applicationName;
   }



   public ApplicationType<T> setInitializeInOrder(String initializeInOrder)
   {
      this.initializeInOrder = initializeInOrder;
      childNode.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   public String getInitializeInOrder()
   {
      return initializeInOrder;
   }



   public ApplicationType<T> setModule(ModuleType<ApplicationType<T>> module)
   {
      this.module = module;
      childNode.getOrCreate("module").text(module);
      return this;
   }

   public ModuleType<ApplicationType<T>> getModule()
   {
      if( module == null)
      {
          module = new ModuleTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return module;
   }




   public ApplicationType<T> setSecurityRole(SecurityRoleType<ApplicationType<T>> securityRole)
   {
      this.securityRole = securityRole;
      childNode.getOrCreate("security-role").text(securityRole);
      return this;
   }

   public SecurityRoleType<ApplicationType<T>> getSecurityRole()
   {
      if( securityRole == null)
      {
          securityRole = new SecurityRoleTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return securityRole;
   }




   public ApplicationType<T> setLibraryDirectory(String libraryDirectory)
   {
      this.libraryDirectory = libraryDirectory;
      childNode.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   public String getLibraryDirectory()
   {
      return libraryDirectory;
   }



   public ApplicationType<T> setEnvEntry(EnvEntryType<ApplicationType<T>> envEntry)
   {
      this.envEntry = envEntry;
      childNode.getOrCreate("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<ApplicationType<T>> getEnvEntry()
   {
      if( envEntry == null)
      {
          envEntry = new EnvEntryTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return envEntry;
   }




   public ApplicationType<T> setEjbRef(EjbRefType<ApplicationType<T>> ejbRef)
   {
      this.ejbRef = ejbRef;
      childNode.getOrCreate("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<ApplicationType<T>> getEjbRef()
   {
      if( ejbRef == null)
      {
          ejbRef = new EjbRefTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return ejbRef;
   }




   public ApplicationType<T> setEjbLocalRef(EjbLocalRefType<ApplicationType<T>> ejbLocalRef)
   {
      this.ejbLocalRef = ejbLocalRef;
      childNode.getOrCreate("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<ApplicationType<T>> getEjbLocalRef()
   {
      if( ejbLocalRef == null)
      {
          ejbLocalRef = new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return ejbLocalRef;
   }




   public ApplicationType<T> setResourceRef(ResourceRefType<ApplicationType<T>> resourceRef)
   {
      this.resourceRef = resourceRef;
      childNode.getOrCreate("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<ApplicationType<T>> getResourceRef()
   {
      if( resourceRef == null)
      {
          resourceRef = new ResourceRefTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return resourceRef;
   }




   public ApplicationType<T> setResourceEnvRef(ResourceEnvRefType<ApplicationType<T>> resourceEnvRef)
   {
      this.resourceEnvRef = resourceEnvRef;
      childNode.getOrCreate("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<ApplicationType<T>> getResourceEnvRef()
   {
      if( resourceEnvRef == null)
      {
          resourceEnvRef = new ResourceEnvRefTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return resourceEnvRef;
   }




   public ApplicationType<T> setMessageDestinationRef(MessageDestinationRefType<ApplicationType<T>> messageDestinationRef)
   {
      this.messageDestinationRef = messageDestinationRef;
      childNode.getOrCreate("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<ApplicationType<T>> getMessageDestinationRef()
   {
      if( messageDestinationRef == null)
      {
          messageDestinationRef = new MessageDestinationRefTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return messageDestinationRef;
   }




   public ApplicationType<T> setPersistenceContextRef(PersistenceContextRefType<ApplicationType<T>> persistenceContextRef)
   {
      this.persistenceContextRef = persistenceContextRef;
      childNode.getOrCreate("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<ApplicationType<T>> getPersistenceContextRef()
   {
      if( persistenceContextRef == null)
      {
          persistenceContextRef = new PersistenceContextRefTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return persistenceContextRef;
   }




   public ApplicationType<T> setPersistenceUnitRef(PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef)
   {
      this.persistenceUnitRef = persistenceUnitRef;
      childNode.getOrCreate("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<ApplicationType<T>> getPersistenceUnitRef()
   {
      if( persistenceUnitRef == null)
      {
          persistenceUnitRef = new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return persistenceUnitRef;
   }




   public ApplicationType<T> setMessageDestination(MessageDestinationType<ApplicationType<T>> messageDestination)
   {
      this.messageDestination = messageDestination;
      childNode.getOrCreate("message-destination").text(messageDestination);
      return this;
   }

   public MessageDestinationType<ApplicationType<T>> getMessageDestination()
   {
      if( messageDestination == null)
      {
          messageDestination = new MessageDestinationTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return messageDestination;
   }




   public ApplicationType<T> setDataSource(DataSourceType<ApplicationType<T>> dataSource)
   {
      this.dataSource = dataSource;
      childNode.getOrCreate("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<ApplicationType<T>> getDataSource()
   {
      if( dataSource == null)
      {
          dataSource = new DataSourceTypeImpl<ApplicationType<T>>(this, "", childNode);
      }
      return dataSource;
   }


}
