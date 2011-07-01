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
 * Generation date :2011-07-01T19:50:22.163-04:00
 */
public interface WebFragmentType<T> extends Child<T>
{
   public WebFragmentType<T> distributable();

   public Boolean isDistributable();

   public WebFragmentType<T> removeAllContextParam();

   public ParamValueType<WebFragmentType<T>> contextParam();

   public List<ParamValueType<WebFragmentType<T>>> getContextParamList();

   public WebFragmentType<T> removeAllFilter();

   public FilterType<WebFragmentType<T>> filter();

   public List<FilterType<WebFragmentType<T>>> getFilterList();

   public WebFragmentType<T> removeAllFilterMapping();

   public FilterMappingType<WebFragmentType<T>> filterMapping();

   public List<FilterMappingType<WebFragmentType<T>>> getFilterMappingList();

   public WebFragmentType<T> removeAllListener();

   public ListenerType<WebFragmentType<T>> listener();

   public List<ListenerType<WebFragmentType<T>>> getListenerList();

   public WebFragmentType<T> removeAllServlet();

   public ServletType<WebFragmentType<T>> servlet();

   public List<ServletType<WebFragmentType<T>>> getServletList();

   public WebFragmentType<T> removeAllServletMapping();

   public ServletMappingType<WebFragmentType<T>> servletMapping();

   public List<ServletMappingType<WebFragmentType<T>>> getServletMappingList();

   public WebFragmentType<T> removeAllSessionConfig();

   public SessionConfigType<WebFragmentType<T>> sessionConfig();

   public List<SessionConfigType<WebFragmentType<T>>> getSessionConfigList();

   public WebFragmentType<T> removeAllMimeMapping();

   public MimeMappingType<WebFragmentType<T>> mimeMapping();

   public List<MimeMappingType<WebFragmentType<T>>> getMimeMappingList();

   public WebFragmentType<T> removeAllWelcomeFileList();

   public WelcomeFileListType<WebFragmentType<T>> welcomeFileList();

   public List<WelcomeFileListType<WebFragmentType<T>>> getWelcomeFileListList();

   public WebFragmentType<T> removeAllErrorPage();

   public ErrorPageType<WebFragmentType<T>> errorPage();

   public List<ErrorPageType<WebFragmentType<T>>> getErrorPageList();

   public WebFragmentType<T> removeAllJspConfig();

   public JspConfigType<WebFragmentType<T>> jspConfig();

   public List<JspConfigType<WebFragmentType<T>>> getJspConfigList();

   public WebFragmentType<T> removeAllSecurityConstraint();

   public SecurityConstraintType<WebFragmentType<T>> securityConstraint();

   public List<SecurityConstraintType<WebFragmentType<T>>> getSecurityConstraintList();

   public WebFragmentType<T> removeAllLoginConfig();

   public LoginConfigType<WebFragmentType<T>> loginConfig();

   public List<LoginConfigType<WebFragmentType<T>>> getLoginConfigList();

   public WebFragmentType<T> removeAllSecurityRole();

   public SecurityRoleType<WebFragmentType<T>> securityRole();

   public List<SecurityRoleType<WebFragmentType<T>>> getSecurityRoleList();

   public WebFragmentType<T> removeAllMessageDestination();

   public MessageDestinationType<WebFragmentType<T>> messageDestination();

   public List<MessageDestinationType<WebFragmentType<T>>> getMessageDestinationList();

   public WebFragmentType<T> removeAllLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList();

   public List<LocaleEncodingMappingListType<WebFragmentType<T>>> getLocaleEncodingMappingListList();

   public WebFragmentType<T> setDescription(String description);

   public WebFragmentType<T> setDescriptionList(String... values);

   public WebFragmentType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public WebFragmentType<T> setDisplayName(String displayName);

   public WebFragmentType<T> setDisplayNameList(String... values);

   public WebFragmentType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();

   public WebFragmentType<T> removeAllIcon();

   public IconType<WebFragmentType<T>> icon();

   public List<IconType<WebFragmentType<T>>> getIconList();

   public WebFragmentType<T> removeAllEnvEntry();

   public EnvEntryType<WebFragmentType<T>> envEntry();

   public List<EnvEntryType<WebFragmentType<T>>> getEnvEntryList();

   public WebFragmentType<T> removeAllEjbRef();

   public EjbRefType<WebFragmentType<T>> ejbRef();

   public List<EjbRefType<WebFragmentType<T>>> getEjbRefList();

   public WebFragmentType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<WebFragmentType<T>> ejbLocalRef();

   public List<EjbLocalRefType<WebFragmentType<T>>> getEjbLocalRefList();

   public WebFragmentType<T> removeAllResourceRef();

   public ResourceRefType<WebFragmentType<T>> resourceRef();

   public List<ResourceRefType<WebFragmentType<T>>> getResourceRefList();

   public WebFragmentType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef();

   public List<ResourceEnvRefType<WebFragmentType<T>>> getResourceEnvRefList();

   public WebFragmentType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef();

   public List<MessageDestinationRefType<WebFragmentType<T>>> getMessageDestinationRefList();

   public WebFragmentType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef();

   public List<PersistenceContextRefType<WebFragmentType<T>>> getPersistenceContextRefList();

   public WebFragmentType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef();

   public List<PersistenceUnitRefType<WebFragmentType<T>>> getPersistenceUnitRefList();

   public WebFragmentType<T> removeAllPostConstruct();

   public LifecycleCallbackType<WebFragmentType<T>> postConstruct();

   public List<LifecycleCallbackType<WebFragmentType<T>>> getPostConstructList();

   public WebFragmentType<T> removeAllPreDestroy();

   public LifecycleCallbackType<WebFragmentType<T>> preDestroy();

   public List<LifecycleCallbackType<WebFragmentType<T>>> getPreDestroyList();

   public WebFragmentType<T> removeAllDataSource();

   public DataSourceType<WebFragmentType<T>> dataSource();

   public List<DataSourceType<WebFragmentType<T>>> getDataSourceList();

   public WebFragmentType<T> setVersion(WebAppVersionType version);

   public WebFragmentType<T> setVersion(String version);

   public WebFragmentType<T> removeVersion();

   public WebAppVersionType getVersion();

   public String getVersionAsString();

   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete);

   public WebFragmentType<T> removeMetadataComplete();

   public Boolean isMetadataComplete();

   public WebFragmentType<T> setName(String name);

   public WebFragmentType<T> setNameList(String... values);

   public WebFragmentType<T> removeAllName();

   public List<String> getNameList();

   public WebFragmentType<T> removeAllOrdering();

   public OrderingType<WebFragmentType<T>> ordering();

   public List<OrderingType<WebFragmentType<T>>> getOrderingList();

}
