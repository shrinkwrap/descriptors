package org.jboss.shrinkwrap.descriptor.api.webapp30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 */
public interface WebApp30Descriptor extends Descriptor, DescriptorNamespace<WebApp30Descriptor>
{
   public WebApp30Descriptor distributable();

   public Boolean isDistributable();

   public WebApp30Descriptor removeAllContextParam();

   public ParamValueType<WebApp30Descriptor> contextParam();

   public List<ParamValueType<WebApp30Descriptor>> getContextParamList();

   public WebApp30Descriptor removeAllFilter();

   public FilterType<WebApp30Descriptor> filter();

   public List<FilterType<WebApp30Descriptor>> getFilterList();

   public WebApp30Descriptor removeAllFilterMapping();

   public FilterMappingType<WebApp30Descriptor> filterMapping();

   public List<FilterMappingType<WebApp30Descriptor>> getFilterMappingList();

   public WebApp30Descriptor removeAllListener();

   public ListenerType<WebApp30Descriptor> listener();

   public List<ListenerType<WebApp30Descriptor>> getListenerList();

   public WebApp30Descriptor removeAllServlet();

   public ServletType<WebApp30Descriptor> servlet();

   public List<ServletType<WebApp30Descriptor>> getServletList();

   public WebApp30Descriptor removeAllServletMapping();

   public ServletMappingType<WebApp30Descriptor> servletMapping();

   public List<ServletMappingType<WebApp30Descriptor>> getServletMappingList();

   public WebApp30Descriptor removeAllSessionConfig();

   public SessionConfigType<WebApp30Descriptor> sessionConfig();

   public List<SessionConfigType<WebApp30Descriptor>> getSessionConfigList();

   public WebApp30Descriptor removeAllMimeMapping();

   public MimeMappingType<WebApp30Descriptor> mimeMapping();

   public List<MimeMappingType<WebApp30Descriptor>> getMimeMappingList();

   public WebApp30Descriptor removeAllWelcomeFileList();

   public WelcomeFileListType<WebApp30Descriptor> welcomeFileList();

   public List<WelcomeFileListType<WebApp30Descriptor>> getWelcomeFileListList();

   public WebApp30Descriptor removeAllErrorPage();

   public ErrorPageType<WebApp30Descriptor> errorPage();

   public List<ErrorPageType<WebApp30Descriptor>> getErrorPageList();

   public WebApp30Descriptor removeAllJspConfig();

   public JspConfigType<WebApp30Descriptor> jspConfig();

   public List<JspConfigType<WebApp30Descriptor>> getJspConfigList();

   public WebApp30Descriptor removeAllSecurityConstraint();

   public SecurityConstraintType<WebApp30Descriptor> securityConstraint();

   public List<SecurityConstraintType<WebApp30Descriptor>> getSecurityConstraintList();

   public WebApp30Descriptor removeAllLoginConfig();

   public LoginConfigType<WebApp30Descriptor> loginConfig();

   public List<LoginConfigType<WebApp30Descriptor>> getLoginConfigList();

   public WebApp30Descriptor removeAllSecurityRole();

   public SecurityRoleType<WebApp30Descriptor> securityRole();

   public List<SecurityRoleType<WebApp30Descriptor>> getSecurityRoleList();

   public WebApp30Descriptor removeAllMessageDestination();

   public MessageDestinationType<WebApp30Descriptor> messageDestination();

   public List<MessageDestinationType<WebApp30Descriptor>> getMessageDestinationList();

   public WebApp30Descriptor removeAllLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<WebApp30Descriptor> localeEncodingMappingList();

   public List<LocaleEncodingMappingListType<WebApp30Descriptor>> getLocaleEncodingMappingListList();

   public WebApp30Descriptor setDescription(String description);

   public WebApp30Descriptor setDescriptionList(String... values);

   public WebApp30Descriptor removeAllDescription();

   public List<String> getDescriptionList();

   public WebApp30Descriptor setDisplayName(String displayName);

   public WebApp30Descriptor setDisplayNameList(String... values);

   public WebApp30Descriptor removeAllDisplayName();

   public List<String> getDisplayNameList();

   public WebApp30Descriptor removeAllIcon();

   public IconType<WebApp30Descriptor> icon();

   public List<IconType<WebApp30Descriptor>> getIconList();

   public WebApp30Descriptor removeAllEnvEntry();

   public EnvEntryType<WebApp30Descriptor> envEntry();

   public List<EnvEntryType<WebApp30Descriptor>> getEnvEntryList();

   public WebApp30Descriptor removeAllEjbRef();

   public EjbRefType<WebApp30Descriptor> ejbRef();

   public List<EjbRefType<WebApp30Descriptor>> getEjbRefList();

   public WebApp30Descriptor removeAllEjbLocalRef();

   public EjbLocalRefType<WebApp30Descriptor> ejbLocalRef();

   public List<EjbLocalRefType<WebApp30Descriptor>> getEjbLocalRefList();

   public WebApp30Descriptor removeAllResourceRef();

   public ResourceRefType<WebApp30Descriptor> resourceRef();

   public List<ResourceRefType<WebApp30Descriptor>> getResourceRefList();

   public WebApp30Descriptor removeAllResourceEnvRef();

   public ResourceEnvRefType<WebApp30Descriptor> resourceEnvRef();

   public List<ResourceEnvRefType<WebApp30Descriptor>> getResourceEnvRefList();

   public WebApp30Descriptor removeAllMessageDestinationRef();

   public MessageDestinationRefType<WebApp30Descriptor> messageDestinationRef();

   public List<MessageDestinationRefType<WebApp30Descriptor>> getMessageDestinationRefList();

   public WebApp30Descriptor removeAllPersistenceContextRef();

   public PersistenceContextRefType<WebApp30Descriptor> persistenceContextRef();

   public List<PersistenceContextRefType<WebApp30Descriptor>> getPersistenceContextRefList();

   public WebApp30Descriptor removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<WebApp30Descriptor> persistenceUnitRef();

   public List<PersistenceUnitRefType<WebApp30Descriptor>> getPersistenceUnitRefList();

   public WebApp30Descriptor removeAllPostConstruct();

   public LifecycleCallbackType<WebApp30Descriptor> postConstruct();

   public List<LifecycleCallbackType<WebApp30Descriptor>> getPostConstructList();

   public WebApp30Descriptor removeAllPreDestroy();

   public LifecycleCallbackType<WebApp30Descriptor> preDestroy();

   public List<LifecycleCallbackType<WebApp30Descriptor>> getPreDestroyList();

   public WebApp30Descriptor removeAllDataSource();

   public DataSourceType<WebApp30Descriptor> dataSource();

   public List<DataSourceType<WebApp30Descriptor>> getDataSourceList();

   public WebApp30Descriptor setVersion(WebAppVersionType version);

   public WebApp30Descriptor setVersion(String version);

   public WebApp30Descriptor removeVersion();

   public WebAppVersionType getVersion();

   public String getVersionAsString();

   public WebApp30Descriptor setMetadataComplete(Boolean metadataComplete);

   public WebApp30Descriptor removeMetadataComplete();

   public Boolean isMetadataComplete();

   public WebApp30Descriptor setModuleName(String moduleName);

   public WebApp30Descriptor setModuleNameList(String... values);

   public WebApp30Descriptor removeAllModuleName();

   public List<String> getModuleNameList();

   public WebApp30Descriptor removeAllAbsoluteOrdering();

   public AbsoluteOrderingType<WebApp30Descriptor> absoluteOrdering();

   public List<AbsoluteOrderingType<WebApp30Descriptor>> getAbsoluteOrderingList();

}
