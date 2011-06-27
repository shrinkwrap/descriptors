package org.jboss.shrinkwrap.descriptor.api.application6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.GenericBooleanType;
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
 * Generation date :2011-06-27T07:43:58.376-04:00
 */
public interface Application6Descriptor extends Descriptor, DescriptorNamespace<Application6Descriptor>
{

   public Application6Descriptor setDescription(String description);

   public Application6Descriptor setDescriptionList(String... values);

   public Application6Descriptor removeAllDescription();

   public List<String> getDescriptionList();

   public Application6Descriptor setDisplayName(String displayName);

   public Application6Descriptor setDisplayNameList(String... values);

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

   public String getInitializeInOrderAsString();

   public Application6Descriptor removeModule();

   public ModuleType<Application6Descriptor> module();

   public Application6Descriptor removeSecurityRole();

   public SecurityRoleType<Application6Descriptor> securityRole();

   public Application6Descriptor setLibraryDirectory(String libraryDirectory);

   public Application6Descriptor removeLibraryDirectory();

   public String getLibraryDirectory();

   public Application6Descriptor removeEnvEntry();

   public EnvEntryType<Application6Descriptor> envEntry();

   public Application6Descriptor removeEjbRef();

   public EjbRefType<Application6Descriptor> ejbRef();

   public Application6Descriptor removeEjbLocalRef();

   public EjbLocalRefType<Application6Descriptor> ejbLocalRef();

   public Application6Descriptor removeResourceRef();

   public ResourceRefType<Application6Descriptor> resourceRef();

   public Application6Descriptor removeResourceEnvRef();

   public ResourceEnvRefType<Application6Descriptor> resourceEnvRef();

   public Application6Descriptor removeMessageDestinationRef();

   public MessageDestinationRefType<Application6Descriptor> messageDestinationRef();

   public Application6Descriptor removePersistenceContextRef();

   public PersistenceContextRefType<Application6Descriptor> persistenceContextRef();

   public Application6Descriptor removePersistenceUnitRef();

   public PersistenceUnitRefType<Application6Descriptor> persistenceUnitRef();

   public Application6Descriptor removeMessageDestination();

   public MessageDestinationType<Application6Descriptor> messageDestination();

   public Application6Descriptor removeDataSource();

   public DataSourceType<Application6Descriptor> dataSource();

}
