package org.jboss.shrinkwrap.descriptor.api.application6;

import java.util.List;

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

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface ApplicationType<T> extends Child<T>
{

   public ApplicationType<T> setDescription(String description);

   public ApplicationType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public ApplicationType<T> setDisplayName(String displayName);

   public ApplicationType<T> setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public ApplicationType<T> removeAllIcon();

   public IconType<ApplicationType<T>> getIcon();

   public List<IconType<ApplicationType<T>>> getIconList();

   public ApplicationType<T> setApplicationName(String applicationName);

   public String getApplicationName();

   public ApplicationType<T> setInitializeInOrder(String initializeInOrder);

   public String getInitializeInOrder();

   public ApplicationType<T> removeAllModule();

   public ModuleType<ApplicationType<T>> getModule();

   public List<ModuleType<ApplicationType<T>>> getModuleList();

   public ApplicationType<T> removeAllSecurityRole();

   public SecurityRoleType<ApplicationType<T>> getSecurityRole();

   public List<SecurityRoleType<ApplicationType<T>>> getSecurityRoleList();

   public ApplicationType<T> setLibraryDirectory(String libraryDirectory);

   public String getLibraryDirectory();

   public ApplicationType<T> removeAllEnvEntry();

   public EnvEntryType<ApplicationType<T>> getEnvEntry();

   public List<EnvEntryType<ApplicationType<T>>> getEnvEntryList();

   public ApplicationType<T> removeAllEjbRef();

   public EjbRefType<ApplicationType<T>> getEjbRef();

   public List<EjbRefType<ApplicationType<T>>> getEjbRefList();

   public ApplicationType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<ApplicationType<T>> getEjbLocalRef();

   public List<EjbLocalRefType<ApplicationType<T>>> getEjbLocalRefList();

   public ApplicationType<T> removeAllResourceRef();

   public ResourceRefType<ApplicationType<T>> getResourceRef();

   public List<ResourceRefType<ApplicationType<T>>> getResourceRefList();

   public ApplicationType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<ApplicationType<T>> getResourceEnvRef();

   public List<ResourceEnvRefType<ApplicationType<T>>> getResourceEnvRefList();

   public ApplicationType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<ApplicationType<T>> getMessageDestinationRef();

   public List<MessageDestinationRefType<ApplicationType<T>>> getMessageDestinationRefList();

   public ApplicationType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<ApplicationType<T>> getPersistenceContextRef();

   public List<PersistenceContextRefType<ApplicationType<T>>> getPersistenceContextRefList();

   public ApplicationType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<ApplicationType<T>> getPersistenceUnitRef();

   public List<PersistenceUnitRefType<ApplicationType<T>>> getPersistenceUnitRefList();

   public ApplicationType<T> removeAllMessageDestination();

   public MessageDestinationType<ApplicationType<T>> getMessageDestination();

   public List<MessageDestinationType<ApplicationType<T>>> getMessageDestinationList();

   public ApplicationType<T> removeAllDataSource();

   public DataSourceType<ApplicationType<T>> getDataSource();

   public List<DataSourceType<ApplicationType<T>>> getDataSourceList();

}
