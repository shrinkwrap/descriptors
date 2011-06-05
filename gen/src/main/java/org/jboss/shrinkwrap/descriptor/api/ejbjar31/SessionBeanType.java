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
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface SessionBeanType<T> extends Child<T>
{

   public SessionBeanType<T> setDescription(String description);
   public String getDescription();

   public SessionBeanType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public SessionBeanType<T> setIcon(IconType<SessionBeanType<T>> icon);
   public IconType<SessionBeanType<T>> getIcon();


   public SessionBeanType<T> setEnvEntry(EnvEntryType<SessionBeanType<T>> envEntry);
   public EnvEntryType<SessionBeanType<T>> getEnvEntry();


   public SessionBeanType<T> setEjbRef(EjbRefType<SessionBeanType<T>> ejbRef);
   public EjbRefType<SessionBeanType<T>> getEjbRef();


   public SessionBeanType<T> setEjbLocalRef(EjbLocalRefType<SessionBeanType<T>> ejbLocalRef);
   public EjbLocalRefType<SessionBeanType<T>> getEjbLocalRef();


   public SessionBeanType<T> setResourceRef(ResourceRefType<SessionBeanType<T>> resourceRef);
   public ResourceRefType<SessionBeanType<T>> getResourceRef();


   public SessionBeanType<T> setResourceEnvRef(ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef);
   public ResourceEnvRefType<SessionBeanType<T>> getResourceEnvRef();


   public SessionBeanType<T> setMessageDestinationRef(MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef);
   public MessageDestinationRefType<SessionBeanType<T>> getMessageDestinationRef();


   public SessionBeanType<T> setPersistenceContextRef(PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef);
   public PersistenceContextRefType<SessionBeanType<T>> getPersistenceContextRef();


   public SessionBeanType<T> setPersistenceUnitRef(PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef);
   public PersistenceUnitRefType<SessionBeanType<T>> getPersistenceUnitRef();


   public SessionBeanType<T> setPostConstruct(LifecycleCallbackType<SessionBeanType<T>> postConstruct);
   public LifecycleCallbackType<SessionBeanType<T>> getPostConstruct();


   public SessionBeanType<T> setPreDestroy(LifecycleCallbackType<SessionBeanType<T>> preDestroy);
   public LifecycleCallbackType<SessionBeanType<T>> getPreDestroy();


   public SessionBeanType<T> setDataSource(DataSourceType<SessionBeanType<T>> dataSource);
   public DataSourceType<SessionBeanType<T>> getDataSource();


   public SessionBeanType<T> setServiceRef(ServiceRefType<SessionBeanType<T>> serviceRef);
   public ServiceRefType<SessionBeanType<T>> getServiceRef();


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


   public SessionBeanType<T> setLocalBean(Boolean localBean);
   public Boolean getLocalBean();


   public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint);
   public String getServiceEndpoint();


   public SessionBeanType<T> setEjbClass(String ejbClass);
   public String getEjbClass();


   public SessionBeanType<T> setSessionType(String sessionType);
   public String getSessionType();


   public SessionBeanType<T> setStatefulTimeout(StatefulTimeoutType<SessionBeanType<T>> statefulTimeout);
   public StatefulTimeoutType<SessionBeanType<T>> getStatefulTimeout();



   public SessionBeanType<T> setTimeoutMethod(NamedMethodType<SessionBeanType<T>> timeoutMethod);
   public NamedMethodType<SessionBeanType<T>> getTimeoutMethod();



   public SessionBeanType<T> setTimer(TimerType<SessionBeanType<T>> timer);
   public TimerType<SessionBeanType<T>> getTimer();



   public SessionBeanType<T> setInitOnStartup(Boolean initOnStartup);
   public Boolean getInitOnStartup();


   public SessionBeanType<T> setConcurrencyManagementType(String concurrencyManagementType);
   public String getConcurrencyManagementType();


   public SessionBeanType<T> setConcurrentMethod(ConcurrentMethodType<SessionBeanType<T>> concurrentMethod);
   public ConcurrentMethodType<SessionBeanType<T>> getConcurrentMethod();



   public SessionBeanType<T> setDependsOn(DependsOnType<SessionBeanType<T>> dependsOn);
   public DependsOnType<SessionBeanType<T>> getDependsOn();



   public SessionBeanType<T> setInitMethod(InitMethodType<SessionBeanType<T>> initMethod);
   public InitMethodType<SessionBeanType<T>> getInitMethod();



   public SessionBeanType<T> setRemoveMethod(RemoveMethodType<SessionBeanType<T>> removeMethod);
   public RemoveMethodType<SessionBeanType<T>> getRemoveMethod();



   public SessionBeanType<T> setAsyncMethod(AsyncMethodType<SessionBeanType<T>> asyncMethod);
   public AsyncMethodType<SessionBeanType<T>> getAsyncMethod();



   public SessionBeanType<T> setTransactionType(String transactionType);
   public String getTransactionType();


   public SessionBeanType<T> setAfterBeginMethod(NamedMethodType<SessionBeanType<T>> afterBeginMethod);
   public NamedMethodType<SessionBeanType<T>> getAfterBeginMethod();



   public SessionBeanType<T> setBeforeCompletionMethod(NamedMethodType<SessionBeanType<T>> beforeCompletionMethod);
   public NamedMethodType<SessionBeanType<T>> getBeforeCompletionMethod();



   public SessionBeanType<T> setAfterCompletionMethod(NamedMethodType<SessionBeanType<T>> afterCompletionMethod);
   public NamedMethodType<SessionBeanType<T>> getAfterCompletionMethod();



   public SessionBeanType<T> setAroundInvoke(AroundInvokeType<SessionBeanType<T>> aroundInvoke);
   public AroundInvokeType<SessionBeanType<T>> getAroundInvoke();



   public SessionBeanType<T> setAroundTimeout(AroundTimeoutType<SessionBeanType<T>> aroundTimeout);
   public AroundTimeoutType<SessionBeanType<T>> getAroundTimeout();



   public SessionBeanType<T> setPostActivate(LifecycleCallbackType<SessionBeanType<T>> postActivate);
   public LifecycleCallbackType<SessionBeanType<T>> getPostActivate();



   public SessionBeanType<T> setPrePassivate(LifecycleCallbackType<SessionBeanType<T>> prePassivate);
   public LifecycleCallbackType<SessionBeanType<T>> getPrePassivate();



   public SessionBeanType<T> setSecurityRoleRef(SecurityRoleRefType<SessionBeanType<T>> securityRoleRef);
   public SecurityRoleRefType<SessionBeanType<T>> getSecurityRoleRef();



   public SessionBeanType<T> setSecurityIdentity(SecurityIdentityType<SessionBeanType<T>> securityIdentity);
   public SecurityIdentityType<SessionBeanType<T>> getSecurityIdentity();

}
