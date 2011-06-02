package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
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
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface EntityBeanType<T> extends Child<T>
{
   public EntityBeanType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public EntityBeanType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<EntityBeanType<T>> icon();

   @NodeInfo(xmlName = "env-entry")
   public EnvEntryType<EntityBeanType<T>> envEntry();

   @NodeInfo(xmlName = "ejb-ref")
   public EjbRefType<EntityBeanType<T>> ejbRef();

   @NodeInfo(xmlName = "ejb-local-ref")
   public EjbLocalRefType<EntityBeanType<T>> ejbLocalRef();

   @NodeInfo(xmlName = "resource-ref")
   public ResourceRefType<EntityBeanType<T>> resourceRef();

   @NodeInfo(xmlName = "resource-env-ref")
   public ResourceEnvRefType<EntityBeanType<T>> resourceEnvRef();

   @NodeInfo(xmlName = "message-destination-ref")
   public MessageDestinationRefType<EntityBeanType<T>> messageDestinationRef();

   @NodeInfo(xmlName = "persistence-context-ref")
   public PersistenceContextRefType<EntityBeanType<T>> persistenceContextRef();

   @NodeInfo(xmlName = "persistence-unit-ref")
   public PersistenceUnitRefType<EntityBeanType<T>> persistenceUnitRef();

   @NodeInfo(xmlName = "post-construct")
   public LifecycleCallbackType<EntityBeanType<T>> postConstruct();

   @NodeInfo(xmlName = "pre-destroy")
   public LifecycleCallbackType<EntityBeanType<T>> preDestroy();

   @NodeInfo(xmlName = "data-source")
   public DataSourceType<EntityBeanType<T>> dataSource();

   @NodeInfo(xmlName = "service-ref")
   public ServiceRefType<EntityBeanType<T>> serviceRef();

   public EntityBeanType<T> setEjbName(String ejbName);

   @NodeInfo(xmlName = "ejb-name")
   public String getEjbName();

   public EntityBeanType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   public EntityBeanType<T> setHome(String home);

   @NodeInfo(xmlName = "home")
   public String getHome();

   public EntityBeanType<T> setRemote(String remote);

   @NodeInfo(xmlName = "remote")
   public String getRemote();

   public EntityBeanType<T> setLocalHome(String localHome);

   @NodeInfo(xmlName = "local-home")
   public String getLocalHome();

   public EntityBeanType<T> setLocal(String local);

   @NodeInfo(xmlName = "local")
   public String getLocal();

   public EntityBeanType<T> setEjbClass(String ejbClass);

   @NodeInfo(xmlName = "ejb-class")
   public String getEjbClass();

   public EntityBeanType<T> setPersistenceType(PersistenceTypeType persistenceType);

   public EntityBeanType<T> setPersistenceType(String persistenceType);

   @NodeInfo(xmlName = "persistence-type")
   public String getPersistenceType();

   public EntityBeanType<T> setPrimKeyClass(Class<?> primKeyClass);

   public EntityBeanType<T> setPrimKeyClass(String primKeyClass);

   @NodeInfo(xmlName = "prim-key-class")
   public String getPrimKeyClass();

   public EntityBeanType<T> setReentrant(Boolean reentrant);

   @NodeInfo(xmlName = "reentrant")
   public Boolean getReentrant();

   public EntityBeanType<T> setCmpVersion(CmpVersionType cmpVersion);

   public EntityBeanType<T> setCmpVersion(String cmpVersion);

   @NodeInfo(xmlName = "cmp-version")
   public String getCmpVersion();

   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName);

   @NodeInfo(xmlName = "abstract-schema-name")
   public String getAbstractSchemaName();

   @NodeInfo(xmlName = "cmp-field")
   public CmpFieldType<EntityBeanType<T>> cmpField();

   public EntityBeanType<T> setPrimkeyField(String primkeyField);

   @NodeInfo(xmlName = "primkey-field")
   public String getPrimkeyField();

   @NodeInfo(xmlName = "security-role-ref")
   public SecurityRoleRefType<EntityBeanType<T>> securityRoleRef();

   @NodeInfo(xmlName = "security-identity")
   public SecurityIdentityType<EntityBeanType<T>> securityIdentity();

   @NodeInfo(xmlName = "query")
   public QueryType<EntityBeanType<T>> query();
}
