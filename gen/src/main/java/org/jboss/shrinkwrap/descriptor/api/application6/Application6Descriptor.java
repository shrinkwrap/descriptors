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
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 */
public interface Application6Descriptor extends Descriptor, DescriptorNamespace<Application6Descriptor>
{

   public Application6Descriptor setDescription(String description);
   public Application6Descriptor setDescriptionList(String ... values);
   public Application6Descriptor removeAllDescription();

   public List<String> getDescriptionList();


   public Application6Descriptor setDisplayName(String displayName);
   public Application6Descriptor setDisplayNameList(String ... values);
   public Application6Descriptor removeAllDisplayName();

   public List<String> getDisplayNameList();


   public Application6Descriptor removeAllIcon();

   public IconType<Application6Descriptor> icon();
   public List<IconType<Application6Descriptor>> getIconList();



   public Application6Descriptor setApplicationName(String applicationName);
   public Application6Descriptor removeApplicationName();

   public String getApplicationName();


   public Application6Descriptor setInitializeInOrder(GenericBooleanType initializeInOrder);
   public Application6Descriptor setInitializeInOrder(String initializeInOrder);

   public GenericBooleanType getInitializeInOrder();
   public String  getInitializeInOrderAsString();


   public Application6Descriptor removeAllModule();

   public ModuleType<Application6Descriptor> module();
   public List<ModuleType<Application6Descriptor>> getModuleList();



   public Application6Descriptor removeAllSecurityRole();

   public SecurityRoleType<Application6Descriptor> securityRole();
   public List<SecurityRoleType<Application6Descriptor>> getSecurityRoleList();



   public Application6Descriptor setLibraryDirectory(String libraryDirectory);
   public Application6Descriptor removeLibraryDirectory();

   public String getLibraryDirectory();


   public Application6Descriptor removeAllEnvEntry();

   public EnvEntryType<Application6Descriptor> envEntry();
   public List<EnvEntryType<Application6Descriptor>> getEnvEntryList();



   public Application6Descriptor removeAllEjbRef();

   public EjbRefType<Application6Descriptor> ejbRef();
   public List<EjbRefType<Application6Descriptor>> getEjbRefList();



   public Application6Descriptor removeAllEjbLocalRef();

   public EjbLocalRefType<Application6Descriptor> ejbLocalRef();
   public List<EjbLocalRefType<Application6Descriptor>> getEjbLocalRefList();



   public Application6Descriptor removeAllResourceRef();

   public ResourceRefType<Application6Descriptor> resourceRef();
   public List<ResourceRefType<Application6Descriptor>> getResourceRefList();



   public Application6Descriptor removeAllResourceEnvRef();

   public ResourceEnvRefType<Application6Descriptor> resourceEnvRef();
   public List<ResourceEnvRefType<Application6Descriptor>> getResourceEnvRefList();



   public Application6Descriptor removeAllMessageDestinationRef();

   public MessageDestinationRefType<Application6Descriptor> messageDestinationRef();
   public List<MessageDestinationRefType<Application6Descriptor>> getMessageDestinationRefList();



   public Application6Descriptor removeAllPersistenceContextRef();

   public PersistenceContextRefType<Application6Descriptor> persistenceContextRef();
   public List<PersistenceContextRefType<Application6Descriptor>> getPersistenceContextRefList();



   public Application6Descriptor removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<Application6Descriptor> persistenceUnitRef();
   public List<PersistenceUnitRefType<Application6Descriptor>> getPersistenceUnitRefList();



   public Application6Descriptor removeAllMessageDestination();

   public MessageDestinationType<Application6Descriptor> messageDestination();
   public List<MessageDestinationType<Application6Descriptor>> getMessageDestinationList();



   public Application6Descriptor removeAllDataSource();

   public DataSourceType<Application6Descriptor> dataSource();
   public List<DataSourceType<Application6Descriptor>> getDataSourceList();



   public Application6Descriptor setVersion(String version);
   public Application6Descriptor removeVersion();

   public String getVersion();

}
