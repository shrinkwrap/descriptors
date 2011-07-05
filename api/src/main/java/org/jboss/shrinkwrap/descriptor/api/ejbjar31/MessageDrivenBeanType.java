package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

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

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The message-driven element declares a message-driven
 * bean. The declaration consists of:
 *
 * - an optional description
 * - an optional display name
 * - an optional icon element that contains a small and a large
 * icon file name.
 * - a name assigned to the enterprise bean in
 * the deployment descriptor
 * - an optional mapped-name element that can be used to provide
 * vendor-specific deployment information such as the physical
 * jndi-name of destination from which this message-driven bean
 * should consume. This element is not required to be supported
 * by all implementations. Any use of this element is non-portable.
 * - the message-driven bean's implementation class
 * - an optional declaration of the bean's messaging
 * type
 * - an optional declaration of the bean's timeout method for
 * handling programmatically created timers
 * - an optional declaration of timers to be automatically created at
 * deployment time
 * - the optional message-driven bean's transaction management
 * type. If it is not defined, it is defaulted to Container.
 * - an optional declaration of the bean's
 * message-destination-type
 * - an optional declaration of the bean's
 * message-destination-link
 * - an optional declaration of the message-driven bean's
 * activation configuration properties
 * - an optional list of the message-driven bean class and/or
 * superclass around-invoke methods.
 * - an optional list of the message-driven bean class and/or
 * superclass around-timeout methods.
 * - an optional declaration of the bean's environment
 * entries
 * - an optional declaration of the bean's EJB references
 * - an optional declaration of the bean's local EJB
 * references
 * - an optional declaration of the bean's web service
 * references
 * - an optional declaration of the security role
 * references
 * - an optional declaration of the security
 * identity to be used for the execution of the bean's
 * methods
 * - an optional declaration of the bean's
 * resource manager connection factory
 * references
 * - an optional declaration of the bean's resource
 * environment references.
 * - an optional declaration of the bean's message
 * destination references
 *
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

   public MessageDrivenBeanType<T> removeAllEnvEntry();

   public EnvEntryType<MessageDrivenBeanType<T>> envEntry();

   public List<EnvEntryType<MessageDrivenBeanType<T>>> getEnvEntryList();

   public MessageDrivenBeanType<T> removeAllEjbRef();

   public EjbRefType<MessageDrivenBeanType<T>> ejbRef();

   public List<EjbRefType<MessageDrivenBeanType<T>>> getEjbRefList();

   public MessageDrivenBeanType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef();

   public List<EjbLocalRefType<MessageDrivenBeanType<T>>> getEjbLocalRefList();

   public MessageDrivenBeanType<T> removeAllResourceRef();

   public ResourceRefType<MessageDrivenBeanType<T>> resourceRef();

   public List<ResourceRefType<MessageDrivenBeanType<T>>> getResourceRefList();

   public MessageDrivenBeanType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef();

   public List<ResourceEnvRefType<MessageDrivenBeanType<T>>> getResourceEnvRefList();

   public MessageDrivenBeanType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef();

   public List<MessageDestinationRefType<MessageDrivenBeanType<T>>> getMessageDestinationRefList();

   public MessageDrivenBeanType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<MessageDrivenBeanType<T>> persistenceContextRef();

   public List<PersistenceContextRefType<MessageDrivenBeanType<T>>> getPersistenceContextRefList();

   public MessageDrivenBeanType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<MessageDrivenBeanType<T>> persistenceUnitRef();

   public List<PersistenceUnitRefType<MessageDrivenBeanType<T>>> getPersistenceUnitRefList();

   public MessageDrivenBeanType<T> removeAllPostConstruct();

   public LifecycleCallbackType<MessageDrivenBeanType<T>> postConstruct();

   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getPostConstructList();

   public MessageDrivenBeanType<T> removeAllPreDestroy();

   public LifecycleCallbackType<MessageDrivenBeanType<T>> preDestroy();

   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getPreDestroyList();

   public MessageDrivenBeanType<T> removeAllDataSource();

   public DataSourceType<MessageDrivenBeanType<T>> dataSource();

   public List<DataSourceType<MessageDrivenBeanType<T>>> getDataSourceList();

   public MessageDrivenBeanType<T> setEjbName(String ejbName);

   public MessageDrivenBeanType<T> removeEjbName();

   public String getEjbName();

   public MessageDrivenBeanType<T> setMappedName(String mappedName);

   public MessageDrivenBeanType<T> removeMappedName();

   public String getMappedName();

   public MessageDrivenBeanType<T> setEjbClass(String ejbClass);

   public MessageDrivenBeanType<T> removeEjbClass();

   public String getEjbClass();

   public MessageDrivenBeanType<T> setMessagingType(String messagingType);

   public MessageDrivenBeanType<T> removeMessagingType();

   public String getMessagingType();

   public MessageDrivenBeanType<T> removeTimeoutMethod();

   public NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod();

   public MessageDrivenBeanType<T> removeAllTimer();

   public TimerType<MessageDrivenBeanType<T>> timer();

   public List<TimerType<MessageDrivenBeanType<T>>> getTimerList();

   public MessageDrivenBeanType<T> setTransactionType(TransactionTypeType transactionType);

   public MessageDrivenBeanType<T> setTransactionType(String transactionType);

   public TransactionTypeType getTransactionType();

   public String getTransactionTypeAsString();

   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType);

   public MessageDrivenBeanType<T> removeMessageDestinationType();

   public String getMessageDestinationType();

   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink);

   public MessageDrivenBeanType<T> removeMessageDestinationLink();

   public String getMessageDestinationLink();

   public MessageDrivenBeanType<T> removeActivationConfig();

   public ActivationConfigType<MessageDrivenBeanType<T>> activationConfig();

   public MessageDrivenBeanType<T> removeAllAroundInvoke();

   public AroundInvokeType<MessageDrivenBeanType<T>> aroundInvoke();

   public List<AroundInvokeType<MessageDrivenBeanType<T>>> getAroundInvokeList();

   public MessageDrivenBeanType<T> removeAllAroundTimeout();

   public AroundTimeoutType<MessageDrivenBeanType<T>> aroundTimeout();

   public List<AroundTimeoutType<MessageDrivenBeanType<T>>> getAroundTimeoutList();

   public MessageDrivenBeanType<T> removeAllSecurityRoleRef();

   public SecurityRoleRefType<MessageDrivenBeanType<T>> securityRoleRef();

   public List<SecurityRoleRefType<MessageDrivenBeanType<T>>> getSecurityRoleRefList();

   public MessageDrivenBeanType<T> removeSecurityIdentity();

   public SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity();

}
