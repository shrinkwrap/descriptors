package org.jboss.shrinkwrap.descriptor.api.jsp22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface JspPropertyGroupType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setDescription(String description);
   public JspPropertyGroupType<T> setDescription(String ... values);

   public List<String> getDescriptionList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setDisplayName(String displayName);
   public JspPropertyGroupType<T> setDisplayName(String ... values);

   public List<String> getDisplayNameList();

   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public JspPropertyGroupType<T> setIcon(IconType<JspPropertyGroupType<T>> icon);

   public IconType<JspPropertyGroupType<T>> getIcon();
   public List<IconType<JspPropertyGroupType<T>>> getIconList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setUrlPattern(String urlPattern);
   public JspPropertyGroupType<T> setUrlPattern(String ... values);

   public List<String> getUrlPatternList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored);

   public Boolean getElIgnored();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding);

   public String getPageEncoding();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid);

   public Boolean getScriptingInvalid();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public JspPropertyGroupType<T> setIsXml(Boolean isXml);

   public Boolean getIsXml();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude);
   public JspPropertyGroupType<T> setIncludePrelude(String ... values);

   public List<String> getIncludePreludeList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda);
   public JspPropertyGroupType<T> setIncludeCoda(String ... values);

   public List<String> getIncludeCodaList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral);

   public Boolean getDeferredSyntaxAllowedAsLiteral();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces);

   public Boolean getTrimDirectiveWhitespaces();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType);

   public String getDefaultContentType();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public JspPropertyGroupType<T> setBuffer(String buffer);

   public String getBuffer();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace);

   public Boolean getErrorOnUndeclaredNamespace();

}
