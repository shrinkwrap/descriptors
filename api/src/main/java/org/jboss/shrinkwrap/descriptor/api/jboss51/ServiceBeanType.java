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
 * Original Documentation: The service element holds all of the information
 * specific about a service bean which is a JBoss proprietary extension to EJB3
 * creating multithreaded, singleton services. Service beans are the EJB3
 * analogy for JMX MBeans.
 * 
 */
public interface ServiceBeanType<T> extends Child<T> {

	public ServiceBeanType<T> setDescription(String description);

	public ServiceBeanType<T> setDescriptionList(String... values);

	public ServiceBeanType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ServiceBeanType<T> setDisplayName(String displayName);

	public ServiceBeanType<T> setDisplayNameList(String... values);

	public ServiceBeanType<T> removeAllDisplayName();

	public List<String> getDisplayNameList();

	public ServiceBeanType<T> removeAllIcon();

	public IconType<ServiceBeanType<T>> icon();

	public List<IconType<ServiceBeanType<T>>> getIconList();

	public ServiceBeanType<T> removeAllEnvEntry();

	public EnvEntryType<ServiceBeanType<T>> envEntry();

	public List<EnvEntryType<ServiceBeanType<T>>> getEnvEntryList();

	public ServiceBeanType<T> removeAllEjbRef();

	public EjbRefType<ServiceBeanType<T>> ejbRef();

	public List<EjbRefType<ServiceBeanType<T>>> getEjbRefList();

	public ServiceBeanType<T> removeAllEjbLocalRef();

	public EjbLocalRefType<ServiceBeanType<T>> ejbLocalRef();

	public List<EjbLocalRefType<ServiceBeanType<T>>> getEjbLocalRefList();

	public ServiceBeanType<T> removeAllResourceRef();

	public ResourceRefType<ServiceBeanType<T>> resourceRef();

	public List<ResourceRefType<ServiceBeanType<T>>> getResourceRefList();

	public ServiceBeanType<T> removeAllResourceEnvRef();

	public ResourceEnvRefType<ServiceBeanType<T>> resourceEnvRef();

	public List<ResourceEnvRefType<ServiceBeanType<T>>> getResourceEnvRefList();

	public ServiceBeanType<T> removeAllMessageDestinationRef();

	public MessageDestinationRefType<ServiceBeanType<T>> messageDestinationRef();

	public List<MessageDestinationRefType<ServiceBeanType<T>>> getMessageDestinationRefList();

	public ServiceBeanType<T> removeAllPersistenceContextRef();

	public PersistenceContextRefType<ServiceBeanType<T>> persistenceContextRef();

	public List<PersistenceContextRefType<ServiceBeanType<T>>> getPersistenceContextRefList();

	public ServiceBeanType<T> removeAllPersistenceUnitRef();

	public PersistenceUnitRefType<ServiceBeanType<T>> persistenceUnitRef();

	public List<PersistenceUnitRefType<ServiceBeanType<T>>> getPersistenceUnitRefList();

	public ServiceBeanType<T> removeAllPostConstruct();

	public LifecycleCallbackType<ServiceBeanType<T>> postConstruct();

	public List<LifecycleCallbackType<ServiceBeanType<T>>> getPostConstructList();

	public ServiceBeanType<T> removeAllPreDestroy();

	public LifecycleCallbackType<ServiceBeanType<T>> preDestroy();

	public List<LifecycleCallbackType<ServiceBeanType<T>>> getPreDestroyList();

	public ServiceBeanType<T> removeAllServiceRef();

	public ServiceRefType<ServiceBeanType<T>> serviceRef();

	public List<ServiceRefType<ServiceBeanType<T>>> getServiceRefList();

	public ServiceBeanType<T> setEjbName(String ejbName);

	public ServiceBeanType<T> removeEjbName();

	public String getEjbName();

	public ServiceBeanType<T> setMappedName(String mappedName);

	public ServiceBeanType<T> removeMappedName();

	public String getMappedName();

	public ServiceBeanType<T> setBusinessLocal(String businessLocal);

	public ServiceBeanType<T> setBusinessLocalList(String... values);

	public ServiceBeanType<T> removeAllBusinessLocal();

	public List<String> getBusinessLocalList();

	public ServiceBeanType<T> setBusinessRemote(String businessRemote);

	public ServiceBeanType<T> setBusinessRemoteList(String... values);

	public ServiceBeanType<T> removeAllBusinessRemote();

	public List<String> getBusinessRemoteList();

	public ServiceBeanType<T> setEjbClass(String ejbClass);

	public ServiceBeanType<T> removeEjbClass();

	public String getEjbClass();

	public ServiceBeanType<T> removeSecurityIdentity();

	public SecurityIdentityType<ServiceBeanType<T>> securityIdentity();

	public ServiceBeanType<T> setObjectName(String objectName);

	public ServiceBeanType<T> removeObjectName();

	public String getObjectName();

	public ServiceBeanType<T> setManagement(String management);

	public ServiceBeanType<T> removeManagement();

	public String getManagement();

	public ServiceBeanType<T> setXmbean(String xmbean);

	public ServiceBeanType<T> removeXmbean();

	public String getXmbean();

	public ServiceBeanType<T> removeAllLocalBinding();

	public LocalBindingType<ServiceBeanType<T>> localBinding();

	public List<LocalBindingType<ServiceBeanType<T>>> getLocalBindingList();

	public ServiceBeanType<T> removeAllRemoteBinding();

	public RemoteBindingType<ServiceBeanType<T>> remoteBinding();

	public List<RemoteBindingType<ServiceBeanType<T>>> getRemoteBindingList();

	public ServiceBeanType<T> setJndiName(String jndiName);

	public ServiceBeanType<T> removeJndiName();

	public String getJndiName();

	public ServiceBeanType<T> setHomeJndiName(String homeJndiName);

	public ServiceBeanType<T> removeHomeJndiName();

	public String getHomeJndiName();

	public ServiceBeanType<T> setLocalJndiName(String localJndiName);

	public ServiceBeanType<T> removeLocalJndiName();

	public String getLocalJndiName();

	public ServiceBeanType<T> setJndiBindingPolicy(String jndiBindingPolicy);

	public ServiceBeanType<T> removeJndiBindingPolicy();

	public String getJndiBindingPolicy();

	public ServiceBeanType<T> setClustered(Boolean clustered);

	public ServiceBeanType<T> removeClustered();

	public Boolean isClustered();

	public ServiceBeanType<T> removeClusterConfig();

	public ClusterConfigType<ServiceBeanType<T>> clusterConfig();

	public ServiceBeanType<T> setSecurityDomain(String securityDomain);

	public ServiceBeanType<T> removeSecurityDomain();

	public String getSecurityDomain();

	public ServiceBeanType<T> removeMethodAttributes();

	public MethodAttributesType<ServiceBeanType<T>> methodAttributes();

	public ServiceBeanType<T> setDepends(String depends);

	public ServiceBeanType<T> setDependsList(String... values);

	public ServiceBeanType<T> removeAllDepends();

	public List<String> getDependsList();

	public ServiceBeanType<T> removeAllAnnotation();

	public AnnotationType<ServiceBeanType<T>> annotation();

	public List<AnnotationType<ServiceBeanType<T>>> getAnnotationList();

	public ServiceBeanType<T> removeIgnoreDependency();

	public IgnoreDependencyType<ServiceBeanType<T>> ignoreDependency();

	public ServiceBeanType<T> setAopDomainName(String aopDomainName);

	public ServiceBeanType<T> removeAopDomainName();

	public String getAopDomainName();

	public ServiceBeanType<T> removePoolConfig();

	public PoolConfigType<ServiceBeanType<T>> poolConfig();

	public ServiceBeanType<T> setConcurrent(Boolean concurrent);

	public ServiceBeanType<T> removeConcurrent();

	public Boolean isConcurrent();

	public ServiceBeanType<T> removeAllJndiRef();

	public JndiRefType<ServiceBeanType<T>> jndiRef();

	public List<JndiRefType<ServiceBeanType<T>>> getJndiRefList();

	public ServiceBeanType<T> removePortComponent();

	public PortComponentType<ServiceBeanType<T>> portComponent();

	public ServiceBeanType<T> removeEjbTimeoutIdentity();

	public SecurityIdentityType<ServiceBeanType<T>> ejbTimeoutIdentity();

}
