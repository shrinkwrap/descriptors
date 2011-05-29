package org.jboss.shrinkwrap.descriptor.api.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefGroup;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface ApplicationType<T> extends Child<T>, DescriptionGroup<T>, ServiceRefGroup<T>

{
   public ApplicationType<T> setApplicationName(String applicationName);

   public String getApplicationName();

   public ApplicationType<T> setInitializeInOrder(GenericBooleanType initializeInOrder);

   public GenericBooleanType getInitializeInOrder();

   public ModuleType<ApplicationType<T>> setModule(ModuleType<T> module);

   public ModuleType<ApplicationType<T>> getModule();

   public SecurityRoleType<ApplicationType<T>> setSecurityRole(SecurityRoleType<T> securityRole);

   public SecurityRoleType<ApplicationType<T>> getSecurityRole();

   public ApplicationType<T> setLibraryDirectory(String libraryDirectory);

   public String getLibraryDirectory();

   public EnvEntryType<ApplicationType<T>> setEnvEntry(EnvEntryType<T> envEntry);

   public EnvEntryType<ApplicationType<T>> getEnvEntry();

   public EjbRefType<ApplicationType<T>> setEjbRef(EjbRefType<T> ejbRef);

   public EjbRefType<ApplicationType<T>> getEjbRef();

   public EjbLocalRefType<ApplicationType<T>> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);

   public EjbLocalRefType<ApplicationType<T>> getEjbLocalRef();

   public ResourceRefType<ApplicationType<T>> setResourceRef(ResourceRefType<T> resourceRef);

   public ResourceRefType<ApplicationType<T>> getResourceRef();

   public ResourceEnvRefType<ApplicationType<T>> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);

   public ResourceEnvRefType<ApplicationType<T>> getResourceEnvRef();

   public MessageDestinationRefType<ApplicationType<T>> setMessageDestinationRef(
         MessageDestinationRefType<T> messageDestinationRef);

   public MessageDestinationRefType<ApplicationType<T>> getMessageDestinationRef();

   public PersistenceContextRefType<ApplicationType<T>> setPersistenceContextRef(
         PersistenceContextRefType<T> persistenceContextRef);

   public PersistenceContextRefType<ApplicationType<T>> getPersistenceContextRef();

   public PersistenceUnitRefType<ApplicationType<T>> setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);

   public PersistenceUnitRefType<ApplicationType<T>> getPersistenceUnitRef();

   public MessageDestinationType<ApplicationType<T>> setMessageDestination(MessageDestinationType<T> messageDestination);

   public MessageDestinationType<ApplicationType<T>> getMessageDestination();

   public DataSourceType<ApplicationType<T>> setDataSource(DataSourceType<T> dataSource);

   public DataSourceType<ApplicationType<T>> getDataSource();
}
