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

public interface MessageDrivenBeanType<T> extends Child<T>
{
   public MessageDrivenBeanType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public MessageDrivenBeanType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<MessageDrivenBeanType<T>> icon();

   @NodeInfo(xmlName = "env-entry")
   public EnvEntryType<MessageDrivenBeanType<T>> envEntry();

   @NodeInfo(xmlName = "ejb-ref")
   public EjbRefType<MessageDrivenBeanType<T>> ejbRef();

   @NodeInfo(xmlName = "ejb-local-ref")
   public EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef();

   @NodeInfo(xmlName = "resource-ref")
   public ResourceRefType<MessageDrivenBeanType<T>> resourceRef();

   @NodeInfo(xmlName = "resource-env-ref")
   public ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef();

   @NodeInfo(xmlName = "message-destination-ref")
   public MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef();

   @NodeInfo(xmlName = "persistence-context-ref")
   public PersistenceContextRefType<MessageDrivenBeanType<T>> persistenceContextRef();

   @NodeInfo(xmlName = "persistence-unit-ref")
   public PersistenceUnitRefType<MessageDrivenBeanType<T>> persistenceUnitRef();

   @NodeInfo(xmlName = "post-construct")
   public LifecycleCallbackType<MessageDrivenBeanType<T>> postConstruct();

   @NodeInfo(xmlName = "pre-destroy")
   public LifecycleCallbackType<MessageDrivenBeanType<T>> preDestroy();

   @NodeInfo(xmlName = "data-source")
   public DataSourceType<MessageDrivenBeanType<T>> dataSource();

   @NodeInfo(xmlName = "service-ref")
   public ServiceRefType<MessageDrivenBeanType<T>> serviceRef();

   public MessageDrivenBeanType<T> setEjbName(String ejbName);

   @NodeInfo(xmlName = "ejb-name")
   public String getEjbName();

   public MessageDrivenBeanType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   public MessageDrivenBeanType<T> setEjbClass(String ejbClass);

   @NodeInfo(xmlName = "ejb-class")
   public String getEjbClass();

   public MessageDrivenBeanType<T> setMessagingType(Class<?> messagingType);

   public MessageDrivenBeanType<T> setMessagingType(String messagingType);

   @NodeInfo(xmlName = "messaging-type")
   public String getMessagingType();

   @NodeInfo(xmlName = "timeout-method")
   public NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod();

   @NodeInfo(xmlName = "timer")
   public TimerType<MessageDrivenBeanType<T>> timer();

   public MessageDrivenBeanType<T> setTransactionType(TransactionTypeType transactionType);

   public MessageDrivenBeanType<T> setTransactionType(String transactionType);

   @NodeInfo(xmlName = "transaction-type")
   public String getTransactionType();

   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType);

   @NodeInfo(xmlName = "message-destination-type")
   public String getMessageDestinationType();

   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink);

   @NodeInfo(xmlName = "message-destination-link")
   public String getMessageDestinationLink();

   @NodeInfo(xmlName = "activation-config")
   public ActivationConfigType<MessageDrivenBeanType<T>> activationConfig();

   @NodeInfo(xmlName = "around-invoke")
   public AroundInvokeType<MessageDrivenBeanType<T>> aroundInvoke();

   @NodeInfo(xmlName = "around-timeout")
   public AroundTimeoutType<MessageDrivenBeanType<T>> aroundTimeout();

   @NodeInfo(xmlName = "security-role-ref")
   public SecurityRoleRefType<MessageDrivenBeanType<T>> securityRoleRef();

   @NodeInfo(xmlName = "security-identity")
   public SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity();
}
