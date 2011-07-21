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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> iconType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The icon type contains small-icon and large-icon elements <br> 
 * that specify the file names for small and large GIF, JPEG, <br> 
 * or PNG icon images used to represent the parent element in a <br> 
 * GUI tool. <br> 
 *<br>
 * The xml:lang attribute defines the language that the <br> 
 * icon file names are provided in. Its value is "en" (English) <br> 
 * by default. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface IconType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : small-icon
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>small-icon</code> element with the given value will be created.
    * Otherwise, the existing <code>small-icon</code> element will be updated with the given value.
    * @return the current instance of {@link IconType<T>} 
    */
   public IconType<T> setSmallIcon(String smallIcon);

   /**
    * Removes the <code>small-icon</code> element 
    * @return the current instance of {@link IconType<T>} 
    */
   public IconType<T> removeSmallIcon();

   /**
    * Returns the <code>small-icon</code> element
    * @return the node defined for the element <code>small-icon</code> 
    */
   public String getSmallIcon();

   // -------------------------------------------------------------------------------------||
   // Element type : large-icon
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>large-icon</code> element with the given value will be created.
    * Otherwise, the existing <code>large-icon</code> element will be updated with the given value.
    * @return the current instance of {@link IconType<T>} 
    */
   public IconType<T> setLargeIcon(String largeIcon);

   /**
    * Removes the <code>large-icon</code> element 
    * @return the current instance of {@link IconType<T>} 
    */
   public IconType<T> removeLargeIcon();

   /**
    * Returns the <code>large-icon</code> element
    * @return the node defined for the element <code>large-icon</code> 
    */
   public String getLargeIcon();

}
