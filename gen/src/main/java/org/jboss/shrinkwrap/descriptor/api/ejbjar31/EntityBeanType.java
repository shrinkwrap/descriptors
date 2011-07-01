package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

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
/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The entity-beanType declares an entity bean. The declaration
 * consists of:
 *
 * - an optional description
 * - an optional display name
 * - an optional icon element that contains a small and a large
 * icon file name
 * - a unique name assigned to the enterprise bean
 * in the deployment descriptor
 * - an optional mapped-name element that can be used to provide
 * vendor-specific deployment information such as the physical
 * jndi-name of the entity bean's remote home interface. This
 * element is not required to be supported by all implementations.
 * Any use of this element is non-portable.
 * - the names of the entity bean's remote home
 * and remote interfaces, if any
 * - the names of the entity bean's local home and local
 * interfaces, if any
 * - the entity bean's implementation class
 * - the optional entity bean's persistence management type. If
 * this element is not specified it is defaulted to Container.
 * - the entity bean's primary key class name
 * - an indication of the entity bean's reentrancy
 * - an optional specification of the
 * entity bean's cmp-version
 * - an optional specification of the entity bean's
 * abstract schema name
 * - an optional list of container-managed fields
 * - an optional specification of the primary key
 * field
 * - an optional declaration of the bean's environment
 * entries
 * - an optional declaration of the bean's EJB
 * references
 * - an optional declaration of the bean's local
 * EJB references
 * - an optional declaration of the bean's web
 * service references
 * - an optional declaration of the security role
 * references
 * - an optional declaration of the security identity
 * to be used for the execution of the bean's methods
 * - an optional declaration of the bean's
 * resource manager connection factory references
 * - an optional declaration of the bean's
 * resource environment references
 * - an optional declaration of the bean's message
 * destination references
 * - an optional set of query declarations
 * for finder and select methods for an entity
 * bean with cmp-version 2.x.
 *
 * The optional abstract-schema-name element must be specified
 * for an entity bean with container-managed persistence and
 * cmp-version 2.x.
 *
 * The optional primkey-field may be present in the descriptor
 * if the entity's persistence-type is Container.
 *
 * The optional cmp-version element may be present in the
 * descriptor if the entity's persistence-type is Container. If
 * the persistence-type is Container and the cmp-version
 * element is not specified, its value defaults to 2.x.
 *
 * The optional home and remote elements must be specified if
 * the entity bean cmp-version is 1.x.
 *
 * The optional home and remote elements must be specified if
 * the entity bean has a remote home and remote interface.
 *
 * The optional local-home and local elements must be specified
 * if the entity bean has a local home and local interface.
 *
 * Either both the local-home and the local elements or both
 * the home and the remote elements must be specified.
 *
 * The optional query elements must be present if the
 * persistence-type is Container and the cmp-version is 2.x and
 * query methods other than findByPrimaryKey have been defined
 * for the entity bean.
 *
 * The other elements that are optional are "optional" in the
 * sense that they are omitted if the lists represented by them
 * are empty.
 *
 * At least one cmp-field element must be present in the
 * descriptor if the entity's persistence-type is Container and
 * the cmp-version is 1.x, and none must not be present if the
 * entity's persistence-type is Bean.
 *
 *
 *
 */
public interface EntityBeanType<T> extends Child<T>
{

   public EntityBeanType<T> setDescription(String description);
   public EntityBeanType<T> setDescriptionList(String ... values);
   public EntityBeanType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public EntityBeanType<T> setDisplayName(String displayName);
   public EntityBeanType<T> setDisplayNameList(String ... values);
   public EntityBeanType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();


   public EntityBeanType<T> removeAllIcon();

   public IconType<EntityBeanType<T>> icon();
   public List<IconType<EntityBeanType<T>>> getIconList();



   public EntityBeanType<T> removeAllEnvEntry();

   public EnvEntryType<EntityBeanType<T>> envEntry();
   public List<EnvEntryType<EntityBeanType<T>>> getEnvEntryList();



   public EntityBeanType<T> removeAllEjbRef();

   public EjbRefType<EntityBeanType<T>> ejbRef();
   public List<EjbRefType<EntityBeanType<T>>> getEjbRefList();



   public EntityBeanType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<EntityBeanType<T>> ejbLocalRef();
   public List<EjbLocalRefType<EntityBeanType<T>>> getEjbLocalRefList();



   public EntityBeanType<T> removeAllResourceRef();

   public ResourceRefType<EntityBeanType<T>> resourceRef();
   public List<ResourceRefType<EntityBeanType<T>>> getResourceRefList();



   public EntityBeanType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<EntityBeanType<T>> resourceEnvRef();
   public List<ResourceEnvRefType<EntityBeanType<T>>> getResourceEnvRefList();



   public EntityBeanType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<EntityBeanType<T>> messageDestinationRef();
   public List<MessageDestinationRefType<EntityBeanType<T>>> getMessageDestinationRefList();



   public EntityBeanType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<EntityBeanType<T>> persistenceContextRef();
   public List<PersistenceContextRefType<EntityBeanType<T>>> getPersistenceContextRefList();



   public EntityBeanType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<EntityBeanType<T>> persistenceUnitRef();
   public List<PersistenceUnitRefType<EntityBeanType<T>>> getPersistenceUnitRefList();



   public EntityBeanType<T> removeAllPostConstruct();

   public LifecycleCallbackType<EntityBeanType<T>> postConstruct();
   public List<LifecycleCallbackType<EntityBeanType<T>>> getPostConstructList();



   public EntityBeanType<T> removeAllPreDestroy();

   public LifecycleCallbackType<EntityBeanType<T>> preDestroy();
   public List<LifecycleCallbackType<EntityBeanType<T>>> getPreDestroyList();



   public EntityBeanType<T> removeAllDataSource();

   public DataSourceType<EntityBeanType<T>> dataSource();
   public List<DataSourceType<EntityBeanType<T>>> getDataSourceList();



   public EntityBeanType<T> setEjbName(String ejbName);
   public EntityBeanType<T> removeEjbName();

   public String getEjbName();



   public EntityBeanType<T> setMappedName(String mappedName);
   public EntityBeanType<T> removeMappedName();

   public String getMappedName();



   public EntityBeanType<T> setHome(String home);
   public EntityBeanType<T> removeHome();

   public String getHome();



   public EntityBeanType<T> setRemote(String remote);
   public EntityBeanType<T> removeRemote();

   public String getRemote();



   public EntityBeanType<T> setLocalHome(String localHome);
   public EntityBeanType<T> removeLocalHome();

   public String getLocalHome();



   public EntityBeanType<T> setLocal(String local);
   public EntityBeanType<T> removeLocal();

   public String getLocal();



   public EntityBeanType<T> setEjbClass(String ejbClass);
   public EntityBeanType<T> removeEjbClass();

   public String getEjbClass();



   public EntityBeanType<T> setPersistenceType(PersistenceTypeType persistenceType);
   public EntityBeanType<T> setPersistenceType(String persistenceType);

   public PersistenceTypeType getPersistenceType();
   public String  getPersistenceTypeAsString();



   public EntityBeanType<T> setPrimKeyClass(String primKeyClass);
   public EntityBeanType<T> removePrimKeyClass();

   public String getPrimKeyClass();



   public EntityBeanType<T> setReentrant(Boolean reentrant);
   public EntityBeanType<T> removeReentrant();

   public Boolean isReentrant();



   public EntityBeanType<T> setCmpVersion(CmpVersionType cmpVersion);
   public EntityBeanType<T> setCmpVersion(String cmpVersion);

   public CmpVersionType getCmpVersion();
   public String  getCmpVersionAsString();



   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName);
   public EntityBeanType<T> removeAbstractSchemaName();

   public String getAbstractSchemaName();



   public EntityBeanType<T> removeAllCmpField();

   public CmpFieldType<EntityBeanType<T>> cmpField();
   public List<CmpFieldType<EntityBeanType<T>>> getCmpFieldList();




   public EntityBeanType<T> setPrimkeyField(String primkeyField);
   public EntityBeanType<T> removePrimkeyField();

   public String getPrimkeyField();



   public EntityBeanType<T> removeAllSecurityRoleRef();

   public SecurityRoleRefType<EntityBeanType<T>> securityRoleRef();
   public List<SecurityRoleRefType<EntityBeanType<T>>> getSecurityRoleRefList();




   public EntityBeanType<T> removeSecurityIdentity();

   public SecurityIdentityType<EntityBeanType<T>> securityIdentity();




   public EntityBeanType<T> removeAllQuery();

   public QueryType<EntityBeanType<T>> query();
   public List<QueryType<EntityBeanType<T>>> getQueryList();


}
