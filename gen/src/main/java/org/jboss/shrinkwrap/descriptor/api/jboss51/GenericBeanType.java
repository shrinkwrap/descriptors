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
 */
public interface GenericBeanType<T> extends Child<T> {

	public GenericBeanType<T> setDescription(String description);

	public GenericBeanType<T> setDescriptionList(String... values);

	public GenericBeanType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public GenericBeanType<T> setDisplayName(String displayName);

	public GenericBeanType<T> setDisplayNameList(String... values);

	public GenericBeanType<T> removeAllDisplayName();

	public List<String> getDisplayNameList();

	public GenericBeanType<T> removeAllIcon();

	public IconType<GenericBeanType<T>> icon();

	public List<IconType<GenericBeanType<T>>> getIconList();

	public GenericBeanType<T> removeAllEnvEntry();

	public EnvEntryType<GenericBeanType<T>> envEntry();

	public List<EnvEntryType<GenericBeanType<T>>> getEnvEntryList();

	public GenericBeanType<T> removeAllEjbRef();

	public EjbRefType<GenericBeanType<T>> ejbRef();

	public List<EjbRefType<GenericBeanType<T>>> getEjbRefList();

	public GenericBeanType<T> removeAllEjbLocalRef();

	public EjbLocalRefType<GenericBeanType<T>> ejbLocalRef();

	public List<EjbLocalRefType<GenericBeanType<T>>> getEjbLocalRefList();

	public GenericBeanType<T> removeAllResourceRef();

	public ResourceRefType<GenericBeanType<T>> resourceRef();

	public List<ResourceRefType<GenericBeanType<T>>> getResourceRefList();

	public GenericBeanType<T> removeAllResourceEnvRef();

	public ResourceEnvRefType<GenericBeanType<T>> resourceEnvRef();

	public List<ResourceEnvRefType<GenericBeanType<T>>> getResourceEnvRefList();

	public GenericBeanType<T> removeAllMessageDestinationRef();

	public MessageDestinationRefType<GenericBeanType<T>> messageDestinationRef();

	public List<MessageDestinationRefType<GenericBeanType<T>>> getMessageDestinationRefList();

	public GenericBeanType<T> removeAllPersistenceContextRef();

	public PersistenceContextRefType<GenericBeanType<T>> persistenceContextRef();

	public List<PersistenceContextRefType<GenericBeanType<T>>> getPersistenceContextRefList();

	public GenericBeanType<T> removeAllPersistenceUnitRef();

	public PersistenceUnitRefType<GenericBeanType<T>> persistenceUnitRef();

	public List<PersistenceUnitRefType<GenericBeanType<T>>> getPersistenceUnitRefList();

	public GenericBeanType<T> removeAllPostConstruct();

	public LifecycleCallbackType<GenericBeanType<T>> postConstruct();

	public List<LifecycleCallbackType<GenericBeanType<T>>> getPostConstructList();

	public GenericBeanType<T> removeAllPreDestroy();

	public LifecycleCallbackType<GenericBeanType<T>> preDestroy();

	public List<LifecycleCallbackType<GenericBeanType<T>>> getPreDestroyList();

	public GenericBeanType<T> removeAllServiceRef();

	public ServiceRefType<GenericBeanType<T>> serviceRef();

	public List<ServiceRefType<GenericBeanType<T>>> getServiceRefList();

	public GenericBeanType<T> setEjbName(String ejbName);

	public GenericBeanType<T> removeEjbName();

	public String getEjbName();

	public GenericBeanType<T> setMappedName(String mappedName);

	public GenericBeanType<T> removeMappedName();

	public String getMappedName();

	public GenericBeanType<T> removeSecurityIdentity();

	public SecurityIdentityType<GenericBeanType<T>> securityIdentity();

	public GenericBeanType<T> setJndiName(String jndiName);

	public GenericBeanType<T> removeJndiName();

	public String getJndiName();

	public GenericBeanType<T> setHomeJndiName(String homeJndiName);

	public GenericBeanType<T> removeHomeJndiName();

	public String getHomeJndiName();

	public GenericBeanType<T> setLocalJndiName(String localJndiName);

	public GenericBeanType<T> removeLocalJndiName();

	public String getLocalJndiName();

	public GenericBeanType<T> setLocalHomeJndiName(String localHomeJndiName);

	public GenericBeanType<T> removeLocalHomeJndiName();

	public String getLocalHomeJndiName();

	public GenericBeanType<T> setJndiBindingPolicy(String jndiBindingPolicy);

	public GenericBeanType<T> removeJndiBindingPolicy();

	public String getJndiBindingPolicy();

	public GenericBeanType<T> setSecurityDomain(String securityDomain);

	public GenericBeanType<T> removeSecurityDomain();

	public String getSecurityDomain();

	public GenericBeanType<T> removeMethodAttributes();

	public MethodAttributesType<GenericBeanType<T>> methodAttributes();

	public GenericBeanType<T> setDepends(String depends);

	public GenericBeanType<T> setDependsList(String... values);

	public GenericBeanType<T> removeAllDepends();

	public List<String> getDependsList();

	public GenericBeanType<T> removeAllAnnotation();

	public AnnotationType<GenericBeanType<T>> annotation();

	public List<AnnotationType<GenericBeanType<T>>> getAnnotationList();

	public GenericBeanType<T> removeIgnoreDependency();

	public IgnoreDependencyType<GenericBeanType<T>> ignoreDependency();

	public GenericBeanType<T> setAopDomainName(String aopDomainName);

	public GenericBeanType<T> removeAopDomainName();

	public String getAopDomainName();

	public GenericBeanType<T> removePoolConfig();

	public PoolConfigType<GenericBeanType<T>> poolConfig();

	public GenericBeanType<T> removeAllJndiRef();

	public JndiRefType<GenericBeanType<T>> jndiRef();

	public List<JndiRefType<GenericBeanType<T>>> getJndiRefList();

	public GenericBeanType<T> removePortComponent();

	public PortComponentType<GenericBeanType<T>> portComponent();

}
