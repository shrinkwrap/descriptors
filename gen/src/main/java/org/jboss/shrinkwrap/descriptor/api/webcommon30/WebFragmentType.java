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
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface WebFragmentType<T> extends Child<T>
{
   public WebFragmentType<T> distributable();
   public Boolean isDistributable();

   public WebFragmentType<T> removeContextParam();

   public ParamValueType<WebFragmentType<T>> contextParam();



   public WebFragmentType<T> removeFilter();

   public FilterType<WebFragmentType<T>> filter();



   public WebFragmentType<T> removeFilterMapping();

   public FilterMappingType<WebFragmentType<T>> filterMapping();



   public WebFragmentType<T> removeListener();

   public ListenerType<WebFragmentType<T>> listener();



   public WebFragmentType<T> removeServlet();

   public ServletType<WebFragmentType<T>> servlet();



   public WebFragmentType<T> removeServletMapping();

   public ServletMappingType<WebFragmentType<T>> servletMapping();



   public WebFragmentType<T> removeSessionConfig();

   public SessionConfigType<WebFragmentType<T>> sessionConfig();



   public WebFragmentType<T> removeMimeMapping();

   public MimeMappingType<WebFragmentType<T>> mimeMapping();



   public WebFragmentType<T> removeWelcomeFileList();

   public WelcomeFileListType<WebFragmentType<T>> welcomeFileList();



   public WebFragmentType<T> removeErrorPage();

   public ErrorPageType<WebFragmentType<T>> errorPage();



   public WebFragmentType<T> removeJspConfig();

   public JspConfigType<WebFragmentType<T>> jspConfig();



   public WebFragmentType<T> removeSecurityConstraint();

   public SecurityConstraintType<WebFragmentType<T>> securityConstraint();



   public WebFragmentType<T> removeLoginConfig();

   public LoginConfigType<WebFragmentType<T>> loginConfig();



   public WebFragmentType<T> removeSecurityRole();

   public SecurityRoleType<WebFragmentType<T>> securityRole();



   public WebFragmentType<T> removeMessageDestination();

   public MessageDestinationType<WebFragmentType<T>> messageDestination();



   public WebFragmentType<T> removeLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList();



   public WebFragmentType<T> setDescription(String description);
   public WebFragmentType<T> setDescriptionList(String ... values);
   public WebFragmentType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public WebFragmentType<T> setDisplayName(String displayName);
   public WebFragmentType<T> setDisplayNameList(String ... values);
   public WebFragmentType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();


   public WebFragmentType<T> removeAllIcon();

   public IconType<WebFragmentType<T>> icon();
   public List<IconType<WebFragmentType<T>>> getIconList();



   public WebFragmentType<T> removeAllEnvEntry();

   public EnvEntryType<WebFragmentType<T>> envEntry();
   public List<EnvEntryType<WebFragmentType<T>>> getEnvEntryList();



   public WebFragmentType<T> removeAllEjbRef();

   public EjbRefType<WebFragmentType<T>> ejbRef();
   public List<EjbRefType<WebFragmentType<T>>> getEjbRefList();



   public WebFragmentType<T> removeAllEjbLocalRef();

   public EjbLocalRefType<WebFragmentType<T>> ejbLocalRef();
   public List<EjbLocalRefType<WebFragmentType<T>>> getEjbLocalRefList();



   public WebFragmentType<T> removeAllResourceRef();

   public ResourceRefType<WebFragmentType<T>> resourceRef();
   public List<ResourceRefType<WebFragmentType<T>>> getResourceRefList();



   public WebFragmentType<T> removeAllResourceEnvRef();

   public ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef();
   public List<ResourceEnvRefType<WebFragmentType<T>>> getResourceEnvRefList();



   public WebFragmentType<T> removeAllMessageDestinationRef();

   public MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef();
   public List<MessageDestinationRefType<WebFragmentType<T>>> getMessageDestinationRefList();



   public WebFragmentType<T> removeAllPersistenceContextRef();

   public PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef();
   public List<PersistenceContextRefType<WebFragmentType<T>>> getPersistenceContextRefList();



   public WebFragmentType<T> removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef();
   public List<PersistenceUnitRefType<WebFragmentType<T>>> getPersistenceUnitRefList();



   public WebFragmentType<T> removeAllPostConstruct();

   public LifecycleCallbackType<WebFragmentType<T>> postConstruct();
   public List<LifecycleCallbackType<WebFragmentType<T>>> getPostConstructList();



   public WebFragmentType<T> removeAllPreDestroy();

   public LifecycleCallbackType<WebFragmentType<T>> preDestroy();
   public List<LifecycleCallbackType<WebFragmentType<T>>> getPreDestroyList();



   public WebFragmentType<T> removeAllDataSource();

   public DataSourceType<WebFragmentType<T>> dataSource();
   public List<DataSourceType<WebFragmentType<T>>> getDataSourceList();



   public WebFragmentType<T> setVersion(String version);

   public String getVersion();


   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete);

   public Boolean isMetadataComplete();


   public WebFragmentType<T> setName(String name);
   public WebFragmentType<T> removeName();

   public String getName();



   public WebFragmentType<T> removeOrdering();

   public OrderingType<WebFragmentType<T>> ordering();


}
