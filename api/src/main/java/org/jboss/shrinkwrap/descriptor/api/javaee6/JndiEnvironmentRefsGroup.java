package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefGroup;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface JndiEnvironmentRefsGroup<T> extends Child<T>, ServiceRefGroup<T>

{
   public EnvEntryType<JndiEnvironmentRefsGroup<T>> setEnvEntry(EnvEntryType<T> envEntry);

   public EnvEntryType<JndiEnvironmentRefsGroup<T>> getEnvEntry();

   public EjbRefType<JndiEnvironmentRefsGroup<T>> setEjbRef(EjbRefType<T> ejbRef);

   public EjbRefType<JndiEnvironmentRefsGroup<T>> getEjbRef();

   public EjbLocalRefType<JndiEnvironmentRefsGroup<T>> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);

   public EjbLocalRefType<JndiEnvironmentRefsGroup<T>> getEjbLocalRef();

   public ResourceRefType<JndiEnvironmentRefsGroup<T>> setResourceRef(ResourceRefType<T> resourceRef);

   public ResourceRefType<JndiEnvironmentRefsGroup<T>> getResourceRef();

   public ResourceEnvRefType<JndiEnvironmentRefsGroup<T>> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);

   public ResourceEnvRefType<JndiEnvironmentRefsGroup<T>> getResourceEnvRef();

   public MessageDestinationRefType<JndiEnvironmentRefsGroup<T>> setMessageDestinationRef(
         MessageDestinationRefType<T> messageDestinationRef);

   public MessageDestinationRefType<JndiEnvironmentRefsGroup<T>> getMessageDestinationRef();

   public PersistenceContextRefType<JndiEnvironmentRefsGroup<T>> setPersistenceContextRef(
         PersistenceContextRefType<T> persistenceContextRef);

   public PersistenceContextRefType<JndiEnvironmentRefsGroup<T>> getPersistenceContextRef();

   public PersistenceUnitRefType<JndiEnvironmentRefsGroup<T>> setPersistenceUnitRef(
         PersistenceUnitRefType<T> persistenceUnitRef);

   public PersistenceUnitRefType<JndiEnvironmentRefsGroup<T>> getPersistenceUnitRef();

   public LifecycleCallbackType<JndiEnvironmentRefsGroup<T>> setPostConstruct(LifecycleCallbackType<T> postConstruct);

   public LifecycleCallbackType<JndiEnvironmentRefsGroup<T>> getPostConstruct();

   public LifecycleCallbackType<JndiEnvironmentRefsGroup<T>> setPreDestroy(LifecycleCallbackType<T> preDestroy);

   public LifecycleCallbackType<JndiEnvironmentRefsGroup<T>> getPreDestroy();

   public DataSourceType<JndiEnvironmentRefsGroup<T>> setDataSource(DataSourceType<T> dataSource);

   public DataSourceType<JndiEnvironmentRefsGroup<T>> getDataSource();
}
