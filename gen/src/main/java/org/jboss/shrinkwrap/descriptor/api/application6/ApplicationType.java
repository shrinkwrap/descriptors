package org.jboss.shrinkwrap.descriptor.api.application6; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:30:58.763-04:00
 *
 * Original Documentation:
 *
 *
 * The applicationType defines the structure of the
 * application.
 *
 *
 *
 */
public interface ApplicationType<T> extends Child<T>
{

   public ApplicationType<T> setDescription(String description);
   public ApplicationType<T> setDescriptionList(String ... values);
   public ApplicationType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public ApplicationType<T> setDisplayName(String displayName);
   public ApplicationType<T> setDisplayNameList(String ... values);
   public ApplicationType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();


   public ApplicationType<T> removeAllIcon();

   public IconType<ApplicationType<T>> icon();
   public List<IconType<ApplicationType<T>>> getIconList();



   public ApplicationType<T> setApplicationName(String applicationName);
   public ApplicationType<T> removeApplicationName();

   public String getApplicationName();



   public ApplicationType<T> setInitializeInOrder(GenericBooleanType initializeInOrder);
   public ApplicationType<T> setInitializeInOrder(String initializeInOrder);

   public GenericBooleanType getInitializeInOrder();
   public String  getInitializeInOrderAsString();



   public ApplicationType<T> removeAllModule();

   public ModuleType<ApplicationType<T>> module();
   public List<ModuleType<ApplicationType<T>>> getModuleList();




   public ApplicationType<T> removeAllSecurityRole();

   public SecurityRoleType<ApplicationType<T>> securityRole();
   public List<SecurityRoleType<ApplicationType<T>>> getSecurityRoleList();




   public ApplicationType<T> setLibraryDirectory(String libraryDirectory);
   public ApplicationType<T> removeLibraryDirectory();

   public String getLibraryDirectory();



   public ApplicationType<T> removeAllEnvEntry();

   public EnvEntryType<ApplicationType<T>> envEntry();
   public List<EnvEntryType<ApplicationType<T>>> getEnvEntryList();




   public ApplicationType<T> removeAllEjbRef();

   public EjbRefType<ApplicationType<T>> ejbRef();
   public List<EjbRefType<ApplicationType<T>>> getEjbRefList();




   public ApplicationType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<ApplicationType<T>> ejbLocalRef();
   public List<EjbLocalRefType<ApplicationType<T>>> getEjbLocalRefList();




   public ApplicationType<T> removeAllResourceRef();

   public ResourceRefType<ApplicationType<T>> resourceRef();
   public List<ResourceRefType<ApplicationType<T>>> getResourceRefList();




   public ApplicationType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<ApplicationType<T>> resourceEnvRef();
   public List<ResourceEnvRefType<ApplicationType<T>>> getResourceEnvRefList();




   public ApplicationType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<ApplicationType<T>> messageDestinationRef();
   public List<MessageDestinationRefType<ApplicationType<T>>> getMessageDestinationRefList();




   public ApplicationType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<ApplicationType<T>> persistenceContextRef();
   public List<PersistenceContextRefType<ApplicationType<T>>> getPersistenceContextRefList();




   public ApplicationType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef();
   public List<PersistenceUnitRefType<ApplicationType<T>>> getPersistenceUnitRefList();




   public ApplicationType<T> removeAllMessageDestination();

   public MessageDestinationType<ApplicationType<T>> messageDestination();
   public List<MessageDestinationType<ApplicationType<T>>> getMessageDestinationList();




   public ApplicationType<T> removeAllDataSource();

   public DataSourceType<ApplicationType<T>> dataSource();
   public List<DataSourceType<ApplicationType<T>>> getDataSourceList();


}
