package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The session-beanType declares an session bean. The
 * declaration consists of:
 *
 * - an optional description
 * - an optional display name
 * - an optional icon element that contains a small and a large
 * icon file name
 * - a name assigned to the enterprise bean
 * in the deployment description
 * - an optional mapped-name element that can be used to provide
 * vendor-specific deployment information such as the physical
 * jndi-name of the session bean's remote home/business interface.
 * This element is not required to be supported by all
 * implementations. Any use of this element is non-portable.
 * - the names of all the remote or local business interfaces,
 * if any
 * - the names of the session bean's remote home and
 * remote interfaces, if any
 * - the names of the session bean's local home and
 * local interfaces, if any
 * - an optional declaration that this bean exposes a
 * no-interface view
 * - the name of the session bean's web service endpoint
 * interface, if any
 * - the session bean's implementation class
 * - the session bean's state management type
 * - an optional declaration of a stateful session bean's timeout value
 * - an optional declaration of the session bean's timeout method for
 * handling programmatically created timers
 * - an optional declaration of timers to be automatically created at
 * deployment time
 * - an optional declaration that a Singleton bean has eager
 * initialization
 * - an optional declaration of a Singleton/Stateful bean's concurrency
 * management type
 * - an optional declaration of the method locking metadata
 * for a Singleton with container managed concurrency
 * - an optional declaration of the other Singleton beans in the
 * application that must be initialized before this bean
 * - an optional declaration of the session bean's asynchronous
 * methods
 * - the optional session bean's transaction management type.
 * If it is not present, it is defaulted to Container.
 * - an optional declaration of a stateful session bean's
 * afterBegin, beforeCompletion, and/or afterCompletion methods
 * - an optional list of the session bean class and/or
 * superclass around-invoke methods.
 * - an optional list of the session bean class and/or
 * superclass around-timeout methods.
 * - an optional declaration of the bean's
 * environment entries
 * - an optional declaration of the bean's EJB references
 * - an optional declaration of the bean's local
 * EJB references
 * - an optional declaration of the bean's web
 * service references
 * - an optional declaration of the security role
 * references
 * - an optional declaration of the security identity
 * to be used for the execution of the bean's methods
 * - an optional declaration of the bean's resource
 * manager connection factory references
 * - an optional declaration of the bean's resource
 * environment references.
 * - an optional declaration of the bean's message
 * destination references
 *
 * The elements that are optional are "optional" in the sense
 * that they are omitted when if lists represented by them are
 * empty.
 *
 * The service-endpoint element may only be specified if the
 * bean is a stateless session bean.
 *
 *
 *
 */
public interface SessionBeanType<T> extends Child<T>
{

   public SessionBeanType<T> setDescription(String description);
   public SessionBeanType<T> setDescriptionList(String ... values);
   public SessionBeanType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public SessionBeanType<T> setDisplayName(String displayName);
   public SessionBeanType<T> setDisplayNameList(String ... values);
   public SessionBeanType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();


   public SessionBeanType<T> removeAllIcon();

   public IconType<SessionBeanType<T>> icon();
   public List<IconType<SessionBeanType<T>>> getIconList();



   public SessionBeanType<T> removeAllEnvEntry();

   public EnvEntryType<SessionBeanType<T>> envEntry();
   public List<EnvEntryType<SessionBeanType<T>>> getEnvEntryList();



   public SessionBeanType<T> removeAllEjbRef();

   public EjbRefType<SessionBeanType<T>> ejbRef();
   public List<EjbRefType<SessionBeanType<T>>> getEjbRefList();



   public SessionBeanType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<SessionBeanType<T>> ejbLocalRef();
   public List<EjbLocalRefType<SessionBeanType<T>>> getEjbLocalRefList();



   public SessionBeanType<T> removeAllResourceRef();

   public ResourceRefType<SessionBeanType<T>> resourceRef();
   public List<ResourceRefType<SessionBeanType<T>>> getResourceRefList();



   public SessionBeanType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef();
   public List<ResourceEnvRefType<SessionBeanType<T>>> getResourceEnvRefList();



   public SessionBeanType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef();
   public List<MessageDestinationRefType<SessionBeanType<T>>> getMessageDestinationRefList();



   public SessionBeanType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef();
   public List<PersistenceContextRefType<SessionBeanType<T>>> getPersistenceContextRefList();



   public SessionBeanType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef();
   public List<PersistenceUnitRefType<SessionBeanType<T>>> getPersistenceUnitRefList();



   public SessionBeanType<T> removeAllPostConstruct();

   public LifecycleCallbackType<SessionBeanType<T>> postConstruct();
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPostConstructList();



   public SessionBeanType<T> removeAllPreDestroy();

   public LifecycleCallbackType<SessionBeanType<T>> preDestroy();
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPreDestroyList();



   public SessionBeanType<T> removeAllDataSource();

   public DataSourceType<SessionBeanType<T>> dataSource();
   public List<DataSourceType<SessionBeanType<T>>> getDataSourceList();



   public SessionBeanType<T> setEjbName(String ejbName);
   public SessionBeanType<T> removeEjbName();

   public String getEjbName();



   public SessionBeanType<T> setMappedName(String mappedName);
   public SessionBeanType<T> removeMappedName();

   public String getMappedName();



   public SessionBeanType<T> setHome(String home);
   public SessionBeanType<T> removeHome();

   public String getHome();



   public SessionBeanType<T> setRemote(String remote);
   public SessionBeanType<T> removeRemote();

   public String getRemote();



   public SessionBeanType<T> setLocalHome(String localHome);
   public SessionBeanType<T> removeLocalHome();

   public String getLocalHome();



   public SessionBeanType<T> setLocal(String local);
   public SessionBeanType<T> removeLocal();

   public String getLocal();



   public SessionBeanType<T> setBusinessLocal(String businessLocal);
   public SessionBeanType<T> setBusinessLocalList(String ... values);
   public SessionBeanType<T> removeAllBusinessLocal();

   public List<String> getBusinessLocalList();



   public SessionBeanType<T> setBusinessRemote(String businessRemote);
   public SessionBeanType<T> setBusinessRemoteList(String ... values);
   public SessionBeanType<T> removeAllBusinessRemote();

   public List<String> getBusinessRemoteList();


   public SessionBeanType<T> localBean();
   public Boolean isLocalBean();


   public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint);
   public SessionBeanType<T> removeServiceEndpoint();

   public String getServiceEndpoint();



   public SessionBeanType<T> setEjbClass(String ejbClass);
   public SessionBeanType<T> removeEjbClass();

   public String getEjbClass();



   public SessionBeanType<T> setSessionType(SessionTypeType sessionType);
   public SessionBeanType<T> setSessionType(String sessionType);

   public SessionTypeType getSessionType();
   public String  getSessionTypeAsString();



   public SessionBeanType<T> removeStatefulTimeout();

   public StatefulTimeoutType<SessionBeanType<T>> statefulTimeout();




   public SessionBeanType<T> removeTimeoutMethod();

   public NamedMethodType<SessionBeanType<T>> timeoutMethod();




   public SessionBeanType<T> removeAllTimer();

   public TimerType<SessionBeanType<T>> timer();
   public List<TimerType<SessionBeanType<T>>> getTimerList();




   public SessionBeanType<T> setInitOnStartup(Boolean initOnStartup);
   public SessionBeanType<T> removeInitOnStartup();

   public Boolean isInitOnStartup();



   public SessionBeanType<T> setConcurrencyManagementType(ConcurrencyManagementTypeType concurrencyManagementType);
   public SessionBeanType<T> setConcurrencyManagementType(String concurrencyManagementType);

   public ConcurrencyManagementTypeType getConcurrencyManagementType();
   public String  getConcurrencyManagementTypeAsString();



   public SessionBeanType<T> removeAllConcurrentMethod();

   public ConcurrentMethodType<SessionBeanType<T>> concurrentMethod();
   public List<ConcurrentMethodType<SessionBeanType<T>>> getConcurrentMethodList();




   public SessionBeanType<T> removeDependsOn();

   public DependsOnType<SessionBeanType<T>> dependsOn();




   public SessionBeanType<T> removeAllInitMethod();

   public InitMethodType<SessionBeanType<T>> initMethod();
   public List<InitMethodType<SessionBeanType<T>>> getInitMethodList();




   public SessionBeanType<T> removeAllRemoveMethod();

   public RemoveMethodType<SessionBeanType<T>> removeMethod();
   public List<RemoveMethodType<SessionBeanType<T>>> getRemoveMethodList();




   public SessionBeanType<T> removeAllAsyncMethod();

   public AsyncMethodType<SessionBeanType<T>> asyncMethod();
   public List<AsyncMethodType<SessionBeanType<T>>> getAsyncMethodList();




   public SessionBeanType<T> setTransactionType(TransactionTypeType transactionType);
   public SessionBeanType<T> setTransactionType(String transactionType);

   public TransactionTypeType getTransactionType();
   public String  getTransactionTypeAsString();



   public SessionBeanType<T> removeAfterBeginMethod();

   public NamedMethodType<SessionBeanType<T>> afterBeginMethod();




   public SessionBeanType<T> removeBeforeCompletionMethod();

   public NamedMethodType<SessionBeanType<T>> beforeCompletionMethod();




   public SessionBeanType<T> removeAfterCompletionMethod();

   public NamedMethodType<SessionBeanType<T>> afterCompletionMethod();




   public SessionBeanType<T> removeAllAroundInvoke();

   public AroundInvokeType<SessionBeanType<T>> aroundInvoke();
   public List<AroundInvokeType<SessionBeanType<T>>> getAroundInvokeList();




   public SessionBeanType<T> removeAllAroundTimeout();

   public AroundTimeoutType<SessionBeanType<T>> aroundTimeout();
   public List<AroundTimeoutType<SessionBeanType<T>>> getAroundTimeoutList();




   public SessionBeanType<T> removeAllPostActivate();

   public LifecycleCallbackType<SessionBeanType<T>> postActivate();
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPostActivateList();




   public SessionBeanType<T> removeAllPrePassivate();

   public LifecycleCallbackType<SessionBeanType<T>> prePassivate();
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPrePassivateList();




   public SessionBeanType<T> removeAllSecurityRoleRef();

   public SecurityRoleRefType<SessionBeanType<T>> securityRoleRef();
   public List<SecurityRoleRefType<SessionBeanType<T>>> getSecurityRoleRefList();




   public SessionBeanType<T> removeSecurityIdentity();

   public SecurityIdentityType<SessionBeanType<T>> securityIdentity();


}
