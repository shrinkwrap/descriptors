package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface WebCommonType<T> extends Child<T>, DescriptionGroup<T>, JndiEnvironmentRefsGroup<T>
{
   public WebCommonType<T> distributable();

   public WebCommonType<T> setContextParam(ParamValueType<T> contextParam);
   public ParamValueType<T> getContextParam();

   public WebCommonType<T> setFilter(FilterType<T> filter);
   public FilterType<T> getFilter();

   public WebCommonType<T> setFilterMapping(FilterMappingType<T> filterMapping);
   public FilterMappingType<T> getFilterMapping();

   public WebCommonType<T> setListener(ListenerType<T> listener);
   public ListenerType<T> getListener();

   public WebCommonType<T> setServlet(ServletType<T> servlet);
   public ServletType<T> getServlet();

   public WebCommonType<T> setServletMapping(ServletMappingType<T> servletMapping);
   public ServletMappingType<T> getServletMapping();

   public WebCommonType<T> setSessionConfig(SessionConfigType<T> sessionConfig);
   public SessionConfigType<T> getSessionConfig();

   public WebCommonType<T> setMimeMapping(MimeMappingType<T> mimeMapping);
   public MimeMappingType<T> getMimeMapping();

   public WebCommonType<T> setWelcomeFileList(WelcomeFileListType<T> welcomeFileList);
   public WelcomeFileListType<T> getWelcomeFileList();

   public WebCommonType<T> setErrorPage(ErrorPageType<T> errorPage);
   public ErrorPageType<T> getErrorPage();

   public WebCommonType<T> setJspConfig(JspConfigType<T> jspConfig);
   public JspConfigType<T> getJspConfig();

   public WebCommonType<T> setSecurityConstraint(SecurityConstraintType<T> securityConstraint);
   public SecurityConstraintType<T> getSecurityConstraint();

   public WebCommonType<T> setLoginConfig(LoginConfigType<T> loginConfig);
   public LoginConfigType<T> getLoginConfig();

   public WebCommonType<T> setSecurityRole(SecurityRoleType<T> securityRole);
   public SecurityRoleType<T> getSecurityRole();

   public WebCommonType<T> setMessageDestination(MessageDestinationType<T> messageDestination);
   public MessageDestinationType<T> getMessageDestination();

   public WebCommonType<T> setLocaleEncodingMappingList(LocaleEncodingMappingListType<T> localeEncodingMappingList);
   public LocaleEncodingMappingListType<T> getLocaleEncodingMappingList();
}
