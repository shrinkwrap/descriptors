package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
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

   public SessionBeanType<T> localBean();

   public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint);
   public String getServiceEndpoint();

   public SessionBeanType<T> setEjbClass(String ejbClass);
   public String getEjbClass();

   public SessionBeanType<T> setSessionType(SessionTypeType sessionType);
   public SessionTypeType getSessionType();

   public SessionBeanType<T> setStatefulTimeout(StatefulTimeoutType<T> statefulTimeout);
   public StatefulTimeoutType<T> getStatefulTimeout();

   public SessionBeanType<T> setTimeoutMethod(NamedMethodType<T> timeoutMethod);
   public NamedMethodType<T> getTimeoutMethod();

   public SessionBeanType<T> setTimer(TimerType<T> timer);
   public TimerType<T> getTimer();

   public SessionBeanType<T> setInitOnStartup(Boolean initOnStartup);
   public Boolean getInitOnStartup();

   public SessionBeanType<T> setConcurrencyManagementType(ConcurrencyManagementTypeType concurrencyManagementType);
   public ConcurrencyManagementTypeType getConcurrencyManagementType();

   public SessionBeanType<T> setConcurrentMethod(ConcurrentMethodType<T> concurrentMethod);
   public ConcurrentMethodType<T> getConcurrentMethod();

   public SessionBeanType<T> setDependsOn(DependsOnType<T> dependsOn);
   public DependsOnType<T> getDependsOn();

   public SessionBeanType<T> setInitMethod(InitMethodType<T> initMethod);
   public InitMethodType<T> getInitMethod();

   public SessionBeanType<T> setRemoveMethod(RemoveMethodType<T> removeMethod);
   public RemoveMethodType<T> getRemoveMethod();

   public SessionBeanType<T> setAsyncMethod(AsyncMethodType<T> asyncMethod);
   public AsyncMethodType<T> getAsyncMethod();

   public SessionBeanType<T> setTransactionType(TransactionTypeType transactionType);
   public TransactionTypeType getTransactionType();

   public SessionBeanType<T> setAfterBeginMethod(NamedMethodType<T> afterBeginMethod);
   public NamedMethodType<T> getAfterBeginMethod();

   public SessionBeanType<T> setBeforeCompletionMethod(NamedMethodType<T> beforeCompletionMethod);
   public NamedMethodType<T> getBeforeCompletionMethod();

   public SessionBeanType<T> setAfterCompletionMethod(NamedMethodType<T> afterCompletionMethod);
   public NamedMethodType<T> getAfterCompletionMethod();

   public SessionBeanType<T> setAroundInvoke(AroundInvokeType<T> aroundInvoke);
   public AroundInvokeType<T> getAroundInvoke();

   public SessionBeanType<T> setAroundTimeout(AroundTimeoutType<T> aroundTimeout);
   public AroundTimeoutType<T> getAroundTimeout();

   public SessionBeanType<T> setPostActivate(LifecycleCallbackType<T> postActivate);
   public LifecycleCallbackType<T> getPostActivate();

   public SessionBeanType<T> setPrePassivate(LifecycleCallbackType<T> prePassivate);
   public LifecycleCallbackType<T> getPrePassivate();

   public SessionBeanType<T> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);
   public SecurityRoleRefType<T> getSecurityRoleRef();

   public SessionBeanType<T> setSecurityIdentity(SecurityIdentityType<T> securityIdentity);
   public SecurityIdentityType<T> getSecurityIdentity();
}
