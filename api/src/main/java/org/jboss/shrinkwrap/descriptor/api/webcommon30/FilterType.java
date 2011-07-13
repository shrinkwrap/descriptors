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
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

/**
 * This interface defines the contract for the <code> filterType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The filterType is used to declare a filter in the web <br> 
 * application. The filter is mapped to either a servlet or a <br> 
 * URL pattern in the filter-mapping element, using the <br> 
 * filter-name value to reference. Filters can access the <br> 
 * initialization parameters declared in the deployment <br> 
 * descriptor at runtime via the FilterConfig interface. <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface FilterType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAllDescription();

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
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAllDisplayName();

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
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<FilterType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FilterType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : filter-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-name</code> element with the given value will be created.
    * Otherwise, the existing <code>filter-name</code> element will be updated with the given value.
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setFilterName(String filterName);

   /**
    * Removes the <code>filter-name</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeFilterName();

   /**
    * Returns the <code>filter-name</code> element
    * @return the node defined for the element <code>filter-name</code> 
    */
   public String getFilterName();

   // -------------------------------------------------------------------------------------||
   // Element type : filter-class
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-class</code> element with the given value will be created.
    * Otherwise, the existing <code>filter-class</code> element will be updated with the given value.
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setFilterClass(String filterClass);

   /**
    * Removes the <code>filter-class</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeFilterClass();

   /**
    * Returns the <code>filter-class</code> element
    * @return the node defined for the element <code>filter-class</code> 
    */
   public String getFilterClass();

   // -------------------------------------------------------------------------------------||
   // Element type : async-supported
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>async-supported</code> element with the given value will be created.
    * Otherwise, the existing <code>async-supported</code> element will be updated with the given value.
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setAsyncSupported(Boolean asyncSupported);

   /**
    * Removes the <code>async-supported</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAsyncSupported();

   /**
    * Returns the <code>async-supported</code> element
    * @return the node defined for the element <code>async-supported</code> 
    */
   public Boolean isAsyncSupported();

   // -------------------------------------------------------------------------------------||
   // Element type : init-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAllInitParam();

   /**
    * Returns the <code>init-param</code> element
    * @return the node defined for the element <code>init-param</code> 
    */
   public ParamValueType<FilterType<T>> initParam();

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<FilterType<T>>> getInitParamList();

}
