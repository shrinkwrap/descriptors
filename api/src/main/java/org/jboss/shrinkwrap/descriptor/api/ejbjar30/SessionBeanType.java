package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The session-beanType declares an session bean. The
 * declaration consists of:
 *
 * - an optional description
 * - an optional display name
 * - an optional icon element that contains a small and a large
 * icon file name
 * - a name assigned to the enterprise bean
 * in the deployment description
 * - an optional mapped-name element that can be used to provide
 * vendor-specific deployment information such as the physical
 * jndi-name of the session bean's remote home/business interface.
 * This element is not required to be supported by all
 * implementations. Any use of this element is non-portable.
 * - the names of all the remote or local business interfaces,
 * if any
 * - the names of the session bean's remote home and
 * remote interfaces, if any
 * - the names of the session bean's local home and
 * local interfaces, if any
 * - the name of the session bean's web service endpoint
 * interface, if any
 * - the session bean's implementation class
 * - the session bean's state management type
 * - an optional declaration of the session bean's timeout method.
 * - the optional session bean's transaction management type.
 * If it is not present, it is defaulted to Container.
 * - an optional list of the session bean class and/or
 * superclass around-invoke methods.
 * - an optional declaration of the bean's
 * environment entries
 * - an optional declaration of the bean's EJB references
 * - an optional declaration of the bean's local
 * EJB references
 * - an optional declaration of the bean's web
 * service references
 * - an optional declaration of the security role
 * references
 * - an optional declaration of the security identity
 * to be used for the execution of the bean's methods
 * - an optional declaration of the bean's resource
 * manager connection factory references
 * - an optional declaration of the bean's resource
 * environment references.
 * - an optional declaration of the bean's message
 * destination references
 *
 * The elements that are optional are "optional" in the sense
 * that they are omitted when if lists represented by them are
 * empty.
 *
 * Either both the local-home and the local elements or both
 * the home and the remote elements must be specified for the
 * session bean.
 *
 * The service-endpoint element may only be specified if the
 * bean is a stateless session bean.
 *
 *
 *
 */
public interface SessionBeanType<T> extends Child<T>
{

   public SessionBeanType<T> setDescription(String description);

   public SessionBeanType<T> setDescriptionList(String... values);

   public SessionBeanType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public SessionBeanType<T> setDisplayName(String displayName);

   public SessionBeanType<T> setDisplayNameList(String... values);

   public SessionBeanType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();

   public SessionBeanType<T> removeAllIcon();

   public IconType<SessionBeanType<T>> icon();

   public List<IconType<SessionBeanType<T>>> getIconList();

   public SessionBeanType<T> removeAllEnvEntry();

   public EnvEntryType<SessionBeanType<T>> envEntry();

   public List<EnvEntryType<SessionBeanType<T>>> getEnvEntryList();

   public SessionBeanType<T> removeAllEjbRef();

   public EjbRefType<SessionBeanType<T>> ejbRef();

   public List<EjbRefType<SessionBeanType<T>>> getEjbRefList();

   public SessionBeanType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<SessionBeanType<T>> ejbLocalRef();

   public List<EjbLocalRefType<SessionBeanType<T>>> getEjbLocalRefList();

   public SessionBeanType<T> removeAllResourceRef();

   public ResourceRefType<SessionBeanType<T>> resourceRef();

   public List<ResourceRefType<SessionBeanType<T>>> getResourceRefList();

   public SessionBeanType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef();

   public List<ResourceEnvRefType<SessionBeanType<T>>> getResourceEnvRefList();

   public SessionBeanType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef();

   public List<MessageDestinationRefType<SessionBeanType<T>>> getMessageDestinationRefList();

   public SessionBeanType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef();

   public List<PersistenceContextRefType<SessionBeanType<T>>> getPersistenceContextRefList();

   public SessionBeanType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef();

   public List<PersistenceUnitRefType<SessionBeanType<T>>> getPersistenceUnitRefList();

   public SessionBeanType<T> removeAllPostConstruct();

   public LifecycleCallbackType<SessionBeanType<T>> postConstruct();

   public List<LifecycleCallbackType<SessionBeanType<T>>> getPostConstructList();

   public SessionBeanType<T> removeAllPreDestroy();

   public LifecycleCallbackType<SessionBeanType<T>> preDestroy();

   public List<LifecycleCallbackType<SessionBeanType<T>>> getPreDestroyList();

   public SessionBeanType<T> removeAllServiceRef();

   public ServiceRefType<SessionBeanType<T>> serviceRef();

   public List<ServiceRefType<SessionBeanType<T>>> getServiceRefList();

   public SessionBeanType<T> setEjbName(String ejbName);

   public SessionBeanType<T> removeEjbName();

   public String getEjbName();

   public SessionBeanType<T> setMappedName(String mappedName);

   public SessionBeanType<T> removeMappedName();

   public String getMappedName();

   public SessionBeanType<T> setHome(String home);

   public SessionBeanType<T> removeHome();

   public String getHome();

   public SessionBeanType<T> setRemote(String remote);

   public SessionBeanType<T> removeRemote();

   public String getRemote();

   public SessionBeanType<T> setLocalHome(String localHome);

   public SessionBeanType<T> removeLocalHome();

   public String getLocalHome();

   public SessionBeanType<T> setLocal(String local);

   public SessionBeanType<T> removeLocal();

   public String getLocal();

   public SessionBeanType<T> setBusinessLocal(String businessLocal);

   public SessionBeanType<T> setBusinessLocalList(String... values);

   public SessionBeanType<T> removeAllBusinessLocal();

   public List<String> getBusinessLocalList();

   public SessionBeanType<T> setBusinessRemote(String businessRemote);

   public SessionBeanType<T> setBusinessRemoteList(String... values);

   public SessionBeanType<T> removeAllBusinessRemote();

   public List<String> getBusinessRemoteList();

   public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint);

   public SessionBeanType<T> removeServiceEndpoint();

   public String getServiceEndpoint();

   public SessionBeanType<T> setEjbClass(String ejbClass);

   public SessionBeanType<T> removeEjbClass();

   public String getEjbClass();

   public SessionBeanType<T> setSessionType(SessionTypeType sessionType);

   public SessionBeanType<T> setSessionType(String sessionType);

   public SessionTypeType getSessionType();

   public String getSessionTypeAsString();

   public SessionBeanType<T> removeTimeoutMethod();

   public NamedMethodType<SessionBeanType<T>> timeoutMethod();

   public SessionBeanType<T> removeAllInitMethod();

   public InitMethodType<SessionBeanType<T>> initMethod();

   public List<InitMethodType<SessionBeanType<T>>> getInitMethodList();

   public SessionBeanType<T> removeAllRemoveMethod();

   public RemoveMethodType<SessionBeanType<T>> removeMethod();

   public List<RemoveMethodType<SessionBeanType<T>>> getRemoveMethodList();

   public SessionBeanType<T> setTransactionType(TransactionTypeType transactionType);

   public SessionBeanType<T> setTransactionType(String transactionType);

   public TransactionTypeType getTransactionType();

   public String getTransactionTypeAsString();

   public SessionBeanType<T> removeAllAroundInvoke();

   public AroundInvokeType<SessionBeanType<T>> aroundInvoke();

   public List<AroundInvokeType<SessionBeanType<T>>> getAroundInvokeList();

   public SessionBeanType<T> removeAllPostActivate();

   public LifecycleCallbackType<SessionBeanType<T>> postActivate();

   public List<LifecycleCallbackType<SessionBeanType<T>>> getPostActivateList();

   public SessionBeanType<T> removeAllPrePassivate();

   public LifecycleCallbackType<SessionBeanType<T>> prePassivate();

   public List<LifecycleCallbackType<SessionBeanType<T>>> getPrePassivateList();

   public SessionBeanType<T> removeAllSecurityRoleRef();

   public SecurityRoleRefType<SessionBeanType<T>> securityRoleRef();

   public List<SecurityRoleRefType<SessionBeanType<T>>> getSecurityRoleRefList();

   public SessionBeanType<T> removeSecurityIdentity();

   public SecurityIdentityType<SessionBeanType<T>> securityIdentity();

}
