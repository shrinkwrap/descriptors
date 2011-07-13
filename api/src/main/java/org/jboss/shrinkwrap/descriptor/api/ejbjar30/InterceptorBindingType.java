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
package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> interceptor-bindingType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The interceptor-bindingType element describes the binding of <br> 
 * interceptor classes to beans within the ejb-jar. <br> 
 * It consists of : <br> 
 *<br>
 * - An optional description. <br> 
 * - The name of an ejb within the ejb-jar or the wildcard value "*", <br> 
 * which is used to define interceptors that are bound to all <br> 
 * beans in the ejb-jar. <br> 
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
 * "*" are default interceptors for the components in the ejb-jar. <br> 
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
 *<br>
 *<br>
 * Specifying the ejb-name as the wildcard value "*" designates <br> 
 * default interceptors (interceptors that apply to all session and <br> 
 * message-driven beans contained in the ejb-jar). <br> 
 *<br>
 * 2. <br> 
 *<br>
 *<br>
 * This style is used to refer to interceptors associated with the <br> 
 * specified enterprise bean(class-level interceptors). <br> 
 *<br>
 * 3. <br> 
 *<br>
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
 *<br>
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
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface InterceptorBindingType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setEjbName(String ejbName);

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeEjbName();

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName();

   // -------------------------------------------------------------------------------------||
   // Element type : exclude-default-interceptors
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude-default-interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude-default-interceptors</code> element will be updated with the given value.
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setExcludeDefaultInterceptors(Boolean excludeDefaultInterceptors);

   /**
    * Removes the <code>exclude-default-interceptors</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeExcludeDefaultInterceptors();

   /**
    * Returns the <code>exclude-default-interceptors</code> element
    * @return the node defined for the element <code>exclude-default-interceptors</code> 
    */
   public Boolean isExcludeDefaultInterceptors();

   // -------------------------------------------------------------------------------------||
   // Element type : exclude-class-interceptors
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude-class-interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude-class-interceptors</code> element will be updated with the given value.
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setExcludeClassInterceptors(Boolean excludeClassInterceptors);

   /**
    * Removes the <code>exclude-class-interceptors</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeExcludeClassInterceptors();

   /**
    * Returns the <code>exclude-class-interceptors</code> element
    * @return the node defined for the element <code>exclude-class-interceptors</code> 
    */
   public Boolean isExcludeClassInterceptors();

   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeMethod();

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the existing <code>method</code> element will be returned.
    * @return the node defined for the element <code>method</code> 
    */
   public NamedMethodType<InterceptorBindingType<T>> method();

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-class
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setInterceptorClass(String interceptorClass);

   /**
    * Creates for all String objects representing <code>interceptor-class</code> elements, 
    * a new <code>interceptor-class</code> element 
    * @param list of <code>interceptor-class</code> objects 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> setInterceptorClassList(String... values);

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeAllInterceptorClass();

   /**
    * Returns all <code>interceptor-class</code> elements
    * @return list of <code>interceptor-class</code> 
    */
   public List<String> getInterceptorClassList();

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-order
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>interceptor-order</code> element 
    * @return the current instance of {@link InterceptorBindingType<T>} 
    */
   public InterceptorBindingType<T> removeInterceptorOrder();

   /**
    * If not already created, a new <code>interceptor-order</code> element will be created and returned.
    * Otherwise, the existing <code>interceptor-order</code> element will be returned.
    * @return the node defined for the element <code>interceptor-order</code> 
    */
   public InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder();

}
