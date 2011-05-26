package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

public interface ServletType<T> extends Child<T>, DescriptionGroup<T>
{
   public ServletType<T> setServletName(String servletName);

   public String getServletName();

   public ServletType<T> setInitParam(ParamValueType<T> initParam);

   public ParamValueType<ServletType<T>> getInitParam();

   public ServletType<T> setLoadOnStartup(LoadOnStartupType<T> loadOnStartup);

   public LoadOnStartupType<ServletType<T>> getLoadOnStartup();

   public ServletType<T> setEnabled(Boolean enabled);

   public Boolean getEnabled();

   public ServletType<T> setAsyncSupported(Boolean asyncSupported);

   public Boolean getAsyncSupported();

   public ServletType<T> setRunAs(RunAsType<T> runAs);

   public RunAsType<ServletType<T>> getRunAs();

   public ServletType<T> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);

   public SecurityRoleRefType<ServletType<T>> getSecurityRoleRef();

   public ServletType<T> setMultipartConfig(MultipartConfigType<T> multipartConfig);

   public MultipartConfigType<ServletType<T>> getMultipartConfig();
}
