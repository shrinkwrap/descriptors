package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface ServletType<T> extends Child<T>
{
   public ServletType<T> setDescription(String description);
   public String getDescription();

   public ServletType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public ServletType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public ServletType<T> setServletName(String servletName);
   public String getServletName();

   public ServletType<T> setInitParam(ParamValueType<T> initParam);
   public ParamValueType<T> getInitParam();

   public ServletType<T> setLoadOnStartup(Boolean loadOnStartup);
   public Boolean getLoadOnStartup();

   public ServletType<T> setEnabled(Boolean enabled);
   public Boolean getEnabled();

   public ServletType<T> setAsyncSupported(Boolean asyncSupported);
   public Boolean getAsyncSupported();

   public ServletType<T> setRunAs(RunAsType<T> runAs);
   public RunAsType<T> getRunAs();

   public ServletType<T> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);
   public SecurityRoleRefType<T> getSecurityRoleRef();

   public ServletType<T> setMultipartConfig(MultipartConfigType<T> multipartConfig);
   public MultipartConfigType<T> getMultipartConfig();
}
