package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface ServletType<T> extends Child<T>
{

   public ServletType<T> setDescription(String description);

   public ServletType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public ServletType<T> setDisplayName(String displayName);

   public ServletType<T> setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public ServletType<T> removeAllIcon();

   public IconType<ServletType<T>> getIcon();

   public List<IconType<ServletType<T>>> getIconList();

   public ServletType<T> setServletName(String servletName);

   public String getServletName();

   public ServletType<T> removeAllInitParam();

   public ParamValueType<ServletType<T>> getInitParam();

   public List<ParamValueType<ServletType<T>>> getInitParamList();

   public ServletType<T> setLoadOnStartup(Boolean loadOnStartup);

   public Boolean isLoadOnStartup();

   public ServletType<T> setEnabled(Boolean enabled);

   public Boolean isEnabled();

   public ServletType<T> setAsyncSupported(Boolean asyncSupported);

   public Boolean isAsyncSupported();

   public ServletType<T> removeRunAs();

   public RunAsType<ServletType<T>> getRunAs();

   public ServletType<T> removeAllSecurityRoleRef();

   public SecurityRoleRefType<ServletType<T>> getSecurityRoleRef();

   public List<SecurityRoleRefType<ServletType<T>>> getSecurityRoleRefList();

   public ServletType<T> removeMultipartConfig();

   public MultipartConfigType<ServletType<T>> getMultipartConfig();

   public ServletType<T> setServletClass(String servletClass);

   public String getServletClass();

   public ServletType<T> setJspFile(String jspFile);

   public String getJspFile();

}
