package org.jboss.shrinkwrap.descriptor.api.webapp30; 

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface WebApp30Descriptor<T> extends Descriptor
{

   public T setDistributable(Boolean distributable);
   public Boolean getDistributable();

   public T setContextParam(ParamValueType<T> contextParam);
   public ParamValueType<T> getContextParam();


   public T setFilter(FilterType<T> filter);
   public FilterType<T> getFilter();


   public T setFilterMapping(FilterMappingType<T> filterMapping);
   public FilterMappingType<T> getFilterMapping();


   public T setListener(ListenerType<T> listener);
   public ListenerType<T> getListener();


   public T setServlet(ServletType<T> servlet);
   public ServletType<T> getServlet();


   public T setServletMapping(ServletMappingType<T> servletMapping);
   public ServletMappingType<T> getServletMapping();


   public T setSessionConfig(SessionConfigType<T> sessionConfig);
   public SessionConfigType<T> getSessionConfig();


   public T setMimeMapping(MimeMappingType<T> mimeMapping);
   public MimeMappingType<T> getMimeMapping();


   public T setWelcomeFileList(WelcomeFileListType<T> welcomeFileList);
   public WelcomeFileListType<T> getWelcomeFileList();


   public T setErrorPage(ErrorPageType<T> errorPage);
   public ErrorPageType<T> getErrorPage();


   public T setJspConfig(JspConfigType<T> jspConfig);
   public JspConfigType<T> getJspConfig();


   public T setSecurityConstraint(SecurityConstraintType<T> securityConstraint);
   public SecurityConstraintType<T> getSecurityConstraint();


   public T setLoginConfig(LoginConfigType<T> loginConfig);
   public LoginConfigType<T> getLoginConfig();


   public T setSecurityRole(SecurityRoleType<T> securityRole);
   public SecurityRoleType<T> getSecurityRole();


   public T setMessageDestination(MessageDestinationType<T> messageDestination);
   public MessageDestinationType<T> getMessageDestination();


   public T setLocaleEncodingMappingList(LocaleEncodingMappingListType<T> localeEncodingMappingList);
   public LocaleEncodingMappingListType<T> getLocaleEncodingMappingList();


   public T setDescription(String description);
   public String getDescription();

   public T setDisplayName(String displayName);
   public String getDisplayName();

   public T setIcon(IconType<T> icon);
   public IconType<T> getIcon();


   public T setEnvEntry(EnvEntryType<T> envEntry);
   public EnvEntryType<T> getEnvEntry();


   public T setEjbRef(EjbRefType<T> ejbRef);
   public EjbRefType<T> getEjbRef();


   public T setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);
   public EjbLocalRefType<T> getEjbLocalRef();


   public T setResourceRef(ResourceRefType<T> resourceRef);
   public ResourceRefType<T> getResourceRef();


   public T setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);
   public ResourceEnvRefType<T> getResourceEnvRef();


   public T setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);
   public MessageDestinationRefType<T> getMessageDestinationRef();


   public T setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);
   public PersistenceContextRefType<T> getPersistenceContextRef();


   public T setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);
   public PersistenceUnitRefType<T> getPersistenceUnitRef();


   public T setPostConstruct(LifecycleCallbackType<T> postConstruct);
   public LifecycleCallbackType<T> getPostConstruct();


   public T setPreDestroy(LifecycleCallbackType<T> preDestroy);
   public LifecycleCallbackType<T> getPreDestroy();


   public T setDataSource(DataSourceType<T> dataSource);
   public DataSourceType<T> getDataSource();


   public T setServiceRef(ServiceRefType<T> serviceRef);
   public ServiceRefType<T> getServiceRef();


   public T setVersion(String version);
   public String getVersion();

   public T setMetadataComplete(Boolean metadataComplete);
   public Boolean getMetadataComplete();

   public T setModuleName(String moduleName);
   public String getModuleName();

   public T setAbsoluteOrdering(AbsoluteOrderingType<T> absoluteOrdering);
   public AbsoluteOrderingType<T> getAbsoluteOrdering();

}
