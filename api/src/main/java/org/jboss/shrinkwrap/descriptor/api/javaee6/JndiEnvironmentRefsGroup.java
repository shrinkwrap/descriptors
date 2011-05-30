package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefGroup;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface JndiEnvironmentRefsGroup<T> extends Child<T>, ServiceRefGroup<T>
{
   public JndiEnvironmentRefsGroup<T> setEnvEntry(EnvEntryType<T> envEntry);
   public EnvEntryType<T> getEnvEntry();

   public JndiEnvironmentRefsGroup<T> setEjbRef(EjbRefType<T> ejbRef);
   public EjbRefType<T> getEjbRef();

   public JndiEnvironmentRefsGroup<T> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);
   public EjbLocalRefType<T> getEjbLocalRef();

   public JndiEnvironmentRefsGroup<T> setResourceRef(ResourceRefType<T> resourceRef);
   public ResourceRefType<T> getResourceRef();

   public JndiEnvironmentRefsGroup<T> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);
   public ResourceEnvRefType<T> getResourceEnvRef();

   public JndiEnvironmentRefsGroup<T> setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);
   public MessageDestinationRefType<T> getMessageDestinationRef();

   public JndiEnvironmentRefsGroup<T> setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);
   public PersistenceContextRefType<T> getPersistenceContextRef();

   public JndiEnvironmentRefsGroup<T> setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);
   public PersistenceUnitRefType<T> getPersistenceUnitRef();

   public JndiEnvironmentRefsGroup<T> setPostConstruct(LifecycleCallbackType<T> postConstruct);
   public LifecycleCallbackType<T> getPostConstruct();

   public JndiEnvironmentRefsGroup<T> setPreDestroy(LifecycleCallbackType<T> preDestroy);
   public LifecycleCallbackType<T> getPreDestroy();

   public JndiEnvironmentRefsGroup<T> setDataSource(DataSourceType<T> dataSource);
   public DataSourceType<T> getDataSource();
}
