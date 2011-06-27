package org.jboss.shrinkwrap.descriptor.api.webapp30; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:30:58.763-04:00
 */
public interface WebApp30Descriptor extends Descriptor, DescriptorNamespace<WebApp30Descriptor>
{
   public WebApp30Descriptor distributable();
   public Boolean isDistributable();

   public WebApp30Descriptor removeContextParam();

   public ParamValueType<WebApp30Descriptor> contextParam();



   public WebApp30Descriptor removeFilter();

   public FilterType<WebApp30Descriptor> filter();



   public WebApp30Descriptor removeFilterMapping();

   public FilterMappingType<WebApp30Descriptor> filterMapping();



   public WebApp30Descriptor removeListener();

   public ListenerType<WebApp30Descriptor> listener();



   public WebApp30Descriptor removeServlet();

   public ServletType<WebApp30Descriptor> servlet();



   public WebApp30Descriptor removeServletMapping();

   public ServletMappingType<WebApp30Descriptor> servletMapping();



   public WebApp30Descriptor removeSessionConfig();

   public SessionConfigType<WebApp30Descriptor> sessionConfig();



   public WebApp30Descriptor removeMimeMapping();

   public MimeMappingType<WebApp30Descriptor> mimeMapping();



   public WebApp30Descriptor removeWelcomeFileList();

   public WelcomeFileListType<WebApp30Descriptor> welcomeFileList();



   public WebApp30Descriptor removeErrorPage();

   public ErrorPageType<WebApp30Descriptor> errorPage();



   public WebApp30Descriptor removeJspConfig();

   public JspConfigType<WebApp30Descriptor> jspConfig();



   public WebApp30Descriptor removeSecurityConstraint();

   public SecurityConstraintType<WebApp30Descriptor> securityConstraint();



   public WebApp30Descriptor removeLoginConfig();

   public LoginConfigType<WebApp30Descriptor> loginConfig();



   public WebApp30Descriptor removeSecurityRole();

   public SecurityRoleType<WebApp30Descriptor> securityRole();



   public WebApp30Descriptor removeMessageDestination();

   public MessageDestinationType<WebApp30Descriptor> messageDestination();



   public WebApp30Descriptor removeLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<WebApp30Descriptor> localeEncodingMappingList();



   public WebApp30Descriptor setDescription(String description);
   public WebApp30Descriptor setDescriptionList(String ... values);
   public WebApp30Descriptor removeAllDescription();

   public List<String> getDescriptionList();


   public WebApp30Descriptor setDisplayName(String displayName);
   public WebApp30Descriptor setDisplayNameList(String ... values);
   public WebApp30Descriptor removeAllDisplayName();

   public List<String> getDisplayNameList();


   public WebApp30Descriptor removeAllIcon();

   public IconType<WebApp30Descriptor> icon();
   public List<IconType<WebApp30Descriptor>> getIconList();



   public WebApp30Descriptor removeAllEnvEntry();

   public EnvEntryType<WebApp30Descriptor> envEntry();
   public List<EnvEntryType<WebApp30Descriptor>> getEnvEntryList();



   public WebApp30Descriptor removeAllEjbRef();

   public EjbRefType<WebApp30Descriptor> ejbRef();
   public List<EjbRefType<WebApp30Descriptor>> getEjbRefList();



   public WebApp30Descriptor removeAllEjbLocalRef();

   public EjbLocalRefType<WebApp30Descriptor> ejbLocalRef();
   public List<EjbLocalRefType<WebApp30Descriptor>> getEjbLocalRefList();



   public WebApp30Descriptor removeAllResourceRef();

   public ResourceRefType<WebApp30Descriptor> resourceRef();
   public List<ResourceRefType<WebApp30Descriptor>> getResourceRefList();



   public WebApp30Descriptor removeAllResourceEnvRef();

   public ResourceEnvRefType<WebApp30Descriptor> resourceEnvRef();
   public List<ResourceEnvRefType<WebApp30Descriptor>> getResourceEnvRefList();



   public WebApp30Descriptor removeAllMessageDestinationRef();

   public MessageDestinationRefType<WebApp30Descriptor> messageDestinationRef();
   public List<MessageDestinationRefType<WebApp30Descriptor>> getMessageDestinationRefList();



   public WebApp30Descriptor removeAllPersistenceContextRef();

   public PersistenceContextRefType<WebApp30Descriptor> persistenceContextRef();
   public List<PersistenceContextRefType<WebApp30Descriptor>> getPersistenceContextRefList();



   public WebApp30Descriptor removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<WebApp30Descriptor> persistenceUnitRef();
   public List<PersistenceUnitRefType<WebApp30Descriptor>> getPersistenceUnitRefList();



   public WebApp30Descriptor removeAllPostConstruct();

   public LifecycleCallbackType<WebApp30Descriptor> postConstruct();
   public List<LifecycleCallbackType<WebApp30Descriptor>> getPostConstructList();



   public WebApp30Descriptor removeAllPreDestroy();

   public LifecycleCallbackType<WebApp30Descriptor> preDestroy();
   public List<LifecycleCallbackType<WebApp30Descriptor>> getPreDestroyList();



   public WebApp30Descriptor removeAllDataSource();

   public DataSourceType<WebApp30Descriptor> dataSource();
   public List<DataSourceType<WebApp30Descriptor>> getDataSourceList();



   public WebApp30Descriptor setVersion(WebAppVersionType version);
   public WebApp30Descriptor setVersion(String version);

   public WebAppVersionType getVersion();
   public String  getVersionAsString();


   public WebApp30Descriptor setMetadataComplete(Boolean metadataComplete);

   public Boolean isMetadataComplete();


   public WebApp30Descriptor setModuleName(String moduleName);
   public WebApp30Descriptor removeModuleName();

   public String getModuleName();


   public WebApp30Descriptor removeAbsoluteOrdering();

   public AbsoluteOrderingType<WebApp30Descriptor> absoluteOrdering();


}
