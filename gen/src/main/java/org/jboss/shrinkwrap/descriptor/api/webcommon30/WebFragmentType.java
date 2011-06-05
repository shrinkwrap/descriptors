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
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface WebFragmentType<T> extends Child<T>
{

   public WebFragmentType<T> setDistributable(Boolean distributable);
   public Boolean getDistributable();

   public WebFragmentType<T> setContextParam(ParamValueType<WebFragmentType<T>> contextParam);
   public ParamValueType<WebFragmentType<T>> getContextParam();


   public WebFragmentType<T> setFilter(FilterType<WebFragmentType<T>> filter);
   public FilterType<WebFragmentType<T>> getFilter();


   public WebFragmentType<T> setFilterMapping(FilterMappingType<WebFragmentType<T>> filterMapping);
   public FilterMappingType<WebFragmentType<T>> getFilterMapping();


   public WebFragmentType<T> setListener(ListenerType<WebFragmentType<T>> listener);
   public ListenerType<WebFragmentType<T>> getListener();


   public WebFragmentType<T> setServlet(ServletType<WebFragmentType<T>> servlet);
   public ServletType<WebFragmentType<T>> getServlet();


   public WebFragmentType<T> setServletMapping(ServletMappingType<WebFragmentType<T>> servletMapping);
   public ServletMappingType<WebFragmentType<T>> getServletMapping();


   public WebFragmentType<T> setSessionConfig(SessionConfigType<WebFragmentType<T>> sessionConfig);
   public SessionConfigType<WebFragmentType<T>> getSessionConfig();


   public WebFragmentType<T> setMimeMapping(MimeMappingType<WebFragmentType<T>> mimeMapping);
   public MimeMappingType<WebFragmentType<T>> getMimeMapping();


   public WebFragmentType<T> setWelcomeFileList(WelcomeFileListType<WebFragmentType<T>> welcomeFileList);
   public WelcomeFileListType<WebFragmentType<T>> getWelcomeFileList();


   public WebFragmentType<T> setErrorPage(ErrorPageType<WebFragmentType<T>> errorPage);
   public ErrorPageType<WebFragmentType<T>> getErrorPage();


   public WebFragmentType<T> setJspConfig(JspConfigType<WebFragmentType<T>> jspConfig);
   public JspConfigType<WebFragmentType<T>> getJspConfig();


   public WebFragmentType<T> setSecurityConstraint(SecurityConstraintType<WebFragmentType<T>> securityConstraint);
   public SecurityConstraintType<WebFragmentType<T>> getSecurityConstraint();


   public WebFragmentType<T> setLoginConfig(LoginConfigType<WebFragmentType<T>> loginConfig);
   public LoginConfigType<WebFragmentType<T>> getLoginConfig();


   public WebFragmentType<T> setSecurityRole(SecurityRoleType<WebFragmentType<T>> securityRole);
   public SecurityRoleType<WebFragmentType<T>> getSecurityRole();


   public WebFragmentType<T> setMessageDestination(MessageDestinationType<WebFragmentType<T>> messageDestination);
   public MessageDestinationType<WebFragmentType<T>> getMessageDestination();


   public WebFragmentType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList);
   public LocaleEncodingMappingListType<WebFragmentType<T>> getLocaleEncodingMappingList();


   public WebFragmentType<T> setDescription(String description);
   public String getDescription();

   public WebFragmentType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public WebFragmentType<T> setIcon(IconType<WebFragmentType<T>> icon);
   public IconType<WebFragmentType<T>> getIcon();


   public WebFragmentType<T> setEnvEntry(EnvEntryType<WebFragmentType<T>> envEntry);
   public EnvEntryType<WebFragmentType<T>> getEnvEntry();


   public WebFragmentType<T> setEjbRef(EjbRefType<WebFragmentType<T>> ejbRef);
   public EjbRefType<WebFragmentType<T>> getEjbRef();


   public WebFragmentType<T> setEjbLocalRef(EjbLocalRefType<WebFragmentType<T>> ejbLocalRef);
   public EjbLocalRefType<WebFragmentType<T>> getEjbLocalRef();


   public WebFragmentType<T> setResourceRef(ResourceRefType<WebFragmentType<T>> resourceRef);
   public ResourceRefType<WebFragmentType<T>> getResourceRef();


   public WebFragmentType<T> setResourceEnvRef(ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef);
   public ResourceEnvRefType<WebFragmentType<T>> getResourceEnvRef();


   public WebFragmentType<T> setMessageDestinationRef(MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef);
   public MessageDestinationRefType<WebFragmentType<T>> getMessageDestinationRef();


   public WebFragmentType<T> setPersistenceContextRef(PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef);
   public PersistenceContextRefType<WebFragmentType<T>> getPersistenceContextRef();


   public WebFragmentType<T> setPersistenceUnitRef(PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef);
   public PersistenceUnitRefType<WebFragmentType<T>> getPersistenceUnitRef();


   public WebFragmentType<T> setPostConstruct(LifecycleCallbackType<WebFragmentType<T>> postConstruct);
   public LifecycleCallbackType<WebFragmentType<T>> getPostConstruct();


   public WebFragmentType<T> setPreDestroy(LifecycleCallbackType<WebFragmentType<T>> preDestroy);
   public LifecycleCallbackType<WebFragmentType<T>> getPreDestroy();


   public WebFragmentType<T> setDataSource(DataSourceType<WebFragmentType<T>> dataSource);
   public DataSourceType<WebFragmentType<T>> getDataSource();


   public WebFragmentType<T> setServiceRef(ServiceRefType<WebFragmentType<T>> serviceRef);
   public ServiceRefType<WebFragmentType<T>> getServiceRef();


   public WebFragmentType<T> setVersion(String version);
   public String getVersion();

   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete);
   public Boolean getMetadataComplete();

   public WebFragmentType<T> setName(String name);
   public String getName();


   public WebFragmentType<T> setOrdering(OrderingType<WebFragmentType<T>> ordering);
   public OrderingType<WebFragmentType<T>> getOrdering();

}
