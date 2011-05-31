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
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface MessageDrivenBeanType<T> extends Child<T>
{
   public MessageDrivenBeanType<T> setDescription(String description);
   public String getDescription();

   public MessageDrivenBeanType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public MessageDrivenBeanType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public MessageDrivenBeanType<T> setEnvEntry(EnvEntryType<T> envEntry);
   public EnvEntryType<T> getEnvEntry();

   public MessageDrivenBeanType<T> setEjbRef(EjbRefType<T> ejbRef);
   public EjbRefType<T> getEjbRef();

   public MessageDrivenBeanType<T> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);
   public EjbLocalRefType<T> getEjbLocalRef();

   public MessageDrivenBeanType<T> setResourceRef(ResourceRefType<T> resourceRef);
   public ResourceRefType<T> getResourceRef();

   public MessageDrivenBeanType<T> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);
   public ResourceEnvRefType<T> getResourceEnvRef();

   public MessageDrivenBeanType<T> setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);
   public MessageDestinationRefType<T> getMessageDestinationRef();

   public MessageDrivenBeanType<T> setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);
   public PersistenceContextRefType<T> getPersistenceContextRef();

   public MessageDrivenBeanType<T> setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);
   public PersistenceUnitRefType<T> getPersistenceUnitRef();

   public MessageDrivenBeanType<T> setPostConstruct(LifecycleCallbackType<T> postConstruct);
   public LifecycleCallbackType<T> getPostConstruct();

   public MessageDrivenBeanType<T> setPreDestroy(LifecycleCallbackType<T> preDestroy);
   public LifecycleCallbackType<T> getPreDestroy();

   public MessageDrivenBeanType<T> setDataSource(DataSourceType<T> dataSource);
   public DataSourceType<T> getDataSource();

   public MessageDrivenBeanType<T> setServiceRef(ServiceRefType<T> serviceRef);
   public ServiceRefType<T> getServiceRef();

   public MessageDrivenBeanType<T> setEjbName(String ejbName);
   public String getEjbName();

   public MessageDrivenBeanType<T> setMappedName(String mappedName);
   public String getMappedName();

   public MessageDrivenBeanType<T> setEjbClass(String ejbClass);
   public String getEjbClass();

   public MessageDrivenBeanType<T> setMessagingType(String messagingType);
   public String getMessagingType();

   public MessageDrivenBeanType<T> setTimeoutMethod(NamedMethodType<T> timeoutMethod);
   public NamedMethodType<T> getTimeoutMethod();

   public MessageDrivenBeanType<T> setTimer(TimerType<T> timer);
   public TimerType<T> getTimer();

   public MessageDrivenBeanType<T> setTransactionType(TransactionTypeType transactionType);
   public TransactionTypeType getTransactionType();

   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType);
   public String getMessageDestinationType();

   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink);
   public String getMessageDestinationLink();

   public MessageDrivenBeanType<T> setActivationConfig(ActivationConfigType<T> activationConfig);
   public ActivationConfigType<T> getActivationConfig();

   public MessageDrivenBeanType<T> setAroundInvoke(AroundInvokeType<T> aroundInvoke);
   public AroundInvokeType<T> getAroundInvoke();

   public MessageDrivenBeanType<T> setAroundTimeout(AroundTimeoutType<T> aroundTimeout);
   public AroundTimeoutType<T> getAroundTimeout();

   public MessageDrivenBeanType<T> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);
   public SecurityRoleRefType<T> getSecurityRoleRef();

   public MessageDrivenBeanType<T> setSecurityIdentity(SecurityIdentityType<T> securityIdentity);
   public SecurityIdentityType<T> getSecurityIdentity();
}
