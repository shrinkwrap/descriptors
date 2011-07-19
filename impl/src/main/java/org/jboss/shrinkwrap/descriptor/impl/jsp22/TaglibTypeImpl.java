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
package org.jboss.shrinkwrap.descriptor.impl.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> taglibType </code> xsd type 
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
public class TaglibTypeImpl<T> implements Child<T>, TaglibType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TaglibTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public TaglibTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : taglib-uri
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib-uri</code> element with the given value will be created.
    * Otherwise, the existing <code>taglib-uri</code> element will be updated with the given value.
    * @return the current instance of {@link TaglibType<T>} 
    */
   public TaglibType<T> setTaglibUri(String taglibUri)
   {
      childNode.getOrCreate("taglib-uri").text(taglibUri);
      return this;
   }

   /**
    * Removes the <code>taglib-uri</code> element 
    * @return the current instance of {@link TaglibType<T>} 
    */
   public TaglibType<T> removeTaglibUri()
   {
      childNode.remove("taglib-uri");
      return this;
   }

   /**
    * Returns the <code>taglib-uri</code> element
    * @return the node defined for the element <code>taglib-uri</code> 
    */
   public String getTaglibUri()
   {
      return childNode.textValue("taglib-uri");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : taglib-location
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib-location</code> element with the given value will be created.
    * Otherwise, the existing <code>taglib-location</code> element will be updated with the given value.
    * @return the current instance of {@link TaglibType<T>} 
    */
   public TaglibType<T> setTaglibLocation(String taglibLocation)
   {
      childNode.getOrCreate("taglib-location").text(taglibLocation);
      return this;
   }

   /**
    * Removes the <code>taglib-location</code> element 
    * @return the current instance of {@link TaglibType<T>} 
    */
   public TaglibType<T> removeTaglibLocation()
   {
      childNode.remove("taglib-location");
      return this;
   }

   /**
    * Returns the <code>taglib-location</code> element
    * @return the node defined for the element <code>taglib-location</code> 
    */
   public String getTaglibLocation()
   {
      return childNode.textValue("taglib-location");
   }

}
