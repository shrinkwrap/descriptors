package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorType;
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
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class InterceptorTypeImpl<T> implements Child<T>, InterceptorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String interceptorClass;
   private AroundInvokeType<InterceptorType<T>> aroundInvoke;
   private AroundTimeoutType<InterceptorType<T>> aroundTimeout;
   private LifecycleCallbackType<InterceptorType<T>> postActivate;
   private LifecycleCallbackType<InterceptorType<T>> prePassivate;

   private EnvEntryType<InterceptorType<T>> envEntry;
   private EjbRefType<InterceptorType<T>> ejbRef;
   private EjbLocalRefType<InterceptorType<T>> ejbLocalRef;
   private ResourceRefType<InterceptorType<T>> resourceRef;
   private ResourceEnvRefType<InterceptorType<T>> resourceEnvRef;
   private MessageDestinationRefType<InterceptorType<T>> messageDestinationRef;
   private PersistenceContextRefType<InterceptorType<T>> persistenceContextRef;
   private PersistenceUnitRefType<InterceptorType<T>> persistenceUnitRef;
   private LifecycleCallbackType<InterceptorType<T>> postConstruct;
   private LifecycleCallbackType<InterceptorType<T>> preDestroy;
   private DataSourceType<InterceptorType<T>> dataSource;
   private ServiceRefType<InterceptorType<T>> serviceRef;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public InterceptorTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("interceptor");   }


   public T up()
   {
      return t;
   }



   public InterceptorType<T> setEnvEntry(EnvEntryType<InterceptorType<T>> envEntry)
   {
      this.envEntry = envEntry;
      childNode.getOrCreate("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<InterceptorType<T>> getEnvEntry()
   {
      if( envEntry == null)
      {
          envEntry = new EnvEntryTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return envEntry;
   }



   public InterceptorType<T> setEjbRef(EjbRefType<InterceptorType<T>> ejbRef)
   {
      this.ejbRef = ejbRef;
      childNode.getOrCreate("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<InterceptorType<T>> getEjbRef()
   {
      if( ejbRef == null)
      {
          ejbRef = new EjbRefTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return ejbRef;
   }



   public InterceptorType<T> setEjbLocalRef(EjbLocalRefType<InterceptorType<T>> ejbLocalRef)
   {
      this.ejbLocalRef = ejbLocalRef;
      childNode.getOrCreate("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<InterceptorType<T>> getEjbLocalRef()
   {
      if( ejbLocalRef == null)
      {
          ejbLocalRef = new EjbLocalRefTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return ejbLocalRef;
   }



   public InterceptorType<T> setResourceRef(ResourceRefType<InterceptorType<T>> resourceRef)
   {
      this.resourceRef = resourceRef;
      childNode.getOrCreate("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<InterceptorType<T>> getResourceRef()
   {
      if( resourceRef == null)
      {
          resourceRef = new ResourceRefTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return resourceRef;
   }



   public InterceptorType<T> setResourceEnvRef(ResourceEnvRefType<InterceptorType<T>> resourceEnvRef)
   {
      this.resourceEnvRef = resourceEnvRef;
      childNode.getOrCreate("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<InterceptorType<T>> getResourceEnvRef()
   {
      if( resourceEnvRef == null)
      {
          resourceEnvRef = new ResourceEnvRefTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return resourceEnvRef;
   }



   public InterceptorType<T> setMessageDestinationRef(MessageDestinationRefType<InterceptorType<T>> messageDestinationRef)
   {
      this.messageDestinationRef = messageDestinationRef;
      childNode.getOrCreate("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<InterceptorType<T>> getMessageDestinationRef()
   {
      if( messageDestinationRef == null)
      {
          messageDestinationRef = new MessageDestinationRefTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return messageDestinationRef;
   }



   public InterceptorType<T> setPersistenceContextRef(PersistenceContextRefType<InterceptorType<T>> persistenceContextRef)
   {
      this.persistenceContextRef = persistenceContextRef;
      childNode.getOrCreate("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<InterceptorType<T>> getPersistenceContextRef()
   {
      if( persistenceContextRef == null)
      {
          persistenceContextRef = new PersistenceContextRefTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return persistenceContextRef;
   }



   public InterceptorType<T> setPersistenceUnitRef(PersistenceUnitRefType<InterceptorType<T>> persistenceUnitRef)
   {
      this.persistenceUnitRef = persistenceUnitRef;
      childNode.getOrCreate("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<InterceptorType<T>> getPersistenceUnitRef()
   {
      if( persistenceUnitRef == null)
      {
          persistenceUnitRef = new PersistenceUnitRefTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return persistenceUnitRef;
   }



   public InterceptorType<T> setPostConstruct(LifecycleCallbackType<InterceptorType<T>> postConstruct)
   {
      this.postConstruct = postConstruct;
      childNode.getOrCreate("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<InterceptorType<T>> getPostConstruct()
   {
      if( postConstruct == null)
      {
          postConstruct = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return postConstruct;
   }



   public InterceptorType<T> setPreDestroy(LifecycleCallbackType<InterceptorType<T>> preDestroy)
   {
      this.preDestroy = preDestroy;
      childNode.getOrCreate("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<InterceptorType<T>> getPreDestroy()
   {
      if( preDestroy == null)
      {
          preDestroy = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return preDestroy;
   }



   public InterceptorType<T> setDataSource(DataSourceType<InterceptorType<T>> dataSource)
   {
      this.dataSource = dataSource;
      childNode.getOrCreate("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<InterceptorType<T>> getDataSource()
   {
      if( dataSource == null)
      {
          dataSource = new DataSourceTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return dataSource;
   }



   public InterceptorType<T> setServiceRef(ServiceRefType<InterceptorType<T>> serviceRef)
   {
      this.serviceRef = serviceRef;
      childNode.getOrCreate("service-ref").text(serviceRef);
      return this;
   }

   public ServiceRefType<InterceptorType<T>> getServiceRef()
   {
      if( serviceRef == null)
      {
          serviceRef = new ServiceRefTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return serviceRef;
   }



   public InterceptorType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public InterceptorType<T> setInterceptorClass(String interceptorClass)
   {
      this.interceptorClass = interceptorClass;
      childNode.getOrCreate("interceptor-class").text(interceptorClass);
      return this;
   }

   public String getInterceptorClass()
   {
      return interceptorClass;
   }



   public InterceptorType<T> setAroundInvoke(AroundInvokeType<InterceptorType<T>> aroundInvoke)
   {
      this.aroundInvoke = aroundInvoke;
      childNode.getOrCreate("around-invoke").text(aroundInvoke);
      return this;
   }

   public AroundInvokeType<InterceptorType<T>> getAroundInvoke()
   {
      if( aroundInvoke == null)
      {
          aroundInvoke = new AroundInvokeTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return aroundInvoke;
   }




   public InterceptorType<T> setAroundTimeout(AroundTimeoutType<InterceptorType<T>> aroundTimeout)
   {
      this.aroundTimeout = aroundTimeout;
      childNode.getOrCreate("around-timeout").text(aroundTimeout);
      return this;
   }

   public AroundTimeoutType<InterceptorType<T>> getAroundTimeout()
   {
      if( aroundTimeout == null)
      {
          aroundTimeout = new AroundTimeoutTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return aroundTimeout;
   }




   public InterceptorType<T> setPostActivate(LifecycleCallbackType<InterceptorType<T>> postActivate)
   {
      this.postActivate = postActivate;
      childNode.getOrCreate("post-activate").text(postActivate);
      return this;
   }

   public LifecycleCallbackType<InterceptorType<T>> getPostActivate()
   {
      if( postActivate == null)
      {
          postActivate = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return postActivate;
   }




   public InterceptorType<T> setPrePassivate(LifecycleCallbackType<InterceptorType<T>> prePassivate)
   {
      this.prePassivate = prePassivate;
      childNode.getOrCreate("pre-passivate").text(prePassivate);
      return this;
   }

   public LifecycleCallbackType<InterceptorType<T>> getPrePassivate()
   {
      if( prePassivate == null)
      {
          prePassivate = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "", childNode);
      }
      return prePassivate;
   }


}
