package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AsyncMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrentMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.DependsOnType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InitMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RemoveMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.StatefulTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
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
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class SessionBeanTypeImpl<T> implements Child<T>, SessionBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String ejbName;
   private String mappedName;
   private String home;
   private String remote;
   private String localHome;
   private String local;
   private String businessLocal;
   private String businessRemote;
   private Boolean localBean;
   private String serviceEndpoint;
   private String ejbClass;
   private String sessionType;
   private StatefulTimeoutType<SessionBeanType<T>> statefulTimeout;
   private NamedMethodType<SessionBeanType<T>> timeoutMethod;
   private TimerType<SessionBeanType<T>> timer;
   private Boolean initOnStartup;
   private String concurrencyManagementType;
   private ConcurrentMethodType<SessionBeanType<T>> concurrentMethod;
   private DependsOnType<SessionBeanType<T>> dependsOn;
   private InitMethodType<SessionBeanType<T>> initMethod;
   private RemoveMethodType<SessionBeanType<T>> removeMethod;
   private AsyncMethodType<SessionBeanType<T>> asyncMethod;
   private String transactionType;
   private NamedMethodType<SessionBeanType<T>> afterBeginMethod;
   private NamedMethodType<SessionBeanType<T>> beforeCompletionMethod;
   private NamedMethodType<SessionBeanType<T>> afterCompletionMethod;
   private AroundInvokeType<SessionBeanType<T>> aroundInvoke;
   private AroundTimeoutType<SessionBeanType<T>> aroundTimeout;
   private LifecycleCallbackType<SessionBeanType<T>> postActivate;
   private LifecycleCallbackType<SessionBeanType<T>> prePassivate;
   private SecurityRoleRefType<SessionBeanType<T>> securityRoleRef;
   private SecurityIdentityType<SessionBeanType<T>> securityIdentity;

   private String description;
   private String displayName;
   private IconType<SessionBeanType<T>> icon;
   private EnvEntryType<SessionBeanType<T>> envEntry;
   private EjbRefType<SessionBeanType<T>> ejbRef;
   private EjbLocalRefType<SessionBeanType<T>> ejbLocalRef;
   private ResourceRefType<SessionBeanType<T>> resourceRef;
   private ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef;
   private MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef;
   private PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef;
   private PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef;
   private LifecycleCallbackType<SessionBeanType<T>> postConstruct;
   private LifecycleCallbackType<SessionBeanType<T>> preDestroy;
   private DataSourceType<SessionBeanType<T>> dataSource;
   private ServiceRefType<SessionBeanType<T>> serviceRef;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SessionBeanTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("session");   }


   public T up()
   {
      return t;
   }



   public SessionBeanType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public SessionBeanType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public SessionBeanType<T> setIcon(IconType<SessionBeanType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<SessionBeanType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return icon;
   }



   public SessionBeanType<T> setEnvEntry(EnvEntryType<SessionBeanType<T>> envEntry)
   {
      this.envEntry = envEntry;
      childNode.getOrCreate("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<SessionBeanType<T>> getEnvEntry()
   {
      if( envEntry == null)
      {
          envEntry = new EnvEntryTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return envEntry;
   }



   public SessionBeanType<T> setEjbRef(EjbRefType<SessionBeanType<T>> ejbRef)
   {
      this.ejbRef = ejbRef;
      childNode.getOrCreate("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<SessionBeanType<T>> getEjbRef()
   {
      if( ejbRef == null)
      {
          ejbRef = new EjbRefTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return ejbRef;
   }



   public SessionBeanType<T> setEjbLocalRef(EjbLocalRefType<SessionBeanType<T>> ejbLocalRef)
   {
      this.ejbLocalRef = ejbLocalRef;
      childNode.getOrCreate("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<SessionBeanType<T>> getEjbLocalRef()
   {
      if( ejbLocalRef == null)
      {
          ejbLocalRef = new EjbLocalRefTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return ejbLocalRef;
   }



   public SessionBeanType<T> setResourceRef(ResourceRefType<SessionBeanType<T>> resourceRef)
   {
      this.resourceRef = resourceRef;
      childNode.getOrCreate("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<SessionBeanType<T>> getResourceRef()
   {
      if( resourceRef == null)
      {
          resourceRef = new ResourceRefTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return resourceRef;
   }



   public SessionBeanType<T> setResourceEnvRef(ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef)
   {
      this.resourceEnvRef = resourceEnvRef;
      childNode.getOrCreate("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<SessionBeanType<T>> getResourceEnvRef()
   {
      if( resourceEnvRef == null)
      {
          resourceEnvRef = new ResourceEnvRefTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return resourceEnvRef;
   }



   public SessionBeanType<T> setMessageDestinationRef(MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef)
   {
      this.messageDestinationRef = messageDestinationRef;
      childNode.getOrCreate("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<SessionBeanType<T>> getMessageDestinationRef()
   {
      if( messageDestinationRef == null)
      {
          messageDestinationRef = new MessageDestinationRefTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return messageDestinationRef;
   }



   public SessionBeanType<T> setPersistenceContextRef(PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef)
   {
      this.persistenceContextRef = persistenceContextRef;
      childNode.getOrCreate("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<SessionBeanType<T>> getPersistenceContextRef()
   {
      if( persistenceContextRef == null)
      {
          persistenceContextRef = new PersistenceContextRefTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return persistenceContextRef;
   }



   public SessionBeanType<T> setPersistenceUnitRef(PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef)
   {
      this.persistenceUnitRef = persistenceUnitRef;
      childNode.getOrCreate("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<SessionBeanType<T>> getPersistenceUnitRef()
   {
      if( persistenceUnitRef == null)
      {
          persistenceUnitRef = new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return persistenceUnitRef;
   }



   public SessionBeanType<T> setPostConstruct(LifecycleCallbackType<SessionBeanType<T>> postConstruct)
   {
      this.postConstruct = postConstruct;
      childNode.getOrCreate("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<SessionBeanType<T>> getPostConstruct()
   {
      if( postConstruct == null)
      {
          postConstruct = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return postConstruct;
   }



   public SessionBeanType<T> setPreDestroy(LifecycleCallbackType<SessionBeanType<T>> preDestroy)
   {
      this.preDestroy = preDestroy;
      childNode.getOrCreate("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<SessionBeanType<T>> getPreDestroy()
   {
      if( preDestroy == null)
      {
          preDestroy = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return preDestroy;
   }



   public SessionBeanType<T> setDataSource(DataSourceType<SessionBeanType<T>> dataSource)
   {
      this.dataSource = dataSource;
      childNode.getOrCreate("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<SessionBeanType<T>> getDataSource()
   {
      if( dataSource == null)
      {
          dataSource = new DataSourceTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return dataSource;
   }



   public SessionBeanType<T> setServiceRef(ServiceRefType<SessionBeanType<T>> serviceRef)
   {
      this.serviceRef = serviceRef;
      childNode.getOrCreate("service-ref").text(serviceRef);
      return this;
   }

   public ServiceRefType<SessionBeanType<T>> getServiceRef()
   {
      if( serviceRef == null)
      {
          serviceRef = new ServiceRefTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return serviceRef;
   }



   public SessionBeanType<T> setEjbName(String ejbName)
   {
      this.ejbName = ejbName;
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public String getEjbName()
   {
      return ejbName;
   }



   public SessionBeanType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }



   public SessionBeanType<T> setHome(String home)
   {
      this.home = home;
      childNode.getOrCreate("home").text(home);
      return this;
   }

   public String getHome()
   {
      return home;
   }



   public SessionBeanType<T> setRemote(String remote)
   {
      this.remote = remote;
      childNode.getOrCreate("remote").text(remote);
      return this;
   }

   public String getRemote()
   {
      return remote;
   }



   public SessionBeanType<T> setLocalHome(String localHome)
   {
      this.localHome = localHome;
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   public String getLocalHome()
   {
      return localHome;
   }



   public SessionBeanType<T> setLocal(String local)
   {
      this.local = local;
      childNode.getOrCreate("local").text(local);
      return this;
   }

   public String getLocal()
   {
      return local;
   }



   public SessionBeanType<T> setBusinessLocal(String businessLocal)
   {
      this.businessLocal = businessLocal;
      childNode.getOrCreate("business-local").text(businessLocal);
      return this;
   }

   public String getBusinessLocal()
   {
      return businessLocal;
   }



   public SessionBeanType<T> setBusinessRemote(String businessRemote)
   {
      this.businessRemote = businessRemote;
      childNode.getOrCreate("business-remote").text(businessRemote);
      return this;
   }

   public String getBusinessRemote()
   {
      return businessRemote;
   }



   public SessionBeanType<T> setLocalBean(Boolean localBean)
   {
      this.localBean = localBean;
      childNode.getOrCreate("local-bean").text(localBean);
      return this;
   }

   public Boolean getLocalBean()
   {
      return localBean;
   }



   public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint)
   {
      this.serviceEndpoint = serviceEndpoint;
      childNode.getOrCreate("service-endpoint").text(serviceEndpoint);
      return this;
   }

   public String getServiceEndpoint()
   {
      return serviceEndpoint;
   }



   public SessionBeanType<T> setEjbClass(String ejbClass)
   {
      this.ejbClass = ejbClass;
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   public String getEjbClass()
   {
      return ejbClass;
   }



   public SessionBeanType<T> setSessionType(String sessionType)
   {
      this.sessionType = sessionType;
      childNode.getOrCreate("session-type").text(sessionType);
      return this;
   }

   public String getSessionType()
   {
      return sessionType;
   }



   public SessionBeanType<T> setStatefulTimeout(StatefulTimeoutType<SessionBeanType<T>> statefulTimeout)
   {
      this.statefulTimeout = statefulTimeout;
      childNode.getOrCreate("stateful-timeout").text(statefulTimeout);
      return this;
   }

   public StatefulTimeoutType<SessionBeanType<T>> getStatefulTimeout()
   {
      if( statefulTimeout == null)
      {
          statefulTimeout = new StatefulTimeoutTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return statefulTimeout;
   }




   public SessionBeanType<T> setTimeoutMethod(NamedMethodType<SessionBeanType<T>> timeoutMethod)
   {
      this.timeoutMethod = timeoutMethod;
      childNode.getOrCreate("timeout-method").text(timeoutMethod);
      return this;
   }

   public NamedMethodType<SessionBeanType<T>> getTimeoutMethod()
   {
      if( timeoutMethod == null)
      {
          timeoutMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return timeoutMethod;
   }




   public SessionBeanType<T> setTimer(TimerType<SessionBeanType<T>> timer)
   {
      this.timer = timer;
      childNode.getOrCreate("timer").text(timer);
      return this;
   }

   public TimerType<SessionBeanType<T>> getTimer()
   {
      if( timer == null)
      {
          timer = new TimerTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return timer;
   }




   public SessionBeanType<T> setInitOnStartup(Boolean initOnStartup)
   {
      this.initOnStartup = initOnStartup;
      childNode.getOrCreate("init-on-startup").text(initOnStartup);
      return this;
   }

   public Boolean getInitOnStartup()
   {
      return initOnStartup;
   }



   public SessionBeanType<T> setConcurrencyManagementType(String concurrencyManagementType)
   {
      this.concurrencyManagementType = concurrencyManagementType;
      childNode.getOrCreate("concurrency-management-type").text(concurrencyManagementType);
      return this;
   }

   public String getConcurrencyManagementType()
   {
      return concurrencyManagementType;
   }



   public SessionBeanType<T> setConcurrentMethod(ConcurrentMethodType<SessionBeanType<T>> concurrentMethod)
   {
      this.concurrentMethod = concurrentMethod;
      childNode.getOrCreate("concurrent-method").text(concurrentMethod);
      return this;
   }

   public ConcurrentMethodType<SessionBeanType<T>> getConcurrentMethod()
   {
      if( concurrentMethod == null)
      {
          concurrentMethod = new ConcurrentMethodTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return concurrentMethod;
   }




   public SessionBeanType<T> setDependsOn(DependsOnType<SessionBeanType<T>> dependsOn)
   {
      this.dependsOn = dependsOn;
      childNode.getOrCreate("depends-on").text(dependsOn);
      return this;
   }

   public DependsOnType<SessionBeanType<T>> getDependsOn()
   {
      if( dependsOn == null)
      {
          dependsOn = new DependsOnTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return dependsOn;
   }




   public SessionBeanType<T> setInitMethod(InitMethodType<SessionBeanType<T>> initMethod)
   {
      this.initMethod = initMethod;
      childNode.getOrCreate("init-method").text(initMethod);
      return this;
   }

   public InitMethodType<SessionBeanType<T>> getInitMethod()
   {
      if( initMethod == null)
      {
          initMethod = new InitMethodTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return initMethod;
   }




   public SessionBeanType<T> setRemoveMethod(RemoveMethodType<SessionBeanType<T>> removeMethod)
   {
      this.removeMethod = removeMethod;
      childNode.getOrCreate("remove-method").text(removeMethod);
      return this;
   }

   public RemoveMethodType<SessionBeanType<T>> getRemoveMethod()
   {
      if( removeMethod == null)
      {
          removeMethod = new RemoveMethodTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return removeMethod;
   }




   public SessionBeanType<T> setAsyncMethod(AsyncMethodType<SessionBeanType<T>> asyncMethod)
   {
      this.asyncMethod = asyncMethod;
      childNode.getOrCreate("async-method").text(asyncMethod);
      return this;
   }

   public AsyncMethodType<SessionBeanType<T>> getAsyncMethod()
   {
      if( asyncMethod == null)
      {
          asyncMethod = new AsyncMethodTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return asyncMethod;
   }




   public SessionBeanType<T> setTransactionType(String transactionType)
   {
      this.transactionType = transactionType;
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }

   public String getTransactionType()
   {
      return transactionType;
   }



   public SessionBeanType<T> setAfterBeginMethod(NamedMethodType<SessionBeanType<T>> afterBeginMethod)
   {
      this.afterBeginMethod = afterBeginMethod;
      childNode.getOrCreate("after-begin-method").text(afterBeginMethod);
      return this;
   }

   public NamedMethodType<SessionBeanType<T>> getAfterBeginMethod()
   {
      if( afterBeginMethod == null)
      {
          afterBeginMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return afterBeginMethod;
   }




   public SessionBeanType<T> setBeforeCompletionMethod(NamedMethodType<SessionBeanType<T>> beforeCompletionMethod)
   {
      this.beforeCompletionMethod = beforeCompletionMethod;
      childNode.getOrCreate("before-completion-method").text(beforeCompletionMethod);
      return this;
   }

   public NamedMethodType<SessionBeanType<T>> getBeforeCompletionMethod()
   {
      if( beforeCompletionMethod == null)
      {
          beforeCompletionMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return beforeCompletionMethod;
   }




   public SessionBeanType<T> setAfterCompletionMethod(NamedMethodType<SessionBeanType<T>> afterCompletionMethod)
   {
      this.afterCompletionMethod = afterCompletionMethod;
      childNode.getOrCreate("after-completion-method").text(afterCompletionMethod);
      return this;
   }

   public NamedMethodType<SessionBeanType<T>> getAfterCompletionMethod()
   {
      if( afterCompletionMethod == null)
      {
          afterCompletionMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return afterCompletionMethod;
   }




   public SessionBeanType<T> setAroundInvoke(AroundInvokeType<SessionBeanType<T>> aroundInvoke)
   {
      this.aroundInvoke = aroundInvoke;
      childNode.getOrCreate("around-invoke").text(aroundInvoke);
      return this;
   }

   public AroundInvokeType<SessionBeanType<T>> getAroundInvoke()
   {
      if( aroundInvoke == null)
      {
          aroundInvoke = new AroundInvokeTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return aroundInvoke;
   }




   public SessionBeanType<T> setAroundTimeout(AroundTimeoutType<SessionBeanType<T>> aroundTimeout)
   {
      this.aroundTimeout = aroundTimeout;
      childNode.getOrCreate("around-timeout").text(aroundTimeout);
      return this;
   }

   public AroundTimeoutType<SessionBeanType<T>> getAroundTimeout()
   {
      if( aroundTimeout == null)
      {
          aroundTimeout = new AroundTimeoutTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return aroundTimeout;
   }




   public SessionBeanType<T> setPostActivate(LifecycleCallbackType<SessionBeanType<T>> postActivate)
   {
      this.postActivate = postActivate;
      childNode.getOrCreate("post-activate").text(postActivate);
      return this;
   }

   public LifecycleCallbackType<SessionBeanType<T>> getPostActivate()
   {
      if( postActivate == null)
      {
          postActivate = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return postActivate;
   }




   public SessionBeanType<T> setPrePassivate(LifecycleCallbackType<SessionBeanType<T>> prePassivate)
   {
      this.prePassivate = prePassivate;
      childNode.getOrCreate("pre-passivate").text(prePassivate);
      return this;
   }

   public LifecycleCallbackType<SessionBeanType<T>> getPrePassivate()
   {
      if( prePassivate == null)
      {
          prePassivate = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return prePassivate;
   }




   public SessionBeanType<T> setSecurityRoleRef(SecurityRoleRefType<SessionBeanType<T>> securityRoleRef)
   {
      this.securityRoleRef = securityRoleRef;
      childNode.getOrCreate("security-role-ref").text(securityRoleRef);
      return this;
   }

   public SecurityRoleRefType<SessionBeanType<T>> getSecurityRoleRef()
   {
      if( securityRoleRef == null)
      {
          securityRoleRef = new SecurityRoleRefTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return securityRoleRef;
   }




   public SessionBeanType<T> setSecurityIdentity(SecurityIdentityType<SessionBeanType<T>> securityIdentity)
   {
      this.securityIdentity = securityIdentity;
      childNode.getOrCreate("security-identity").text(securityIdentity);
      return this;
   }

   public SecurityIdentityType<SessionBeanType<T>> getSecurityIdentity()
   {
      if( securityIdentity == null)
      {
          securityIdentity = new SecurityIdentityTypeImpl<SessionBeanType<T>>(this, "", childNode);
      }
      return securityIdentity;
   }


}
