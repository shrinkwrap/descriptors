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
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface InterceptorType<T> extends Child<T>
{
   public InterceptorType<T> setEnvEntry(EnvEntryType<T> envEntry);
   public EnvEntryType<T> getEnvEntry();

   public InterceptorType<T> setEjbRef(EjbRefType<T> ejbRef);
   public EjbRefType<T> getEjbRef();

   public InterceptorType<T> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);
   public EjbLocalRefType<T> getEjbLocalRef();

   public InterceptorType<T> setResourceRef(ResourceRefType<T> resourceRef);
   public ResourceRefType<T> getResourceRef();

   public InterceptorType<T> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);
   public ResourceEnvRefType<T> getResourceEnvRef();

   public InterceptorType<T> setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);
   public MessageDestinationRefType<T> getMessageDestinationRef();

   public InterceptorType<T> setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);
   public PersistenceContextRefType<T> getPersistenceContextRef();

   public InterceptorType<T> setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);
   public PersistenceUnitRefType<T> getPersistenceUnitRef();

   public InterceptorType<T> setPostConstruct(LifecycleCallbackType<T> postConstruct);
   public LifecycleCallbackType<T> getPostConstruct();

   public InterceptorType<T> setPreDestroy(LifecycleCallbackType<T> preDestroy);
   public LifecycleCallbackType<T> getPreDestroy();

   public InterceptorType<T> setDataSource(DataSourceType<T> dataSource);
   public DataSourceType<T> getDataSource();

   public InterceptorType<T> setServiceRef(ServiceRefType<T> serviceRef);
   public ServiceRefType<T> getServiceRef();

   public InterceptorType<T> setDescription(String description);
   public String getDescription();

   public InterceptorType<T> setInterceptorClass(String interceptorClass);
   public String getInterceptorClass();

   public InterceptorType<T> setAroundInvoke(AroundInvokeType<T> aroundInvoke);
   public AroundInvokeType<T> getAroundInvoke();

   public InterceptorType<T> setAroundTimeout(AroundTimeoutType<T> aroundTimeout);
   public AroundTimeoutType<T> getAroundTimeout();

   public InterceptorType<T> setPostActivate(LifecycleCallbackType<T> postActivate);
   public LifecycleCallbackType<T> getPostActivate();

   public InterceptorType<T> setPrePassivate(LifecycleCallbackType<T> prePassivate);
   public LifecycleCallbackType<T> getPrePassivate();
}
