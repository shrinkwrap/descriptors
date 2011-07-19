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
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> web-resource-collectionType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The web-resource-collectionType is used to identify the <br> 
 * resources and HTTP methods on those resources to which a <br> 
 * security constraint applies. If no HTTP methods are specified, <br> 
 * then the security constraint applies to all HTTP methods. <br> 
 * If HTTP methods are specified by http-method-omission <br> 
 * elements, the security constraint applies to all methods <br> 
 * except those identified in the collection. <br> 
 * http-method-omission and http-method elements are never <br> 
 * mixed in the same collection. <br> 
 *<br>
 * Used in: security-constraint <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface WebResourceCollectionType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : web-resource-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>web-resource-name</code> element with the given value will be created.
    * Otherwise, the existing <code>web-resource-name</code> element will be updated with the given value.
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setWebResourceName(String webResourceName);

   /**
    * Removes the <code>web-resource-name</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeWebResourceName();

   /**
    * Returns the <code>web-resource-name</code> element
    * @return the node defined for the element <code>web-resource-name</code> 
    */
   public String getWebResourceName();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>url-pattern</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setUrlPattern(String urlPattern);

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param list of <code>url-pattern</code> objects 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setUrlPatternList(String... values);

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeAllUrlPattern();

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getUrlPatternList();

   // -------------------------------------------------------------------------------------||
   // Element type : http-method
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>http-method</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setHttpMethod(String httpMethod);

   /**
    * Creates for all String objects representing <code>http-method</code> elements, 
    * a new <code>http-method</code> element 
    * @param list of <code>http-method</code> objects 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setHttpMethodList(String... values);

   /**
    * Removes the <code>http-method</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeAllHttpMethod();

   /**
    * Returns all <code>http-method</code> elements
    * @return list of <code>http-method</code> 
    */
   public List<String> getHttpMethodList();

   // -------------------------------------------------------------------------------------||
   // Element type : http-method-omission
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>http-method-omission</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setHttpMethodOmission(String httpMethodOmission);

   /**
    * Creates for all String objects representing <code>http-method-omission</code> elements, 
    * a new <code>http-method-omission</code> element 
    * @param list of <code>http-method-omission</code> objects 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setHttpMethodOmissionList(String... values);

   /**
    * Removes the <code>http-method-omission</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeAllHttpMethodOmission();

   /**
    * Returns all <code>http-method-omission</code> elements
    * @return list of <code>http-method-omission</code> 
    */
   public List<String> getHttpMethodOmissionList();

}
