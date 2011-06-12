package org.jboss.shrinkwrap.descriptor.api.application6;

import java.util.List;

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

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface Application6Descriptor<T> extends Descriptor
{

   public T setDescription(String description);

   public T setDescription(String... values);

   public List<String> getDescriptionList();

   public T setDisplayName(String displayName);

   public T setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public T removeAllIcon();

   public IconType<T> getIcon();

   public List<IconType<T>> getIconList();

   public T setApplicationName(String applicationName);

   public String getApplicationName();

   public T setInitializeInOrder(String initializeInOrder);

   public String getInitializeInOrder();

   public T removeModule();

   public ModuleType<T> getModule();

   public T removeSecurityRole();

   public SecurityRoleType<T> getSecurityRole();

   public T setLibraryDirectory(String libraryDirectory);

   public String getLibraryDirectory();

   public T removeEnvEntry();

   public EnvEntryType<T> getEnvEntry();

   public T removeEjbRef();

   public EjbRefType<T> getEjbRef();

   public T removeEjbLocalRef();

   public EjbLocalRefType<T> getEjbLocalRef();

   public T removeResourceRef();

   public ResourceRefType<T> getResourceRef();

   public T removeResourceEnvRef();

   public ResourceEnvRefType<T> getResourceEnvRef();

   public T removeMessageDestinationRef();

   public MessageDestinationRefType<T> getMessageDestinationRef();

   public T removePersistenceContextRef();

   public PersistenceContextRefType<T> getPersistenceContextRef();

   public T removePersistenceUnitRef();

   public PersistenceUnitRefType<T> getPersistenceUnitRef();

   public T removeMessageDestination();

   public MessageDestinationType<T> getMessageDestination();

   public T removeDataSource();

   public DataSourceType<T> getDataSource();

}
