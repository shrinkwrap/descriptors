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
 * This class implements the <code> jsp-property-groupType </code> xsd type 
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
public class JspPropertyGroupTypeImpl<T> implements Child<T>, JspPropertyGroupType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public JspPropertyGroupTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public JspPropertyGroupTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
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

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
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

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDisplayNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDisplayName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
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

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<JspPropertyGroupType<T>> icon()
   {
      return new IconTypeImpl<JspPropertyGroupType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<JspPropertyGroupType<T>>> getIconList()
   {
      List<IconType<JspPropertyGroupType<T>>> list = new ArrayList<IconType<JspPropertyGroupType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<JspPropertyGroupType<T>> type = new IconTypeImpl<JspPropertyGroupType<T>>(this, "icon", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>url-pattern</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setUrlPattern(String urlPattern)
   {
      childNode.create("url-pattern").text(urlPattern);
      return this;
   }

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param list of <code>url-pattern</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setUrlPatternList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setUrlPattern(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllUrlPattern()
   {
      childNode.remove("url-pattern");
      return this;
   }

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
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

   /**
    * If not already created, a new <code>el-ignored</code> element with the given value will be created.
    * Otherwise, the existing <code>el-ignored</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setElIgnored(Boolean elIgnored)
   {
      childNode.getOrCreate("el-ignored").text(elIgnored);
      return this;
   }

   /**
    * Removes the <code>el-ignored</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeElIgnored()
   {
      childNode.remove("el-ignored");
      return this;
   }

   /**
    * Returns the <code>el-ignored</code> element
    * @return the node defined for the element <code>el-ignored</code> 
    */
   public Boolean isElIgnored()
   {
      return Strings.isTrue(childNode.textValue("el-ignored"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : page-encoding
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>page-encoding</code> element with the given value will be created.
    * Otherwise, the existing <code>page-encoding</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setPageEncoding(String pageEncoding)
   {
      childNode.getOrCreate("page-encoding").text(pageEncoding);
      return this;
   }

   /**
    * Removes the <code>page-encoding</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removePageEncoding()
   {
      childNode.remove("page-encoding");
      return this;
   }

   /**
    * Returns the <code>page-encoding</code> element
    * @return the node defined for the element <code>page-encoding</code> 
    */
   public String getPageEncoding()
   {
      return childNode.textValue("page-encoding");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : scripting-invalid
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>scripting-invalid</code> element with the given value will be created.
    * Otherwise, the existing <code>scripting-invalid</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setScriptingInvalid(Boolean scriptingInvalid)
   {
      childNode.getOrCreate("scripting-invalid").text(scriptingInvalid);
      return this;
   }

   /**
    * Removes the <code>scripting-invalid</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeScriptingInvalid()
   {
      childNode.remove("scripting-invalid");
      return this;
   }

   /**
    * Returns the <code>scripting-invalid</code> element
    * @return the node defined for the element <code>scripting-invalid</code> 
    */
   public Boolean isScriptingInvalid()
   {
      return Strings.isTrue(childNode.textValue("scripting-invalid"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : is-xml
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>is-xml</code> element with the given value will be created.
    * Otherwise, the existing <code>is-xml</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIsXml(Boolean isXml)
   {
      childNode.getOrCreate("is-xml").text(isXml);
      return this;
   }

   /**
    * Removes the <code>is-xml</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeIsXml()
   {
      childNode.remove("is-xml");
      return this;
   }

   /**
    * Returns the <code>is-xml</code> element
    * @return the node defined for the element <code>is-xml</code> 
    */
   public Boolean isIsXml()
   {
      return Strings.isTrue(childNode.textValue("is-xml"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : include-prelude
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>include-prelude</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIncludePrelude(String includePrelude)
   {
      childNode.create("include-prelude").text(includePrelude);
      return this;
   }

   /**
    * Creates for all String objects representing <code>include-prelude</code> elements, 
    * a new <code>include-prelude</code> element 
    * @param list of <code>include-prelude</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIncludePreludeList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setIncludePrelude(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>include-prelude</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllIncludePrelude()
   {
      childNode.remove("include-prelude");
      return this;
   }

   /**
    * Returns all <code>include-prelude</code> elements
    * @return list of <code>include-prelude</code> 
    */
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

   /**
    * Creates a new <code>include-coda</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIncludeCoda(String includeCoda)
   {
      childNode.create("include-coda").text(includeCoda);
      return this;
   }

   /**
    * Creates for all String objects representing <code>include-coda</code> elements, 
    * a new <code>include-coda</code> element 
    * @param list of <code>include-coda</code> objects 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setIncludeCodaList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setIncludeCoda(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>include-coda</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeAllIncludeCoda()
   {
      childNode.remove("include-coda");
      return this;
   }

   /**
    * Returns all <code>include-coda</code> elements
    * @return list of <code>include-coda</code> 
    */
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

   /**
    * If not already created, a new <code>deferred-syntax-allowed-as-literal</code> element with the given value will be created.
    * Otherwise, the existing <code>deferred-syntax-allowed-as-literal</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDeferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral)
   {
      childNode.getOrCreate("deferred-syntax-allowed-as-literal").text(deferredSyntaxAllowedAsLiteral);
      return this;
   }

   /**
    * Removes the <code>deferred-syntax-allowed-as-literal</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeDeferredSyntaxAllowedAsLiteral()
   {
      childNode.remove("deferred-syntax-allowed-as-literal");
      return this;
   }

   /**
    * Returns the <code>deferred-syntax-allowed-as-literal</code> element
    * @return the node defined for the element <code>deferred-syntax-allowed-as-literal</code> 
    */
   public Boolean isDeferredSyntaxAllowedAsLiteral()
   {
      return Strings.isTrue(childNode.textValue("deferred-syntax-allowed-as-literal"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : trim-directive-whitespaces
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>trim-directive-whitespaces</code> element with the given value will be created.
    * Otherwise, the existing <code>trim-directive-whitespaces</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setTrimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces)
   {
      childNode.getOrCreate("trim-directive-whitespaces").text(trimDirectiveWhitespaces);
      return this;
   }

   /**
    * Removes the <code>trim-directive-whitespaces</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeTrimDirectiveWhitespaces()
   {
      childNode.remove("trim-directive-whitespaces");
      return this;
   }

   /**
    * Returns the <code>trim-directive-whitespaces</code> element
    * @return the node defined for the element <code>trim-directive-whitespaces</code> 
    */
   public Boolean isTrimDirectiveWhitespaces()
   {
      return Strings.isTrue(childNode.textValue("trim-directive-whitespaces"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : default-content-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>default-content-type</code> element with the given value will be created.
    * Otherwise, the existing <code>default-content-type</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setDefaultContentType(String defaultContentType)
   {
      childNode.getOrCreate("default-content-type").text(defaultContentType);
      return this;
   }

   /**
    * Removes the <code>default-content-type</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeDefaultContentType()
   {
      childNode.remove("default-content-type");
      return this;
   }

   /**
    * Returns the <code>default-content-type</code> element
    * @return the node defined for the element <code>default-content-type</code> 
    */
   public String getDefaultContentType()
   {
      return childNode.textValue("default-content-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : buffer
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>buffer</code> element with the given value will be created.
    * Otherwise, the existing <code>buffer</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setBuffer(String buffer)
   {
      childNode.getOrCreate("buffer").text(buffer);
      return this;
   }

   /**
    * Removes the <code>buffer</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeBuffer()
   {
      childNode.remove("buffer");
      return this;
   }

   /**
    * Returns the <code>buffer</code> element
    * @return the node defined for the element <code>buffer</code> 
    */
   public String getBuffer()
   {
      return childNode.textValue("buffer");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : error-on-undeclared-namespace
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-on-undeclared-namespace</code> element with the given value will be created.
    * Otherwise, the existing <code>error-on-undeclared-namespace</code> element will be updated with the given value.
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> setErrorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace)
   {
      childNode.getOrCreate("error-on-undeclared-namespace").text(errorOnUndeclaredNamespace);
      return this;
   }

   /**
    * Removes the <code>error-on-undeclared-namespace</code> element 
    * @return the current instance of {@link JspPropertyGroupType<T>} 
    */
   public JspPropertyGroupType<T> removeErrorOnUndeclaredNamespace()
   {
      childNode.remove("error-on-undeclared-namespace");
      return this;
   }

   /**
    * Returns the <code>error-on-undeclared-namespace</code> element
    * @return the node defined for the element <code>error-on-undeclared-namespace</code> 
    */
   public Boolean isErrorOnUndeclaredNamespace()
   {
      return Strings.isTrue(childNode.textValue("error-on-undeclared-namespace"));
   }

}
