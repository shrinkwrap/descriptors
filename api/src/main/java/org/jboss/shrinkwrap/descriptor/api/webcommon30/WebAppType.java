package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

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
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface WebAppType<T> extends Child<T>
{
   public WebAppType<T> distributable();

   public WebAppType<T> setContextParam(ParamValueType<T> contextParam);
   public ParamValueType<T> getContextParam();

   public WebAppType<T> setFilter(FilterType<T> filter);
   public FilterType<T> getFilter();

   public WebAppType<T> setFilterMapping(FilterMappingType<T> filterMapping);
   public FilterMappingType<T> getFilterMapping();

   public WebAppType<T> setListener(ListenerType<T> listener);
   public ListenerType<T> getListener();

   public WebAppType<T> setServlet(ServletType<T> servlet);
   public ServletType<T> getServlet();

   public WebAppType<T> setServletMapping(ServletMappingType<T> servletMapping);
   public ServletMappingType<T> getServletMapping();

   public WebAppType<T> setSessionConfig(SessionConfigType<T> sessionConfig);
   public SessionConfigType<T> getSessionConfig();

   public WebAppType<T> setMimeMapping(MimeMappingType<T> mimeMapping);
   public MimeMappingType<T> getMimeMapping();

   public WebAppType<T> setWelcomeFileList(WelcomeFileListType<T> welcomeFileList);
   public WelcomeFileListType<T> getWelcomeFileList();

   public WebAppType<T> setErrorPage(ErrorPageType<T> errorPage);
   public ErrorPageType<T> getErrorPage();

   public WebAppType<T> setJspConfig(JspConfigType<T> jspConfig);
   public JspConfigType<T> getJspConfig();

   public WebAppType<T> setSecurityConstraint(SecurityConstraintType<T> securityConstraint);
   public SecurityConstraintType<T> getSecurityConstraint();

   public WebAppType<T> setLoginConfig(LoginConfigType<T> loginConfig);
   public LoginConfigType<T> getLoginConfig();

   public WebAppType<T> setSecurityRole(SecurityRoleType<T> securityRole);
   public SecurityRoleType<T> getSecurityRole();

   public WebAppType<T> setMessageDestination(MessageDestinationType<T> messageDestination);
   public MessageDestinationType<T> getMessageDestination();

   public WebAppType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<T> localeEncodingMappingList);
   public LocaleEncodingMappingListType<T> getLocaleEncodingMappingList();

   public WebAppType<T> setDescription(String description);
   public String getDescription();

   public WebAppType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public WebAppType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public WebAppType<T> setEnvEntry(EnvEntryType<T> envEntry);
   public EnvEntryType<T> getEnvEntry();

   public WebAppType<T> setEjbRef(EjbRefType<T> ejbRef);
   public EjbRefType<T> getEjbRef();

   public WebAppType<T> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);
   public EjbLocalRefType<T> getEjbLocalRef();

   public WebAppType<T> setResourceRef(ResourceRefType<T> resourceRef);
   public ResourceRefType<T> getResourceRef();

   public WebAppType<T> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);
   public ResourceEnvRefType<T> getResourceEnvRef();

   public WebAppType<T> setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);
   public MessageDestinationRefType<T> getMessageDestinationRef();

   public WebAppType<T> setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);
   public PersistenceContextRefType<T> getPersistenceContextRef();

   public WebAppType<T> setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);
   public PersistenceUnitRefType<T> getPersistenceUnitRef();

   public WebAppType<T> setPostConstruct(LifecycleCallbackType<T> postConstruct);
   public LifecycleCallbackType<T> getPostConstruct();

   public WebAppType<T> setPreDestroy(LifecycleCallbackType<T> preDestroy);
   public LifecycleCallbackType<T> getPreDestroy();

   public WebAppType<T> setDataSource(DataSourceType<T> dataSource);
   public DataSourceType<T> getDataSource();

   public WebAppType<T> setServiceRef(ServiceRefType<T> serviceRef);
   public ServiceRefType<T> getServiceRef();

   public WebAppType<T> setVersion(WebAppVersionType version);
   public WebAppVersionType getVersion();

   public WebAppType<T> setMetadataComplete(Boolean metadataComplete);
   public Boolean getMetadataComplete();

   public WebAppType<T> setModuleName(String moduleName);
   public String getModuleName();

   public WebAppType<T> setAbsoluteOrdering(AbsoluteOrderingType<T> absoluteOrdering);
   public AbsoluteOrderingType<T> getAbsoluteOrdering();
}
