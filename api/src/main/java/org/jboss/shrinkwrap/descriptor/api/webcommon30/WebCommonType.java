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
 * Generation date :2011-05-29T19:58:11.781+02:00
 */
public interface WebCommonType<T> extends Child<T>, DescriptionGroup<T>, JndiEnvironmentRefsGroup<T>

{
   public void distributable();

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

   public JspConfigType<WebCommonType<T>> setJspConfig(JspConfigType<T> jspConfig);
   public JspConfigType<T> getJspConfig();

   public SecurityConstraintType<WebCommonType<T>> setSecurityConstraint(SecurityConstraintType<T> securityConstraint);
   public SecurityConstraintType<T> getSecurityConstraint();

   public LoginConfigType<WebCommonType<T>> setLoginConfig(LoginConfigType<T> loginConfig);
   public LoginConfigType<WebCommonType<T>> getLoginConfig();

   public SecurityRoleType<WebCommonType<T>> setSecurityRole(SecurityRoleType<T> securityRole);
   public SecurityRoleType<WebCommonType<T>> getSecurityRole();

   public MessageDestinationType<WebCommonType<T>> setMessageDestination(MessageDestinationType<T> messageDestination);
   public MessageDestinationType<WebCommonType<T>> getMessageDestination();

   public LocaleEncodingMappingListType<WebCommonType<T>> setLocaleEncodingMappingList(LocaleEncodingMappingListType<T> localeEncodingMappingList);
   public LocaleEncodingMappingListType<WebCommonType<T>> getLocaleEncodingMappingList();
}
