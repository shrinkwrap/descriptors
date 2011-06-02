package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
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
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface InterceptorType<T> extends Child<T>
{
   @NodeInfo(xmlName = "env-entry")
   public EnvEntryType<InterceptorType<T>> envEntry();

   @NodeInfo(xmlName = "ejb-ref")
   public EjbRefType<InterceptorType<T>> ejbRef();

   @NodeInfo(xmlName = "ejb-local-ref")
   public EjbLocalRefType<InterceptorType<T>> ejbLocalRef();

   @NodeInfo(xmlName = "resource-ref")
   public ResourceRefType<InterceptorType<T>> resourceRef();

   @NodeInfo(xmlName = "resource-env-ref")
   public ResourceEnvRefType<InterceptorType<T>> resourceEnvRef();

   @NodeInfo(xmlName = "message-destination-ref")
   public MessageDestinationRefType<InterceptorType<T>> messageDestinationRef();

   @NodeInfo(xmlName = "persistence-context-ref")
   public PersistenceContextRefType<InterceptorType<T>> persistenceContextRef();

   @NodeInfo(xmlName = "persistence-unit-ref")
   public PersistenceUnitRefType<InterceptorType<T>> persistenceUnitRef();

   @NodeInfo(xmlName = "post-construct")
   public LifecycleCallbackType<InterceptorType<T>> postConstruct();

   @NodeInfo(xmlName = "pre-destroy")
   public LifecycleCallbackType<InterceptorType<T>> preDestroy();

   @NodeInfo(xmlName = "data-source")
   public DataSourceType<InterceptorType<T>> dataSource();

   @NodeInfo(xmlName = "service-ref")
   public ServiceRefType<InterceptorType<T>> serviceRef();

   public InterceptorType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public InterceptorType<T> setInterceptorClass(Class<?> interceptorClass);

   public InterceptorType<T> setInterceptorClass(String interceptorClass);

   @NodeInfo(xmlName = "interceptor-class")
   public String getInterceptorClass();

   @NodeInfo(xmlName = "around-invoke")
   public AroundInvokeType<InterceptorType<T>> aroundInvoke();

   @NodeInfo(xmlName = "around-timeout")
   public AroundTimeoutType<InterceptorType<T>> aroundTimeout();

   @NodeInfo(xmlName = "post-activate")
   public LifecycleCallbackType<InterceptorType<T>> postActivate();

   @NodeInfo(xmlName = "pre-passivate")
   public LifecycleCallbackType<InterceptorType<T>> prePassivate();
}
