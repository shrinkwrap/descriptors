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
package org.jboss.shrinkwrap.descriptor.api.javaee5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> param-valueType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * This type is a general type that can be used to declare <br> 
 * parameter/value lists. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ParamValueType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ParamValueType<T>} 
    */
   public ParamValueType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ParamValueType<T>} 
    */
   public ParamValueType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ParamValueType<T>} 
    */
   public ParamValueType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : param-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>param-name</code> element with the given value will be created.
    * Otherwise, the existing <code>param-name</code> element will be updated with the given value.
    * @return the current instance of {@link ParamValueType<T>} 
    */
   public ParamValueType<T> setParamName(String paramName);

   /**
    * Removes the <code>param-name</code> element 
    * @return the current instance of {@link ParamValueType<T>} 
    */
   public ParamValueType<T> removeParamName();

   /**
    * Returns the <code>param-name</code> element
    * @return the node defined for the element <code>param-name</code> 
    */
   public String getParamName();

   // -------------------------------------------------------------------------------------||
   // Element type : param-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>param-value</code> element with the given value will be created.
    * Otherwise, the existing <code>param-value</code> element will be updated with the given value.
    * @return the current instance of {@link ParamValueType<T>} 
    */
   public ParamValueType<T> setParamValue(String paramValue);

   /**
    * Removes the <code>param-value</code> element 
    * @return the current instance of {@link ParamValueType<T>} 
    */
   public ParamValueType<T> removeParamValue();

   /**
    * Returns the <code>param-value</code> element
    * @return the node defined for the element <code>param-value</code> 
    */
   public String getParamValue();

}
