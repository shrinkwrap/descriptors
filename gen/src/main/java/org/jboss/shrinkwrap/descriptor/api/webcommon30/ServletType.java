package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The servletType is used to declare a servlet.
 * It contains the declarative data of a
 * servlet. If a jsp-file is specified and the load-on-startup
 * element is present, then the JSP should be precompiled and
 * loaded.
 *
 * Used in: web-app
 *
 *
 *
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




   public ServletType<T> setLoadOnStartup(Integer loadOnStartup);
   public ServletType<T> removeLoadOnStartup();

   public Integer getLoadOnStartup();



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
