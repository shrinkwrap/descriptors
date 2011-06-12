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
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface WebAppType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setDistributable(Boolean distributable);

   public Boolean getDistributable();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setContextParam(ParamValueType<WebAppType<T>> contextParam);

   public ParamValueType<WebAppType<T>> getContextParam();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setFilter(FilterType<WebAppType<T>> filter);

   public FilterType<WebAppType<T>> getFilter();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setFilterMapping(FilterMappingType<WebAppType<T>> filterMapping);

   public FilterMappingType<WebAppType<T>> getFilterMapping();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setListener(ListenerType<WebAppType<T>> listener);

   public ListenerType<WebAppType<T>> getListener();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setServlet(ServletType<WebAppType<T>> servlet);

   public ServletType<WebAppType<T>> getServlet();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setServletMapping(ServletMappingType<WebAppType<T>> servletMapping);

   public ServletMappingType<WebAppType<T>> getServletMapping();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setSessionConfig(SessionConfigType<WebAppType<T>> sessionConfig);

   public SessionConfigType<WebAppType<T>> getSessionConfig();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setMimeMapping(MimeMappingType<WebAppType<T>> mimeMapping);

   public MimeMappingType<WebAppType<T>> getMimeMapping();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setWelcomeFileList(WelcomeFileListType<WebAppType<T>> welcomeFileList);

   public WelcomeFileListType<WebAppType<T>> getWelcomeFileList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setErrorPage(ErrorPageType<WebAppType<T>> errorPage);

   public ErrorPageType<WebAppType<T>> getErrorPage();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setJspConfig(JspConfigType<WebAppType<T>> jspConfig);

   public JspConfigType<WebAppType<T>> getJspConfig();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setSecurityConstraint(SecurityConstraintType<WebAppType<T>> securityConstraint);

   public SecurityConstraintType<WebAppType<T>> getSecurityConstraint();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setLoginConfig(LoginConfigType<WebAppType<T>> loginConfig);

   public LoginConfigType<WebAppType<T>> getLoginConfig();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setSecurityRole(SecurityRoleType<WebAppType<T>> securityRole);

   public SecurityRoleType<WebAppType<T>> getSecurityRole();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setMessageDestination(MessageDestinationType<WebAppType<T>> messageDestination);

   public MessageDestinationType<WebAppType<T>> getMessageDestination();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList);

   public LocaleEncodingMappingListType<WebAppType<T>> getLocaleEncodingMappingList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setDescription(String description);
   public WebAppType<T> setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebAppType<T> setDisplayName(String displayName);
   public WebAppType<T> setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setIcon(IconType<WebAppType<T>> icon);

   public IconType<WebAppType<T>> getIcon();
   public List<IconType<WebAppType<T>>> getIconList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setEnvEntry(EnvEntryType<WebAppType<T>> envEntry);

   public EnvEntryType<WebAppType<T>> getEnvEntry();
   public List<EnvEntryType<WebAppType<T>>> getEnvEntryList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setEjbRef(EjbRefType<WebAppType<T>> ejbRef);

   public EjbRefType<WebAppType<T>> getEjbRef();
   public List<EjbRefType<WebAppType<T>>> getEjbRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setEjbLocalRef(EjbLocalRefType<WebAppType<T>> ejbLocalRef);

   public EjbLocalRefType<WebAppType<T>> getEjbLocalRef();
   public List<EjbLocalRefType<WebAppType<T>>> getEjbLocalRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setResourceRef(ResourceRefType<WebAppType<T>> resourceRef);

   public ResourceRefType<WebAppType<T>> getResourceRef();
   public List<ResourceRefType<WebAppType<T>>> getResourceRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setResourceEnvRef(ResourceEnvRefType<WebAppType<T>> resourceEnvRef);

   public ResourceEnvRefType<WebAppType<T>> getResourceEnvRef();
   public List<ResourceEnvRefType<WebAppType<T>>> getResourceEnvRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setMessageDestinationRef(MessageDestinationRefType<WebAppType<T>> messageDestinationRef);

   public MessageDestinationRefType<WebAppType<T>> getMessageDestinationRef();
   public List<MessageDestinationRefType<WebAppType<T>>> getMessageDestinationRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setPersistenceContextRef(PersistenceContextRefType<WebAppType<T>> persistenceContextRef);

   public PersistenceContextRefType<WebAppType<T>> getPersistenceContextRef();
   public List<PersistenceContextRefType<WebAppType<T>>> getPersistenceContextRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setPersistenceUnitRef(PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef);

   public PersistenceUnitRefType<WebAppType<T>> getPersistenceUnitRef();
   public List<PersistenceUnitRefType<WebAppType<T>>> getPersistenceUnitRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setPostConstruct(LifecycleCallbackType<WebAppType<T>> postConstruct);

   public LifecycleCallbackType<WebAppType<T>> getPostConstruct();
   public List<LifecycleCallbackType<WebAppType<T>>> getPostConstructList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setPreDestroy(LifecycleCallbackType<WebAppType<T>> preDestroy);

   public LifecycleCallbackType<WebAppType<T>> getPreDestroy();
   public List<LifecycleCallbackType<WebAppType<T>>> getPreDestroyList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebAppType<T> setDataSource(DataSourceType<WebAppType<T>> dataSource);

   public DataSourceType<WebAppType<T>> getDataSource();
   public List<DataSourceType<WebAppType<T>>> getDataSourceList();



// pIsAttribute=true();
   public WebAppType<T> setVersion(String version);

   public String getVersion();


// pIsAttribute=true();
   public WebAppType<T> setMetadataComplete(Boolean metadataComplete);

   public Boolean getMetadataComplete();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setModuleName(String moduleName);

   public String getModuleName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebAppType<T> setAbsoluteOrdering(AbsoluteOrderingType<WebAppType<T>> absoluteOrdering);

   public AbsoluteOrderingType<WebAppType<T>> getAbsoluteOrdering();


}
