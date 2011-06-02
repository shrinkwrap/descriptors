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

public interface WebFragmentType<T> extends Child<T>
{
   @NodeInfo(xmlName = "distributable")
   public WebFragmentType<T> distributable();

   @NodeInfo(xmlName = "context-param")
   public ParamValueType<WebFragmentType<T>> contextParam();

   @NodeInfo(xmlName = "filter")
   public FilterType<WebFragmentType<T>> filter();

   @NodeInfo(xmlName = "filter-mapping")
   public FilterMappingType<WebFragmentType<T>> filterMapping();

   @NodeInfo(xmlName = "listener")
   public ListenerType<WebFragmentType<T>> listener();

   @NodeInfo(xmlName = "servlet")
   public ServletType<WebFragmentType<T>> servlet();

   @NodeInfo(xmlName = "servlet-mapping")
   public ServletMappingType<WebFragmentType<T>> servletMapping();

   @NodeInfo(xmlName = "session-config")
   public SessionConfigType<WebFragmentType<T>> sessionConfig();

   @NodeInfo(xmlName = "mime-mapping")
   public MimeMappingType<WebFragmentType<T>> mimeMapping();

   @NodeInfo(xmlName = "welcome-file-list")
   public WelcomeFileListType<WebFragmentType<T>> welcomeFileList();

   @NodeInfo(xmlName = "error-page")
   public ErrorPageType<WebFragmentType<T>> errorPage();

   @NodeInfo(xmlName = "jsp-config")
   public JspConfigType<WebFragmentType<T>> jspConfig();

   @NodeInfo(xmlName = "security-constraint")
   public SecurityConstraintType<WebFragmentType<T>> securityConstraint();

   @NodeInfo(xmlName = "login-config")
   public LoginConfigType<WebFragmentType<T>> loginConfig();

   @NodeInfo(xmlName = "security-role")
   public SecurityRoleType<WebFragmentType<T>> securityRole();

   @NodeInfo(xmlName = "message-destination")
   public MessageDestinationType<WebFragmentType<T>> messageDestination();

   @NodeInfo(xmlName = "locale-encoding-mapping-list")
   public LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList();

   public WebFragmentType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public WebFragmentType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<WebFragmentType<T>> icon();

   @NodeInfo(xmlName = "env-entry")
   public EnvEntryType<WebFragmentType<T>> envEntry();

   @NodeInfo(xmlName = "ejb-ref")
   public EjbRefType<WebFragmentType<T>> ejbRef();

   @NodeInfo(xmlName = "ejb-local-ref")
   public EjbLocalRefType<WebFragmentType<T>> ejbLocalRef();

   @NodeInfo(xmlName = "resource-ref")
   public ResourceRefType<WebFragmentType<T>> resourceRef();

   @NodeInfo(xmlName = "resource-env-ref")
   public ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef();

   @NodeInfo(xmlName = "message-destination-ref")
   public MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef();

   @NodeInfo(xmlName = "persistence-context-ref")
   public PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef();

   @NodeInfo(xmlName = "persistence-unit-ref")
   public PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef();

   @NodeInfo(xmlName = "post-construct")
   public LifecycleCallbackType<WebFragmentType<T>> postConstruct();

   @NodeInfo(xmlName = "pre-destroy")
   public LifecycleCallbackType<WebFragmentType<T>> preDestroy();

   @NodeInfo(xmlName = "data-source")
   public DataSourceType<WebFragmentType<T>> dataSource();

   @NodeInfo(xmlName = "service-ref")
   public ServiceRefType<WebFragmentType<T>> serviceRef();

   public WebFragmentType<T> setVersion(WebAppVersionType version);

   public WebFragmentType<T> setVersion(String version);

   @NodeInfo(xmlName = "version")
   public String getVersion();

   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete);

   @NodeInfo(xmlName = "metadata-complete")
   public Boolean getMetadataComplete();

   public WebFragmentType<T> setName(String name);

   @NodeInfo(xmlName = "name")
   public String getName();

   @NodeInfo(xmlName = "ordering")
   public OrderingType<WebFragmentType<T>> ordering();
}
