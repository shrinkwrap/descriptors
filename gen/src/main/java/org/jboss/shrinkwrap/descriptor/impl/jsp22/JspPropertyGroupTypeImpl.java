package org.jboss.shrinkwrap.descriptor.impl.jsp22;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspPropertyGroupType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public class JspPropertyGroupTypeImpl<T> implements Child<T>, JspPropertyGroupType<T>
{
   public final static String nodeName = "jsp-property-group";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public JspPropertyGroupTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public JspPropertyGroupTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   public JspPropertyGroupType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public JspPropertyGroupType<T> setDescription(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
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

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public JspPropertyGroupType<T> setDisplayName(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
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

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<JspPropertyGroupType<T>> getIcon()
   {
      return new IconTypeImpl<JspPropertyGroupType<T>>(this, "", childNode);
   }

   public List<IconType<JspPropertyGroupType<T>>> getIconList()
   {
      List<IconType<JspPropertyGroupType<T>>> list = new ArrayList<IconType<JspPropertyGroupType<T>>>();
      List<Node> nodeList = childNode.get(IconTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         IconType<JspPropertyGroupType<T>> type = new IconTypeImpl<JspPropertyGroupType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setUrlPattern(String urlPattern)
   {
      childNode.create("url-pattern").text(urlPattern);
      return this;
   }

   public JspPropertyGroupType<T> setUrlPattern(String... values)
   {
      for (String name : values)
      {
         setUrlPattern(name);
      }
      return this;
   }

   public List<String> getUrlPatternList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("url-pattern");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : el-ignored
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored)
   {
      childNode.getOrCreate("el-ignored").text(elIgnored);
      return this;
   }

   public Boolean isElIgnored()
   {
      return Strings.isTrue(childNode.textValue("el-ignored"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : page-encoding
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding)
   {
      childNode.getOrCreate("page-encoding").text(pageEncoding);
      return this;
   }

   public String getPageEncoding()
   {
      return childNode.textValue("page-encoding");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : scripting-invalid
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid)
   {
      childNode.getOrCreate("scripting-invalid").text(scriptingInvalid);
      return this;
   }

   public Boolean isScriptingInvalid()
   {
      return Strings.isTrue(childNode.textValue("scripting-invalid"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : is-xml
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setIsXml(Boolean isXml)
   {
      childNode.getOrCreate("is-xml").text(isXml);
      return this;
   }

   public Boolean isIsXml()
   {
      return Strings.isTrue(childNode.textValue("is-xml"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : include-prelude
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude)
   {
      childNode.create("include-prelude").text(includePrelude);
      return this;
   }

   public JspPropertyGroupType<T> setIncludePrelude(String... values)
   {
      for (String name : values)
      {
         setIncludePrelude(name);
      }
      return this;
   }

   public List<String> getIncludePreludeList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("include-prelude");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : include-coda
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda)
   {
      childNode.create("include-coda").text(includeCoda);
      return this;
   }

   public JspPropertyGroupType<T> setIncludeCoda(String... values)
   {
      for (String name : values)
      {
         setIncludeCoda(name);
      }
      return this;
   }

   public List<String> getIncludeCodaList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("include-coda");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : deferred-syntax-allowed-as-literal
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral)
   {
      childNode.getOrCreate("deferred-syntax-allowed-as-literal").text(deferredSyntaxAllowedAsLiteral);
      return this;
   }

   public Boolean isDeferredSyntaxAllowedAsLiteral()
   {
      return Strings.isTrue(childNode.textValue("deferred-syntax-allowed-as-literal"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : trim-directive-whitespaces
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces)
   {
      childNode.getOrCreate("trim-directive-whitespaces").text(trimDirectiveWhitespaces);
      return this;
   }

   public Boolean isTrimDirectiveWhitespaces()
   {
      return Strings.isTrue(childNode.textValue("trim-directive-whitespaces"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : default-content-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType)
   {
      childNode.getOrCreate("default-content-type").text(defaultContentType);
      return this;
   }

   public String getDefaultContentType()
   {
      return childNode.textValue("default-content-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : buffer
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setBuffer(String buffer)
   {
      childNode.getOrCreate("buffer").text(buffer);
      return this;
   }

   public String getBuffer()
   {
      return childNode.textValue("buffer");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : error-on-undeclared-namespace
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace)
   {
      childNode.getOrCreate("error-on-undeclared-namespace").text(errorOnUndeclaredNamespace);
      return this;
   }

   public Boolean isErrorOnUndeclaredNamespace()
   {
      return Strings.isTrue(childNode.textValue("error-on-undeclared-namespace"));
   }

}
