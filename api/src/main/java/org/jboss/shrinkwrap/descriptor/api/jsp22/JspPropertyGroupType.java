/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.api.jsp22;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This interface defines the contract for the <code> jsp-property-groupType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The jsp-property-groupType is used to group a number of <br> 
 * files so they can be given global property information. <br> 
 * All files so described are deemed to be JSP files. The <br> 
 * following additional properties can be described: <br> 
 *<br>
 * - Control whether EL is ignored. <br> 
 * - Control whether scripting elements are invalid. <br> 
 * - Indicate pageEncoding information. <br> 
 * - Indicate that a resource is a JSP document (XML). <br> 
 * - Prelude and Coda automatic includes. <br> 
 * - Control whether the character sequence #{ is allowed <br> 
 * when used as a String literal. <br> 
 * - Control whether template text containing only <br> 
 * whitespaces must be removed from the response output. <br> 
 * - Indicate the default contentType information. <br> 
 * - Indicate the default buffering model for JspWriter <br> 
 * - Control whether error should be raised for the use of <br> 
 * undeclared namespaces in a JSP page. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface JspPropertyGroupType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllDisplayName();

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList();

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<JspPropertyGroupType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<JspPropertyGroupType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>url-pattern</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setUrlPattern(String urlPattern);

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param list of <code>url-pattern</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setUrlPatternList(String... values);

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllUrlPattern();

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getUrlPatternList();

   // -------------------------------------------------------------------------------------||
   // Element type : el-ignored
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>el-ignored</code> element with the given value will be created.
    * Otherwise, the existing <code>el-ignored</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored);

   /**
    * Removes the <code>el-ignored</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeElIgnored();

   /**
    * Returns the <code>el-ignored</code> element
    * @return the node defined for the element <code>el-ignored</code> 
    */
   public Boolean isElIgnored();

   // -------------------------------------------------------------------------------------||
   // Element type : page-encoding
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>page-encoding</code> element with the given value will be created.
    * Otherwise, the existing <code>page-encoding</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding);

   /**
    * Removes the <code>page-encoding</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removePageEncoding();

   /**
    * Returns the <code>page-encoding</code> element
    * @return the node defined for the element <code>page-encoding</code> 
    */
   public String getPageEncoding();

   // -------------------------------------------------------------------------------------||
   // Element type : scripting-invalid
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>scripting-invalid</code> element with the given value will be created.
    * Otherwise, the existing <code>scripting-invalid</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid);

   /**
    * Removes the <code>scripting-invalid</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeScriptingInvalid();

   /**
    * Returns the <code>scripting-invalid</code> element
    * @return the node defined for the element <code>scripting-invalid</code> 
    */
   public Boolean isScriptingInvalid();

   // -------------------------------------------------------------------------------------||
   // Element type : is-xml
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>is-xml</code> element with the given value will be created.
    * Otherwise, the existing <code>is-xml</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIsXml(Boolean isXml);

   /**
    * Removes the <code>is-xml</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeIsXml();

   /**
    * Returns the <code>is-xml</code> element
    * @return the node defined for the element <code>is-xml</code> 
    */
   public Boolean isIsXml();

   // -------------------------------------------------------------------------------------||
   // Element type : include-prelude
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>include-prelude</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude);

   /**
    * Creates for all String objects representing <code>include-prelude</code> elements, 
    * a new <code>include-prelude</code> element 
    * @param list of <code>include-prelude</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIncludePreludeList(String... values);

   /**
    * Removes the <code>include-prelude</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllIncludePrelude();

   /**
    * Returns all <code>include-prelude</code> elements
    * @return list of <code>include-prelude</code> 
    */
   public List<String> getIncludePreludeList();

   // -------------------------------------------------------------------------------------||
   // Element type : include-coda
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>include-coda</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda);

   /**
    * Creates for all String objects representing <code>include-coda</code> elements, 
    * a new <code>include-coda</code> element 
    * @param list of <code>include-coda</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIncludeCodaList(String... values);

   /**
    * Removes the <code>include-coda</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllIncludeCoda();

   /**
    * Returns all <code>include-coda</code> elements
    * @return list of <code>include-coda</code> 
    */
   public List<String> getIncludeCodaList();

   // -------------------------------------------------------------------------------------||
   // Element type : deferred-syntax-allowed-as-literal
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>deferred-syntax-allowed-as-literal</code> element with the given value will be created.
    * Otherwise, the existing <code>deferred-syntax-allowed-as-literal</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral);

   /**
    * Removes the <code>deferred-syntax-allowed-as-literal</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeDeferredSyntaxAllowedAsLiteral();

   /**
    * Returns the <code>deferred-syntax-allowed-as-literal</code> element
    * @return the node defined for the element <code>deferred-syntax-allowed-as-literal</code> 
    */
   public Boolean isDeferredSyntaxAllowedAsLiteral();

   // -------------------------------------------------------------------------------------||
   // Element type : trim-directive-whitespaces
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>trim-directive-whitespaces</code> element with the given value will be created.
    * Otherwise, the existing <code>trim-directive-whitespaces</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces);

   /**
    * Removes the <code>trim-directive-whitespaces</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeTrimDirectiveWhitespaces();

   /**
    * Returns the <code>trim-directive-whitespaces</code> element
    * @return the node defined for the element <code>trim-directive-whitespaces</code> 
    */
   public Boolean isTrimDirectiveWhitespaces();

   // -------------------------------------------------------------------------------------||
   // Element type : default-content-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>default-content-type</code> element with the given value will be created.
    * Otherwise, the existing <code>default-content-type</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType);

   /**
    * Removes the <code>default-content-type</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeDefaultContentType();

   /**
    * Returns the <code>default-content-type</code> element
    * @return the node defined for the element <code>default-content-type</code> 
    */
   public String getDefaultContentType();

   // -------------------------------------------------------------------------------------||
   // Element type : buffer
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>buffer</code> element with the given value will be created.
    * Otherwise, the existing <code>buffer</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setBuffer(String buffer);

   /**
    * Removes the <code>buffer</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeBuffer();

   /**
    * Returns the <code>buffer</code> element
    * @return the node defined for the element <code>buffer</code> 
    */
   public String getBuffer();

   // -------------------------------------------------------------------------------------||
   // Element type : error-on-undeclared-namespace
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-on-undeclared-namespace</code> element with the given value will be created.
    * Otherwise, the existing <code>error-on-undeclared-namespace</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace);

   /**
    * Removes the <code>error-on-undeclared-namespace</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeErrorOnUndeclaredNamespace();

   /**
    * Returns the <code>error-on-undeclared-namespace</code> element
    * @return the node defined for the element <code>error-on-undeclared-namespace</code> 
    */
   public Boolean isErrorOnUndeclaredNamespace();

}
