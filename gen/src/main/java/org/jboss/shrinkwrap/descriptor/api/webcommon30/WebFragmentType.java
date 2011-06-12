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
public interface WebFragmentType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setDistributable(Boolean distributable);

   public Boolean getDistributable();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setContextParam(ParamValueType<WebFragmentType<T>> contextParam);

   public ParamValueType<WebFragmentType<T>> getContextParam();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setFilter(FilterType<WebFragmentType<T>> filter);

   public FilterType<WebFragmentType<T>> getFilter();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setFilterMapping(FilterMappingType<WebFragmentType<T>> filterMapping);

   public FilterMappingType<WebFragmentType<T>> getFilterMapping();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setListener(ListenerType<WebFragmentType<T>> listener);

   public ListenerType<WebFragmentType<T>> getListener();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setServlet(ServletType<WebFragmentType<T>> servlet);

   public ServletType<WebFragmentType<T>> getServlet();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setServletMapping(ServletMappingType<WebFragmentType<T>> servletMapping);

   public ServletMappingType<WebFragmentType<T>> getServletMapping();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setSessionConfig(SessionConfigType<WebFragmentType<T>> sessionConfig);

   public SessionConfigType<WebFragmentType<T>> getSessionConfig();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setMimeMapping(MimeMappingType<WebFragmentType<T>> mimeMapping);

   public MimeMappingType<WebFragmentType<T>> getMimeMapping();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setWelcomeFileList(WelcomeFileListType<WebFragmentType<T>> welcomeFileList);

   public WelcomeFileListType<WebFragmentType<T>> getWelcomeFileList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setErrorPage(ErrorPageType<WebFragmentType<T>> errorPage);

   public ErrorPageType<WebFragmentType<T>> getErrorPage();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setJspConfig(JspConfigType<WebFragmentType<T>> jspConfig);

   public JspConfigType<WebFragmentType<T>> getJspConfig();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setSecurityConstraint(SecurityConstraintType<WebFragmentType<T>> securityConstraint);

   public SecurityConstraintType<WebFragmentType<T>> getSecurityConstraint();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setLoginConfig(LoginConfigType<WebFragmentType<T>> loginConfig);

   public LoginConfigType<WebFragmentType<T>> getLoginConfig();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setSecurityRole(SecurityRoleType<WebFragmentType<T>> securityRole);

   public SecurityRoleType<WebFragmentType<T>> getSecurityRole();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setMessageDestination(MessageDestinationType<WebFragmentType<T>> messageDestination);

   public MessageDestinationType<WebFragmentType<T>> getMessageDestination();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList);

   public LocaleEncodingMappingListType<WebFragmentType<T>> getLocaleEncodingMappingList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setDescription(String description);
   public WebFragmentType<T> setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebFragmentType<T> setDisplayName(String displayName);
   public WebFragmentType<T> setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setIcon(IconType<WebFragmentType<T>> icon);

   public IconType<WebFragmentType<T>> getIcon();
   public List<IconType<WebFragmentType<T>>> getIconList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setEnvEntry(EnvEntryType<WebFragmentType<T>> envEntry);

   public EnvEntryType<WebFragmentType<T>> getEnvEntry();
   public List<EnvEntryType<WebFragmentType<T>>> getEnvEntryList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setEjbRef(EjbRefType<WebFragmentType<T>> ejbRef);

   public EjbRefType<WebFragmentType<T>> getEjbRef();
   public List<EjbRefType<WebFragmentType<T>>> getEjbRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setEjbLocalRef(EjbLocalRefType<WebFragmentType<T>> ejbLocalRef);

   public EjbLocalRefType<WebFragmentType<T>> getEjbLocalRef();
   public List<EjbLocalRefType<WebFragmentType<T>>> getEjbLocalRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setResourceRef(ResourceRefType<WebFragmentType<T>> resourceRef);

   public ResourceRefType<WebFragmentType<T>> getResourceRef();
   public List<ResourceRefType<WebFragmentType<T>>> getResourceRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setResourceEnvRef(ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef);

   public ResourceEnvRefType<WebFragmentType<T>> getResourceEnvRef();
   public List<ResourceEnvRefType<WebFragmentType<T>>> getResourceEnvRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setMessageDestinationRef(MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef);

   public MessageDestinationRefType<WebFragmentType<T>> getMessageDestinationRef();
   public List<MessageDestinationRefType<WebFragmentType<T>>> getMessageDestinationRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setPersistenceContextRef(PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef);

   public PersistenceContextRefType<WebFragmentType<T>> getPersistenceContextRef();
   public List<PersistenceContextRefType<WebFragmentType<T>>> getPersistenceContextRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setPersistenceUnitRef(PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef);

   public PersistenceUnitRefType<WebFragmentType<T>> getPersistenceUnitRef();
   public List<PersistenceUnitRefType<WebFragmentType<T>>> getPersistenceUnitRefList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setPostConstruct(LifecycleCallbackType<WebFragmentType<T>> postConstruct);

   public LifecycleCallbackType<WebFragmentType<T>> getPostConstruct();
   public List<LifecycleCallbackType<WebFragmentType<T>>> getPostConstructList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setPreDestroy(LifecycleCallbackType<WebFragmentType<T>> preDestroy);

   public LifecycleCallbackType<WebFragmentType<T>> getPreDestroy();
   public List<LifecycleCallbackType<WebFragmentType<T>>> getPreDestroyList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public WebFragmentType<T> setDataSource(DataSourceType<WebFragmentType<T>> dataSource);

   public DataSourceType<WebFragmentType<T>> getDataSource();
   public List<DataSourceType<WebFragmentType<T>>> getDataSourceList();



// pIsAttribute=true();
   public WebFragmentType<T> setVersion(String version);

   public String getVersion();


// pIsAttribute=true();
   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete);

   public Boolean getMetadataComplete();

   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setName(String name);

   public String getName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebFragmentType<T> setOrdering(OrderingType<WebFragmentType<T>> ordering);

   public OrderingType<WebFragmentType<T>> getOrdering();


}
