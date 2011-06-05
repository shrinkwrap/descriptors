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
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface MessageDrivenBeanType<T> extends Child<T>
{

   public MessageDrivenBeanType<T> setDescription(String description);
   public String getDescription();

   public MessageDrivenBeanType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public MessageDrivenBeanType<T> setIcon(IconType<MessageDrivenBeanType<T>> icon);
   public IconType<MessageDrivenBeanType<T>> getIcon();


   public MessageDrivenBeanType<T> setEnvEntry(EnvEntryType<MessageDrivenBeanType<T>> envEntry);
   public EnvEntryType<MessageDrivenBeanType<T>> getEnvEntry();


   public MessageDrivenBeanType<T> setEjbRef(EjbRefType<MessageDrivenBeanType<T>> ejbRef);
   public EjbRefType<MessageDrivenBeanType<T>> getEjbRef();


   public MessageDrivenBeanType<T> setEjbLocalRef(EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef);
   public EjbLocalRefType<MessageDrivenBeanType<T>> getEjbLocalRef();


   public MessageDrivenBeanType<T> setResourceRef(ResourceRefType<MessageDrivenBeanType<T>> resourceRef);
   public ResourceRefType<MessageDrivenBeanType<T>> getResourceRef();


   public MessageDrivenBeanType<T> setResourceEnvRef(ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef);
   public ResourceEnvRefType<MessageDrivenBeanType<T>> getResourceEnvRef();


   public MessageDrivenBeanType<T> setMessageDestinationRef(MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef);
   public MessageDestinationRefType<MessageDrivenBeanType<T>> getMessageDestinationRef();


   public MessageDrivenBeanType<T> setPersistenceContextRef(PersistenceContextRefType<MessageDrivenBeanType<T>> persistenceContextRef);
   public PersistenceContextRefType<MessageDrivenBeanType<T>> getPersistenceContextRef();


   public MessageDrivenBeanType<T> setPersistenceUnitRef(PersistenceUnitRefType<MessageDrivenBeanType<T>> persistenceUnitRef);
   public PersistenceUnitRefType<MessageDrivenBeanType<T>> getPersistenceUnitRef();


   public MessageDrivenBeanType<T> setPostConstruct(LifecycleCallbackType<MessageDrivenBeanType<T>> postConstruct);
   public LifecycleCallbackType<MessageDrivenBeanType<T>> getPostConstruct();


   public MessageDrivenBeanType<T> setPreDestroy(LifecycleCallbackType<MessageDrivenBeanType<T>> preDestroy);
   public LifecycleCallbackType<MessageDrivenBeanType<T>> getPreDestroy();


   public MessageDrivenBeanType<T> setDataSource(DataSourceType<MessageDrivenBeanType<T>> dataSource);
   public DataSourceType<MessageDrivenBeanType<T>> getDataSource();


   public MessageDrivenBeanType<T> setServiceRef(ServiceRefType<MessageDrivenBeanType<T>> serviceRef);
   public ServiceRefType<MessageDrivenBeanType<T>> getServiceRef();


   public MessageDrivenBeanType<T> setEjbName(String ejbName);
   public String getEjbName();


   public MessageDrivenBeanType<T> setMappedName(String mappedName);
   public String getMappedName();


   public MessageDrivenBeanType<T> setEjbClass(String ejbClass);
   public String getEjbClass();


   public MessageDrivenBeanType<T> setMessagingType(String messagingType);
   public String getMessagingType();


   public MessageDrivenBeanType<T> setTimeoutMethod(NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod);
   public NamedMethodType<MessageDrivenBeanType<T>> getTimeoutMethod();



   public MessageDrivenBeanType<T> setTimer(TimerType<MessageDrivenBeanType<T>> timer);
   public TimerType<MessageDrivenBeanType<T>> getTimer();



   public MessageDrivenBeanType<T> setTransactionType(String transactionType);
   public String getTransactionType();


   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType);
   public String getMessageDestinationType();


   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink);
   public String getMessageDestinationLink();


   public MessageDrivenBeanType<T> setActivationConfig(ActivationConfigType<MessageDrivenBeanType<T>> activationConfig);
   public ActivationConfigType<MessageDrivenBeanType<T>> getActivationConfig();



   public MessageDrivenBeanType<T> setAroundInvoke(AroundInvokeType<MessageDrivenBeanType<T>> aroundInvoke);
   public AroundInvokeType<MessageDrivenBeanType<T>> getAroundInvoke();



   public MessageDrivenBeanType<T> setAroundTimeout(AroundTimeoutType<MessageDrivenBeanType<T>> aroundTimeout);
   public AroundTimeoutType<MessageDrivenBeanType<T>> getAroundTimeout();



   public MessageDrivenBeanType<T> setSecurityRoleRef(SecurityRoleRefType<MessageDrivenBeanType<T>> securityRoleRef);
   public SecurityRoleRefType<MessageDrivenBeanType<T>> getSecurityRoleRef();



   public MessageDrivenBeanType<T> setSecurityIdentity(SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity);
   public SecurityIdentityType<MessageDrivenBeanType<T>> getSecurityIdentity();

}
