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
 * Generation date :2011-06-27T07:43:58.376-04:00
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
public class ServletTypeImpl<T> implements Child<T>, ServletType<T>
{
   public final static String nodeName = "servlet";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ServletTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ServletTypeImpl(T t, String descriptorName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ServletType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public ServletType<T> removeAllDescription()
   {
      childNode.remove("description");
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

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public ServletType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public ServletType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
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

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> removeAllIcon()
   {
      childNode.remove(IconTypeImpl.nodeName);
      return this;
   }

   public IconType<ServletType<T>> icon()
   {
      return new IconTypeImpl<ServletType<T>>(this, "", childNode);
   }

   public List<IconType<ServletType<T>>> getIconList()
   {
      List<IconType<ServletType<T>>> list = new ArrayList<IconType<ServletType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         IconType<ServletType<T>> type = new IconTypeImpl<ServletType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> setServletName(String servletName)
   {
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   public ServletType<T> removeServletName()
   {
      childNode.remove("servlet-name");
      return this;
   }

   public String getServletName()
   {
      return childNode.textValue("servlet-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : init-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> removeAllInitParam()
   {
      childNode.remove(ParamValueTypeImpl.nodeName);
      return this;
   }

   public ParamValueType<ServletType<T>> initParam()
   {
      return new ParamValueTypeImpl<ServletType<T>>(this, "", childNode);
   }

   public List<ParamValueType<ServletType<T>>> getInitParamList()
   {
      List<ParamValueType<ServletType<T>>> list = new ArrayList<ParamValueType<ServletType<T>>>();
      List<Node> nodeList = childNode.get(ParamValueTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         ParamValueType<ServletType<T>> type = new ParamValueTypeImpl<ServletType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : load-on-startup
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> setLoadOnStartup(Boolean loadOnStartup)
   {
      childNode.getOrCreate("load-on-startup").text(loadOnStartup);
      return this;
   }

   public ServletType<T> removeLoadOnStartup()
   {
      childNode.remove("load-on-startup");
      return this;
   }

   public Boolean isLoadOnStartup()
   {
      return Strings.isTrue(childNode.textValue("load-on-startup"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : enabled
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> setEnabled(Boolean enabled)
   {
      childNode.getOrCreate("enabled").text(enabled);
      return this;
   }

   public ServletType<T> removeEnabled()
   {
      childNode.remove("enabled");
      return this;
   }

   public Boolean isEnabled()
   {
      return Strings.isTrue(childNode.textValue("enabled"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : async-supported
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> setAsyncSupported(Boolean asyncSupported)
   {
      childNode.getOrCreate("async-supported").text(asyncSupported);
      return this;
   }

   public ServletType<T> removeAsyncSupported()
   {
      childNode.remove("async-supported");
      return this;
   }

   public Boolean isAsyncSupported()
   {
      return Strings.isTrue(childNode.textValue("async-supported"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : run-as
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> removeRunAs()
   {
      childNode.remove("run-as");
      return this;
   }

   public RunAsType<ServletType<T>> runAs()
   {
      Node node = childNode.getOrCreate(RunAsTypeImpl.nodeName);
      RunAsType<ServletType<T>> runAs = new RunAsTypeImpl<ServletType<T>>(this, "", childNode, node);
      return runAs;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> removeAllSecurityRoleRef()
   {
      childNode.remove(SecurityRoleRefTypeImpl.nodeName);
      return this;
   }

   public SecurityRoleRefType<ServletType<T>> securityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<ServletType<T>>(this, "", childNode);
   }

   public List<SecurityRoleRefType<ServletType<T>>> getSecurityRoleRefList()
   {
      List<SecurityRoleRefType<ServletType<T>>> list = new ArrayList<SecurityRoleRefType<ServletType<T>>>();
      List<Node> nodeList = childNode.get(SecurityRoleRefTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         SecurityRoleRefType<ServletType<T>> type = new SecurityRoleRefTypeImpl<ServletType<T>>(this, "", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : multipart-config
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> removeMultipartConfig()
   {
      childNode.remove("multipart-config");
      return this;
   }

   public MultipartConfigType<ServletType<T>> multipartConfig()
   {
      Node node = childNode.getOrCreate(MultipartConfigTypeImpl.nodeName);
      MultipartConfigType<ServletType<T>> multipartConfig = new MultipartConfigTypeImpl<ServletType<T>>(this, "",
            childNode, node);
      return multipartConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> setServletClass(String servletClass)
   {
      childNode.getOrCreate("servlet-class").text(servletClass);
      return this;
   }

   public ServletType<T> removeServletClass()
   {
      childNode.remove("servlet-class");
      return this;
   }

   public String getServletClass()
   {
      return childNode.textValue("servlet-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-file
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ServletType<T> setJspFile(String jspFile)
   {
      childNode.getOrCreate("jsp-file").text(jspFile);
      return this;
   }

   public ServletType<T> removeJspFile()
   {
      childNode.remove("jsp-file");
      return this;
   }

   public String getJspFile()
   {
      return childNode.textValue("jsp-file");
   }

}
