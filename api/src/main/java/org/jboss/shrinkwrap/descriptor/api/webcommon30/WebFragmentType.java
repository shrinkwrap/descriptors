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
public interface WebFragmentType<T> extends Child<T>
{
   public WebFragmentType<T> distributable();

   public WebFragmentType<T> setContextParam(ParamValueType<T> contextParam);
   public ParamValueType<T> getContextParam();

   public WebFragmentType<T> setFilter(FilterType<T> filter);
   public FilterType<T> getFilter();

   public WebFragmentType<T> setFilterMapping(FilterMappingType<T> filterMapping);
   public FilterMappingType<T> getFilterMapping();

   public WebFragmentType<T> setListener(ListenerType<T> listener);
   public ListenerType<T> getListener();

   public WebFragmentType<T> setServlet(ServletType<T> servlet);
   public ServletType<T> getServlet();

   public WebFragmentType<T> setServletMapping(ServletMappingType<T> servletMapping);
   public ServletMappingType<T> getServletMapping();

   public WebFragmentType<T> setSessionConfig(SessionConfigType<T> sessionConfig);
   public SessionConfigType<T> getSessionConfig();

   public WebFragmentType<T> setMimeMapping(MimeMappingType<T> mimeMapping);
   public MimeMappingType<T> getMimeMapping();

   public WebFragmentType<T> setWelcomeFileList(WelcomeFileListType<T> welcomeFileList);
   public WelcomeFileListType<T> getWelcomeFileList();

   public WebFragmentType<T> setErrorPage(ErrorPageType<T> errorPage);
   public ErrorPageType<T> getErrorPage();

   public WebFragmentType<T> setJspConfig(JspConfigType<T> jspConfig);
   public JspConfigType<T> getJspConfig();

   public WebFragmentType<T> setSecurityConstraint(SecurityConstraintType<T> securityConstraint);
   public SecurityConstraintType<T> getSecurityConstraint();

   public WebFragmentType<T> setLoginConfig(LoginConfigType<T> loginConfig);
   public LoginConfigType<T> getLoginConfig();

   public WebFragmentType<T> setSecurityRole(SecurityRoleType<T> securityRole);
   public SecurityRoleType<T> getSecurityRole();

   public WebFragmentType<T> setMessageDestination(MessageDestinationType<T> messageDestination);
   public MessageDestinationType<T> getMessageDestination();

   public WebFragmentType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<T> localeEncodingMappingList);
   public LocaleEncodingMappingListType<T> getLocaleEncodingMappingList();

   public WebFragmentType<T> setDescription(String description);
   public String getDescription();

   public WebFragmentType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public WebFragmentType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public WebFragmentType<T> setEnvEntry(EnvEntryType<T> envEntry);
   public EnvEntryType<T> getEnvEntry();

   public WebFragmentType<T> setEjbRef(EjbRefType<T> ejbRef);
   public EjbRefType<T> getEjbRef();

   public WebFragmentType<T> setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);
   public EjbLocalRefType<T> getEjbLocalRef();

   public WebFragmentType<T> setResourceRef(ResourceRefType<T> resourceRef);
   public ResourceRefType<T> getResourceRef();

   public WebFragmentType<T> setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);
   public ResourceEnvRefType<T> getResourceEnvRef();

   public WebFragmentType<T> setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);
   public MessageDestinationRefType<T> getMessageDestinationRef();

   public WebFragmentType<T> setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);
   public PersistenceContextRefType<T> getPersistenceContextRef();

   public WebFragmentType<T> setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);
   public PersistenceUnitRefType<T> getPersistenceUnitRef();

   public WebFragmentType<T> setPostConstruct(LifecycleCallbackType<T> postConstruct);
   public LifecycleCallbackType<T> getPostConstruct();

   public WebFragmentType<T> setPreDestroy(LifecycleCallbackType<T> preDestroy);
   public LifecycleCallbackType<T> getPreDestroy();

   public WebFragmentType<T> setDataSource(DataSourceType<T> dataSource);
   public DataSourceType<T> getDataSource();

   public WebFragmentType<T> setServiceRef(ServiceRefType<T> serviceRef);
   public ServiceRefType<T> getServiceRef();

   public WebFragmentType<T> setVersion(WebAppVersionType version);
   public WebAppVersionType getVersion();

   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete);
   public Boolean getMetadataComplete();

   public WebFragmentType<T> setName(String name);
   public String getName();

   public WebFragmentType<T> setOrdering(OrderingType<T> ordering);
   public OrderingType<T> getOrdering();
}
