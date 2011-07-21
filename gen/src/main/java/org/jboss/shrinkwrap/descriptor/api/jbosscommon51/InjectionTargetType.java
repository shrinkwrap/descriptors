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
package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> injection-targetType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface InjectionTargetType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target-class</code> element with the given value will be created.
    * Otherwise, the existing <code>injection-target-class</code> element will be updated with the given value.
    * @return the current instance of {@link InjectionTargetType<T>} 
    */
   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass);

   /**
    * Removes the <code>injection-target-class</code> element 
    * @return the current instance of {@link InjectionTargetType<T>} 
    */
   public InjectionTargetType<T> removeInjectionTargetClass();

   /**
    * Returns the <code>injection-target-class</code> element
    * @return the node defined for the element <code>injection-target-class</code> 
    */
   public String getInjectionTargetClass();

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target-name</code> element with the given value will be created.
    * Otherwise, the existing <code>injection-target-name</code> element will be updated with the given value.
    * @return the current instance of {@link InjectionTargetType<T>} 
    */
   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName);

   /**
    * Removes the <code>injection-target-name</code> element 
    * @return the current instance of {@link InjectionTargetType<T>} 
    */
   public InjectionTargetType<T> removeInjectionTargetName();

   /**
    * Returns the <code>injection-target-name</code> element
    * @return the node defined for the element <code>injection-target-name</code> 
    */
   public String getInjectionTargetName();

}
