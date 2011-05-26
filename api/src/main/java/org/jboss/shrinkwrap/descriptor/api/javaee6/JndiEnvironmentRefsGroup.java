package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefGroup;

public interface JndiEnvironmentRefsGroup<T> extends Child<T>, ServiceRefGroup<T>
{
   public JndiEnvironmentRefsGroup<T> setEnvEntry(EnvEntryType<T> envEntry);

   public EnvEntryType<JndiEnvironmentRefsGroup<T>> getEnvEntry();

   public JndiEnvironmentRefsGroup<T> setEjbRef(EjbRefType<T> ejbRef);

   public EjbRefType<JndiEnvironmentRefsGroup<T>> getEjbRef();

   public JndiEnvironmentRefsGroup<T> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);

   public EjbLocalRefType<JndiEnvironmentRefsGroup<T>> getEjbLocalRef();

   public JndiEnvironmentRefsGroup<T> setResourceRef(ResourceRefType<T> resourceRef);

   public ResourceRefType<JndiEnvironmentRefsGroup<T>> getResourceRef();

   public JndiEnvironmentRefsGroup<T> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);

   public ResourceEnvRefType<JndiEnvironmentRefsGroup<T>> getResourceEnvRef();

   public JndiEnvironmentRefsGroup<T> setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);

   public MessageDestinationRefType<JndiEnvironmentRefsGroup<T>> getMessageDestinationRef();

   public JndiEnvironmentRefsGroup<T> setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);

   public PersistenceContextRefType<JndiEnvironmentRefsGroup<T>> getPersistenceContextRef();

   public JndiEnvironmentRefsGroup<T> setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);

   public PersistenceUnitRefType<JndiEnvironmentRefsGroup<T>> getPersistenceUnitRef();

   public JndiEnvironmentRefsGroup<T> setPostConstruct(LifecycleCallbackType<T> postConstruct);

   public LifecycleCallbackType<JndiEnvironmentRefsGroup<T>> getPostConstruct();

   public JndiEnvironmentRefsGroup<T> setPreDestroy(LifecycleCallbackType<T> preDestroy);

   public LifecycleCallbackType<JndiEnvironmentRefsGroup<T>> getPreDestroy();

   public JndiEnvironmentRefsGroup<T> setDataSource(DataSourceType<T> dataSource);

   public DataSourceType<JndiEnvironmentRefsGroup<T>> getDataSource();
}
