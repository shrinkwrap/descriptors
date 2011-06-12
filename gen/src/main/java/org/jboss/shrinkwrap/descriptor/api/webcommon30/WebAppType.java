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
public interface WebAppType<T> extends Child<T>
{

   public WebAppType<T> setDistributable(Boolean distributable);

   public Boolean isDistributable();

   public WebAppType<T> removeContextParam();

   public ParamValueType<WebAppType<T>> getContextParam();

   public WebAppType<T> removeFilter();

   public FilterType<WebAppType<T>> getFilter();

   public WebAppType<T> removeFilterMapping();

   public FilterMappingType<WebAppType<T>> getFilterMapping();

   public WebAppType<T> removeListener();

   public ListenerType<WebAppType<T>> getListener();

   public WebAppType<T> removeServlet();

   public ServletType<WebAppType<T>> getServlet();

   public WebAppType<T> removeServletMapping();

   public ServletMappingType<WebAppType<T>> getServletMapping();

   public WebAppType<T> removeSessionConfig();

   public SessionConfigType<WebAppType<T>> getSessionConfig();

   public WebAppType<T> removeMimeMapping();

   public MimeMappingType<WebAppType<T>> getMimeMapping();

   public WebAppType<T> removeWelcomeFileList();

   public WelcomeFileListType<WebAppType<T>> getWelcomeFileList();

   public WebAppType<T> removeErrorPage();

   public ErrorPageType<WebAppType<T>> getErrorPage();

   public WebAppType<T> removeJspConfig();

   public JspConfigType<WebAppType<T>> getJspConfig();

   public WebAppType<T> removeSecurityConstraint();

   public SecurityConstraintType<WebAppType<T>> getSecurityConstraint();

   public WebAppType<T> removeLoginConfig();

   public LoginConfigType<WebAppType<T>> getLoginConfig();

   public WebAppType<T> removeSecurityRole();

   public SecurityRoleType<WebAppType<T>> getSecurityRole();

   public WebAppType<T> removeMessageDestination();

   public MessageDestinationType<WebAppType<T>> getMessageDestination();

   public WebAppType<T> removeLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<WebAppType<T>> getLocaleEncodingMappingList();

   public WebAppType<T> setDescription(String description);

   public WebAppType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public WebAppType<T> setDisplayName(String displayName);

   public WebAppType<T> setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public WebAppType<T> removeAllIcon();

   public IconType<WebAppType<T>> getIcon();

   public List<IconType<WebAppType<T>>> getIconList();

   public WebAppType<T> removeAllEnvEntry();

   public EnvEntryType<WebAppType<T>> getEnvEntry();

   public List<EnvEntryType<WebAppType<T>>> getEnvEntryList();

   public WebAppType<T> removeAllEjbRef();

   public EjbRefType<WebAppType<T>> getEjbRef();

   public List<EjbRefType<WebAppType<T>>> getEjbRefList();

   public WebAppType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<WebAppType<T>> getEjbLocalRef();

   public List<EjbLocalRefType<WebAppType<T>>> getEjbLocalRefList();

   public WebAppType<T> removeAllResourceRef();

   public ResourceRefType<WebAppType<T>> getResourceRef();

   public List<ResourceRefType<WebAppType<T>>> getResourceRefList();

   public WebAppType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<WebAppType<T>> getResourceEnvRef();

   public List<ResourceEnvRefType<WebAppType<T>>> getResourceEnvRefList();

   public WebAppType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<WebAppType<T>> getMessageDestinationRef();

   public List<MessageDestinationRefType<WebAppType<T>>> getMessageDestinationRefList();

   public WebAppType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<WebAppType<T>> getPersistenceContextRef();

   public List<PersistenceContextRefType<WebAppType<T>>> getPersistenceContextRefList();

   public WebAppType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<WebAppType<T>> getPersistenceUnitRef();

   public List<PersistenceUnitRefType<WebAppType<T>>> getPersistenceUnitRefList();

   public WebAppType<T> removeAllPostConstruct();

   public LifecycleCallbackType<WebAppType<T>> getPostConstruct();

   public List<LifecycleCallbackType<WebAppType<T>>> getPostConstructList();

   public WebAppType<T> removeAllPreDestroy();

   public LifecycleCallbackType<WebAppType<T>> getPreDestroy();

   public List<LifecycleCallbackType<WebAppType<T>>> getPreDestroyList();

   public WebAppType<T> removeAllDataSource();

   public DataSourceType<WebAppType<T>> getDataSource();

   public List<DataSourceType<WebAppType<T>>> getDataSourceList();

   public WebAppType<T> setVersion(String version);

   public String getVersion();

   public WebAppType<T> setMetadataComplete(Boolean metadataComplete);

   public Boolean isMetadataComplete();

   public WebAppType<T> setModuleName(String moduleName);

   public String getModuleName();

   public WebAppType<T> removeAbsoluteOrdering();

   public AbsoluteOrderingType<WebAppType<T>> getAbsoluteOrdering();

}
