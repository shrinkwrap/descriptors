package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
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
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface WebAppType<T> extends Child<T>
{
   @NodeInfo(xmlName = "distributable")
   public WebAppType<T> distributable();

   @NodeInfo(xmlName = "context-param")
   public ParamValueType<WebAppType<T>> contextParam();

   @NodeInfo(xmlName = "filter")
   public FilterType<WebAppType<T>> filter();

   @NodeInfo(xmlName = "filter-mapping")
   public FilterMappingType<WebAppType<T>> filterMapping();

   @NodeInfo(xmlName = "listener")
   public ListenerType<WebAppType<T>> listener();

   @NodeInfo(xmlName = "servlet")
   public ServletType<WebAppType<T>> servlet();

   @NodeInfo(xmlName = "servlet-mapping")
   public ServletMappingType<WebAppType<T>> servletMapping();

   @NodeInfo(xmlName = "session-config")
   public SessionConfigType<WebAppType<T>> sessionConfig();

   @NodeInfo(xmlName = "mime-mapping")
   public MimeMappingType<WebAppType<T>> mimeMapping();

   @NodeInfo(xmlName = "welcome-file-list")
   public WelcomeFileListType<WebAppType<T>> welcomeFileList();

   @NodeInfo(xmlName = "error-page")
   public ErrorPageType<WebAppType<T>> errorPage();

   @NodeInfo(xmlName = "jsp-config")
   public JspConfigType<WebAppType<T>> jspConfig();

   @NodeInfo(xmlName = "security-constraint")
   public SecurityConstraintType<WebAppType<T>> securityConstraint();

   @NodeInfo(xmlName = "login-config")
   public LoginConfigType<WebAppType<T>> loginConfig();

   @NodeInfo(xmlName = "security-role")
   public SecurityRoleType<WebAppType<T>> securityRole();

   @NodeInfo(xmlName = "message-destination")
   public MessageDestinationType<WebAppType<T>> messageDestination();

   @NodeInfo(xmlName = "locale-encoding-mapping-list")
   public LocaleEncodingMappingListType<WebAppType<T>> localeEncodingMappingList();

   public WebAppType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public WebAppType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<WebAppType<T>> icon();

   @NodeInfo(xmlName = "env-entry")
   public EnvEntryType<WebAppType<T>> envEntry();

   @NodeInfo(xmlName = "ejb-ref")
   public EjbRefType<WebAppType<T>> ejbRef();

   @NodeInfo(xmlName = "ejb-local-ref")
   public EjbLocalRefType<WebAppType<T>> ejbLocalRef();

   @NodeInfo(xmlName = "resource-ref")
   public ResourceRefType<WebAppType<T>> resourceRef();

   @NodeInfo(xmlName = "resource-env-ref")
   public ResourceEnvRefType<WebAppType<T>> resourceEnvRef();

   @NodeInfo(xmlName = "message-destination-ref")
   public MessageDestinationRefType<WebAppType<T>> messageDestinationRef();

   @NodeInfo(xmlName = "persistence-context-ref")
   public PersistenceContextRefType<WebAppType<T>> persistenceContextRef();

   @NodeInfo(xmlName = "persistence-unit-ref")
   public PersistenceUnitRefType<WebAppType<T>> persistenceUnitRef();

   @NodeInfo(xmlName = "post-construct")
   public LifecycleCallbackType<WebAppType<T>> postConstruct();

   @NodeInfo(xmlName = "pre-destroy")
   public LifecycleCallbackType<WebAppType<T>> preDestroy();

   @NodeInfo(xmlName = "data-source")
   public DataSourceType<WebAppType<T>> dataSource();

   @NodeInfo(xmlName = "service-ref")
   public ServiceRefType<WebAppType<T>> serviceRef();

   public WebAppType<T> setVersion(WebAppVersionType version);

   public WebAppType<T> setVersion(String version);

   @NodeInfo(xmlName = "version")
   public String getVersion();

   public WebAppType<T> setMetadataComplete(Boolean metadataComplete);

   @NodeInfo(xmlName = "metadata-complete")
   public Boolean getMetadataComplete();

   public WebAppType<T> setModuleName(String moduleName);

   @NodeInfo(xmlName = "module-name")
   public String getModuleName();

   @NodeInfo(xmlName = "absolute-ordering")
   public AbsoluteOrderingType<WebAppType<T>> absoluteOrdering();
}
