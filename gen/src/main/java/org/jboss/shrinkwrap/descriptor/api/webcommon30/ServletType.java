package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface ServletType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ServletType<T> setDescription(String description);
   public ServletType<T> setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ServletType<T> setDisplayName(String displayName);
   public ServletType<T> setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ServletType<T> setIcon(IconType<ServletType<T>> icon);

   public IconType<ServletType<T>> getIcon();
   public List<IconType<ServletType<T>>> getIconList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ServletType<T> setServletName(String servletName);

   public String getServletName();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ServletType<T> setInitParam(ParamValueType<ServletType<T>> initParam);

   public ParamValueType<ServletType<T>> getInitParam();
   public List<ParamValueType<ServletType<T>>> getInitParamList();



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ServletType<T> setLoadOnStartup(Boolean loadOnStartup);

   public Boolean getLoadOnStartup();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ServletType<T> setEnabled(Boolean enabled);

   public Boolean getEnabled();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ServletType<T> setAsyncSupported(Boolean asyncSupported);

   public Boolean getAsyncSupported();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ServletType<T> setRunAs(RunAsType<ServletType<T>> runAs);

   public RunAsType<ServletType<T>> getRunAs();



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public ServletType<T> setSecurityRoleRef(SecurityRoleRefType<ServletType<T>> securityRoleRef);

   public SecurityRoleRefType<ServletType<T>> getSecurityRoleRef();
   public List<SecurityRoleRefType<ServletType<T>>> getSecurityRoleRefList();



   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

// otherwise;
   public ServletType<T> setMultipartConfig(MultipartConfigType<ServletType<T>> multipartConfig);

   public MultipartConfigType<ServletType<T>> getMultipartConfig();



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ServletType<T> setServletClass(String servletClass);

   public String getServletClass();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ServletType<T> setJspFile(String jspFile);

   public String getJspFile();

}
