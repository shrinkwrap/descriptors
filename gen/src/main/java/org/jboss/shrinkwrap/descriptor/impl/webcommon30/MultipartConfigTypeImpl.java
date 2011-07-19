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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> multipart-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * This element specifies configuration information related to the <br> 
 * handling of multipart/form-data requests. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class MultipartConfigTypeImpl<T> implements Child<T>, MultipartConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MultipartConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MultipartConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : location
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>location</code> element with the given value will be created.
    * Otherwise, the existing <code>location</code> element will be updated with the given value.
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> setLocation(String location)
   {
      childNode.getOrCreate("location").text(location);
      return this;
   }

   /**
    * Removes the <code>location</code> element 
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> removeLocation()
   {
      childNode.remove("location");
      return this;
   }

   /**
    * Returns the <code>location</code> element
    * @return the node defined for the element <code>location</code> 
    */
   public String getLocation()
   {
      return childNode.textValue("location");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : max-file-size
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-file-size</code> element with the given value will be created.
    * Otherwise, the existing <code>max-file-size</code> element will be updated with the given value.
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> setMaxFileSize(Long maxFileSize)
   {
      childNode.getOrCreate("max-file-size").text(maxFileSize);
      return this;
   }

   /**
    * Removes the <code>max-file-size</code> element 
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> removeMaxFileSize()
   {
      childNode.remove("max-file-size");
      return this;
   }

   /**
    * Returns the <code>max-file-size</code> element
    * @return the node defined for the element <code>max-file-size</code> 
    */
   public Long getMaxFileSize()
   {
      if (childNode.textValue("max-file-size") != null && !childNode.textValue("max-file-size").equals("null"))
      {
         return Long.valueOf(childNode.textValue("max-file-size"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : max-request-size
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-request-size</code> element with the given value will be created.
    * Otherwise, the existing <code>max-request-size</code> element will be updated with the given value.
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize)
   {
      childNode.getOrCreate("max-request-size").text(maxRequestSize);
      return this;
   }

   /**
    * Removes the <code>max-request-size</code> element 
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> removeMaxRequestSize()
   {
      childNode.remove("max-request-size");
      return this;
   }

   /**
    * Returns the <code>max-request-size</code> element
    * @return the node defined for the element <code>max-request-size</code> 
    */
   public Long getMaxRequestSize()
   {
      if (childNode.textValue("max-request-size") != null && !childNode.textValue("max-request-size").equals("null"))
      {
         return Long.valueOf(childNode.textValue("max-request-size"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : file-size-threshold
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>file-size-threshold</code> element with the given value will be created.
    * Otherwise, the existing <code>file-size-threshold</code> element will be updated with the given value.
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold)
   {
      childNode.getOrCreate("file-size-threshold").text(fileSizeThreshold);
      return this;
   }

   /**
    * Removes the <code>file-size-threshold</code> element 
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> removeFileSizeThreshold()
   {
      childNode.remove("file-size-threshold");
      return this;
   }

   /**
    * Returns the <code>file-size-threshold</code> element
    * @return the node defined for the element <code>file-size-threshold</code> 
    */
   public Integer getFileSizeThreshold()
   {
      if (childNode.textValue("file-size-threshold") != null
            && !childNode.textValue("file-size-threshold").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("file-size-threshold"));
      }
      return null;
   }

}
