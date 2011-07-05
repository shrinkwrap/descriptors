package org.jboss.shrinkwrap.descriptor.api.jsp22; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The jsp-property-groupType is used to group a number of
 * files so they can be given global property information.
 * All files so described are deemed to be JSP files. The
 * following additional properties can be described:
 *
 * - Control whether EL is ignored.
 * - Control whether scripting elements are invalid.
 * - Indicate pageEncoding information.
 * - Indicate that a resource is a JSP document (XML).
 * - Prelude and Coda automatic includes.
 * - Control whether the character sequence #{ is allowed
 * when used as a String literal.
 * - Control whether template text containing only
 * whitespaces must be removed from the response output.
 * - Indicate the default contentType information.
 * - Indicate the default buffering model for JspWriter
 * - Control whether error should be raised for the use of
 * undeclared namespaces in a JSP page.
 *
 *
 *
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
