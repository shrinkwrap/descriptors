package org.jboss.shrinkwrap.descriptor.api.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
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
public interface ApplicationType<T> extends Child<T>
{

   public ApplicationType<T> setDescription(String description);
   public String getDescription();

   public ApplicationType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public ApplicationType<T> setIcon(IconType<ApplicationType<T>> icon);
   public IconType<ApplicationType<T>> getIcon();


   public ApplicationType<T> setServiceRef(ServiceRefType<ApplicationType<T>> serviceRef);
   public ServiceRefType<ApplicationType<T>> getServiceRef();


   public ApplicationType<T> setApplicationName(String applicationName);
   public String getApplicationName();


   public ApplicationType<T> setInitializeInOrder(String initializeInOrder);
   public String getInitializeInOrder();


   public ApplicationType<T> setModule(ModuleType<ApplicationType<T>> module);
   public ModuleType<ApplicationType<T>> getModule();



   public ApplicationType<T> setSecurityRole(SecurityRoleType<ApplicationType<T>> securityRole);
   public SecurityRoleType<ApplicationType<T>> getSecurityRole();



   public ApplicationType<T> setLibraryDirectory(String libraryDirectory);
   public String getLibraryDirectory();


   public ApplicationType<T> setEnvEntry(EnvEntryType<ApplicationType<T>> envEntry);
   public EnvEntryType<ApplicationType<T>> getEnvEntry();



   public ApplicationType<T> setEjbRef(EjbRefType<ApplicationType<T>> ejbRef);
   public EjbRefType<ApplicationType<T>> getEjbRef();



   public ApplicationType<T> setEjbLocalRef(EjbLocalRefType<ApplicationType<T>> ejbLocalRef);
   public EjbLocalRefType<ApplicationType<T>> getEjbLocalRef();



   public ApplicationType<T> setResourceRef(ResourceRefType<ApplicationType<T>> resourceRef);
   public ResourceRefType<ApplicationType<T>> getResourceRef();



   public ApplicationType<T> setResourceEnvRef(ResourceEnvRefType<ApplicationType<T>> resourceEnvRef);
   public ResourceEnvRefType<ApplicationType<T>> getResourceEnvRef();



   public ApplicationType<T> setMessageDestinationRef(MessageDestinationRefType<ApplicationType<T>> messageDestinationRef);
   public MessageDestinationRefType<ApplicationType<T>> getMessageDestinationRef();



   public ApplicationType<T> setPersistenceContextRef(PersistenceContextRefType<ApplicationType<T>> persistenceContextRef);
   public PersistenceContextRefType<ApplicationType<T>> getPersistenceContextRef();



   public ApplicationType<T> setPersistenceUnitRef(PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef);
   public PersistenceUnitRefType<ApplicationType<T>> getPersistenceUnitRef();



   public ApplicationType<T> setMessageDestination(MessageDestinationType<ApplicationType<T>> messageDestination);
   public MessageDestinationType<ApplicationType<T>> getMessageDestination();



   public ApplicationType<T> setDataSource(DataSourceType<ApplicationType<T>> dataSource);
   public DataSourceType<ApplicationType<T>> getDataSource();

}
