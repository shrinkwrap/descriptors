package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface ServletType<T> extends Child<T>
{

   public ServletType<T> setDescription(String description);
   public ServletType<T> setDescriptionList(String ... values);
   public ServletType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public ServletType<T> setDisplayName(String displayName);
   public ServletType<T> setDisplayNameList(String ... values);
   public ServletType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();


   public ServletType<T> removeAllIcon();

   public IconType<ServletType<T>> icon();
   public List<IconType<ServletType<T>>> getIconList();



   public ServletType<T> setServletName(String servletName);
   public ServletType<T> removeServletName();

   public String getServletName();



   public ServletType<T> removeAllInitParam();

   public ParamValueType<ServletType<T>> initParam();
   public List<ParamValueType<ServletType<T>>> getInitParamList();




   public ServletType<T> setLoadOnStartup(Boolean loadOnStartup);
   public ServletType<T> removeLoadOnStartup();

   public Boolean isLoadOnStartup();



   public ServletType<T> setEnabled(Boolean enabled);
   public ServletType<T> removeEnabled();

   public Boolean isEnabled();



   public ServletType<T> setAsyncSupported(Boolean asyncSupported);
   public ServletType<T> removeAsyncSupported();

   public Boolean isAsyncSupported();



   public ServletType<T> removeRunAs();

   public RunAsType<ServletType<T>> runAs();




   public ServletType<T> removeAllSecurityRoleRef();

   public SecurityRoleRefType<ServletType<T>> securityRoleRef();
   public List<SecurityRoleRefType<ServletType<T>>> getSecurityRoleRefList();




   public ServletType<T> removeMultipartConfig();

   public MultipartConfigType<ServletType<T>> multipartConfig();




   public ServletType<T> setServletClass(String servletClass);
   public ServletType<T> removeServletClass();

   public String getServletClass();



   public ServletType<T> setJspFile(String jspFile);
   public ServletType<T> removeJspFile();

   public String getJspFile();

}
