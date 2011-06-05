package org.jboss.shrinkwrap.descriptor.impl.jsp22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspPropertyGroupType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class JspPropertyGroupTypeImpl<T> implements Child<T>, JspPropertyGroupType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String urlPattern;
   private Boolean elIgnored;
   private String pageEncoding;
   private Boolean scriptingInvalid;
   private Boolean isXml;
   private String includePrelude;
   private String includeCoda;
   private Boolean deferredSyntaxAllowedAsLiteral;
   private Boolean trimDirectiveWhitespaces;
   private String defaultContentType;
   private String buffer;
   private Boolean errorOnUndeclaredNamespace;

   private String description;
   private String displayName;
   private IconType<JspPropertyGroupType<T>> icon;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public JspPropertyGroupTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("jsp-property-group");   }


   public T up()
   {
      return t;
   }



   public JspPropertyGroupType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public JspPropertyGroupType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public JspPropertyGroupType<T> setIcon(IconType<JspPropertyGroupType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<JspPropertyGroupType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<JspPropertyGroupType<T>>(this, "", childNode);
      }
      return icon;
   }



   public JspPropertyGroupType<T> setUrlPattern(String urlPattern)
   {
      this.urlPattern = urlPattern;
      childNode.getOrCreate("url-pattern").text(urlPattern);
      return this;
   }

   public String getUrlPattern()
   {
      return urlPattern;
   }



   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored)
   {
      this.elIgnored = elIgnored;
      childNode.getOrCreate("el-ignored").text(elIgnored);
      return this;
   }

   public Boolean getElIgnored()
   {
      return elIgnored;
   }



   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding)
   {
      this.pageEncoding = pageEncoding;
      childNode.getOrCreate("page-encoding").text(pageEncoding);
      return this;
   }

   public String getPageEncoding()
   {
      return pageEncoding;
   }



   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid)
   {
      this.scriptingInvalid = scriptingInvalid;
      childNode.getOrCreate("scripting-invalid").text(scriptingInvalid);
      return this;
   }

   public Boolean getScriptingInvalid()
   {
      return scriptingInvalid;
   }



   public JspPropertyGroupType<T> setIsXml(Boolean isXml)
   {
      this.isXml = isXml;
      childNode.getOrCreate("is-xml").text(isXml);
      return this;
   }

   public Boolean getIsXml()
   {
      return isXml;
   }



   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude)
   {
      this.includePrelude = includePrelude;
      childNode.getOrCreate("include-prelude").text(includePrelude);
      return this;
   }

   public String getIncludePrelude()
   {
      return includePrelude;
   }



   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda)
   {
      this.includeCoda = includeCoda;
      childNode.getOrCreate("include-coda").text(includeCoda);
      return this;
   }

   public String getIncludeCoda()
   {
      return includeCoda;
   }



   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral)
   {
      this.deferredSyntaxAllowedAsLiteral = deferredSyntaxAllowedAsLiteral;
      childNode.getOrCreate("deferred-syntax-allowed-as-literal").text(deferredSyntaxAllowedAsLiteral);
      return this;
   }

   public Boolean getDeferredSyntaxAllowedAsLiteral()
   {
      return deferredSyntaxAllowedAsLiteral;
   }



   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces)
   {
      this.trimDirectiveWhitespaces = trimDirectiveWhitespaces;
      childNode.getOrCreate("trim-directive-whitespaces").text(trimDirectiveWhitespaces);
      return this;
   }

   public Boolean getTrimDirectiveWhitespaces()
   {
      return trimDirectiveWhitespaces;
   }



   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType)
   {
      this.defaultContentType = defaultContentType;
      childNode.getOrCreate("default-content-type").text(defaultContentType);
      return this;
   }

   public String getDefaultContentType()
   {
      return defaultContentType;
   }



   public JspPropertyGroupType<T> setBuffer(String buffer)
   {
      this.buffer = buffer;
      childNode.getOrCreate("buffer").text(buffer);
      return this;
   }

   public String getBuffer()
   {
      return buffer;
   }



   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace)
   {
      this.errorOnUndeclaredNamespace = errorOnUndeclaredNamespace;
      childNode.getOrCreate("error-on-undeclared-namespace").text(errorOnUndeclaredNamespace);
      return this;
   }

   public Boolean getErrorOnUndeclaredNamespace()
   {
      return errorOnUndeclaredNamespace;
   }

}
