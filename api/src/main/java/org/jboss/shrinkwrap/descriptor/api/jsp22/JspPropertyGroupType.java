package org.jboss.shrinkwrap.descriptor.api.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface JspPropertyGroupType<T> extends Child<T>
{
   public JspPropertyGroupType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public JspPropertyGroupType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<JspPropertyGroupType<T>> icon();

   public JspPropertyGroupType<T> setUrlPattern(String urlPattern);

   @NodeInfo(xmlName = "url-pattern")
   public String getUrlPattern();

   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored);

   @NodeInfo(xmlName = "el-ignored")
   public Boolean getElIgnored();

   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding);

   @NodeInfo(xmlName = "page-encoding")
   public String getPageEncoding();

   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid);

   @NodeInfo(xmlName = "scripting-invalid")
   public Boolean getScriptingInvalid();

   public JspPropertyGroupType<T> setIsXml(Boolean isXml);

   @NodeInfo(xmlName = "is-xml")
   public Boolean getIsXml();

   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude);

   @NodeInfo(xmlName = "include-prelude")
   public String getIncludePrelude();

   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda);

   @NodeInfo(xmlName = "include-coda")
   public String getIncludeCoda();

   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral);

   @NodeInfo(xmlName = "deferred-syntax-allowed-as-literal")
   public Boolean getDeferredSyntaxAllowedAsLiteral();

   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces);

   @NodeInfo(xmlName = "trim-directive-whitespaces")
   public Boolean getTrimDirectiveWhitespaces();

   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType);

   @NodeInfo(xmlName = "default-content-type")
   public String getDefaultContentType();

   public JspPropertyGroupType<T> setBuffer(String buffer);

   @NodeInfo(xmlName = "buffer")
   public String getBuffer();

   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace);

   @NodeInfo(xmlName = "error-on-undeclared-namespace")
   public Boolean getErrorOnUndeclaredNamespace();
}
