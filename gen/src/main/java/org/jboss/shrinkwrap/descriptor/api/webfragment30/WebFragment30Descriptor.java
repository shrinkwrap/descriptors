package org.jboss.shrinkwrap.descriptor.api.webfragment30;

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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 */
public interface WebFragment30Descriptor extends Descriptor, DescriptorNamespace<WebFragment30Descriptor>
{
   public WebFragment30Descriptor distributable();

   public Boolean isDistributable();

   public WebFragment30Descriptor removeAllContextParam();

   public ParamValueType<WebFragment30Descriptor> contextParam();

   public List<ParamValueType<WebFragment30Descriptor>> getContextParamList();

   public WebFragment30Descriptor removeAllFilter();

   public FilterType<WebFragment30Descriptor> filter();

   public List<FilterType<WebFragment30Descriptor>> getFilterList();

   public WebFragment30Descriptor removeAllFilterMapping();

   public FilterMappingType<WebFragment30Descriptor> filterMapping();

   public List<FilterMappingType<WebFragment30Descriptor>> getFilterMappingList();

   public WebFragment30Descriptor removeAllListener();

   public ListenerType<WebFragment30Descriptor> listener();

   public List<ListenerType<WebFragment30Descriptor>> getListenerList();

   public WebFragment30Descriptor removeAllServlet();

   public ServletType<WebFragment30Descriptor> servlet();

   public List<ServletType<WebFragment30Descriptor>> getServletList();

   public WebFragment30Descriptor removeAllServletMapping();

   public ServletMappingType<WebFragment30Descriptor> servletMapping();

   public List<ServletMappingType<WebFragment30Descriptor>> getServletMappingList();

   public WebFragment30Descriptor removeAllSessionConfig();

   public SessionConfigType<WebFragment30Descriptor> sessionConfig();

   public List<SessionConfigType<WebFragment30Descriptor>> getSessionConfigList();

   public WebFragment30Descriptor removeAllMimeMapping();

   public MimeMappingType<WebFragment30Descriptor> mimeMapping();

   public List<MimeMappingType<WebFragment30Descriptor>> getMimeMappingList();

   public WebFragment30Descriptor removeAllWelcomeFileList();

   public WelcomeFileListType<WebFragment30Descriptor> welcomeFileList();

   public List<WelcomeFileListType<WebFragment30Descriptor>> getWelcomeFileListList();

   public WebFragment30Descriptor removeAllErrorPage();

   public ErrorPageType<WebFragment30Descriptor> errorPage();

   public List<ErrorPageType<WebFragment30Descriptor>> getErrorPageList();

   public WebFragment30Descriptor removeAllJspConfig();

   public JspConfigType<WebFragment30Descriptor> jspConfig();

   public List<JspConfigType<WebFragment30Descriptor>> getJspConfigList();

   public WebFragment30Descriptor removeAllSecurityConstraint();

   public SecurityConstraintType<WebFragment30Descriptor> securityConstraint();

   public List<SecurityConstraintType<WebFragment30Descriptor>> getSecurityConstraintList();

   public WebFragment30Descriptor removeAllLoginConfig();

   public LoginConfigType<WebFragment30Descriptor> loginConfig();

   public List<LoginConfigType<WebFragment30Descriptor>> getLoginConfigList();

   public WebFragment30Descriptor removeAllSecurityRole();

   public SecurityRoleType<WebFragment30Descriptor> securityRole();

   public List<SecurityRoleType<WebFragment30Descriptor>> getSecurityRoleList();

   public WebFragment30Descriptor removeAllMessageDestination();

   public MessageDestinationType<WebFragment30Descriptor> messageDestination();

   public List<MessageDestinationType<WebFragment30Descriptor>> getMessageDestinationList();

   public WebFragment30Descriptor removeAllLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<WebFragment30Descriptor> localeEncodingMappingList();

   public List<LocaleEncodingMappingListType<WebFragment30Descriptor>> getLocaleEncodingMappingListList();

   public WebFragment30Descriptor setDescription(String description);

   public WebFragment30Descriptor setDescriptionList(String... values);

   public WebFragment30Descriptor removeAllDescription();

   public List<String> getDescriptionList();

   public WebFragment30Descriptor setDisplayName(String displayName);

   public WebFragment30Descriptor setDisplayNameList(String... values);

   public WebFragment30Descriptor removeAllDisplayName();

   public List<String> getDisplayNameList();

   public WebFragment30Descriptor removeAllIcon();

   public IconType<WebFragment30Descriptor> icon();

   public List<IconType<WebFragment30Descriptor>> getIconList();

   public WebFragment30Descriptor removeAllEnvEntry();

   public EnvEntryType<WebFragment30Descriptor> envEntry();

   public List<EnvEntryType<WebFragment30Descriptor>> getEnvEntryList();

   public WebFragment30Descriptor removeAllEjbRef();

   public EjbRefType<WebFragment30Descriptor> ejbRef();

   public List<EjbRefType<WebFragment30Descriptor>> getEjbRefList();

   public WebFragment30Descriptor removeAllEjbLocalRef();

   public EjbLocalRefType<WebFragment30Descriptor> ejbLocalRef();

   public List<EjbLocalRefType<WebFragment30Descriptor>> getEjbLocalRefList();

   public WebFragment30Descriptor removeAllResourceRef();

   public ResourceRefType<WebFragment30Descriptor> resourceRef();

   public List<ResourceRefType<WebFragment30Descriptor>> getResourceRefList();

   public WebFragment30Descriptor removeAllResourceEnvRef();

   public ResourceEnvRefType<WebFragment30Descriptor> resourceEnvRef();

   public List<ResourceEnvRefType<WebFragment30Descriptor>> getResourceEnvRefList();

   public WebFragment30Descriptor removeAllMessageDestinationRef();

   public MessageDestinationRefType<WebFragment30Descriptor> messageDestinationRef();

   public List<MessageDestinationRefType<WebFragment30Descriptor>> getMessageDestinationRefList();

   public WebFragment30Descriptor removeAllPersistenceContextRef();

   public PersistenceContextRefType<WebFragment30Descriptor> persistenceContextRef();

   public List<PersistenceContextRefType<WebFragment30Descriptor>> getPersistenceContextRefList();

   public WebFragment30Descriptor removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<WebFragment30Descriptor> persistenceUnitRef();

   public List<PersistenceUnitRefType<WebFragment30Descriptor>> getPersistenceUnitRefList();

   public WebFragment30Descriptor removeAllPostConstruct();

   public LifecycleCallbackType<WebFragment30Descriptor> postConstruct();

   public List<LifecycleCallbackType<WebFragment30Descriptor>> getPostConstructList();

   public WebFragment30Descriptor removeAllPreDestroy();

   public LifecycleCallbackType<WebFragment30Descriptor> preDestroy();

   public List<LifecycleCallbackType<WebFragment30Descriptor>> getPreDestroyList();

   public WebFragment30Descriptor removeAllDataSource();

   public DataSourceType<WebFragment30Descriptor> dataSource();

   public List<DataSourceType<WebFragment30Descriptor>> getDataSourceList();

   public WebFragment30Descriptor setVersion(WebAppVersionType version);

   public WebFragment30Descriptor setVersion(String version);

   public WebFragment30Descriptor removeVersion();

   public WebAppVersionType getVersion();

   public String getVersionAsString();

   public WebFragment30Descriptor setMetadataComplete(Boolean metadataComplete);

   public WebFragment30Descriptor removeMetadataComplete();

   public Boolean isMetadataComplete();

   public WebFragment30Descriptor setName(String name);

   public WebFragment30Descriptor setNameList(String... values);

   public WebFragment30Descriptor removeAllName();

   public List<String> getNameList();

   public WebFragment30Descriptor removeAllOrdering();

   public OrderingType<WebFragment30Descriptor> ordering();

   public List<OrderingType<WebFragment30Descriptor>> getOrderingList();

}
