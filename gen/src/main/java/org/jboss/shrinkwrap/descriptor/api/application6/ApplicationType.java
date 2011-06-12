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
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface ApplicationType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setDescription(String description);
   public ApplicationType<T> setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ApplicationType<T> setDisplayName(String displayName);
   public ApplicationType<T> setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setIcon(IconType<ApplicationType<T>> icon);

   public IconType<ApplicationType<T>> getIcon();
   public List<IconType<ApplicationType<T>>> getIconList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ApplicationType<T> setApplicationName(String applicationName);

   public String getApplicationName();


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

// otherwise;
   public ApplicationType<T> setInitializeInOrder(String initializeInOrder);

   public String getInitializeInOrder();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setModule(ModuleType<ApplicationType<T>> module);

   public ModuleType<ApplicationType<T>> getModule();
   public List<ModuleType<ApplicationType<T>>> getModuleList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setSecurityRole(SecurityRoleType<ApplicationType<T>> securityRole);

   public SecurityRoleType<ApplicationType<T>> getSecurityRole();
   public List<SecurityRoleType<ApplicationType<T>>> getSecurityRoleList();



   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

// otherwise;
   public ApplicationType<T> setLibraryDirectory(String libraryDirectory);

   public String getLibraryDirectory();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setEnvEntry(EnvEntryType<ApplicationType<T>> envEntry);

   public EnvEntryType<ApplicationType<T>> getEnvEntry();
   public List<EnvEntryType<ApplicationType<T>>> getEnvEntryList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setEjbRef(EjbRefType<ApplicationType<T>> ejbRef);

   public EjbRefType<ApplicationType<T>> getEjbRef();
   public List<EjbRefType<ApplicationType<T>>> getEjbRefList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setEjbLocalRef(EjbLocalRefType<ApplicationType<T>> ejbLocalRef);

   public EjbLocalRefType<ApplicationType<T>> getEjbLocalRef();
   public List<EjbLocalRefType<ApplicationType<T>>> getEjbLocalRefList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setResourceRef(ResourceRefType<ApplicationType<T>> resourceRef);

   public ResourceRefType<ApplicationType<T>> getResourceRef();
   public List<ResourceRefType<ApplicationType<T>>> getResourceRefList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setResourceEnvRef(ResourceEnvRefType<ApplicationType<T>> resourceEnvRef);

   public ResourceEnvRefType<ApplicationType<T>> getResourceEnvRef();
   public List<ResourceEnvRefType<ApplicationType<T>>> getResourceEnvRefList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setMessageDestinationRef(MessageDestinationRefType<ApplicationType<T>> messageDestinationRef);

   public MessageDestinationRefType<ApplicationType<T>> getMessageDestinationRef();
   public List<MessageDestinationRefType<ApplicationType<T>>> getMessageDestinationRefList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setPersistenceContextRef(PersistenceContextRefType<ApplicationType<T>> persistenceContextRef);

   public PersistenceContextRefType<ApplicationType<T>> getPersistenceContextRef();
   public List<PersistenceContextRefType<ApplicationType<T>>> getPersistenceContextRefList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setPersistenceUnitRef(PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef);

   public PersistenceUnitRefType<ApplicationType<T>> getPersistenceUnitRef();
   public List<PersistenceUnitRefType<ApplicationType<T>>> getPersistenceUnitRefList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setMessageDestination(MessageDestinationType<ApplicationType<T>> messageDestination);

   public MessageDestinationType<ApplicationType<T>> getMessageDestination();
   public List<MessageDestinationType<ApplicationType<T>>> getMessageDestinationList();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ApplicationType<T> setDataSource(DataSourceType<ApplicationType<T>> dataSource);

   public DataSourceType<ApplicationType<T>> getDataSource();
   public List<DataSourceType<ApplicationType<T>>> getDataSourceList();


}
