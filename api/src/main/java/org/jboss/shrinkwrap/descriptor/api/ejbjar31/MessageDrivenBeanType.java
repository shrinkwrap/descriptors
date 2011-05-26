package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

public interface MessageDrivenBeanType<T> extends Child<T>, DescriptionGroup<T>, JndiEnvironmentRefsGroup<T>
{
   public MessageDrivenBeanType<T> setEjbName(String ejbName);

   public String getEjbName();

   public MessageDrivenBeanType<T> setMappedName(String mappedName);

   public String getMappedName();

   public MessageDrivenBeanType<T> setEjbClazz(String ejbClass);

   public String getEjbClazz();

   public MessageDrivenBeanType<T> setMessagingType(String messagingType);

   public String getMessagingType();

   public MessageDrivenBeanType<T> setTimeoutMethod(NamedMethodType<T> timeoutMethod);

   public NamedMethodType<MessageDrivenBeanType<T>> getTimeoutMethod();

   public MessageDrivenBeanType<T> setTimer(TimerType<T> timer);

   public TimerType<MessageDrivenBeanType<T>> getTimer();

   public MessageDrivenBeanType<T> setTransactionType(String transactionType);

   public String getTransactionType();

   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType);

   public String getMessageDestinationType();

   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink);

   public String getMessageDestinationLink();

   public MessageDrivenBeanType<T> setActivationConfig(ActivationConfigType<T> activationConfig);

   public ActivationConfigType<MessageDrivenBeanType<T>> getActivationConfig();

   public MessageDrivenBeanType<T> setAroundInvoke(AroundInvokeType<T> aroundInvoke);

   public AroundInvokeType<MessageDrivenBeanType<T>> getAroundInvoke();

   public MessageDrivenBeanType<T> setAroundTimeout(AroundTimeoutType<T> aroundTimeout);

   public AroundTimeoutType<MessageDrivenBeanType<T>> getAroundTimeout();

   public MessageDrivenBeanType<T> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);

   public SecurityRoleRefType<MessageDrivenBeanType<T>> getSecurityRoleRef();

   public MessageDrivenBeanType<T> setSecurityIdentity(SecurityIdentityType<T> securityIdentity);

   public SecurityIdentityType<MessageDrivenBeanType<T>> getSecurityIdentity();
}
