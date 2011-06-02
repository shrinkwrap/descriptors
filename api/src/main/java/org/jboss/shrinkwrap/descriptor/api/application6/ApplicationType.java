package org.jboss.shrinkwrap.descriptor.api.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
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
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ApplicationType<T> extends Child<T>
{
   public ApplicationType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public ApplicationType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<ApplicationType<T>> icon();

   @NodeInfo(xmlName = "service-ref")
   public ServiceRefType<ApplicationType<T>> serviceRef();

   public ApplicationType<T> setApplicationName(String applicationName);

   @NodeInfo(xmlName = "application-name")
   public String getApplicationName();

   public ApplicationType<T> setInitializeInOrder(GenericBooleanType initializeInOrder);

   public ApplicationType<T> setInitializeInOrder(String initializeInOrder);

   @NodeInfo(xmlName = "initialize-in-order")
   public String getInitializeInOrder();

   @NodeInfo(xmlName = "module")
   public ModuleType<ApplicationType<T>> module();

   @NodeInfo(xmlName = "security-role")
   public SecurityRoleType<ApplicationType<T>> securityRole();

   public ApplicationType<T> setLibraryDirectory(String libraryDirectory);

   @NodeInfo(xmlName = "library-directory")
   public String getLibraryDirectory();

   @NodeInfo(xmlName = "env-entry")
   public EnvEntryType<ApplicationType<T>> envEntry();

   @NodeInfo(xmlName = "ejb-ref")
   public EjbRefType<ApplicationType<T>> ejbRef();

   @NodeInfo(xmlName = "ejb-local-ref")
   public EjbLocalRefType<ApplicationType<T>> ejbLocalRef();

   @NodeInfo(xmlName = "resource-ref")
   public ResourceRefType<ApplicationType<T>> resourceRef();

   @NodeInfo(xmlName = "resource-env-ref")
   public ResourceEnvRefType<ApplicationType<T>> resourceEnvRef();

   @NodeInfo(xmlName = "message-destination-ref")
   public MessageDestinationRefType<ApplicationType<T>> messageDestinationRef();

   @NodeInfo(xmlName = "persistence-context-ref")
   public PersistenceContextRefType<ApplicationType<T>> persistenceContextRef();

   @NodeInfo(xmlName = "persistence-unit-ref")
   public PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef();

   @NodeInfo(xmlName = "message-destination")
   public MessageDestinationType<ApplicationType<T>> messageDestination();

   @NodeInfo(xmlName = "data-source")
   public DataSourceType<ApplicationType<T>> dataSource();
}
