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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> producerType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The producer element holds all of the information specific about a <br> 
 * producer interface for a consumer bean Used in: consumer <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ProducerType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class</code> element with the given value will be created.
    * Otherwise, the existing <code>class</code> element will be updated with the given value.
    * @return the current instance of {@link ProducerType<T>} 
    */
   public ProducerType<T> setClazz(String clazz);

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of {@link ProducerType<T>} 
    */
   public ProducerType<T> removeClazz();

   /**
    * Returns the <code>class</code> element
    * @return the node defined for the element <code>class</code> 
    */
   public String getClazz();

   // -------------------------------------------------------------------------------------||
   // Element type : connection-factory
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element with the given value will be created.
    * Otherwise, the existing <code>connection-factory</code> element will be updated with the given value.
    * @return the current instance of {@link ProducerType<T>} 
    */
   public ProducerType<T> setConnectionFactory(String connectionFactory);

   /**
    * Removes the <code>connection-factory</code> element 
    * @return the current instance of {@link ProducerType<T>} 
    */
   public ProducerType<T> removeConnectionFactory();

   /**
    * Returns the <code>connection-factory</code> element
    * @return the node defined for the element <code>connection-factory</code> 
    */
   public String getConnectionFactory();

}
