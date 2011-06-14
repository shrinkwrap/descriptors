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
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public interface Application6Descriptor<T> extends Descriptor
{

   public T setDescription(String description);
   public T setDescriptionList(String ... values);
   public T removeAllDescription();

   public List<String> getDescriptionList();


   public T setDisplayName(String displayName);
   public T setDisplayNameList(String ... values);
   public T removeAllDisplayName();

   public List<String> getDisplayNameList();


   public T removeAllIcon();

   public IconType<T> icon();
   public List<IconType<T>> getIconList();



   public T setApplicationName(String applicationName);
   public T removeApplicationName();

   public String getApplicationName();


   public T setInitializeInOrder(String initializeInOrder);
   public T removeInitializeInOrder();

   public String getInitializeInOrder();


   public T removeModule();

   public ModuleType<T> module();



   public T removeSecurityRole();

   public SecurityRoleType<T> securityRole();



   public T setLibraryDirectory(String libraryDirectory);
   public T removeLibraryDirectory();

   public String getLibraryDirectory();


   public T removeEnvEntry();

   public EnvEntryType<T> envEntry();



   public T removeEjbRef();

   public EjbRefType<T> ejbRef();



   public T removeEjbLocalRef();

   public EjbLocalRefType<T> ejbLocalRef();



   public T removeResourceRef();

   public ResourceRefType<T> resourceRef();



   public T removeResourceEnvRef();

   public ResourceEnvRefType<T> resourceEnvRef();



   public T removeMessageDestinationRef();

   public MessageDestinationRefType<T> messageDestinationRef();



   public T removePersistenceContextRef();

   public PersistenceContextRefType<T> persistenceContextRef();



   public T removePersistenceUnitRef();

   public PersistenceUnitRefType<T> persistenceUnitRef();



   public T removeMessageDestination();

   public MessageDestinationType<T> messageDestination();



   public T removeDataSource();

   public DataSourceType<T> dataSource();


}
