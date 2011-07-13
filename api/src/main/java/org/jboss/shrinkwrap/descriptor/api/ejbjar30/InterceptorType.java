package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The interceptorType element declares information about a single interceptor
 * class. It consists of :
 * 
 * - An optional description. - The fully-qualified name of the interceptor
 * class. - An optional list of around invoke methods declared on the
 * interceptor class and/or its super-classes. - An optional list environment
 * dependencies for the interceptor class and/or its super-classes. - An
 * optional list of post-activate methods declared on the interceptor class
 * and/or its super-classes. - An optional list of pre-passivate methods
 * declared on the interceptor class and/or its super-classes.
 * 
 * 
 * 
 */
public interface InterceptorType<T> extends Child<T> {

	public InterceptorType<T> removeAllEnvEntry();

	public EnvEntryType<InterceptorType<T>> envEntry();

	public List<EnvEntryType<InterceptorType<T>>> getEnvEntryList();

	public InterceptorType<T> removeAllEjbRef();

	public EjbRefType<InterceptorType<T>> ejbRef();

	public List<EjbRefType<InterceptorType<T>>> getEjbRefList();

	public InterceptorType<T> removeAllEjbLocalRef();

	public EjbLocalRefType<InterceptorType<T>> ejbLocalRef();

	public List<EjbLocalRefType<InterceptorType<T>>> getEjbLocalRefList();

	public InterceptorType<T> removeAllResourceRef();

	public ResourceRefType<InterceptorType<T>> resourceRef();

	public List<ResourceRefType<InterceptorType<T>>> getResourceRefList();

	public InterceptorType<T> removeAllResourceEnvRef();

	public ResourceEnvRefType<InterceptorType<T>> resourceEnvRef();

	public List<ResourceEnvRefType<InterceptorType<T>>> getResourceEnvRefList();

	public InterceptorType<T> removeAllMessageDestinationRef();

	public MessageDestinationRefType<InterceptorType<T>> messageDestinationRef();

	public List<MessageDestinationRefType<InterceptorType<T>>> getMessageDestinationRefList();

	public InterceptorType<T> removeAllPersistenceContextRef();

	public PersistenceContextRefType<InterceptorType<T>> persistenceContextRef();

	public List<PersistenceContextRefType<InterceptorType<T>>> getPersistenceContextRefList();

	public InterceptorType<T> removeAllPersistenceUnitRef();

	public PersistenceUnitRefType<InterceptorType<T>> persistenceUnitRef();

	public List<PersistenceUnitRefType<InterceptorType<T>>> getPersistenceUnitRefList();

	public InterceptorType<T> removeAllPostConstruct();

	public LifecycleCallbackType<InterceptorType<T>> postConstruct();

	public List<LifecycleCallbackType<InterceptorType<T>>> getPostConstructList();

	public InterceptorType<T> removeAllPreDestroy();

	public LifecycleCallbackType<InterceptorType<T>> preDestroy();

	public List<LifecycleCallbackType<InterceptorType<T>>> getPreDestroyList();

	public InterceptorType<T> removeAllServiceRef();

	public ServiceRefType<InterceptorType<T>> serviceRef();

	public List<ServiceRefType<InterceptorType<T>>> getServiceRefList();

	public InterceptorType<T> setDescription(String description);

	public InterceptorType<T> setDescriptionList(String... values);

	public InterceptorType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public InterceptorType<T> setInterceptorClass(String interceptorClass);

	public InterceptorType<T> removeInterceptorClass();

	public String getInterceptorClass();

	public InterceptorType<T> removeAllAroundInvoke();

	public AroundInvokeType<InterceptorType<T>> aroundInvoke();

	public List<AroundInvokeType<InterceptorType<T>>> getAroundInvokeList();

	public InterceptorType<T> removeAllPostActivate();

	public LifecycleCallbackType<InterceptorType<T>> postActivate();

	public List<LifecycleCallbackType<InterceptorType<T>>> getPostActivateList();

	public InterceptorType<T> removeAllPrePassivate();

	public LifecycleCallbackType<InterceptorType<T>> prePassivate();

	public List<LifecycleCallbackType<InterceptorType<T>>> getPrePassivateList();

}
