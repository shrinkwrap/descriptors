package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface ServletType<T> extends Child<T>
{

   public ServletType<T> setDescription(String description);
   public String getDescription();

   public ServletType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public ServletType<T> setIcon(IconType<ServletType<T>> icon);
   public IconType<ServletType<T>> getIcon();


   public ServletType<T> setServletName(String servletName);
   public String getServletName();


   public ServletType<T> setInitParam(ParamValueType<ServletType<T>> initParam);
   public ParamValueType<ServletType<T>> getInitParam();



   public ServletType<T> setLoadOnStartup(Boolean loadOnStartup);
   public Boolean getLoadOnStartup();


   public ServletType<T> setEnabled(Boolean enabled);
   public Boolean getEnabled();


   public ServletType<T> setAsyncSupported(Boolean asyncSupported);
   public Boolean getAsyncSupported();


   public ServletType<T> setRunAs(RunAsType<ServletType<T>> runAs);
   public RunAsType<ServletType<T>> getRunAs();



   public ServletType<T> setSecurityRoleRef(SecurityRoleRefType<ServletType<T>> securityRoleRef);
   public SecurityRoleRefType<ServletType<T>> getSecurityRoleRef();



   public ServletType<T> setMultipartConfig(MultipartConfigType<ServletType<T>> multipartConfig);
   public MultipartConfigType<ServletType<T>> getMultipartConfig();



   public ServletType<T> setServletClass(String servletClass);
   public String getServletClass();


   public ServletType<T> setJspFile(String jspFile);
   public String getJspFile();
}
