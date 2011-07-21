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
 * This interface defines the contract for the <code> servlet-mappingType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The servlet-mappingType defines a mapping between a <br> 
 * servlet and a url pattern. <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface ServletMappingType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-name</code> element with the given value will be created.
    * Otherwise, the existing <code>servlet-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServletMappingType<T>} 
    */
   public ServletMappingType<T> setServletName(String servletName);

   /**
    * Removes the <code>servlet-name</code> element 
    * @return the current instance of {@link ServletMappingType<T>} 
    */
   public ServletMappingType<T> removeServletName();

   /**
    * Returns the <code>servlet-name</code> element
    * @return the node defined for the element <code>servlet-name</code> 
    */
   public String getServletName();

   // -------------------------------------------------------------------------------------||
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>url-pattern</code> element 
    * @return the current instance of {@link ServletMappingType<T>} 
    */
   public ServletMappingType<T> setUrlPattern(String urlPattern);

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param list of <code>url-pattern</code> objects 
    * @return the current instance of {@link ServletMappingType<T>} 
    */
   public ServletMappingType<T> setUrlPatternList(String... values);

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of {@link ServletMappingType<T>} 
    */
   public ServletMappingType<T> removeAllUrlPattern();

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getUrlPatternList();

}
