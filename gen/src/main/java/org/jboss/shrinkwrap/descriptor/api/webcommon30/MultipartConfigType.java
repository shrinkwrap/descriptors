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
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> multipart-configType </code> xsd type 
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
public interface MultipartConfigType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : location
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>location</code> element with the given value will be created.
    * Otherwise, the existing <code>location</code> element will be updated with the given value.
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> setLocation(String location);

   /**
    * Removes the <code>location</code> element 
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> removeLocation();

   /**
    * Returns the <code>location</code> element
    * @return the node defined for the element <code>location</code> 
    */
   public String getLocation();

   // -------------------------------------------------------------------------------------||
   // Element type : max-file-size
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-file-size</code> element with the given value will be created.
    * Otherwise, the existing <code>max-file-size</code> element will be updated with the given value.
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> setMaxFileSize(Long maxFileSize);

   /**
    * Removes the <code>max-file-size</code> element 
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> removeMaxFileSize();

   /**
    * Returns the <code>max-file-size</code> element
    * @return the node defined for the element <code>max-file-size</code> 
    */
   public Long getMaxFileSize();

   // -------------------------------------------------------------------------------------||
   // Element type : max-request-size
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-request-size</code> element with the given value will be created.
    * Otherwise, the existing <code>max-request-size</code> element will be updated with the given value.
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize);

   /**
    * Removes the <code>max-request-size</code> element 
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> removeMaxRequestSize();

   /**
    * Returns the <code>max-request-size</code> element
    * @return the node defined for the element <code>max-request-size</code> 
    */
   public Long getMaxRequestSize();

   // -------------------------------------------------------------------------------------||
   // Element type : file-size-threshold
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>file-size-threshold</code> element with the given value will be created.
    * Otherwise, the existing <code>file-size-threshold</code> element will be updated with the given value.
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold);

   /**
    * Removes the <code>file-size-threshold</code> element 
    * @return the current instance of {@link MultipartConfigType<T>} 
    */
   public MultipartConfigType<T> removeFileSizeThreshold();

   /**
    * Returns the <code>file-size-threshold</code> element
    * @return the node defined for the element <code>file-size-threshold</code> 
    */
   public Integer getFileSizeThreshold();

}
