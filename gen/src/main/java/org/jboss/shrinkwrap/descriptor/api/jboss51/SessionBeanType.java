package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The session element holds information specific to
 * jboss and not declared in ejb-jar.xml about a session bean, such as jndi
 * name, container configuration, and resource managers. (see tags for details)
 * The bean should already be declared in ejb-jar.xml, with the same ejb-name.
 * Used in: enterprise-beans
 * 
 */
public interface SessionBeanType<T> extends Child<T> {

	public SessionBeanType<T> setDescription(String description);

	public SessionBeanType<T> setDescriptionList(String... values);

	public SessionBeanType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public SessionBeanType<T> setDisplayName(String displayName);

	public SessionBeanType<T> setDisplayNameList(String... values);

	public SessionBeanType<T> removeAllDisplayName();

	public List<String> getDisplayNameList();

	public SessionBeanType<T> removeAllIcon();

	public IconType<SessionBeanType<T>> icon();

	public List<IconType<SessionBeanType<T>>> getIconList();

	public SessionBeanType<T> removeAllEnvEntry();

	public EnvEntryType<SessionBeanType<T>> envEntry();

	public List<EnvEntryType<SessionBeanType<T>>> getEnvEntryList();

	public SessionBeanType<T> removeAllEjbRef();

	public EjbRefType<SessionBeanType<T>> ejbRef();

	public List<EjbRefType<SessionBeanType<T>>> getEjbRefList();

	public SessionBeanType<T> removeAllEjbLocalRef();

	public EjbLocalRefType<SessionBeanType<T>> ejbLocalRef();

	public List<EjbLocalRefType<SessionBeanType<T>>> getEjbLocalRefList();

	public SessionBeanType<T> removeAllResourceRef();

	public ResourceRefType<SessionBeanType<T>> resourceRef();

	public List<ResourceRefType<SessionBeanType<T>>> getResourceRefList();

	public SessionBeanType<T> removeAllResourceEnvRef();

	public ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef();

	public List<ResourceEnvRefType<SessionBeanType<T>>> getResourceEnvRefList();

	public SessionBeanType<T> removeAllMessageDestinationRef();

	public MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef();

	public List<MessageDestinationRefType<SessionBeanType<T>>> getMessageDestinationRefList();

	public SessionBeanType<T> removeAllPersistenceContextRef();

	public PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef();

	public List<PersistenceContextRefType<SessionBeanType<T>>> getPersistenceContextRefList();

	public SessionBeanType<T> removeAllPersistenceUnitRef();

	public PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef();

	public List<PersistenceUnitRefType<SessionBeanType<T>>> getPersistenceUnitRefList();

	public SessionBeanType<T> removeAllPostConstruct();

	public LifecycleCallbackType<SessionBeanType<T>> postConstruct();

	public List<LifecycleCallbackType<SessionBeanType<T>>> getPostConstructList();

	public SessionBeanType<T> removeAllPreDestroy();

	public LifecycleCallbackType<SessionBeanType<T>> preDestroy();

	public List<LifecycleCallbackType<SessionBeanType<T>>> getPreDestroyList();

	public SessionBeanType<T> removeAllServiceRef();

	public ServiceRefType<SessionBeanType<T>> serviceRef();

	public List<ServiceRefType<SessionBeanType<T>>> getServiceRefList();

	public SessionBeanType<T> setEjbName(String ejbName);

	public SessionBeanType<T> removeEjbName();

	public String getEjbName();

	public SessionBeanType<T> setMappedName(String mappedName);

	public SessionBeanType<T> removeMappedName();

	public String getMappedName();

	public SessionBeanType<T> removeSecurityIdentity();

	public SecurityIdentityType<SessionBeanType<T>> securityIdentity();

	public SessionBeanType<T> removeAllLocalBinding();

	public LocalBindingType<SessionBeanType<T>> localBinding();

	public List<LocalBindingType<SessionBeanType<T>>> getLocalBindingList();

	public SessionBeanType<T> removeAllRemoteBinding();

	public RemoteBindingType<SessionBeanType<T>> remoteBinding();

	public List<RemoteBindingType<SessionBeanType<T>>> getRemoteBindingList();

	public SessionBeanType<T> setBusinessLocal(String businessLocal);

	public SessionBeanType<T> setBusinessLocalList(String... values);

	public SessionBeanType<T> removeAllBusinessLocal();

	public List<String> getBusinessLocalList();

	public SessionBeanType<T> setBusinessRemote(String businessRemote);

	public SessionBeanType<T> setBusinessRemoteList(String... values);

	public SessionBeanType<T> removeAllBusinessRemote();

	public List<String> getBusinessRemoteList();

	public SessionBeanType<T> setJndiName(String jndiName);

	public SessionBeanType<T> removeJndiName();

	public String getJndiName();

	public SessionBeanType<T> setHomeJndiName(String homeJndiName);

	public SessionBeanType<T> removeHomeJndiName();

	public String getHomeJndiName();

	public SessionBeanType<T> setLocalJndiName(String localJndiName);

	public SessionBeanType<T> removeLocalJndiName();

	public String getLocalJndiName();

	public SessionBeanType<T> setLocalHomeJndiName(String localHomeJndiName);

	public SessionBeanType<T> removeLocalHomeJndiName();

	public String getLocalHomeJndiName();

	public SessionBeanType<T> setJndiBindingPolicy(String jndiBindingPolicy);

	public SessionBeanType<T> removeJndiBindingPolicy();

	public String getJndiBindingPolicy();

	public SessionBeanType<T> setClustered(Boolean clustered);

	public SessionBeanType<T> removeClustered();

	public Boolean isClustered();

	public SessionBeanType<T> removeClusterConfig();

	public ClusterConfigType<SessionBeanType<T>> clusterConfig();

	public SessionBeanType<T> setSecurityDomain(String securityDomain);

	public SessionBeanType<T> removeSecurityDomain();

	public String getSecurityDomain();

	public SessionBeanType<T> removeMethodAttributes();

	public MethodAttributesType<SessionBeanType<T>> methodAttributes();

	public SessionBeanType<T> setDepends(String depends);

	public SessionBeanType<T> setDependsList(String... values);

	public SessionBeanType<T> removeAllDepends();

	public List<String> getDependsList();

	public SessionBeanType<T> removeAllAnnotation();

	public AnnotationType<SessionBeanType<T>> annotation();

	public List<AnnotationType<SessionBeanType<T>>> getAnnotationList();

	public SessionBeanType<T> removeIgnoreDependency();

	public IgnoreDependencyType<SessionBeanType<T>> ignoreDependency();

	public SessionBeanType<T> setAopDomainName(String aopDomainName);

	public SessionBeanType<T> removeAopDomainName();

	public String getAopDomainName();

	public SessionBeanType<T> removeCacheConfig();

	public CacheConfigType<SessionBeanType<T>> cacheConfig();

	public SessionBeanType<T> removePoolConfig();

	public PoolConfigType<SessionBeanType<T>> poolConfig();

	public SessionBeanType<T> setConcurrent(Boolean concurrent);

	public SessionBeanType<T> removeConcurrent();

	public Boolean isConcurrent();

	public SessionBeanType<T> removeAllJndiRef();

	public JndiRefType<SessionBeanType<T>> jndiRef();

	public List<JndiRefType<SessionBeanType<T>>> getJndiRefList();

	public SessionBeanType<T> removePortComponent();

	public PortComponentType<SessionBeanType<T>> portComponent();

	public SessionBeanType<T> removeEjbTimeoutIdentity();

	public SecurityIdentityType<SessionBeanType<T>> ejbTimeoutIdentity();

}
