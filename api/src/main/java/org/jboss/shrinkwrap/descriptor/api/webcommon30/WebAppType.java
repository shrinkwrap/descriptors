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
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface WebAppType<T> extends Child<T>
{
   public WebAppType<T> distributable();

   public WebAppType<T> setContextParam(ParamValueType<WebAppType<T>> contextParam);
   public ParamValueType<WebAppType<T>> getContextParam();

   public WebAppType<T> setFilter(FilterType<WebAppType<T>> filter);
   public FilterType<WebAppType<T>> getFilter();

   public WebAppType<T> setFilterMapping(FilterMappingType<WebAppType<T>> filterMapping);
   public FilterMappingType<WebAppType<T>> getFilterMapping();

   public WebAppType<T> setListener(ListenerType<WebAppType<T>> listener);
   public ListenerType<WebAppType<T>> getListener();

   public WebAppType<T> setServlet(ServletType<WebAppType<T>> servlet);
   public ServletType<WebAppType<T>> getServlet();

   public WebAppType<T> setServletMapping(ServletMappingType<WebAppType<T>> servletMapping);
   public ServletMappingType<WebAppType<T>> getServletMapping();

   public WebAppType<T> setSessionConfig(SessionConfigType<WebAppType<T>> sessionConfig);
   public SessionConfigType<WebAppType<T>> getSessionConfig();

   public WebAppType<T> setMimeMapping(MimeMappingType<WebAppType<T>> mimeMapping);
   public MimeMappingType<WebAppType<T>> getMimeMapping();

   public WebAppType<T> setWelcomeFileList(WelcomeFileListType<WebAppType<T>> welcomeFileList);
   public WelcomeFileListType<WebAppType<T>> getWelcomeFileList();

   public WebAppType<T> setErrorPage(ErrorPageType<WebAppType<T>> errorPage);
   public ErrorPageType<WebAppType<T>> getErrorPage();

   public WebAppType<T> setJspConfig(JspConfigType<WebAppType<T>> jspConfig);
   public JspConfigType<WebAppType<T>> getJspConfig();

   public WebAppType<T> setSecurityConstraint(SecurityConstraintType<WebAppType<T>> securityConstraint);
   public SecurityConstraintType<WebAppType<T>> getSecurityConstraint();

   public WebAppType<T> setLoginConfig(LoginConfigType<WebAppType<T>> loginConfig);
   public LoginConfigType<WebAppType<T>> getLoginConfig();

   public WebAppType<T> setSecurityRole(SecurityRoleType<WebAppType<T>> securityRole);
   public SecurityRoleType<WebAppType<T>> getSecurityRole();

   public WebAppType<T> setMessageDestination(MessageDestinationType<WebAppType<T>> messageDestination);
   public MessageDestinationType<WebAppType<T>> getMessageDestination();

   public WebAppType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList);
   public LocaleEncodingMappingListType<WebAppType<T>> getLocaleEncodingMappingList();

   public WebAppType<T> setDescription(String description);
   public String getDescription();

   public WebAppType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public WebAppType<T> setIcon(IconType<WebAppType<T>> icon);
   public IconType<WebAppType<T>> getIcon();

   public WebAppType<T> setEnvEntry(EnvEntryType<WebAppType<T>> envEntry);
   public EnvEntryType<WebAppType<T>> getEnvEntry();

   public WebAppType<T> setEjbRef(EjbRefType<WebAppType<T>> ejbRef);
   public EjbRefType<WebAppType<T>> getEjbRef();

   public WebAppType<T> setEjbLocalRef(EjbLocalRefType<WebAppType<T>> ejbLocalRef);
   public EjbLocalRefType<WebAppType<T>> getEjbLocalRef();

   public WebAppType<T> setResourceRef(ResourceRefType<WebAppType<T>> resourceRef);
   public ResourceRefType<WebAppType<T>> getResourceRef();

   public WebAppType<T> setResourceEnvRef(ResourceEnvRefType<WebAppType<T>> resourceEnvRef);
   public ResourceEnvRefType<WebAppType<T>> getResourceEnvRef();

   public WebAppType<T> setMessageDestinationRef(MessageDestinationRefType<WebAppType<T>> messageDestinationRef);
   public MessageDestinationRefType<WebAppType<T>> getMessageDestinationRef();

   public WebAppType<T> setPersistenceContextRef(PersistenceContextRefType<WebAppType<T>> persistenceContextRef);
   public PersistenceContextRefType<WebAppType<T>> getPersistenceContextRef();

   public WebAppType<T> setPersistenceUnitRef(PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef);
   public PersistenceUnitRefType<WebAppType<T>> getPersistenceUnitRef();

   public WebAppType<T> setPostConstruct(LifecycleCallbackType<WebAppType<T>> postConstruct);
   public LifecycleCallbackType<WebAppType<T>> getPostConstruct();

   public WebAppType<T> setPreDestroy(LifecycleCallbackType<WebAppType<T>> preDestroy);
   public LifecycleCallbackType<WebAppType<T>> getPreDestroy();

   public WebAppType<T> setDataSource(DataSourceType<WebAppType<T>> dataSource);
   public DataSourceType<WebAppType<T>> getDataSource();

   public WebAppType<T> setServiceRef(ServiceRefType<WebAppType<T>> serviceRef);
   public ServiceRefType<WebAppType<T>> getServiceRef();

   public WebAppType<T> setVersion(WebAppVersionType version);
   public WebAppVersionType getVersion();

   public WebAppType<T> setMetadataComplete(Boolean metadataComplete);
   public Boolean getMetadataComplete();

   public WebAppType<T> setModuleName(String moduleName);
   public String getModuleName();

   public WebAppType<T> setAbsoluteOrdering(AbsoluteOrderingType<WebAppType<T>> absoluteOrdering);
   public AbsoluteOrderingType<WebAppType<T>> getAbsoluteOrdering();
}
