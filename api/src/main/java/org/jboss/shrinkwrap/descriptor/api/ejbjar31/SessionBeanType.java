package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface SessionBeanType<T> extends Child<T>, DescriptionGroup<T>, JndiEnvironmentRefsGroup<T>

{
   public SessionBeanType<T> setEjbName(String ejbName);

   public String getEjbName();

   public SessionBeanType<T> setMappedName(String mappedName);

   public String getMappedName();

   public SessionBeanType<T> setHome(String home);

   public String getHome();

   public SessionBeanType<T> setRemote(String remote);

   public String getRemote();

   public SessionBeanType<T> setLocalHome(String localHome);

   public String getLocalHome();

   public SessionBeanType<T> setLocal(String local);

   public String getLocal();

   public SessionBeanType<T> setBusinessLocal(String businessLocal);

   public String getBusinessLocal();

   public SessionBeanType<T> setBusinessRemote(String businessRemote);

   public String getBusinessRemote();

   public void localBean();

   public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint);

   public String getServiceEndpoint();

   public SessionBeanType<T> setEjbClass(String ejbClass);

   public String getEjbClass();

   public SessionBeanType<T> setSessionType(SessionTypeType sessionType);

   public SessionTypeType getSessionType();

   public StatefulTimeoutType<SessionBeanType<T>> setStatefulTimeout(StatefulTimeoutType<T> statefulTimeout);

   public StatefulTimeoutType<SessionBeanType<T>> getStatefulTimeout();

   public NamedMethodType<SessionBeanType<T>> setTimeoutMethod(NamedMethodType<T> timeoutMethod);

   public NamedMethodType<SessionBeanType<T>> getTimeoutMethod();

   public TimerType<SessionBeanType<T>> setTimer(TimerType<T> timer);

   public TimerType<SessionBeanType<T>> getTimer();

   public SessionBeanType<T> setInitOnStartup(Boolean initOnStartup);

   public Boolean getInitOnStartup();

   public SessionBeanType<T> setConcurrencyManagementType(ConcurrencyManagementTypeType concurrencyManagementType);

   public ConcurrencyManagementTypeType getConcurrencyManagementType();

   public ConcurrentMethodType<SessionBeanType<T>> setConcurrentMethod(ConcurrentMethodType<T> concurrentMethod);

   public ConcurrentMethodType<SessionBeanType<T>> getConcurrentMethod();

   public DependsOnType<SessionBeanType<T>> setDependsOn(DependsOnType<T> dependsOn);

   public DependsOnType<SessionBeanType<T>> getDependsOn();

   public InitMethodType<SessionBeanType<T>> setInitMethod(InitMethodType<T> initMethod);

   public InitMethodType<SessionBeanType<T>> getInitMethod();

   public RemoveMethodType<SessionBeanType<T>> setRemoveMethod(RemoveMethodType<T> removeMethod);

   public RemoveMethodType<SessionBeanType<T>> getRemoveMethod();

   public AsyncMethodType<SessionBeanType<T>> setAsyncMethod(AsyncMethodType<T> asyncMethod);

   public AsyncMethodType<SessionBeanType<T>> getAsyncMethod();

   public SessionBeanType<T> setTransactionType(TransactionTypeType transactionType);

   public TransactionTypeType getTransactionType();

   public NamedMethodType<SessionBeanType<T>> setAfterBeginMethod(NamedMethodType<T> afterBeginMethod);

   public NamedMethodType<SessionBeanType<T>> getAfterBeginMethod();

   public NamedMethodType<SessionBeanType<T>> setBeforeCompletionMethod(NamedMethodType<T> beforeCompletionMethod);

   public NamedMethodType<SessionBeanType<T>> getBeforeCompletionMethod();

   public NamedMethodType<SessionBeanType<T>> setAfterCompletionMethod(NamedMethodType<T> afterCompletionMethod);

   public NamedMethodType<SessionBeanType<T>> getAfterCompletionMethod();

   public AroundInvokeType<SessionBeanType<T>> setAroundInvoke(AroundInvokeType<T> aroundInvoke);

   public AroundInvokeType<SessionBeanType<T>> getAroundInvoke();

   public AroundTimeoutType<SessionBeanType<T>> setAroundTimeout(AroundTimeoutType<T> aroundTimeout);

   public AroundTimeoutType<SessionBeanType<T>> getAroundTimeout();

   public LifecycleCallbackType<SessionBeanType<T>> setPostActivate(LifecycleCallbackType<T> postActivate);

   public LifecycleCallbackType<SessionBeanType<T>> getPostActivate();

   public LifecycleCallbackType<SessionBeanType<T>> setPrePassivate(LifecycleCallbackType<T> prePassivate);

   public LifecycleCallbackType<SessionBeanType<T>> getPrePassivate();

   public SecurityRoleRefType<SessionBeanType<T>> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);

   public SecurityRoleRefType<SessionBeanType<T>> getSecurityRoleRef();

   public SecurityIdentityType<SessionBeanType<T>> setSecurityIdentity(SecurityIdentityType<T> securityIdentity);

   public SecurityIdentityType<SessionBeanType<T>> getSecurityIdentity();
}
