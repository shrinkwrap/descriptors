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
package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> mime-mappingType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The mime-mappingType defines a mapping between an extension <br> 
 * and a mime type. <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class MimeMappingTypeImpl<T> implements Child<T>, MimeMappingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MimeMappingTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MimeMappingTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : extension
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>extension</code> element with the given value will be created.
    * Otherwise, the existing <code>extension</code> element will be updated with the given value.
    * @return the current instance of {@link MimeMappingType<T>} 
    */
   public MimeMappingType<T> setExtension(String extension)
   {
      childNode.getOrCreate("extension").text(extension);
      return this;
   }

   /**
    * Removes the <code>extension</code> element 
    * @return the current instance of {@link MimeMappingType<T>} 
    */
   public MimeMappingType<T> removeExtension()
   {
      childNode.remove("extension");
      return this;
   }

   /**
    * Returns the <code>extension</code> element
    * @return the node defined for the element <code>extension</code> 
    */
   public String getExtension()
   {
      return childNode.textValue("extension");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mime-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mime-type</code> element with the given value will be created.
    * Otherwise, the existing <code>mime-type</code> element will be updated with the given value.
    * @return the current instance of {@link MimeMappingType<T>} 
    */
   public MimeMappingType<T> setMimeType(String mimeType)
   {
      childNode.getOrCreate("mime-type").text(mimeType);
      return this;
   }

   /**
    * Removes the <code>mime-type</code> element 
    * @return the current instance of {@link MimeMappingType<T>} 
    */
   public MimeMappingType<T> removeMimeType()
   {
      childNode.remove("mime-type");
      return this;
   }

   /**
    * Returns the <code>mime-type</code> element
    * @return the node defined for the element <code>mime-type</code> 
    */
   public String getMimeType()
   {
      return childNode.textValue("mime-type");
   }

}
