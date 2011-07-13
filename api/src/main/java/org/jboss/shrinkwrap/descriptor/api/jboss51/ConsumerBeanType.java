package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The consumer element holds all of the information
 * specific about a consumer bean which is a JBoss proprietary extension to EJB3
 * for sending JMS messages via standard Java interfaces. Used in:
 * enterprise-beans
 * 
 */
public interface ConsumerBeanType<T> extends Child<T> {

	public ConsumerBeanType<T> setDescription(String description);

	public ConsumerBeanType<T> setDescriptionList(String... values);

	public ConsumerBeanType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ConsumerBeanType<T> setDisplayName(String displayName);

	public ConsumerBeanType<T> setDisplayNameList(String... values);

	public ConsumerBeanType<T> removeAllDisplayName();

	public List<String> getDisplayNameList();

	public ConsumerBeanType<T> removeAllIcon();

	public IconType<ConsumerBeanType<T>> icon();

	public List<IconType<ConsumerBeanType<T>>> getIconList();

	public ConsumerBeanType<T> setEjbName(String ejbName);

	public ConsumerBeanType<T> removeEjbName();

	public String getEjbName();

	public ConsumerBeanType<T> setEjbClass(String ejbClass);

	public ConsumerBeanType<T> removeEjbClass();

	public String getEjbClass();

	public ConsumerBeanType<T> setMessageDestination(String messageDestination);

	public ConsumerBeanType<T> removeMessageDestination();

	public String getMessageDestination();

	public ConsumerBeanType<T> setMessageDestinationType(
			String messageDestinationType);

	public ConsumerBeanType<T> removeMessageDestinationType();

	public String getMessageDestinationType();

	public ConsumerBeanType<T> removeAllProducer();

	public ProducerType<ConsumerBeanType<T>> producer();

	public List<ProducerType<ConsumerBeanType<T>>> getProducerList();

	public ConsumerBeanType<T> removeAllLocalProducer();

	public ProducerType<ConsumerBeanType<T>> localProducer();

	public List<ProducerType<ConsumerBeanType<T>>> getLocalProducerList();

	public ConsumerBeanType<T> removeCurrentMessage();

	public MethodAttributesType<ConsumerBeanType<T>> currentMessage();

	public ConsumerBeanType<T> removeAllMessageProperties();

	public MessagePropertiesType<ConsumerBeanType<T>> messageProperties();

	public List<MessagePropertiesType<ConsumerBeanType<T>>> getMessagePropertiesList();

	public ConsumerBeanType<T> removeAllEjbRef();

	public EjbRefType<ConsumerBeanType<T>> ejbRef();

	public List<EjbRefType<ConsumerBeanType<T>>> getEjbRefList();

	public ConsumerBeanType<T> removeAllEjbLocalRef();

	public EjbLocalRefType<ConsumerBeanType<T>> ejbLocalRef();

	public List<EjbLocalRefType<ConsumerBeanType<T>>> getEjbLocalRefList();

	public ConsumerBeanType<T> removeSecurityIdentity();

	public SecurityIdentityType<ConsumerBeanType<T>> securityIdentity();

	public ConsumerBeanType<T> removeAllResourceRef();

	public ResourceRefType<ConsumerBeanType<T>> resourceRef();

	public List<ResourceRefType<ConsumerBeanType<T>>> getResourceRefList();

	public ConsumerBeanType<T> removeAllResourceEnvRef();

	public ResourceEnvRefType<ConsumerBeanType<T>> resourceEnvRef();

	public List<ResourceEnvRefType<ConsumerBeanType<T>>> getResourceEnvRefList();

	public ConsumerBeanType<T> removeAllMessageDestinationRef();

	public MessageDestinationRefType<ConsumerBeanType<T>> messageDestinationRef();

	public List<MessageDestinationRefType<ConsumerBeanType<T>>> getMessageDestinationRefList();

	public ConsumerBeanType<T> setSecurityDomain(String securityDomain);

	public ConsumerBeanType<T> removeSecurityDomain();

	public String getSecurityDomain();

	public ConsumerBeanType<T> removeMethodAttributes();

	public MethodAttributesType<ConsumerBeanType<T>> methodAttributes();

	public ConsumerBeanType<T> setDepends(String depends);

	public ConsumerBeanType<T> setDependsList(String... values);

	public ConsumerBeanType<T> removeAllDepends();

	public List<String> getDependsList();

	public ConsumerBeanType<T> removeAllAnnotation();

	public AnnotationType<ConsumerBeanType<T>> annotation();

	public List<AnnotationType<ConsumerBeanType<T>>> getAnnotationList();

	public ConsumerBeanType<T> removeIgnoreDependency();

	public IgnoreDependencyType<ConsumerBeanType<T>> ignoreDependency();

	public ConsumerBeanType<T> setAopDomainName(String aopDomainName);

	public ConsumerBeanType<T> removeAopDomainName();

	public String getAopDomainName();

	public ConsumerBeanType<T> removePoolConfig();

	public PoolConfigType<ConsumerBeanType<T>> poolConfig();

	public ConsumerBeanType<T> removeAllJndiRef();

	public JndiRefType<ConsumerBeanType<T>> jndiRef();

	public List<JndiRefType<ConsumerBeanType<T>>> getJndiRefList();

	public ConsumerBeanType<T> removeActivationConfig();

	public ActivationConfigType<ConsumerBeanType<T>> activationConfig();

}
