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
package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;

/**
 * This interface defines the contract for the <code> annotationType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The annotationType is used to add annotations to a bean class, <br> 
 * method, or field. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface AnnotationType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : annotation-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>annotation-class</code> element with the given value will be created.
    * Otherwise, the existing <code>annotation-class</code> element will be updated with the given value.
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> setAnnotationClass(String annotationClass);

   /**
    * Removes the <code>annotation-class</code> element 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeAnnotationClass();

   /**
    * Returns the <code>annotation-class</code> element
    * @return the node defined for the element <code>annotation-class</code> 
    */
   public String getAnnotationClass();

   // -------------------------------------------------------------------------------------||
   // Element type : annotation-implementation-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>annotation-implementation-class</code> element with the given value will be created.
    * Otherwise, the existing <code>annotation-implementation-class</code> element will be updated with the given value.
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> setAnnotationImplementationClass(String annotationImplementationClass);

   /**
    * Removes the <code>annotation-implementation-class</code> element 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeAnnotationImplementationClass();

   /**
    * Returns the <code>annotation-implementation-class</code> element
    * @return the node defined for the element <code>annotation-implementation-class</code> 
    */
   public String getAnnotationImplementationClass();

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>injection-target</code> element 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeInjectionTarget();

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the existing <code>injection-target</code> element will be returned.
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<AnnotationType<T>> injectionTarget();

   // -------------------------------------------------------------------------------------||
   // Element type : property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeAllProperty();

   /**
    * Returns the <code>property</code> element
    * @return the node defined for the element <code>property</code> 
    */
   public AnnotationPropertyType<AnnotationType<T>> property();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<AnnotationPropertyType<AnnotationType<T>>> getPropertyList();

}
