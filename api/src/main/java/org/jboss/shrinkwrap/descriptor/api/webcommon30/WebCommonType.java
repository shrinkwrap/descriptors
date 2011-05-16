package org.jboss.shrinkwrap.descriptor.api.webcommon30;

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
import org.jboss.shrinkwrap.descriptor.api.webservices13.ServiceRefType;

/**
 * WebCommonType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebCommonType<T> extends DescriptionGroup<T>
{
   public WebCommonType<T> distributable();

   public ParamValueType<T> contextParam();

   public FilterType<T> filter(); 
   
   public FilterMappingType<T> filterMapping();

   public ListenerType<T> listener();

   public ServletType<T> servlet();

   public ServletMappingType<T> servletMapping();

   public SessionConfigType<T> sessionConfig();

   public MimeMappingType<T> mimeMapping();

   public WelcomeFileListType<T> welcomeFileList();

   public ErrorPageType<T> errorPage();

   public JspConfigType<T> jspConfig();

   public SecurityConstraintType<T> securityConstraint();

   public LoginConfigType<T> loginConfig();

   public SecurityRoleType<T> securityRole();

   public EnvEntryType<T> envEntry();

   public EjbRefType<T> ejbRef();

   public EjbLocalRefType<T> ejbLocalRef();

   public ServiceRefType<T> serviceRef();

   public ResourceRefType<T> resourceRef();

   public ResourceEnvRefType<T> resourceEnvRef();

   public MessageDestinationRefType<T> messageDestinationRef();

   public PersistenceContextRefType<T> persistenceContextRef();

   public PersistenceUnitRefType<T> persistenceUnitRef();

   public LifecycleCallbackType<T> postConstruct();

   public LifecycleCallbackType<T> preDestroy();

   public DataSourceType<T> dataSource();

   public MessageDestinationType<T> messageDestination();

   public WebCommonType<T> localeEncodingMappingList(LocaleEncodingMappingType[] localEncodingMappings);

}
