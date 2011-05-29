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
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface WebCommonType<T> extends Child<T>, DescriptionGroup<T>, JndiEnvironmentRefsGroup<T>

{
   public void distributable();

   public ParamValueType<WebCommonType<T>> setContextParam(ParamValueType<T> contextParam);

   public ParamValueType<WebCommonType<T>> getContextParam();

   public FilterType<WebCommonType<T>> setFilter(FilterType<T> filter);

   public FilterType<WebCommonType<T>> getFilter();

   public FilterMappingType<WebCommonType<T>> setFilterMapping(FilterMappingType<T> filterMapping);

   public FilterMappingType<WebCommonType<T>> getFilterMapping();

   public ListenerType<WebCommonType<T>> setListener(ListenerType<T> listener);

   public ListenerType<WebCommonType<T>> getListener();

   public ServletType<WebCommonType<T>> setServlet(ServletType<T> servlet);

   public ServletType<WebCommonType<T>> getServlet();

   public ServletMappingType<WebCommonType<T>> setServletMapping(ServletMappingType<T> servletMapping);

   public ServletMappingType<WebCommonType<T>> getServletMapping();

   public SessionConfigType<WebCommonType<T>> setSessionConfig(SessionConfigType<T> sessionConfig);

   public SessionConfigType<WebCommonType<T>> getSessionConfig();

   public MimeMappingType<WebCommonType<T>> setMimeMapping(MimeMappingType<T> mimeMapping);

   public MimeMappingType<WebCommonType<T>> getMimeMapping();

   public WelcomeFileListType<WebCommonType<T>> setWelcomeFileList(WelcomeFileListType<T> welcomeFileList);

   public WelcomeFileListType<WebCommonType<T>> getWelcomeFileList();

   public ErrorPageType<WebCommonType<T>> setErrorPage(ErrorPageType<T> errorPage);

   public ErrorPageType<WebCommonType<T>> getErrorPage();

   public JspConfigType<WebCommonType<T>> setJspConfig(JspConfigType<T> jspConfig);

   public JspConfigType<WebCommonType<T>> getJspConfig();

   public SecurityConstraintType<WebCommonType<T>> setSecurityConstraint(SecurityConstraintType<T> securityConstraint);

   public SecurityConstraintType<WebCommonType<T>> getSecurityConstraint();

   public LoginConfigType<WebCommonType<T>> setLoginConfig(LoginConfigType<T> loginConfig);

   public LoginConfigType<WebCommonType<T>> getLoginConfig();

   public SecurityRoleType<WebCommonType<T>> setSecurityRole(SecurityRoleType<T> securityRole);

   public SecurityRoleType<WebCommonType<T>> getSecurityRole();

   public MessageDestinationType<WebCommonType<T>> setMessageDestination(MessageDestinationType<T> messageDestination);

   public MessageDestinationType<WebCommonType<T>> getMessageDestination();

   public LocaleEncodingMappingListType<WebCommonType<T>> setLocaleEncodingMappingList(
         LocaleEncodingMappingListType<T> localeEncodingMappingList);

   public LocaleEncodingMappingListType<WebCommonType<T>> getLocaleEncodingMappingList();
}
