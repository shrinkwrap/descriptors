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

public interface SessionBeanType<T> extends Child<T>
{
   public SessionBeanType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public SessionBeanType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<SessionBeanType<T>> icon();

   @NodeInfo(xmlName = "env-entry")
   public EnvEntryType<SessionBeanType<T>> envEntry();

   @NodeInfo(xmlName = "ejb-ref")
   public EjbRefType<SessionBeanType<T>> ejbRef();

   @NodeInfo(xmlName = "ejb-local-ref")
   public EjbLocalRefType<SessionBeanType<T>> ejbLocalRef();

   @NodeInfo(xmlName = "resource-ref")
   public ResourceRefType<SessionBeanType<T>> resourceRef();

   @NodeInfo(xmlName = "resource-env-ref")
   public ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef();

   @NodeInfo(xmlName = "message-destination-ref")
   public MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef();

   @NodeInfo(xmlName = "persistence-context-ref")
   public PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef();

   @NodeInfo(xmlName = "persistence-unit-ref")
   public PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef();

   @NodeInfo(xmlName = "post-construct")
   public LifecycleCallbackType<SessionBeanType<T>> postConstruct();

   @NodeInfo(xmlName = "pre-destroy")
   public LifecycleCallbackType<SessionBeanType<T>> preDestroy();

   @NodeInfo(xmlName = "data-source")
   public DataSourceType<SessionBeanType<T>> dataSource();

   @NodeInfo(xmlName = "service-ref")
   public ServiceRefType<SessionBeanType<T>> serviceRef();

   public SessionBeanType<T> setEjbName(String ejbName);

   @NodeInfo(xmlName = "ejb-name")
   public String getEjbName();

   public SessionBeanType<T> setMappedName(String mappedName);

   @NodeInfo(xmlName = "mapped-name")
   public String getMappedName();

   public SessionBeanType<T> setHome(String home);

   @NodeInfo(xmlName = "home")
   public String getHome();

   public SessionBeanType<T> setRemote(String remote);

   @NodeInfo(xmlName = "remote")
   public String getRemote();

   public SessionBeanType<T> setLocalHome(String localHome);

   @NodeInfo(xmlName = "local-home")
   public String getLocalHome();

   public SessionBeanType<T> setLocal(String local);

   @NodeInfo(xmlName = "local")
   public String getLocal();

   public SessionBeanType<T> setBusinessLocal(Class<?> businessLocal);

   public SessionBeanType<T> setBusinessLocal(String businessLocal);

   @NodeInfo(xmlName = "business-local")
   public String getBusinessLocal();

   public SessionBeanType<T> setBusinessRemote(Class<?> businessRemote);

   public SessionBeanType<T> setBusinessRemote(String businessRemote);

   @NodeInfo(xmlName = "business-remote")
   public String getBusinessRemote();

   @NodeInfo(xmlName = "local-bean")
   public SessionBeanType<T> localBean();

   public SessionBeanType<T> setServiceEndpoint(Class<?> serviceEndpoint);

   public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint);

   @NodeInfo(xmlName = "service-endpoint")
   public String getServiceEndpoint();

   public SessionBeanType<T> setEjbClass(String ejbClass);

   @NodeInfo(xmlName = "ejb-class")
   public String getEjbClass();

   public SessionBeanType<T> setSessionType(SessionTypeType sessionType);

   public SessionBeanType<T> setSessionType(String sessionType);

   @NodeInfo(xmlName = "session-type")
   public String getSessionType();

   @NodeInfo(xmlName = "stateful-timeout")
   public StatefulTimeoutType<SessionBeanType<T>> statefulTimeout();

   @NodeInfo(xmlName = "timeout-method")
   public NamedMethodType<SessionBeanType<T>> timeoutMethod();

   @NodeInfo(xmlName = "timer")
   public TimerType<SessionBeanType<T>> timer();

   public SessionBeanType<T> setInitOnStartup(Boolean initOnStartup);

   @NodeInfo(xmlName = "init-on-startup")
   public Boolean getInitOnStartup();

   public SessionBeanType<T> setConcurrencyManagementType(ConcurrencyManagementTypeType concurrencyManagementType);

   public SessionBeanType<T> setConcurrencyManagementType(String concurrencyManagementType);

   @NodeInfo(xmlName = "concurrency-management-type")
   public String getConcurrencyManagementType();

   @NodeInfo(xmlName = "concurrent-method")
   public ConcurrentMethodType<SessionBeanType<T>> concurrentMethod();

   @NodeInfo(xmlName = "depends-on")
   public DependsOnType<SessionBeanType<T>> dependsOn();

   @NodeInfo(xmlName = "init-method")
   public InitMethodType<SessionBeanType<T>> initMethod();

   @NodeInfo(xmlName = "remove-method")
   public RemoveMethodType<SessionBeanType<T>> removeMethod();

   @NodeInfo(xmlName = "async-method")
   public AsyncMethodType<SessionBeanType<T>> asyncMethod();

   public SessionBeanType<T> setTransactionType(TransactionTypeType transactionType);

   public SessionBeanType<T> setTransactionType(String transactionType);

   @NodeInfo(xmlName = "transaction-type")
   public String getTransactionType();

   @NodeInfo(xmlName = "after-begin-method")
   public NamedMethodType<SessionBeanType<T>> afterBeginMethod();

   @NodeInfo(xmlName = "before-completion-method")
   public NamedMethodType<SessionBeanType<T>> beforeCompletionMethod();

   @NodeInfo(xmlName = "after-completion-method")
   public NamedMethodType<SessionBeanType<T>> afterCompletionMethod();

   @NodeInfo(xmlName = "around-invoke")
   public AroundInvokeType<SessionBeanType<T>> aroundInvoke();

   @NodeInfo(xmlName = "around-timeout")
   public AroundTimeoutType<SessionBeanType<T>> aroundTimeout();

   @NodeInfo(xmlName = "post-activate")
   public LifecycleCallbackType<SessionBeanType<T>> postActivate();

   @NodeInfo(xmlName = "pre-passivate")
   public LifecycleCallbackType<SessionBeanType<T>> prePassivate();

   @NodeInfo(xmlName = "security-role-ref")
   public SecurityRoleRefType<SessionBeanType<T>> securityRoleRef();

   @NodeInfo(xmlName = "security-identity")
   public SecurityIdentityType<SessionBeanType<T>> securityIdentity();
}
