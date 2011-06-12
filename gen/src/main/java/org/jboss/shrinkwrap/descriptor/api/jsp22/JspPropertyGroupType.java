package org.jboss.shrinkwrap.descriptor.api.jsp22;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface JspPropertyGroupType<T> extends Child<T>
{

   public JspPropertyGroupType<T> setDescription(String description);

   public JspPropertyGroupType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public JspPropertyGroupType<T> setDisplayName(String displayName);

   public JspPropertyGroupType<T> setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public JspPropertyGroupType<T> removeAllIcon();

   public IconType<JspPropertyGroupType<T>> getIcon();

   public List<IconType<JspPropertyGroupType<T>>> getIconList();

   public JspPropertyGroupType<T> setUrlPattern(String urlPattern);

   public JspPropertyGroupType<T> setUrlPattern(String... values);

   public List<String> getUrlPatternList();

   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored);

   public Boolean isElIgnored();

   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding);

   public String getPageEncoding();

   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid);

   public Boolean isScriptingInvalid();

   public JspPropertyGroupType<T> setIsXml(Boolean isXml);

   public Boolean isIsXml();

   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude);

   public JspPropertyGroupType<T> setIncludePrelude(String... values);

   public List<String> getIncludePreludeList();

   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda);

   public JspPropertyGroupType<T> setIncludeCoda(String... values);

   public List<String> getIncludeCodaList();

   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral);

   public Boolean isDeferredSyntaxAllowedAsLiteral();

   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces);

   public Boolean isTrimDirectiveWhitespaces();

   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType);

   public String getDefaultContentType();

   public JspPropertyGroupType<T> setBuffer(String buffer);

   public String getBuffer();

   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace);

   public Boolean isErrorOnUndeclaredNamespace();

}
