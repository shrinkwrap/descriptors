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
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface WebApp30Descriptor<T> extends Descriptor
{

   public T setDistributable(Boolean distributable);

   public Boolean isDistributable();

   public T removeContextParam();

   public ParamValueType<T> getContextParam();

   public T removeFilter();

   public FilterType<T> getFilter();

   public T removeFilterMapping();

   public FilterMappingType<T> getFilterMapping();

   public T removeListener();

   public ListenerType<T> getListener();

   public T removeServlet();

   public ServletType<T> getServlet();

   public T removeServletMapping();

   public ServletMappingType<T> getServletMapping();

   public T removeSessionConfig();

   public SessionConfigType<T> getSessionConfig();

   public T removeMimeMapping();

   public MimeMappingType<T> getMimeMapping();

   public T removeWelcomeFileList();

   public WelcomeFileListType<T> getWelcomeFileList();

   public T removeErrorPage();

   public ErrorPageType<T> getErrorPage();

   public T removeJspConfig();

   public JspConfigType<T> getJspConfig();

   public T removeSecurityConstraint();

   public SecurityConstraintType<T> getSecurityConstraint();

   public T removeLoginConfig();

   public LoginConfigType<T> getLoginConfig();

   public T removeSecurityRole();

   public SecurityRoleType<T> getSecurityRole();

   public T removeMessageDestination();

   public MessageDestinationType<T> getMessageDestination();

   public T removeLocaleEncodingMappingList();

   public LocaleEncodingMappingListType<T> getLocaleEncodingMappingList();

   public T setDescription(String description);

   public T setDescription(String... values);

   public List<String> getDescriptionList();

   public T setDisplayName(String displayName);

   public T setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public T removeAllIcon();

   public IconType<T> getIcon();

   public List<IconType<T>> getIconList();

   public T removeAllEnvEntry();

   public EnvEntryType<T> getEnvEntry();

   public List<EnvEntryType<T>> getEnvEntryList();

   public T removeAllEjbRef();

   public EjbRefType<T> getEjbRef();

   public List<EjbRefType<T>> getEjbRefList();

   public T removeAllEjbLocalRef();

   public EjbLocalRefType<T> getEjbLocalRef();

   public List<EjbLocalRefType<T>> getEjbLocalRefList();

   public T removeAllResourceRef();

   public ResourceRefType<T> getResourceRef();

   public List<ResourceRefType<T>> getResourceRefList();

   public T removeAllResourceEnvRef();

   public ResourceEnvRefType<T> getResourceEnvRef();

   public List<ResourceEnvRefType<T>> getResourceEnvRefList();

   public T removeAllMessageDestinationRef();

   public MessageDestinationRefType<T> getMessageDestinationRef();

   public List<MessageDestinationRefType<T>> getMessageDestinationRefList();

   public T removeAllPersistenceContextRef();

   public PersistenceContextRefType<T> getPersistenceContextRef();

   public List<PersistenceContextRefType<T>> getPersistenceContextRefList();

   public T removeAllPersistenceUnitRef();

   public PersistenceUnitRefType<T> getPersistenceUnitRef();

   public List<PersistenceUnitRefType<T>> getPersistenceUnitRefList();

   public T removeAllPostConstruct();

   public LifecycleCallbackType<T> getPostConstruct();

   public List<LifecycleCallbackType<T>> getPostConstructList();

   public T removeAllPreDestroy();

   public LifecycleCallbackType<T> getPreDestroy();

   public List<LifecycleCallbackType<T>> getPreDestroyList();

   public T removeAllDataSource();

   public DataSourceType<T> getDataSource();

   public List<DataSourceType<T>> getDataSourceList();

   public T setVersion(String version);

   public String getVersion();

   public T setMetadataComplete(Boolean metadataComplete);

   public Boolean isMetadataComplete();

   public T setModuleName(String moduleName);

   public String getModuleName();

   public T removeAbsoluteOrdering();

   public AbsoluteOrderingType<T> getAbsoluteOrdering();

}
