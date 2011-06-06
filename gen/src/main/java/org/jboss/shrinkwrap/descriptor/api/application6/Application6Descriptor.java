package org.jboss.shrinkwrap.descriptor.api.application6; 

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
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

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface Application6Descriptor<T> extends Descriptor
{

   public T setDescription(String description);
   public String getDescription();

   public T setDisplayName(String displayName);
   public String getDisplayName();

   public T setIcon(IconType<T> icon);
   public IconType<T> getIcon();


   public T setServiceRef(ServiceRefType<T> serviceRef);
   public ServiceRefType<T> getServiceRef();


   public T setApplicationName(String applicationName);
   public String getApplicationName();

   public T setInitializeInOrder(String initializeInOrder);
   public String getInitializeInOrder();

   public T setModule(ModuleType<T> module);
   public ModuleType<T> getModule();


   public T setSecurityRole(SecurityRoleType<T> securityRole);
   public SecurityRoleType<T> getSecurityRole();


   public T setLibraryDirectory(String libraryDirectory);
   public String getLibraryDirectory();

   public T setEnvEntry(EnvEntryType<T> envEntry);
   public EnvEntryType<T> getEnvEntry();


   public T setEjbRef(EjbRefType<T> ejbRef);
   public EjbRefType<T> getEjbRef();


   public T setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);
   public EjbLocalRefType<T> getEjbLocalRef();


   public T setResourceRef(ResourceRefType<T> resourceRef);
   public ResourceRefType<T> getResourceRef();


   public T setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);
   public ResourceEnvRefType<T> getResourceEnvRef();


   public T setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);
   public MessageDestinationRefType<T> getMessageDestinationRef();


   public T setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);
   public PersistenceContextRefType<T> getPersistenceContextRef();


   public T setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);
   public PersistenceUnitRefType<T> getPersistenceUnitRef();


   public T setMessageDestination(MessageDestinationType<T> messageDestination);
   public MessageDestinationType<T> getMessageDestination();


   public T setDataSource(DataSourceType<T> dataSource);
   public DataSourceType<T> getDataSource();

}
