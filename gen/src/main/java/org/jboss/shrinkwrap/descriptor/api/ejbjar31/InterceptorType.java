package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface InterceptorType<T> extends Child<T>
{

   public InterceptorType<T> setEnvEntry(EnvEntryType<InterceptorType<T>> envEntry);
   public EnvEntryType<InterceptorType<T>> getEnvEntry();


   public InterceptorType<T> setEjbRef(EjbRefType<InterceptorType<T>> ejbRef);
   public EjbRefType<InterceptorType<T>> getEjbRef();


   public InterceptorType<T> setEjbLocalRef(EjbLocalRefType<InterceptorType<T>> ejbLocalRef);
   public EjbLocalRefType<InterceptorType<T>> getEjbLocalRef();


   public InterceptorType<T> setResourceRef(ResourceRefType<InterceptorType<T>> resourceRef);
   public ResourceRefType<InterceptorType<T>> getResourceRef();


   public InterceptorType<T> setResourceEnvRef(ResourceEnvRefType<InterceptorType<T>> resourceEnvRef);
   public ResourceEnvRefType<InterceptorType<T>> getResourceEnvRef();


   public InterceptorType<T> setMessageDestinationRef(MessageDestinationRefType<InterceptorType<T>> messageDestinationRef);
   public MessageDestinationRefType<InterceptorType<T>> getMessageDestinationRef();


   public InterceptorType<T> setPersistenceContextRef(PersistenceContextRefType<InterceptorType<T>> persistenceContextRef);
   public PersistenceContextRefType<InterceptorType<T>> getPersistenceContextRef();


   public InterceptorType<T> setPersistenceUnitRef(PersistenceUnitRefType<InterceptorType<T>> persistenceUnitRef);
   public PersistenceUnitRefType<InterceptorType<T>> getPersistenceUnitRef();


   public InterceptorType<T> setPostConstruct(LifecycleCallbackType<InterceptorType<T>> postConstruct);
   public LifecycleCallbackType<InterceptorType<T>> getPostConstruct();


   public InterceptorType<T> setPreDestroy(LifecycleCallbackType<InterceptorType<T>> preDestroy);
   public LifecycleCallbackType<InterceptorType<T>> getPreDestroy();


   public InterceptorType<T> setDataSource(DataSourceType<InterceptorType<T>> dataSource);
   public DataSourceType<InterceptorType<T>> getDataSource();


   public InterceptorType<T> setServiceRef(ServiceRefType<InterceptorType<T>> serviceRef);
   public ServiceRefType<InterceptorType<T>> getServiceRef();


   public InterceptorType<T> setDescription(String description);
   public String getDescription();


   public InterceptorType<T> setInterceptorClass(String interceptorClass);
   public String getInterceptorClass();


   public InterceptorType<T> setAroundInvoke(AroundInvokeType<InterceptorType<T>> aroundInvoke);
   public AroundInvokeType<InterceptorType<T>> getAroundInvoke();



   public InterceptorType<T> setAroundTimeout(AroundTimeoutType<InterceptorType<T>> aroundTimeout);
   public AroundTimeoutType<InterceptorType<T>> getAroundTimeout();



   public InterceptorType<T> setPostActivate(LifecycleCallbackType<InterceptorType<T>> postActivate);
   public LifecycleCallbackType<InterceptorType<T>> getPostActivate();



   public InterceptorType<T> setPrePassivate(LifecycleCallbackType<InterceptorType<T>> prePassivate);
   public LifecycleCallbackType<InterceptorType<T>> getPrePassivate();

}
