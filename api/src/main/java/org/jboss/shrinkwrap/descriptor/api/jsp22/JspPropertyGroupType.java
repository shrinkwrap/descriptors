package org.jboss.shrinkwrap.descriptor.api.jsp22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface JspPropertyGroupType<T> extends Child<T>
{
   public JspPropertyGroupType<T> setDescription(String description);
   public String getDescription();

   public JspPropertyGroupType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public JspPropertyGroupType<T> setIcon(IconType<JspPropertyGroupType<T>> icon);
   public IconType<JspPropertyGroupType<T>> getIcon();

   public JspPropertyGroupType<T> setUrlPattern(String urlPattern);
   public String getUrlPattern();

   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored);
   public Boolean getElIgnored();

   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding);
   public String getPageEncoding();

   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid);
   public Boolean getScriptingInvalid();

   public JspPropertyGroupType<T> setIsXml(Boolean isXml);
   public Boolean getIsXml();

   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude);
   public String getIncludePrelude();

   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda);
   public String getIncludeCoda();

   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral);
   public Boolean getDeferredSyntaxAllowedAsLiteral();

   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces);
   public Boolean getTrimDirectiveWhitespaces();

   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType);
   public String getDefaultContentType();

   public JspPropertyGroupType<T> setBuffer(String buffer);
   public String getBuffer();

   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace);
   public Boolean getErrorOnUndeclaredNamespace();
}
