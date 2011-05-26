package org.jboss.shrinkwrap.descriptor.api.webapp30;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebCommonAttributes;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebCommonType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.api.webservices13.ServiceRefType;

/**
 * WebAppDescriptor
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebAppDescriptor extends Descriptor, DescriptionGroup<WebAppDescriptor>, WebCommonAttributes<WebAppDescriptor>
{
   public WebAppDescriptor moduleName(String moduleName); 

   public AbsoluteOrderingType<WebAppDescriptor> absoluteOrdering();
   
   /* WebCommonTypes */
   public WebCommonType<WebAppDescriptor> distributable();

   public ParamValueType<WebAppDescriptor> contextParam();

   public FilterType<WebAppDescriptor> filter(); 
   
   public FilterMappingType<WebAppDescriptor> filterMapping();

   public ListenerType<WebAppDescriptor> listener();

   public ServletType<WebAppDescriptor> servlet();

   public ServletMappingType<WebAppDescriptor> servletMapping();

   public SessionConfigType<WebAppDescriptor> sessionConfig();

   public MimeMappingType<WebAppDescriptor> mimeMapping();

   public WelcomeFileListType<WebAppDescriptor> welcomeFileList();

   public ErrorPageType<WebAppDescriptor> errorPage();

   public JspConfigType<WebAppDescriptor> jspConfig();

   public SecurityConstraintType<WebAppDescriptor> securityConstraint();

   public LoginConfigType<WebAppDescriptor> loginConfig();

   public SecurityRoleType<WebAppDescriptor> securityRole();

   public EnvEntryType<WebAppDescriptor> envEntry();

   public EjbRefType<WebAppDescriptor> ejbRef();

   public EjbLocalRefType<WebAppDescriptor> ejbLocalRef();

   public ServiceRefType<WebAppDescriptor> serviceRef();

   public ResourceRefType<WebAppDescriptor> resourceRef();

   public ResourceEnvRefType<WebAppDescriptor> resourceEnvRef();

   public MessageDestinationRefType<WebAppDescriptor> messageDestinationRef();

   public PersistenceContextRefType<WebAppDescriptor> persistenceContextRef();

   public PersistenceUnitRefType<WebAppDescriptor> persistenceUnitRef();

   public LifecycleCallbackType<WebAppDescriptor> postConstruct();

   public LifecycleCallbackType<WebAppDescriptor> preDestroy();

   public DataSourceType<WebAppDescriptor> dataSource();

   public MessageDestinationType<WebAppDescriptor> messageDestination();

   public WebCommonType<WebAppDescriptor> localeEncodingMappingList(LocaleEncodingMappingType[] localEncodingMappings);
}
