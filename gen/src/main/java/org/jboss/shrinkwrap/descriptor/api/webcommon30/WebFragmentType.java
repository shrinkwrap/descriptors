package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface WebFragmentType<T> extends Child<T>
{

   public WebFragmentType<T> setDistributable(Boolean distributable);

   public Boolean isDistributable();

   public WebFragmentType<T> removeContextParam();

   public ParamValueType<WebFragmentType<T>> getContextParam();

   public WebFragmentType<T> removeFilter();

   public FilterType<WebFragmentType<T>> getFilter();

   public WebFragmentType<T> removeFilterMapping();

   public FilterMappingType<WebFragmentType<T>> getFilterMapping();

   public WebFragmentType<T> removeListener();

   public ListenerType<WebFragmentType<T>> getListener();

   public WebFragmentType<T> removeServlet();

   public ServletType<WebFragmentType<T>> getServlet();

   public WebFragmentType<T> removeServletMapping();

   public ServletMappingType<WebFragmentType<T>> getServletMapping();

   public WebFragmentType<T> removeSessionConfig();

   public SessionConfigType<WebFragmentType<T>> getSessionConfig();

   public WebFragmentType<T> removeMimeMapping();

   public MimeMappingType<WebFragmentType<T>> getMimeMapping();

   public WebFragmentType<T> removeWelcomeFileList();

   public WelcomeFileListType<WebFragmentType<T>> getWelcomeFileList();

   public WebFragmentType<T> removeErrorPage();

   public ErrorPageType<WebFragmentType<T>> getErrorPage();

   public WebFragmentType<T> removeJspConfig();

   public JspConfigType<WebFragmentType<T>> getJspConfig();

   public WebFragmentType<T> removeSecurityConstraint();

   public SecurityConstraintType<WebFragmentType<T>> getSecurityConstraint();

   public WebFragmentType<T> removeLoginConfig();

   public LoginConfigType<WebFragmentType<T>> getLoginConfig();

   public WebFragmentType<T> removeSecurityRole();

   public SecurityRoleType<WebFragmentType<T>> getSecurityRole();

   public WebFragmentType<T> removeMessageDestination();

   public MessageDestinationType<WebFragmentType<T>> getMessageDestination();

   public WebFragmentType<T> removeLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<WebFragmentType<T>> getLocaleEncodingMappingList();

   public WebFragmentType<T> setDescription(String description);

   public WebFragmentType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public WebFragmentType<T> setDisplayName(String displayName);

   public WebFragmentType<T> setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public WebFragmentType<T> removeAllIcon();

   public IconType<WebFragmentType<T>> getIcon();

   public List<IconType<WebFragmentType<T>>> getIconList();

   public WebFragmentType<T> removeAllEnvEntry();

   public EnvEntryType<WebFragmentType<T>> getEnvEntry();

   public List<EnvEntryType<WebFragmentType<T>>> getEnvEntryList();

   public WebFragmentType<T> removeAllEjbRef();

   public EjbRefType<WebFragmentType<T>> getEjbRef();

   public List<EjbRefType<WebFragmentType<T>>> getEjbRefList();

   public WebFragmentType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<WebFragmentType<T>> getEjbLocalRef();

   public List<EjbLocalRefType<WebFragmentType<T>>> getEjbLocalRefList();

   public WebFragmentType<T> removeAllResourceRef();

   public ResourceRefType<WebFragmentType<T>> getResourceRef();

   public List<ResourceRefType<WebFragmentType<T>>> getResourceRefList();

   public WebFragmentType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<WebFragmentType<T>> getResourceEnvRef();

   public List<ResourceEnvRefType<WebFragmentType<T>>> getResourceEnvRefList();

   public WebFragmentType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<WebFragmentType<T>> getMessageDestinationRef();

   public List<MessageDestinationRefType<WebFragmentType<T>>> getMessageDestinationRefList();

   public WebFragmentType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<WebFragmentType<T>> getPersistenceContextRef();

   public List<PersistenceContextRefType<WebFragmentType<T>>> getPersistenceContextRefList();

   public WebFragmentType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<WebFragmentType<T>> getPersistenceUnitRef();

   public List<PersistenceUnitRefType<WebFragmentType<T>>> getPersistenceUnitRefList();

   public WebFragmentType<T> removeAllPostConstruct();

   public LifecycleCallbackType<WebFragmentType<T>> getPostConstruct();

   public List<LifecycleCallbackType<WebFragmentType<T>>> getPostConstructList();

   public WebFragmentType<T> removeAllPreDestroy();

   public LifecycleCallbackType<WebFragmentType<T>> getPreDestroy();

   public List<LifecycleCallbackType<WebFragmentType<T>>> getPreDestroyList();

   public WebFragmentType<T> removeAllDataSource();

   public DataSourceType<WebFragmentType<T>> getDataSource();

   public List<DataSourceType<WebFragmentType<T>>> getDataSourceList();

   public WebFragmentType<T> setVersion(String version);

   public String getVersion();

   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete);

   public Boolean isMetadataComplete();

   public WebFragmentType<T> setName(String name);

   public String getName();

   public WebFragmentType<T> removeOrdering();

   public OrderingType<WebFragmentType<T>> getOrdering();

}
