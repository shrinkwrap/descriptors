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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> taglibType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The taglibType defines the syntax for declaring in <br> 
 * the deployment descriptor that a tag library is <br> 
 * available to the application. This can be done <br> 
 * to override implicit map entries from TLD files and <br> 
 * from the container. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface TaglibType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : taglib-uri
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib-uri</code> element with the given value will be created.
    * Otherwise, the existing <code>taglib-uri</code> element will be updated with the given value.
    * @return the current instance of {@link TaglibType<T>} 
    */
   public TaglibType<T> setTaglibUri(String taglibUri);

   /**
    * Removes the <code>taglib-uri</code> element 
    * @return the current instance of {@link TaglibType<T>} 
    */
   public TaglibType<T> removeTaglibUri();

   /**
    * Returns the <code>taglib-uri</code> element
    * @return the node defined for the element <code>taglib-uri</code> 
    */
   public String getTaglibUri();

   // -------------------------------------------------------------------------------------||
   // Element type : taglib-location
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib-location</code> element with the given value will be created.
    * Otherwise, the existing <code>taglib-location</code> element will be updated with the given value.
    * @return the current instance of {@link TaglibType<T>} 
    */
   public TaglibType<T> setTaglibLocation(String taglibLocation);

   /**
    * Removes the <code>taglib-location</code> element 
    * @return the current instance of {@link TaglibType<T>} 
    */
   public TaglibType<T> removeTaglibLocation();

   /**
    * Returns the <code>taglib-location</code> element
    * @return the node defined for the element <code>taglib-location</code> 
    */
   public String getTaglibLocation();

}
