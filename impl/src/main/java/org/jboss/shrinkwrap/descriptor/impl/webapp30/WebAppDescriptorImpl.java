package org.jboss.shrinkwrap.descriptor.impl.webapp30;

import org.jboss.shrinkwrap.descriptor.api.webcommon30.AbsoluteOrderingType;

public class WebAppDescriptorImpl //implements WebAppDescriptor<WebAppDescriptorImpl>
{

   private AbsoluteOrderingType<WebAppDescriptorImpl> absoluteOrdering;

   private String moduleName;

//   @Override
//   public AbsoluteOrderingType<WebAppDescriptorImpl> absoluteOrdering()
//   {
//      if (absoluteOrdering == null)
//      {
//         absoluteOrdering = new AbsoluteOrderingTypeImpl<WebAppDescriptorImpl>(this);
//      }
//      return absoluteOrdering;
//   }
//
//   @Override
//   public WebAppDescriptor<WebAppDescriptorImpl> moduleName(String moduleName)
//   {
//      this.moduleName = moduleName;
//      return this;
//   }
//
//   @Override
//   public String exportAsString() throws DescriptorExportException
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public void exportTo(OutputStream output) throws DescriptorExportException, IllegalArgumentException
//   {
//      // TODO Auto-generated method stub
//
//   }
//
//   @Override
//   public String getDescriptorName()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }

//   @Override
//   public ParamValueType<WebAppDescriptorImpl> contextParam()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public DataSourceType<WebAppDescriptorImpl> dataSource()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public WebCommonType<WebAppDescriptorImpl> distributable()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public EjbLocalRefType<WebAppDescriptorImpl> ejbLocalRef()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public EjbRefType<WebAppDescriptorImpl> ejbRef()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public EnvEntryType<WebAppDescriptorImpl> envEntry()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public ErrorPageType<WebAppDescriptorImpl> errorPage()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public FilterType<WebAppDescriptorImpl> filter()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public FilterMappingType<WebAppDescriptorImpl> filterMapping()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public JspConfigType<WebAppDescriptorImpl> jspConfig()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public ListenerType<WebAppDescriptorImpl> listener()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public WebCommonType<WebAppDescriptorImpl> localeEncodingMappingList(
//         LocaleEncodingMappingType[] localEncodingMappings)
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public LoginConfigType<WebAppDescriptorImpl> loginConfig()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public MessageDestinationType<WebAppDescriptorImpl> messageDestination()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public MessageDestinationRefType<WebAppDescriptorImpl> messageDestinationRef()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public MimeMappingType<WebAppDescriptorImpl> mimeMapping()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public PersistenceContextRefType<WebAppDescriptorImpl> persistenceContextRef()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public PersistenceUnitRefType<WebAppDescriptorImpl> persistenceUnitRef()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public LifecycleCallbackType<WebAppDescriptorImpl> postConstruct()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public LifecycleCallbackType<WebAppDescriptorImpl> preDestroy()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public ResourceEnvRefType<WebAppDescriptorImpl> resourceEnvRef()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public ResourceRefType<WebAppDescriptorImpl> resourceRef()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public SecurityConstraintType<WebAppDescriptorImpl> securityConstraint()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public SecurityRoleType<WebAppDescriptorImpl> securityRole()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public ServiceRefType<WebAppDescriptorImpl> serviceRef()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public ServletType<WebAppDescriptorImpl> servlet()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public ServletMappingType<WebAppDescriptorImpl> servletMapping()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public SessionConfigType<WebAppDescriptorImpl> sessionConfig()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public WelcomeFileListType<WebAppDescriptorImpl> welcomeFileList()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public WebAppDescriptorImpl description(String description)
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public WebAppDescriptorImpl displayName(String displayName)
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
//   @Override
//   public IconType<WebAppDescriptorImpl> icon()
//   {
//      // TODO Auto-generated method stub
//      return null;
//   }
//
////   @Override  
////   // TODO remove this!
////   public WebAppDescriptorImpl up()
////   {
////      // TODO Auto-generated method stub
////      return null;
////   }

}
