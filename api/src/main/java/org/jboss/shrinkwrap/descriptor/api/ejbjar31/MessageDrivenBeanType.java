package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface MessageDrivenBeanType<T> extends Child<T>, DescriptionGroup<T>, JndiEnvironmentRefsGroup<T>

{
   public MessageDrivenBeanType<T> setEjbName(String ejbName);

   public String getEjbName();

   public MessageDrivenBeanType<T> setMappedName(String mappedName);

   public String getMappedName();

   public MessageDrivenBeanType<T> setEjbClass(String ejbClass);

   public String getEjbClass();

   public MessageDrivenBeanType<T> setMessagingType(String messagingType);

   public String getMessagingType();

   public NamedMethodType<MessageDrivenBeanType<T>> setTimeoutMethod(NamedMethodType<T> timeoutMethod);

   public NamedMethodType<MessageDrivenBeanType<T>> getTimeoutMethod();

   public TimerType<MessageDrivenBeanType<T>> setTimer(TimerType<T> timer);

   public TimerType<MessageDrivenBeanType<T>> getTimer();

   public MessageDrivenBeanType<T> setTransactionType(TransactionTypeType transactionType);

   public TransactionTypeType getTransactionType();

   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType);

   public String getMessageDestinationType();

   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink);

   public String getMessageDestinationLink();

   public ActivationConfigType<MessageDrivenBeanType<T>> setActivationConfig(ActivationConfigType<T> activationConfig);

   public ActivationConfigType<MessageDrivenBeanType<T>> getActivationConfig();

   public AroundInvokeType<MessageDrivenBeanType<T>> setAroundInvoke(AroundInvokeType<T> aroundInvoke);

   public AroundInvokeType<MessageDrivenBeanType<T>> getAroundInvoke();

   public AroundTimeoutType<MessageDrivenBeanType<T>> setAroundTimeout(AroundTimeoutType<T> aroundTimeout);

   public AroundTimeoutType<MessageDrivenBeanType<T>> getAroundTimeout();

   public SecurityRoleRefType<MessageDrivenBeanType<T>> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);

   public SecurityRoleRefType<MessageDrivenBeanType<T>> getSecurityRoleRef();

   public SecurityIdentityType<MessageDrivenBeanType<T>> setSecurityIdentity(SecurityIdentityType<T> securityIdentity);

   public SecurityIdentityType<MessageDrivenBeanType<T>> getSecurityIdentity();
}
