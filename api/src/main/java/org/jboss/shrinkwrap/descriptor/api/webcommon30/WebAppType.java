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
 * Generation date :2011-07-05T19:40:43.525+02:00
 */
public interface WebAppType<T> extends Child<T>
{
   public WebAppType<T> distributable();

   public Boolean isDistributable();

   public WebAppType<T> removeAllContextParam();

   public ParamValueType<WebAppType<T>> contextParam();

   public List<ParamValueType<WebAppType<T>>> getContextParamList();

   public WebAppType<T> removeAllFilter();

   public FilterType<WebAppType<T>> filter();

   public List<FilterType<WebAppType<T>>> getFilterList();

   public WebAppType<T> removeAllFilterMapping();

   public FilterMappingType<WebAppType<T>> filterMapping();

   public List<FilterMappingType<WebAppType<T>>> getFilterMappingList();

   public WebAppType<T> removeAllListener();

   public ListenerType<WebAppType<T>> listener();

   public List<ListenerType<WebAppType<T>>> getListenerList();

   public WebAppType<T> removeAllServlet();

   public ServletType<WebAppType<T>> servlet();

   public List<ServletType<WebAppType<T>>> getServletList();

   public WebAppType<T> removeAllServletMapping();

   public ServletMappingType<WebAppType<T>> servletMapping();

   public List<ServletMappingType<WebAppType<T>>> getServletMappingList();

   public WebAppType<T> removeAllSessionConfig();

   public SessionConfigType<WebAppType<T>> sessionConfig();

   public List<SessionConfigType<WebAppType<T>>> getSessionConfigList();

   public WebAppType<T> removeAllMimeMapping();

   public MimeMappingType<WebAppType<T>> mimeMapping();

   public List<MimeMappingType<WebAppType<T>>> getMimeMappingList();

   public WebAppType<T> removeAllWelcomeFileList();

   public WelcomeFileListType<WebAppType<T>> welcomeFileList();

   public List<WelcomeFileListType<WebAppType<T>>> getWelcomeFileListList();

   public WebAppType<T> removeAllErrorPage();

   public ErrorPageType<WebAppType<T>> errorPage();

   public List<ErrorPageType<WebAppType<T>>> getErrorPageList();

   public WebAppType<T> removeAllJspConfig();

   public JspConfigType<WebAppType<T>> jspConfig();

   public List<JspConfigType<WebAppType<T>>> getJspConfigList();

   public WebAppType<T> removeAllSecurityConstraint();

   public SecurityConstraintType<WebAppType<T>> securityConstraint();

   public List<SecurityConstraintType<WebAppType<T>>> getSecurityConstraintList();

   public WebAppType<T> removeAllLoginConfig();

   public LoginConfigType<WebAppType<T>> loginConfig();

   public List<LoginConfigType<WebAppType<T>>> getLoginConfigList();

   public WebAppType<T> removeAllSecurityRole();

   public SecurityRoleType<WebAppType<T>> securityRole();

   public List<SecurityRoleType<WebAppType<T>>> getSecurityRoleList();

   public WebAppType<T> removeAllMessageDestination();

   public MessageDestinationType<WebAppType<T>> messageDestination();

   public List<MessageDestinationType<WebAppType<T>>> getMessageDestinationList();

   public WebAppType<T> removeAllLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList();

   public List<LocaleEncodingMappingListType<WebAppType<T>>> getLocaleEncodingMappingListList();

   public WebAppType<T> setDescription(String description);

   public WebAppType<T> setDescriptionList(String... values);

   public WebAppType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public WebAppType<T> setDisplayName(String displayName);

   public WebAppType<T> setDisplayNameList(String... values);

   public WebAppType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();

   public WebAppType<T> removeAllIcon();

   public IconType<WebAppType<T>> icon();

   public List<IconType<WebAppType<T>>> getIconList();

   public WebAppType<T> removeAllEnvEntry();

   public EnvEntryType<WebAppType<T>> envEntry();

   public List<EnvEntryType<WebAppType<T>>> getEnvEntryList();

   public WebAppType<T> removeAllEjbRef();

   public EjbRefType<WebAppType<T>> ejbRef();

   public List<EjbRefType<WebAppType<T>>> getEjbRefList();

   public WebAppType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<WebAppType<T>> ejbLocalRef();

   public List<EjbLocalRefType<WebAppType<T>>> getEjbLocalRefList();

   public WebAppType<T> removeAllResourceRef();

   public ResourceRefType<WebAppType<T>> resourceRef();

   public List<ResourceRefType<WebAppType<T>>> getResourceRefList();

   public WebAppType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<WebAppType<T>> resourceEnvRef();

   public List<ResourceEnvRefType<WebAppType<T>>> getResourceEnvRefList();

   public WebAppType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<WebAppType<T>> messageDestinationRef();

   public List<MessageDestinationRefType<WebAppType<T>>> getMessageDestinationRefList();

   public WebAppType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<WebAppType<T>> persistenceContextRef();

   public List<PersistenceContextRefType<WebAppType<T>>> getPersistenceContextRefList();

   public WebAppType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef();

   public List<PersistenceUnitRefType<WebAppType<T>>> getPersistenceUnitRefList();

   public WebAppType<T> removeAllPostConstruct();

   public LifecycleCallbackType<WebAppType<T>> postConstruct();

   public List<LifecycleCallbackType<WebAppType<T>>> getPostConstructList();

   public WebAppType<T> removeAllPreDestroy();

   public LifecycleCallbackType<WebAppType<T>> preDestroy();

   public List<LifecycleCallbackType<WebAppType<T>>> getPreDestroyList();

   public WebAppType<T> removeAllDataSource();

   public DataSourceType<WebAppType<T>> dataSource();

   public List<DataSourceType<WebAppType<T>>> getDataSourceList();

   public WebAppType<T> setVersion(WebAppVersionType version);

   public WebAppType<T> setVersion(String version);

   public WebAppType<T> removeVersion();

   public WebAppVersionType getVersion();

   public String getVersionAsString();

   public WebAppType<T> setMetadataComplete(Boolean metadataComplete);

   public WebAppType<T> removeMetadataComplete();

   public Boolean isMetadataComplete();

   public WebAppType<T> setModuleName(String moduleName);

   public WebAppType<T> setModuleNameList(String... values);

   public WebAppType<T> removeAllModuleName();

   public List<String> getModuleNameList();

   public WebAppType<T> removeAllAbsoluteOrdering();

   public AbsoluteOrderingType<WebAppType<T>> absoluteOrdering();

   public List<AbsoluteOrderingType<WebAppType<T>>> getAbsoluteOrderingList();

}
