package org.jboss.shrinkwrap.descriptor.api.jsp22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public interface JspPropertyGroupType<T> extends Child<T>
{

   public JspPropertyGroupType<T> setDescription(String description);
   public JspPropertyGroupType<T> setDescriptionList(String ... values);
   public JspPropertyGroupType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public JspPropertyGroupType<T> setDisplayName(String displayName);
   public JspPropertyGroupType<T> setDisplayNameList(String ... values);
   public JspPropertyGroupType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();


   public JspPropertyGroupType<T> removeAllIcon();

   public IconType<JspPropertyGroupType<T>> icon();
   public List<IconType<JspPropertyGroupType<T>>> getIconList();



   public JspPropertyGroupType<T> setUrlPattern(String urlPattern);
   public JspPropertyGroupType<T> setUrlPatternList(String ... values);
   public JspPropertyGroupType<T> removeAllUrlPattern();

   public List<String> getUrlPatternList();



   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored);
   public JspPropertyGroupType<T> removeElIgnored();

   public Boolean isElIgnored();



   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding);
   public JspPropertyGroupType<T> removePageEncoding();

   public String getPageEncoding();



   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid);
   public JspPropertyGroupType<T> removeScriptingInvalid();

   public Boolean isScriptingInvalid();



   public JspPropertyGroupType<T> setIsXml(Boolean isXml);
   public JspPropertyGroupType<T> removeIsXml();

   public Boolean isIsXml();



   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude);
   public JspPropertyGroupType<T> setIncludePreludeList(String ... values);
   public JspPropertyGroupType<T> removeAllIncludePrelude();

   public List<String> getIncludePreludeList();



   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda);
   public JspPropertyGroupType<T> setIncludeCodaList(String ... values);
   public JspPropertyGroupType<T> removeAllIncludeCoda();

   public List<String> getIncludeCodaList();



   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral);
   public JspPropertyGroupType<T> removeDeferredSyntaxAllowedAsLiteral();

   public Boolean isDeferredSyntaxAllowedAsLiteral();



   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces);
   public JspPropertyGroupType<T> removeTrimDirectiveWhitespaces();

   public Boolean isTrimDirectiveWhitespaces();



   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType);
   public JspPropertyGroupType<T> removeDefaultContentType();

   public String getDefaultContentType();



   public JspPropertyGroupType<T> setBuffer(String buffer);
   public JspPropertyGroupType<T> removeBuffer();

   public String getBuffer();



   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace);
   public JspPropertyGroupType<T> removeErrorOnUndeclaredNamespace();

   public Boolean isErrorOnUndeclaredNamespace();

}
