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
package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> method-paramsType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The method-paramsType defines a list of the <br> 
 * fully-qualified Java type names of the method parameters. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface MethodParamsType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : method-param
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>method-param</code> element 
    * @return the current instance of {@link MethodParamsType<T>} 
    */
   public MethodParamsType<T> setMethodParam(String methodParam);

   /**
    * Creates for all String objects representing <code>method-param</code> elements, 
    * a new <code>method-param</code> element 
    * @param list of <code>method-param</code> objects 
    * @return the current instance of {@link MethodParamsType<T>} 
    */
   public MethodParamsType<T> setMethodParamList(String... values);

   /**
    * Removes the <code>method-param</code> element 
    * @return the current instance of {@link MethodParamsType<T>} 
    */
   public MethodParamsType<T> removeAllMethodParam();

   /**
    * Returns all <code>method-param</code> elements
    * @return list of <code>method-param</code> 
    */
   public List<String> getMethodParamList();

}
