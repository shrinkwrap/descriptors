package org.jboss.shrinkwrap.descriptor.api.webapp30; 

import java.util.List;

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
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface WebApp30Descriptor<T> extends Descriptor
{
   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setDistributable(Boolean distributable);

   public Boolean getDistributable();

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setContextParam(ParamValueType<T> contextParam);

   public ParamValueType<T> getContextParam();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setFilter(FilterType<T> filter);

   public FilterType<T> getFilter();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setFilterMapping(FilterMappingType<T> filterMapping);

   public FilterMappingType<T> getFilterMapping();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setListener(ListenerType<T> listener);

   public ListenerType<T> getListener();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setServlet(ServletType<T> servlet);

   public ServletType<T> getServlet();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setServletMapping(ServletMappingType<T> servletMapping);

   public ServletMappingType<T> getServletMapping();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setSessionConfig(SessionConfigType<T> sessionConfig);

   public SessionConfigType<T> getSessionConfig();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setMimeMapping(MimeMappingType<T> mimeMapping);

   public MimeMappingType<T> getMimeMapping();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setWelcomeFileList(WelcomeFileListType<T> welcomeFileList);

   public WelcomeFileListType<T> getWelcomeFileList();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setErrorPage(ErrorPageType<T> errorPage);

   public ErrorPageType<T> getErrorPage();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setJspConfig(JspConfigType<T> jspConfig);

   public JspConfigType<T> getJspConfig();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setSecurityConstraint(SecurityConstraintType<T> securityConstraint);

   public SecurityConstraintType<T> getSecurityConstraint();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setLoginConfig(LoginConfigType<T> loginConfig);

   public LoginConfigType<T> getLoginConfig();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setSecurityRole(SecurityRoleType<T> securityRole);

   public SecurityRoleType<T> getSecurityRole();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setMessageDestination(MessageDestinationType<T> messageDestination);

   public MessageDestinationType<T> getMessageDestination();


   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setLocaleEncodingMappingList(LocaleEncodingMappingListType<T> localeEncodingMappingList);

   public LocaleEncodingMappingListType<T> getLocaleEncodingMappingList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public T setDescription(String description);
   public T setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

   public T setDisplayName(String displayName);
   public T setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setIcon(IconType<T> icon);

   public IconType<T> getIcon();
   public List<IconType<T>> getIconList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setEnvEntry(EnvEntryType<T> envEntry);

   public EnvEntryType<T> getEnvEntry();
   public List<EnvEntryType<T>> getEnvEntryList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setEjbRef(EjbRefType<T> ejbRef);

   public EjbRefType<T> getEjbRef();
   public List<EjbRefType<T>> getEjbRefList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setEjbLocalRef(EjbLocalRefType<T> ejbLocalRef);

   public EjbLocalRefType<T> getEjbLocalRef();
   public List<EjbLocalRefType<T>> getEjbLocalRefList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setResourceRef(ResourceRefType<T> resourceRef);

   public ResourceRefType<T> getResourceRef();
   public List<ResourceRefType<T>> getResourceRefList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setResourceEnvRef(ResourceEnvRefType<T> resourceEnvRef);

   public ResourceEnvRefType<T> getResourceEnvRef();
   public List<ResourceEnvRefType<T>> getResourceEnvRefList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setMessageDestinationRef(MessageDestinationRefType<T> messageDestinationRef);

   public MessageDestinationRefType<T> getMessageDestinationRef();
   public List<MessageDestinationRefType<T>> getMessageDestinationRefList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setPersistenceContextRef(PersistenceContextRefType<T> persistenceContextRef);

   public PersistenceContextRefType<T> getPersistenceContextRef();
   public List<PersistenceContextRefType<T>> getPersistenceContextRefList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setPersistenceUnitRef(PersistenceUnitRefType<T> persistenceUnitRef);

   public PersistenceUnitRefType<T> getPersistenceUnitRef();
   public List<PersistenceUnitRefType<T>> getPersistenceUnitRefList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setPostConstruct(LifecycleCallbackType<T> postConstruct);

   public LifecycleCallbackType<T> getPostConstruct();
   public List<LifecycleCallbackType<T>> getPostConstructList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setPreDestroy(LifecycleCallbackType<T> preDestroy);

   public LifecycleCallbackType<T> getPreDestroy();
   public List<LifecycleCallbackType<T>> getPreDestroyList();


   // maxOccurs = -unbounded   // isGeneric = false   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public T setDataSource(DataSourceType<T> dataSource);

   public DataSourceType<T> getDataSource();
   public List<DataSourceType<T>> getDataSourceList();



// pIsAttribute=true();
   public T setVersion(String version);

   public String getVersion();


// pIsAttribute=true();
   public T setMetadataComplete(Boolean metadataComplete);

   public Boolean getMetadataComplete();

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setModuleName(String moduleName);

   public String getModuleName();

   // maxOccurs = -   // isGeneric = false   // isAttribute = false

// otherwise;
   public T setAbsoluteOrdering(AbsoluteOrderingType<T> absoluteOrdering);

   public AbsoluteOrderingType<T> getAbsoluteOrdering();


}
