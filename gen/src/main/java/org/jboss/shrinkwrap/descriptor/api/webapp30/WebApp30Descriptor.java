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
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public interface WebApp30Descriptor<T> extends Descriptor
{
   public T distributable();
   public Boolean isDistributable();

   public T removeContextParam();

   public ParamValueType<T> contextParam();



   public T removeFilter();

   public FilterType<T> filter();



   public T removeFilterMapping();

   public FilterMappingType<T> filterMapping();



   public T removeListener();

   public ListenerType<T> listener();



   public T removeServlet();

   public ServletType<T> servlet();



   public T removeServletMapping();

   public ServletMappingType<T> servletMapping();



   public T removeSessionConfig();

   public SessionConfigType<T> sessionConfig();



   public T removeMimeMapping();

   public MimeMappingType<T> mimeMapping();



   public T removeWelcomeFileList();

   public WelcomeFileListType<T> welcomeFileList();



   public T removeErrorPage();

   public ErrorPageType<T> errorPage();



   public T removeJspConfig();

   public JspConfigType<T> jspConfig();



   public T removeSecurityConstraint();

   public SecurityConstraintType<T> securityConstraint();



   public T removeLoginConfig();

   public LoginConfigType<T> loginConfig();



   public T removeSecurityRole();

   public SecurityRoleType<T> securityRole();



   public T removeMessageDestination();

   public MessageDestinationType<T> messageDestination();



   public T removeLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<T> localeEncodingMappingList();



   public T setDescription(String description);
   public T setDescriptionList(String ... values);
   public T removeAllDescription();

   public List<String> getDescriptionList();


   public T setDisplayName(String displayName);
   public T setDisplayNameList(String ... values);
   public T removeAllDisplayName();

   public List<String> getDisplayNameList();


   public T removeAllIcon();

   public IconType<T> icon();
   public List<IconType<T>> getIconList();



   public T removeAllEnvEntry();

   public EnvEntryType<T> envEntry();
   public List<EnvEntryType<T>> getEnvEntryList();



   public T removeAllEjbRef();

   public EjbRefType<T> ejbRef();
   public List<EjbRefType<T>> getEjbRefList();



   public T removeAllEjbLocalRef();

   public EjbLocalRefType<T> ejbLocalRef();
   public List<EjbLocalRefType<T>> getEjbLocalRefList();



   public T removeAllResourceRef();

   public ResourceRefType<T> resourceRef();
   public List<ResourceRefType<T>> getResourceRefList();



   public T removeAllResourceEnvRef();

   public ResourceEnvRefType<T> resourceEnvRef();
   public List<ResourceEnvRefType<T>> getResourceEnvRefList();



   public T removeAllMessageDestinationRef();

   public MessageDestinationRefType<T> messageDestinationRef();
   public List<MessageDestinationRefType<T>> getMessageDestinationRefList();



   public T removeAllPersistenceContextRef();

   public PersistenceContextRefType<T> persistenceContextRef();
   public List<PersistenceContextRefType<T>> getPersistenceContextRefList();



   public T removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<T> persistenceUnitRef();
   public List<PersistenceUnitRefType<T>> getPersistenceUnitRefList();



   public T removeAllPostConstruct();

   public LifecycleCallbackType<T> postConstruct();
   public List<LifecycleCallbackType<T>> getPostConstructList();



   public T removeAllPreDestroy();

   public LifecycleCallbackType<T> preDestroy();
   public List<LifecycleCallbackType<T>> getPreDestroyList();



   public T removeAllDataSource();

   public DataSourceType<T> dataSource();
   public List<DataSourceType<T>> getDataSourceList();



   public T setVersion(String version);

   public String getVersion();


   public T setMetadataComplete(Boolean metadataComplete);

   public Boolean isMetadataComplete();


   public T setModuleName(String moduleName);
   public T removeModuleName();

   public String getModuleName();


   public T removeAbsoluteOrdering();

   public AbsoluteOrderingType<T> absoluteOrdering();


}
