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
 * Generation date :2011-06-22T14:39:12.971-04:00
 */
public interface WebAppType<T> extends Child<T>
{
   public WebAppType<T> distributable();

   public Boolean isDistributable();

   public WebAppType<T> removeContextParam();

   public ParamValueType<WebAppType<T>> contextParam();

   public WebAppType<T> removeFilter();

   public FilterType<WebAppType<T>> filter();

   public WebAppType<T> removeFilterMapping();

   public FilterMappingType<WebAppType<T>> filterMapping();

   public WebAppType<T> removeListener();

   public ListenerType<WebAppType<T>> listener();

   public WebAppType<T> removeServlet();

   public ServletType<WebAppType<T>> servlet();

   public WebAppType<T> removeServletMapping();

   public ServletMappingType<WebAppType<T>> servletMapping();

   public WebAppType<T> removeSessionConfig();

   public SessionConfigType<WebAppType<T>> sessionConfig();

   public WebAppType<T> removeMimeMapping();

   public MimeMappingType<WebAppType<T>> mimeMapping();

   public WebAppType<T> removeWelcomeFileList();

   public WelcomeFileListType<WebAppType<T>> welcomeFileList();

   public WebAppType<T> removeErrorPage();

   public ErrorPageType<WebAppType<T>> errorPage();

   public WebAppType<T> removeJspConfig();

   public JspConfigType<WebAppType<T>> jspConfig();

   public WebAppType<T> removeSecurityConstraint();

   public SecurityConstraintType<WebAppType<T>> securityConstraint();

   public WebAppType<T> removeLoginConfig();

   public LoginConfigType<WebAppType<T>> loginConfig();

   public WebAppType<T> removeSecurityRole();

   public SecurityRoleType<WebAppType<T>> securityRole();

   public WebAppType<T> removeMessageDestination();

   public MessageDestinationType<WebAppType<T>> messageDestination();

   public WebAppType<T> removeLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList();

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

   public WebAppType<T> setVersion(String version);

   public String getVersion();

   public WebAppType<T> setMetadataComplete(Boolean metadataComplete);

   public Boolean isMetadataComplete();

   public WebAppType<T> setModuleName(String moduleName);

   public WebAppType<T> removeModuleName();

   public String getModuleName();

   public WebAppType<T> removeAbsoluteOrdering();

   public AbsoluteOrderingType<WebAppType<T>> absoluteOrdering();

}
