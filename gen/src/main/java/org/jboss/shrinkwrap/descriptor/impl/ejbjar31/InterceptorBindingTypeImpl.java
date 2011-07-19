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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorBindingType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorOrderType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> interceptor-bindingType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 * [ <br> 
 * The interceptor-bindingType element describes the binding of <br> 
 * interceptor classes to beans within the ejb-jar or .war. <br> 
 * It consists of : <br> 
 *<br>
 * - An optional description. <br> 
 * - The name of an ejb within the module or the wildcard value "*", <br> 
 * which is used to define interceptors that are bound to all <br> 
 * beans in the ejb-jar or .war. <br> 
 * - A list of interceptor classes that are bound to the contents of <br> 
 * the ejb-name element or a specification of the total ordering <br> 
 * over the interceptors defined for the given level and above. <br> 
 * - An optional exclude-default-interceptors element. If set to true, <br> 
 * specifies that default interceptors are not to be applied to <br> 
 * a bean-class and/or business method. <br> 
 * - An optional exclude-class-interceptors element. If set to true, <br> 
 * specifies that class interceptors are not to be applied to <br> 
 * a business method. <br> 
 * - An optional set of method elements for describing the name/params <br> 
 * of a method-level interceptor. <br> 
 *<br>
 * Interceptors bound to all classes using the wildcard syntax <br> 
 * "*" are default interceptors for the components in the ejb-jar or .war. <br> 
 * In addition, interceptors may be bound at the level of the bean <br> 
 * class (class-level interceptors) or business methods (method-level <br> 
 * interceptors ). <br> 
 *<br>
 * The binding of interceptors to classes is additive. If interceptors <br> 
 * are bound at the class-level and/or default-level as well as the <br> 
 * method-level, both class-level and/or default-level as well as <br> 
 * method-level will apply. <br> 
 *<br>
 * There are four possible styles of the interceptor element syntax : <br> 
 *<br>
 * 1. <br> 
 * <interceptor-binding> <br> 
 * <ejb-name>*</ejb-name> <br> 
 * <interceptor-class>INTERCEPTOR</interceptor-class> <br> 
 * </interceptor-binding> <br> 
 *<br>
 * Specifying the ejb-name as the wildcard value "*" designates <br> 
 * default interceptors (interceptors that apply to all session and <br> 
 * message-driven beans contained in the ejb-jar or .war). <br> 
 *<br>
 * 2. <br> 
 * <interceptor-binding> <br> 
 * <ejb-name>EJBNAME</ejb-name> <br> 
 * <interceptor-class>INTERCEPTOR</interceptor-class> <br> 
 * </interceptor-binding> <br> 
 *<br>
 * This style is used to refer to interceptors associated with the <br> 
 * specified enterprise bean(class-level interceptors). <br> 
 *<br>
 * 3. <br> 
 * <interceptor-binding> <br> 
 * <ejb-name>EJBNAME</ejb-name> <br> 
 * <interceptor-class>INTERCEPTOR</interceptor-class> <br> 
 * <method> <br> 
 * <method-name>METHOD</method-name> <br> 
 * </method> <br> 
 * </interceptor-binding> <br> 
 *<br>
 * This style is used to associate a method-level interceptor with <br> 
 * the specified enterprise bean. If there are multiple methods <br> 
 * with the same overloaded name, the element of this style refers <br> 
 * to all the methods with the overloaded name. Method-level <br> 
 * interceptors can only be associated with business methods of the <br> 
 * bean class. Note that the wildcard value "*" cannot be used <br> 
 * to specify method-level interceptors. <br> 
 *<br>
 * 4. <br> 
 * <interceptor-binding> <br> 
 * <ejb-name>EJBNAME</ejb-name> <br> 
 * <interceptor-class>INTERCEPTOR</interceptor-class> <br> 
 * <method> <br> 
 * <method-name>METHOD</method-name> <br> 
 * <method-params> <br> 
 * <method-param>PARAM-1</method-param> <br> 
 * <method-param>PARAM-2</method-param> <br> 
 * ... <br> 
 * <method-param>PARAM-N</method-param> <br> 
 * </method-params> <br> 
 * </method> <br> 
 * </interceptor-binding> <br> 
 *<br>
 * This style is used to associate a method-level interceptor with <br> 
 * the specified method of the specified enterprise bean. This <br> 
 * style is used to refer to a single method within a set of methods <br> 
 * with an overloaded name. The values PARAM-1 through PARAM-N <br> 
 * are the fully-qualified Java types of the method's input parameters <br> 
 * (if the method has no input arguments, the method-params element <br> 
 * contains no method-param elements). Arrays are specified by the <br> 
 * array element's type, followed by one or more pair of square <br> 
 * brackets (e.g. int[][]). <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class InterceptorBindingTypeImpl<T> implements Child<T>, InterceptorBindingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InterceptorBindingTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public InterceptorBindingTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeAllDescription()
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
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName()
   {
      return childNode.textValue("ejb-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : exclude-default-interceptors
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude-default-interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude-default-interceptors</code> element will be updated with the given value.
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setExcludeDefaultInterceptors(Boolean excludeDefaultInterceptors)
   {
      childNode.getOrCreate("exclude-default-interceptors").text(excludeDefaultInterceptors);
      return this;
   }

   /**
    * Removes the <code>exclude-default-interceptors</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeExcludeDefaultInterceptors()
   {
      childNode.remove("exclude-default-interceptors");
      return this;
   }

   /**
    * Returns the <code>exclude-default-interceptors</code> element
    * @return the node defined for the element <code>exclude-default-interceptors</code> 
    */
   public Boolean isExcludeDefaultInterceptors()
   {
      return Strings.isTrue(childNode.textValue("exclude-default-interceptors"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : exclude-class-interceptors
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude-class-interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude-class-interceptors</code> element will be updated with the given value.
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setExcludeClassInterceptors(Boolean excludeClassInterceptors)
   {
      childNode.getOrCreate("exclude-class-interceptors").text(excludeClassInterceptors);
      return this;
   }

   /**
    * Removes the <code>exclude-class-interceptors</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeExcludeClassInterceptors()
   {
      childNode.remove("exclude-class-interceptors");
      return this;
   }

   /**
    * Returns the <code>exclude-class-interceptors</code> element
    * @return the node defined for the element <code>exclude-class-interceptors</code> 
    */
   public Boolean isExcludeClassInterceptors()
   {
      return Strings.isTrue(childNode.textValue("exclude-class-interceptors"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeMethod()
   {
      childNode.remove("method");
      return this;
   }

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the existing <code>method</code> element will be returned.
    * @return the node defined for the element <code>method</code> 
    */
   public NamedMethodType<InterceptorBindingType<T>> method()
   {
      Node node = childNode.getOrCreate("method");
      NamedMethodType<InterceptorBindingType<T>> method = new NamedMethodTypeImpl<InterceptorBindingType<T>>(this,
            "method", childNode, node);
      return method;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-class
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setInterceptorClass(String interceptorClass)
   {
      childNode.create("interceptor-class").text(interceptorClass);
      return this;
   }

   /**
    * Creates for all String objects representing <code>interceptor-class</code> elements, 
    * a new <code>interceptor-class</code> element 
    * @param list of <code>interceptor-class</code> objects 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setInterceptorClassList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setInterceptorClass(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeAllInterceptorClass()
   {
      childNode.remove("interceptor-class");
      return this;
   }

   /**
    * Returns all <code>interceptor-class</code> elements
    * @return list of <code>interceptor-class</code> 
    */
   public List<String> getInterceptorClassList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("interceptor-class");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-order
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>interceptor-order</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeInterceptorOrder()
   {
      childNode.remove("interceptor-order");
      return this;
   }

   /**
    * If not already created, a new <code>interceptor-order</code> element will be created and returned.
    * Otherwise, the existing <code>interceptor-order</code> element will be returned.
    * @return the node defined for the element <code>interceptor-order</code> 
    */
   public InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder()
   {
      Node node = childNode.getOrCreate("interceptor-order");
      InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder = new InterceptorOrderTypeImpl<InterceptorBindingType<T>>(
            this, "interceptor-order", childNode, node);
      return interceptorOrder;
   }

}
