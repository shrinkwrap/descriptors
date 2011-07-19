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
 * This interface defines the contract for the <code> depends-onType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The depends-onType is used to express initialization <br> 
 * ordering dependencies between Singleton components. <br> 
 * The depends-onType specifies the names of one or more <br> 
 * Singleton beans in the same application as the referring <br> 
 * Singleton, each of which must be initialized before <br> 
 * the referring bean. <br> 
 *<br>
 * Each dependent bean is expressed using ejb-link syntax. <br> 
 * The order in which dependent beans are initialized at <br> 
 * runtime is not guaranteed to match the order in which <br> 
 * they are listed. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface DependsOnType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>ejb-name</code> element 
    * @return the current instance of {@link DependsOnType<T>} 
    */
   public DependsOnType<T> setEjbName(String ejbName);

   /**
    * Creates for all String objects representing <code>ejb-name</code> elements, 
    * a new <code>ejb-name</code> element 
    * @param list of <code>ejb-name</code> objects 
    * @return the current instance of {@link DependsOnType<T>} 
    */
   public DependsOnType<T> setEjbNameList(String... values);

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link DependsOnType<T>} 
    */
   public DependsOnType<T> removeAllEjbName();

   /**
    * Returns all <code>ejb-name</code> elements
    * @return list of <code>ejb-name</code> 
    */
   public List<String> getEjbNameList();

}
