package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ServletType<T> extends Child<T>
{
   public ServletType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public ServletType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<ServletType<T>> icon();

   public ServletType<T> setServletName(String servletName);

   @NodeInfo(xmlName = "servlet-name")
   public String getServletName();

   @NodeInfo(xmlName = "init-param")
   public ParamValueType<ServletType<T>> initParam();

   public ServletType<T> setLoadOnStartup(Boolean loadOnStartup);

   @NodeInfo(xmlName = "load-on-startup")
   public Boolean getLoadOnStartup();

   public ServletType<T> setEnabled(Boolean enabled);

   @NodeInfo(xmlName = "enabled")
   public Boolean getEnabled();

   public ServletType<T> setAsyncSupported(Boolean asyncSupported);

   @NodeInfo(xmlName = "async-supported")
   public Boolean getAsyncSupported();

   @NodeInfo(xmlName = "run-as")
   public RunAsType<ServletType<T>> runAs();

   @NodeInfo(xmlName = "security-role-ref")
   public SecurityRoleRefType<ServletType<T>> securityRoleRef();

   @NodeInfo(xmlName = "multipart-config")
   public MultipartConfigType<ServletType<T>> multipartConfig();

   public ServletType<T> setServletClass(Class<?> servletClass);

   public ServletType<T> setServletClass(String servletClass);

   @NodeInfo(xmlName = "servlet-class")
   public String getServletClass();

   public ServletType<T> setJspFile(String jspFile);

   @NodeInfo(xmlName = "jsp-file")
   public String getJspFile();
}
