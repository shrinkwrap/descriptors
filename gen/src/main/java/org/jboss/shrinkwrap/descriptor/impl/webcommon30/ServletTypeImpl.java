package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.RunAsTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class ServletTypeImpl<T> implements Child<T>, ServletType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String servletName;
   private ParamValueType<ServletType<T>> initParam;
   private Boolean loadOnStartup;
   private Boolean enabled;
   private Boolean asyncSupported;
   private RunAsType<ServletType<T>> runAs;
   private SecurityRoleRefType<ServletType<T>> securityRoleRef;
   private MultipartConfigType<ServletType<T>> multipartConfig;
   private String servletClass;
   private String jspFile;

   private String description;
   private String displayName;
   private IconType<ServletType<T>> icon;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ServletTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("servlet");   }


   public T up()
   {
      return t;
   }



   public ServletType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public ServletType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public ServletType<T> setIcon(IconType<ServletType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<ServletType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<ServletType<T>>(this, "", childNode);
      }
      return icon;
   }



   public ServletType<T> setServletName(String servletName)
   {
      this.servletName = servletName;
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   public String getServletName()
   {
      return servletName;
   }



   public ServletType<T> setInitParam(ParamValueType<ServletType<T>> initParam)
   {
      this.initParam = initParam;
      childNode.getOrCreate("init-param").text(initParam);
      return this;
   }

   public ParamValueType<ServletType<T>> getInitParam()
   {
      if( initParam == null)
      {
          initParam = new ParamValueTypeImpl<ServletType<T>>(this, "", childNode);
      }
      return initParam;
   }




   public ServletType<T> setLoadOnStartup(Boolean loadOnStartup)
   {
      this.loadOnStartup = loadOnStartup;
      childNode.getOrCreate("load-on-startup").text(loadOnStartup);
      return this;
   }

   public Boolean getLoadOnStartup()
   {
      return loadOnStartup;
   }



   public ServletType<T> setEnabled(Boolean enabled)
   {
      this.enabled = enabled;
      childNode.getOrCreate("enabled").text(enabled);
      return this;
   }

   public Boolean getEnabled()
   {
      return enabled;
   }



   public ServletType<T> setAsyncSupported(Boolean asyncSupported)
   {
      this.asyncSupported = asyncSupported;
      childNode.getOrCreate("async-supported").text(asyncSupported);
      return this;
   }

   public Boolean getAsyncSupported()
   {
      return asyncSupported;
   }



   public ServletType<T> setRunAs(RunAsType<ServletType<T>> runAs)
   {
      this.runAs = runAs;
      childNode.getOrCreate("run-as").text(runAs);
      return this;
   }

   public RunAsType<ServletType<T>> getRunAs()
   {
      if( runAs == null)
      {
          runAs = new RunAsTypeImpl<ServletType<T>>(this, "", childNode);
      }
      return runAs;
   }




   public ServletType<T> setSecurityRoleRef(SecurityRoleRefType<ServletType<T>> securityRoleRef)
   {
      this.securityRoleRef = securityRoleRef;
      childNode.getOrCreate("security-role-ref").text(securityRoleRef);
      return this;
   }

   public SecurityRoleRefType<ServletType<T>> getSecurityRoleRef()
   {
      if( securityRoleRef == null)
      {
          securityRoleRef = new SecurityRoleRefTypeImpl<ServletType<T>>(this, "", childNode);
      }
      return securityRoleRef;
   }




   public ServletType<T> setMultipartConfig(MultipartConfigType<ServletType<T>> multipartConfig)
   {
      this.multipartConfig = multipartConfig;
      childNode.getOrCreate("multipart-config").text(multipartConfig);
      return this;
   }

   public MultipartConfigType<ServletType<T>> getMultipartConfig()
   {
      if( multipartConfig == null)
      {
          multipartConfig = new MultipartConfigTypeImpl<ServletType<T>>(this, "", childNode);
      }
      return multipartConfig;
   }




   public ServletType<T> setServletClass(String servletClass)
   {
      this.servletClass = servletClass;
      childNode.getOrCreate("servlet-class").text(servletClass);
      return this;
   }

   public String getServletClass()
   {
      return servletClass;
   }



   public ServletType<T> setJspFile(String jspFile)
   {
      this.jspFile = jspFile;
      childNode.getOrCreate("jsp-file").text(jspFile);
      return this;
   }

   public String getJspFile()
   {
      return jspFile;
   }

}
