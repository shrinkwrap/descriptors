package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface EntityBeanType<T> extends Child<T>
{

   public EntityBeanType<T> setDescription(String description);
   public String getDescription();

   public EntityBeanType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public EntityBeanType<T> setIcon(IconType<EntityBeanType<T>> icon);
   public IconType<EntityBeanType<T>> getIcon();


   public EntityBeanType<T> setEnvEntry(EnvEntryType<EntityBeanType<T>> envEntry);
   public EnvEntryType<EntityBeanType<T>> getEnvEntry();


   public EntityBeanType<T> setEjbRef(EjbRefType<EntityBeanType<T>> ejbRef);
   public EjbRefType<EntityBeanType<T>> getEjbRef();


   public EntityBeanType<T> setEjbLocalRef(EjbLocalRefType<EntityBeanType<T>> ejbLocalRef);
   public EjbLocalRefType<EntityBeanType<T>> getEjbLocalRef();


   public EntityBeanType<T> setResourceRef(ResourceRefType<EntityBeanType<T>> resourceRef);
   public ResourceRefType<EntityBeanType<T>> getResourceRef();


   public EntityBeanType<T> setResourceEnvRef(ResourceEnvRefType<EntityBeanType<T>> resourceEnvRef);
   public ResourceEnvRefType<EntityBeanType<T>> getResourceEnvRef();


   public EntityBeanType<T> setMessageDestinationRef(MessageDestinationRefType<EntityBeanType<T>> messageDestinationRef);
   public MessageDestinationRefType<EntityBeanType<T>> getMessageDestinationRef();


   public EntityBeanType<T> setPersistenceContextRef(PersistenceContextRefType<EntityBeanType<T>> persistenceContextRef);
   public PersistenceContextRefType<EntityBeanType<T>> getPersistenceContextRef();


   public EntityBeanType<T> setPersistenceUnitRef(PersistenceUnitRefType<EntityBeanType<T>> persistenceUnitRef);
   public PersistenceUnitRefType<EntityBeanType<T>> getPersistenceUnitRef();


   public EntityBeanType<T> setPostConstruct(LifecycleCallbackType<EntityBeanType<T>> postConstruct);
   public LifecycleCallbackType<EntityBeanType<T>> getPostConstruct();


   public EntityBeanType<T> setPreDestroy(LifecycleCallbackType<EntityBeanType<T>> preDestroy);
   public LifecycleCallbackType<EntityBeanType<T>> getPreDestroy();


   public EntityBeanType<T> setDataSource(DataSourceType<EntityBeanType<T>> dataSource);
   public DataSourceType<EntityBeanType<T>> getDataSource();


   public EntityBeanType<T> setServiceRef(ServiceRefType<EntityBeanType<T>> serviceRef);
   public ServiceRefType<EntityBeanType<T>> getServiceRef();


   public EntityBeanType<T> setEjbName(String ejbName);
   public String getEjbName();


   public EntityBeanType<T> setMappedName(String mappedName);
   public String getMappedName();


   public EntityBeanType<T> setHome(String home);
   public String getHome();


   public EntityBeanType<T> setRemote(String remote);
   public String getRemote();


   public EntityBeanType<T> setLocalHome(String localHome);
   public String getLocalHome();


   public EntityBeanType<T> setLocal(String local);
   public String getLocal();


   public EntityBeanType<T> setEjbClass(String ejbClass);
   public String getEjbClass();


   public EntityBeanType<T> setPersistenceType(String persistenceType);
   public String getPersistenceType();


   public EntityBeanType<T> setPrimKeyClass(String primKeyClass);
   public String getPrimKeyClass();


   public EntityBeanType<T> setReentrant(Boolean reentrant);
   public Boolean getReentrant();


   public EntityBeanType<T> setCmpVersion(String cmpVersion);
   public String getCmpVersion();


   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName);
   public String getAbstractSchemaName();


   public EntityBeanType<T> setCmpField(CmpFieldType<EntityBeanType<T>> cmpField);
   public CmpFieldType<EntityBeanType<T>> getCmpField();



   public EntityBeanType<T> setPrimkeyField(String primkeyField);
   public String getPrimkeyField();


   public EntityBeanType<T> setSecurityRoleRef(SecurityRoleRefType<EntityBeanType<T>> securityRoleRef);
   public SecurityRoleRefType<EntityBeanType<T>> getSecurityRoleRef();



   public EntityBeanType<T> setSecurityIdentity(SecurityIdentityType<EntityBeanType<T>> securityIdentity);
   public SecurityIdentityType<EntityBeanType<T>> getSecurityIdentity();



   public EntityBeanType<T> setQuery(QueryType<EntityBeanType<T>> query);
   public QueryType<EntityBeanType<T>> getQuery();

}
