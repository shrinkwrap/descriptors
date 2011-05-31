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
public interface SessionBeanType<T> extends Child<T>
{
   public SessionBeanType<T> setDescription(String description);
   public String getDescription();

   public SessionBeanType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public SessionBeanType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public SessionBeanType<T> setEnvEntry(EnvEntryType<T> envEntry);
   public EnvEntryType<T> getEnvEntry();

   public SessionBeanType<T> setEjbRef(EjbRefType<T> ejbRef);
   public EjbRefType<T> getEjbRef();

   public SessionBeanType<T> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);
   public EjbLocalRefType<T> getEjbLocalRef();

   public SessionBeanType<T> setResourceRef(ResourceRefType<T> resourceRef);
   public ResourceRefType<T> getResourceRef();

   public SessionBeanType<T> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);
   public ResourceEnvRefType<T> getResourceEnvRef();

   public SessionBeanType<T> setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);
   public MessageDestinationRefType<T> getMessageDestinationRef();

   public SessionBeanType<T> setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);
   public PersistenceContextRefType<T> getPersistenceContextRef();

   public SessionBeanType<T> setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);
   public PersistenceUnitRefType<T> getPersistenceUnitRef();

   public SessionBeanType<T> setPostConstruct(LifecycleCallbackType<T> postConstruct);
   public LifecycleCallbackType<T> getPostConstruct();

   public SessionBeanType<T> setPreDestroy(LifecycleCallbackType<T> preDestroy);
   public LifecycleCallbackType<T> getPreDestroy();

   public SessionBeanType<T> setDataSource(DataSourceType<T> dataSource);
   public DataSourceType<T> getDataSource();

   public SessionBeanType<T> setServiceRef(ServiceRefType<T> serviceRef);
   public ServiceRefType<T> getServiceRef();

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
