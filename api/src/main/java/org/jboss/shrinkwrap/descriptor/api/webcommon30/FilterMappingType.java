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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> filter-mappingType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * Declaration of the filter mappings in this web <br> 
 * application is done by using filter-mappingType. <br> 
 * The container uses the filter-mapping <br> 
 * declarations to decide which filters to apply to a request, <br> 
 * and in what order. The container matches the request URI to <br> 
 * a Servlet in the normal way. To determine which filters to <br> 
 * apply it matches filter-mapping declarations either on <br> 
 * servlet-name, or on url-pattern for each filter-mapping <br> 
 * element, depending on which style is used. The order in <br> 
 * which filters are invoked is the order in which <br> 
 * filter-mapping declarations that match a request URI for a <br> 
 * servlet appear in the list of filter-mapping elements.The <br> 
 * filter-name value must be the value of the filter-name <br> 
 * sub-elements of one of the filter declarations in the <br> 
 * deployment descriptor. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface FilterMappingType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : filter-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-name</code> element with the given value will be created.
    * Otherwise, the existing <code>filter-name</code> element will be updated with the given value.
    * @return the current instance of {@link FilterMappingType<T>} 
    */
   public FilterMappingType<T> setFilterName(String filterName);

   /**
    * Removes the <code>filter-name</code> element 
    * @return the current instance of {@link FilterMappingType<T>} 
    */
   public FilterMappingType<T> removeFilterName();

   /**
    * Returns the <code>filter-name</code> element
    * @return the node defined for the element <code>filter-name</code> 
    */
   public String getFilterName();

   // -------------------------------------------------------------------------------------||
   // Element type : dispatcher
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>dispatcher</code> element with the given value will be created.
    * Otherwise, the existing <code>dispatcher</code> element will be updated with the given value.
    * @return the current instance of {@link FilterMappingType<T>} 
    */
   public FilterMappingType<T> setDispatcher(DispatcherType dispatcher);

   /**
    * If not already created, a new <code>dispatcher</code> element with the given value will be created.
    * Otherwise, the existing <code>dispatcher</code> element will be updated with the given value.
    * @return the current instance of {@link FilterMappingType<T>} 
    */
   public FilterMappingType<T> setDispatcher(String dispatcher);

   /**
    * Returns the <code>dispatcher</code> element
    * @return the node defined for the element <code>dispatcher</code> 
    */
   public DispatcherType getDispatcher();

   /**
    * Returns the <code>dispatcher</code> element
    * @return the node defined for the element <code>dispatcher</code> 
    */
   public String getDispatcherAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>url-pattern</code> element with the given value will be created.
    * Otherwise, the existing <code>url-pattern</code> element will be updated with the given value.
    * @return the current instance of {@link FilterMappingType<T>} 
    */
   public FilterMappingType<T> setUrlPattern(String urlPattern);

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of {@link FilterMappingType<T>} 
    */
   public FilterMappingType<T> removeUrlPattern();

   /**
    * Returns the <code>url-pattern</code> element
    * @return the node defined for the element <code>url-pattern</code> 
    */
   public String getUrlPattern();

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-name</code> element with the given value will be created.
    * Otherwise, the existing <code>servlet-name</code> element will be updated with the given value.
    * @return the current instance of {@link FilterMappingType<T>} 
    */
   public FilterMappingType<T> setServletName(String servletName);

   /**
    * Removes the <code>servlet-name</code> element 
    * @return the current instance of {@link FilterMappingType<T>} 
    */
   public FilterMappingType<T> removeServletName();

   /**
    * Returns the <code>servlet-name</code> element
    * @return the node defined for the element <code>servlet-name</code> 
    */
   public String getServletName();

}
