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
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface Application6Descriptor<T> extends Descriptor
{
   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public T setDescription(String description);
   public T setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public T setDisplayName(String displayName);
   public T setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setIcon(IconType<T> icon);

   public IconType<T> getIcon();
   public List<IconType<T>> getIconList();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setApplicationName(String applicationName);

   public String getApplicationName();

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setInitializeInOrder(String initializeInOrder);

   public String getInitializeInOrder();

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setModule(ModuleType<T> module);

   public ModuleType<T> getModule();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setSecurityRole(SecurityRoleType<T> securityRole);

   public SecurityRoleType<T> getSecurityRole();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setLibraryDirectory(String libraryDirectory);

   public String getLibraryDirectory();

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setEnvEntry(EnvEntryType<T> envEntry);

   public EnvEntryType<T> getEnvEntry();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setEjbRef(EjbRefType<T> ejbRef);

   public EjbRefType<T> getEjbRef();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);

   public EjbLocalRefType<T> getEjbLocalRef();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setResourceRef(ResourceRefType<T> resourceRef);

   public ResourceRefType<T> getResourceRef();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);

   public ResourceEnvRefType<T> getResourceEnvRef();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);

   public MessageDestinationRefType<T> getMessageDestinationRef();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);

   public PersistenceContextRefType<T> getPersistenceContextRef();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);

   public PersistenceUnitRefType<T> getPersistenceUnitRef();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setMessageDestination(MessageDestinationType<T> messageDestination);

   public MessageDestinationType<T> getMessageDestination();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setDataSource(DataSourceType<T> dataSource);

   public DataSourceType<T> getDataSource();


}
