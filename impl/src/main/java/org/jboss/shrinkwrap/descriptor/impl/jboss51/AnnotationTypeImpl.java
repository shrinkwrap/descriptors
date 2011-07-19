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
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationPropertyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.InjectionTargetTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> annotationType </code> xsd type 
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
public class AnnotationTypeImpl<T> implements Child<T>, AnnotationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AnnotationTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public AnnotationTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeAllDescription()
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
   // Element type : annotation-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>annotation-class</code> element with the given value will be created.
    * Otherwise, the existing <code>annotation-class</code> element will be updated with the given value.
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> setAnnotationClass(String annotationClass)
   {
      childNode.getOrCreate("annotation-class").text(annotationClass);
      return this;
   }

   /**
    * Removes the <code>annotation-class</code> element 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeAnnotationClass()
   {
      childNode.remove("annotation-class");
      return this;
   }

   /**
    * Returns the <code>annotation-class</code> element
    * @return the node defined for the element <code>annotation-class</code> 
    */
   public String getAnnotationClass()
   {
      return childNode.textValue("annotation-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : annotation-implementation-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>annotation-implementation-class</code> element with the given value will be created.
    * Otherwise, the existing <code>annotation-implementation-class</code> element will be updated with the given value.
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> setAnnotationImplementationClass(String annotationImplementationClass)
   {
      childNode.getOrCreate("annotation-implementation-class").text(annotationImplementationClass);
      return this;
   }

   /**
    * Removes the <code>annotation-implementation-class</code> element 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeAnnotationImplementationClass()
   {
      childNode.remove("annotation-implementation-class");
      return this;
   }

   /**
    * Returns the <code>annotation-implementation-class</code> element
    * @return the node defined for the element <code>annotation-implementation-class</code> 
    */
   public String getAnnotationImplementationClass()
   {
      return childNode.textValue("annotation-implementation-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>injection-target</code> element 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the existing <code>injection-target</code> element will be returned.
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<AnnotationType<T>> injectionTarget()
   {
      Node node = childNode.getOrCreate("injection-target");
      InjectionTargetType<AnnotationType<T>> injectionTarget = new InjectionTargetTypeImpl<AnnotationType<T>>(this,
            "injection-target", childNode, node);
      return injectionTarget;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of {@link AnnotationType<T>} 
    */
   public AnnotationType<T> removeAllProperty()
   {
      childNode.remove("property");
      return this;
   }

   /**
    * Returns the <code>property</code> element
    * @return the node defined for the element <code>property</code> 
    */
   public AnnotationPropertyType<AnnotationType<T>> property()
   {
      return new AnnotationPropertyTypeImpl<AnnotationType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<AnnotationPropertyType<AnnotationType<T>>> getPropertyList()
   {
      List<AnnotationPropertyType<AnnotationType<T>>> list = new ArrayList<AnnotationPropertyType<AnnotationType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for (Node node : nodeList)
      {
         AnnotationPropertyType<AnnotationType<T>> type = new AnnotationPropertyTypeImpl<AnnotationType<T>>(this,
               "property", childNode, node);
         list.add(type);
      }
      return list;
   }

}
