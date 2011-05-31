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
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface EntityBeanType<T> extends Child<T>
{
   public EntityBeanType<T> setDescription(String description);
   public String getDescription();

   public EntityBeanType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public EntityBeanType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public EntityBeanType<T> setEnvEntry(EnvEntryType<T> envEntry);
   public EnvEntryType<T> getEnvEntry();

   public EntityBeanType<T> setEjbRef(EjbRefType<T> ejbRef);
   public EjbRefType<T> getEjbRef();

   public EntityBeanType<T> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);
   public EjbLocalRefType<T> getEjbLocalRef();

   public EntityBeanType<T> setResourceRef(ResourceRefType<T> resourceRef);
   public ResourceRefType<T> getResourceRef();

   public EntityBeanType<T> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);
   public ResourceEnvRefType<T> getResourceEnvRef();

   public EntityBeanType<T> setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);
   public MessageDestinationRefType<T> getMessageDestinationRef();

   public EntityBeanType<T> setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);
   public PersistenceContextRefType<T> getPersistenceContextRef();

   public EntityBeanType<T> setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);
   public PersistenceUnitRefType<T> getPersistenceUnitRef();

   public EntityBeanType<T> setPostConstruct(LifecycleCallbackType<T> postConstruct);
   public LifecycleCallbackType<T> getPostConstruct();

   public EntityBeanType<T> setPreDestroy(LifecycleCallbackType<T> preDestroy);
   public LifecycleCallbackType<T> getPreDestroy();

   public EntityBeanType<T> setDataSource(DataSourceType<T> dataSource);
   public DataSourceType<T> getDataSource();

   public EntityBeanType<T> setServiceRef(ServiceRefType<T> serviceRef);
   public ServiceRefType<T> getServiceRef();

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

   public EntityBeanType<T> setPersistenceType(PersistenceTypeType persistenceType);
   public PersistenceTypeType getPersistenceType();

   public EntityBeanType<T> setPrimKeyClass(String primKeyClass);
   public String getPrimKeyClass();

   public EntityBeanType<T> setReentrant(Boolean reentrant);
   public Boolean getReentrant();

   public EntityBeanType<T> setCmpVersion(CmpVersionType cmpVersion);
   public CmpVersionType getCmpVersion();

   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName);
   public String getAbstractSchemaName();

   public EntityBeanType<T> setCmpField(CmpFieldType<T> cmpField);
   public CmpFieldType<T> getCmpField();

   public EntityBeanType<T> setPrimkeyField(String primkeyField);
   public String getPrimkeyField();

   public EntityBeanType<T> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);
   public SecurityRoleRefType<T> getSecurityRoleRef();

   public EntityBeanType<T> setSecurityIdentity(SecurityIdentityType<T> securityIdentity);
   public SecurityIdentityType<T> getSecurityIdentity();

   public EntityBeanType<T> setQuery(QueryType<T> query);
   public QueryType<T> getQuery();
}
