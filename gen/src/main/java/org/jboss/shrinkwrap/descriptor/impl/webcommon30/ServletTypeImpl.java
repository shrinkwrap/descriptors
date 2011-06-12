package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.RunAsTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class ServletTypeImpl<T> implements Child<T>, ServletType<T>
{
   public final static String nodeName = "servlet";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String servletName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private ParamValueType<ServletType<T>> initParam;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean loadOnStartup;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean enabled;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean asyncSupported;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private RunAsType<ServletType<T>> runAs;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private SecurityRoleRefType<ServletType<T>> securityRoleRef;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private MultipartConfigType<ServletType<T>> multipartConfig;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String servletClass;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String jspFile;

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private IconType<ServletType<T>> icon;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ServletTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ServletTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ServletType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ServletType<T> setDescription(String ... values)
   {
      for(String name: values)
      {
         setDescription(description);
      }
         return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ServletType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public ServletType<T> setDisplayName(String ... values)
   {
      for(String name: values)
      {
         setDisplayName(displayName);
      }
         return this;
   }

   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ServletType<T> setIcon(IconType<ServletType<T>> icon)
   {
      childNode.create("icon").text(icon);
      return this;
   }

   public IconType<ServletType<T>> getIcon()
   {
      return new IconTypeImpl<ServletType<T>>(this, "", childNode);
   }

   public List<IconType<ServletType<T>>> getIconList()
   {
      List<IconType<ServletType<T>>> list = new ArrayList<IconType<ServletType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         IconType<ServletType<T>>  type = new IconTypeImpl<ServletType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ServletType<T> setServletName(String servletName)   {
      this.servletName = servletName;
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   public String getServletName()
   {
      return childNode.textValue("servlet-name");
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ServletType<T> setInitParam(ParamValueType<ServletType<T>> initParam)
   {
      childNode.create("init-param").text(initParam);
      return this;
   }

   public ParamValueType<ServletType<T>> getInitParam()
   {
      return new ParamValueTypeImpl<ServletType<T>>(this, "", childNode);
   }

   public List<ParamValueType<ServletType<T>>> getInitParamList()
   {
      List<ParamValueType<ServletType<T>>> list = new ArrayList<ParamValueType<ServletType<T>>>();
      List<Node> nodeList = childNode.get(ParamValueTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         ParamValueType<ServletType<T>>  type = new ParamValueTypeImpl<ServletType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ServletType<T> setLoadOnStartup(Boolean loadOnStartup)   {
      this.loadOnStartup = loadOnStartup;
      childNode.getOrCreate("load-on-startup").text(loadOnStartup);
      return this;
   }

   public Boolean getLoadOnStartup()
   {
      return Strings.isTrue(childNode.textValue("load-on-startup"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ServletType<T> setEnabled(Boolean enabled)   {
      this.enabled = enabled;
      childNode.getOrCreate("enabled").text(enabled);
      return this;
   }

   public Boolean getEnabled()
   {
      return Strings.isTrue(childNode.textValue("enabled"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ServletType<T> setAsyncSupported(Boolean asyncSupported)   {
      this.asyncSupported = asyncSupported;
      childNode.getOrCreate("async-supported").text(asyncSupported);
      return this;
   }

   public Boolean getAsyncSupported()
   {
      return Strings.isTrue(childNode.textValue("async-supported"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ServletType<T> setRunAs(RunAsType<ServletType<T>> runAs)   {
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



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ServletType<T> setSecurityRoleRef(SecurityRoleRefType<ServletType<T>> securityRoleRef)
   {
      childNode.create("security-role-ref").text(securityRoleRef);
      return this;
   }

   public SecurityRoleRefType<ServletType<T>> getSecurityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<ServletType<T>>(this, "", childNode);
   }

   public List<SecurityRoleRefType<ServletType<T>>> getSecurityRoleRefList()
   {
      List<SecurityRoleRefType<ServletType<T>>> list = new ArrayList<SecurityRoleRefType<ServletType<T>>>();
      List<Node> nodeList = childNode.get(SecurityRoleRefTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         SecurityRoleRefType<ServletType<T>>  type = new SecurityRoleRefTypeImpl<ServletType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public ServletType<T> setMultipartConfig(MultipartConfigType<ServletType<T>> multipartConfig)   {
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



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ServletType<T> setServletClass(String servletClass)   {
      this.servletClass = servletClass;
      childNode.getOrCreate("servlet-class").text(servletClass);
      return this;
   }

   public String getServletClass()
   {
      return childNode.textValue("servlet-class");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ServletType<T> setJspFile(String jspFile)   {
      this.jspFile = jspFile;
      childNode.getOrCreate("jsp-file").text(jspFile);
      return this;
   }

   public String getJspFile()
   {
      return childNode.textValue("jsp-file");
   }

}
