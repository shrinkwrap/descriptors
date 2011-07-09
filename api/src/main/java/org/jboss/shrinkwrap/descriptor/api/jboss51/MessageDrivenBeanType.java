package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The message-driven element holds information specific to jboss and not
 * declared in ejb-jar.xml about a message-driven bean, such as container configuration and
 * resources. The bean should already be declared in ejb-jar.xml, with the same ejb-name.
 *
 *
 */
public interface MessageDrivenBeanType<T> extends Child<T>
{

   public MessageDrivenBeanType<T> setDescription(String description);

   public MessageDrivenBeanType<T> setDescriptionList(String... values);

   public MessageDrivenBeanType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public MessageDrivenBeanType<T> setDisplayName(String displayName);

   public MessageDrivenBeanType<T> setDisplayNameList(String... values);

   public MessageDrivenBeanType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();

   public MessageDrivenBeanType<T> removeAllIcon();

   public IconType<MessageDrivenBeanType<T>> icon();

   public List<IconType<MessageDrivenBeanType<T>>> getIconList();

   public MessageDrivenBeanType<T> setEjbName(String ejbName);

   public MessageDrivenBeanType<T> removeEjbName();

   public String getEjbName();

   public MessageDrivenBeanType<T> removeActivationConfig();

   public ActivationConfigType<MessageDrivenBeanType<T>> activationConfig();

   public MessageDrivenBeanType<T> setDestinationJndiName(String destinationJndiName);

   public MessageDrivenBeanType<T> removeDestinationJndiName();

   public String getDestinationJndiName();

   public MessageDrivenBeanType<T> setMdbUser(String mdbUser);

   public MessageDrivenBeanType<T> removeMdbUser();

   public String getMdbUser();

   public MessageDrivenBeanType<T> setMdbPasswd(String mdbPasswd);

   public MessageDrivenBeanType<T> removeMdbPasswd();

   public String getMdbPasswd();

   public MessageDrivenBeanType<T> setMdbClientId(String mdbClientId);

   public MessageDrivenBeanType<T> removeMdbClientId();

   public String getMdbClientId();

   public MessageDrivenBeanType<T> setMdbSubscriptionId(String mdbSubscriptionId);

   public MessageDrivenBeanType<T> removeMdbSubscriptionId();

   public String getMdbSubscriptionId();

   public MessageDrivenBeanType<T> setResourceAdapterName(String resourceAdapterName);

   public MessageDrivenBeanType<T> removeResourceAdapterName();

   public String getResourceAdapterName();

   public MessageDrivenBeanType<T> removeAllEjbRef();

   public EjbRefType<MessageDrivenBeanType<T>> ejbRef();

   public List<EjbRefType<MessageDrivenBeanType<T>>> getEjbRefList();

   public MessageDrivenBeanType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef();

   public List<EjbLocalRefType<MessageDrivenBeanType<T>>> getEjbLocalRefList();

   public MessageDrivenBeanType<T> removeAllServiceRef();

   public ServiceRefType<MessageDrivenBeanType<T>> serviceRef();

   public List<ServiceRefType<MessageDrivenBeanType<T>>> getServiceRefList();

   public MessageDrivenBeanType<T> removeAllResourceRef();

   public ResourceRefType<MessageDrivenBeanType<T>> resourceRef();

   public List<ResourceRefType<MessageDrivenBeanType<T>>> getResourceRefList();

   public MessageDrivenBeanType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef();

   public List<ResourceEnvRefType<MessageDrivenBeanType<T>>> getResourceEnvRefList();

   public MessageDrivenBeanType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef();

   public List<MessageDestinationRefType<MessageDrivenBeanType<T>>> getMessageDestinationRefList();

   public MessageDrivenBeanType<T> removeSecurityIdentity();

   public SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity();

   public MessageDrivenBeanType<T> setSecurityDomain(String securityDomain);

   public MessageDrivenBeanType<T> removeSecurityDomain();

   public String getSecurityDomain();

   public MessageDrivenBeanType<T> removeMethodAttributes();

   public MethodAttributesType<MessageDrivenBeanType<T>> methodAttributes();

   public MessageDrivenBeanType<T> setDepends(String depends);

   public MessageDrivenBeanType<T> setDependsList(String... values);

   public MessageDrivenBeanType<T> removeAllDepends();

   public List<String> getDependsList();

   public MessageDrivenBeanType<T> removeEjbTimeoutIdentity();

   public SecurityIdentityType<MessageDrivenBeanType<T>> ejbTimeoutIdentity();

   public MessageDrivenBeanType<T> removeAllAnnotation();

   public AnnotationType<MessageDrivenBeanType<T>> annotation();

   public List<AnnotationType<MessageDrivenBeanType<T>>> getAnnotationList();

   public MessageDrivenBeanType<T> removeIgnoreDependency();

   public IgnoreDependencyType<MessageDrivenBeanType<T>> ignoreDependency();

   public MessageDrivenBeanType<T> setAopDomainName(String aopDomainName);

   public MessageDrivenBeanType<T> removeAopDomainName();

   public String getAopDomainName();

   public MessageDrivenBeanType<T> removePoolConfig();

   public PoolConfigType<MessageDrivenBeanType<T>> poolConfig();

   public MessageDrivenBeanType<T> removeAllJndiRef();

   public JndiRefType<MessageDrivenBeanType<T>> jndiRef();

   public List<JndiRefType<MessageDrivenBeanType<T>>> getJndiRefList();

   public MessageDrivenBeanType<T> setCreateDestination(Boolean createDestination);

   public MessageDrivenBeanType<T> removeCreateDestination();

   public Boolean isCreateDestination();

}
