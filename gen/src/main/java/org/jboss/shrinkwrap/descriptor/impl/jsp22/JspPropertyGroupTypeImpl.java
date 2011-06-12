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
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String urlPattern;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean elIgnored;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String pageEncoding;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean scriptingInvalid;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean isXml;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String includePrelude;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String includeCoda;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean deferredSyntaxAllowedAsLiteral;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean trimDirectiveWhitespaces;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String defaultContentType;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String buffer;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean errorOnUndeclaredNamespace;

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private String displayName;
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false
   private IconType<JspPropertyGroupType<T>> icon;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public JspPropertyGroupTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public JspPropertyGroupTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public JspPropertyGroupType<T> setDescription(String ... values)
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

   public JspPropertyGroupType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public JspPropertyGroupType<T> setDisplayName(String ... values)
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

   public JspPropertyGroupType<T> setIcon(IconType<JspPropertyGroupType<T>> icon)
   {
      childNode.create("icon").text(icon);
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
      for(Node node: nodeList)
      {
         IconType<JspPropertyGroupType<T>>  type = new IconTypeImpl<JspPropertyGroupType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setUrlPattern(String urlPattern)
   {
      childNode.create("url-pattern").text(urlPattern);
      return this;
   }

   public JspPropertyGroupType<T> setUrlPattern(String ... values)
   {
      for(String name: values)
      {
         setUrlPattern(urlPattern);
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


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored)   {
      this.elIgnored = elIgnored;
      childNode.getOrCreate("el-ignored").text(elIgnored);
      return this;
   }

   public Boolean getElIgnored()
   {
      return Strings.isTrue(childNode.textValue("el-ignored"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding)   {
      this.pageEncoding = pageEncoding;
      childNode.getOrCreate("page-encoding").text(pageEncoding);
      return this;
   }

   public String getPageEncoding()
   {
      return childNode.textValue("page-encoding");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid)   {
      this.scriptingInvalid = scriptingInvalid;
      childNode.getOrCreate("scripting-invalid").text(scriptingInvalid);
      return this;
   }

   public Boolean getScriptingInvalid()
   {
      return Strings.isTrue(childNode.textValue("scripting-invalid"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setIsXml(Boolean isXml)   {
      this.isXml = isXml;
      childNode.getOrCreate("is-xml").text(isXml);
      return this;
   }

   public Boolean getIsXml()
   {
      return Strings.isTrue(childNode.textValue("is-xml"));
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude)
   {
      childNode.create("include-prelude").text(includePrelude);
      return this;
   }

   public JspPropertyGroupType<T> setIncludePrelude(String ... values)
   {
      for(String name: values)
      {
         setIncludePrelude(includePrelude);
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


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda)
   {
      childNode.create("include-coda").text(includeCoda);
      return this;
   }

   public JspPropertyGroupType<T> setIncludeCoda(String ... values)
   {
      for(String name: values)
      {
         setIncludeCoda(includeCoda);
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


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral)   {
      this.deferredSyntaxAllowedAsLiteral = deferredSyntaxAllowedAsLiteral;
      childNode.getOrCreate("deferred-syntax-allowed-as-literal").text(deferredSyntaxAllowedAsLiteral);
      return this;
   }

   public Boolean getDeferredSyntaxAllowedAsLiteral()
   {
      return Strings.isTrue(childNode.textValue("deferred-syntax-allowed-as-literal"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces)   {
      this.trimDirectiveWhitespaces = trimDirectiveWhitespaces;
      childNode.getOrCreate("trim-directive-whitespaces").text(trimDirectiveWhitespaces);
      return this;
   }

   public Boolean getTrimDirectiveWhitespaces()
   {
      return Strings.isTrue(childNode.textValue("trim-directive-whitespaces"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType)   {
      this.defaultContentType = defaultContentType;
      childNode.getOrCreate("default-content-type").text(defaultContentType);
      return this;
   }

   public String getDefaultContentType()
   {
      return childNode.textValue("default-content-type");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setBuffer(String buffer)   {
      this.buffer = buffer;
      childNode.getOrCreate("buffer").text(buffer);
      return this;
   }

   public String getBuffer()
   {
      return childNode.textValue("buffer");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace)   {
      this.errorOnUndeclaredNamespace = errorOnUndeclaredNamespace;
      childNode.getOrCreate("error-on-undeclared-namespace").text(errorOnUndeclaredNamespace);
      return this;
   }

   public Boolean getErrorOnUndeclaredNamespace()
   {
      return Strings.isTrue(childNode.textValue("error-on-undeclared-namespace"));
   }

}
