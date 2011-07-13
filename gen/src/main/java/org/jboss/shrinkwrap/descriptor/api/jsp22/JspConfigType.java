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

/**
 * This interface defines the contract for the <code> jsp-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The jsp-configType is used to provide global configuration <br> 
 * information for the JSP files in a web application. It has <br> 
 * two subelements, taglib and jsp-property-group. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface JspConfigType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : taglib
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>taglib</code> elements 
    * @return the current instance of {@link JspConfigType<T>} 
    */
   public JspConfigType<T> removeAllTaglib();

   /**
    * Returns the <code>taglib</code> element
    * @return the node defined for the element <code>taglib</code> 
    */
   public TaglibType<JspConfigType<T>> taglib();

   /**
    * Returns all <code>taglib</code> elements
    * @return list of <code>taglib</code> 
    */
   public List<TaglibType<JspConfigType<T>>> getTaglibList();

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-property-group
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jsp-property-group</code> elements 
    * @return the current instance of {@link JspConfigType<T>} 
    */
   public JspConfigType<T> removeAllJspPropertyGroup();

   /**
    * Returns the <code>jsp-property-group</code> element
    * @return the node defined for the element <code>jsp-property-group</code> 
    */
   public JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup();

   /**
    * Returns all <code>jsp-property-group</code> elements
    * @return list of <code>jsp-property-group</code> 
    */
   public List<JspPropertyGroupType<JspConfigType<T>>> getJspPropertyGroupList();

}
