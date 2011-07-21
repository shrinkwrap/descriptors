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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> error-pageType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The error-pageType contains a mapping between an error code <br> 
 * or exception type to the path of a resource in the web <br> 
 * application. <br> 
 *<br>
 * Error-page declarations using the exception-type element in <br> 
 * the deployment descriptor must be unique up to the class name of <br> 
 * the exception-type. Similarly, error-page declarations using the <br> 
 * status-code element must be unique in the deployment descriptor <br> 
 * up to the status code. <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class ErrorPageTypeImpl<T> implements Child<T>, ErrorPageType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ErrorPageTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ErrorPageTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>location</code> element with the given value will be created.
    * Otherwise, the existing <code>location</code> element will be updated with the given value.
    * @return the current instance of {@link ErrorPageType<T>} 
    */
   public ErrorPageType<T> setLocation(String location)
   {
      childNode.getOrCreate("location").text(location);
      return this;
   }

   /**
    * Removes the <code>location</code> element 
    * @return the current instance of {@link ErrorPageType<T>} 
    */
   public ErrorPageType<T> removeLocation()
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
   // Element type : error-code
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-code</code> element with the given value will be created.
    * Otherwise, the existing <code>error-code</code> element will be updated with the given value.
    * @return the current instance of {@link ErrorPageType<T>} 
    */
   public ErrorPageType<T> setErrorCode(Integer errorCode)
   {
      childNode.getOrCreate("error-code").text(errorCode);
      return this;
   }

   /**
    * Removes the <code>error-code</code> element 
    * @return the current instance of {@link ErrorPageType<T>} 
    */
   public ErrorPageType<T> removeErrorCode()
   {
      childNode.remove("error-code");
      return this;
   }

   /**
    * Returns the <code>error-code</code> element
    * @return the node defined for the element <code>error-code</code> 
    */
   public Integer getErrorCode()
   {
      if (childNode.textValue("error-code") != null && !childNode.textValue("error-code").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("error-code"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : exception-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exception-type</code> element with the given value will be created.
    * Otherwise, the existing <code>exception-type</code> element will be updated with the given value.
    * @return the current instance of {@link ErrorPageType<T>} 
    */
   public ErrorPageType<T> setExceptionType(String exceptionType)
   {
      childNode.getOrCreate("exception-type").text(exceptionType);
      return this;
   }

   /**
    * Removes the <code>exception-type</code> element 
    * @return the current instance of {@link ErrorPageType<T>} 
    */
   public ErrorPageType<T> removeExceptionType()
   {
      childNode.remove("exception-type");
      return this;
   }

   /**
    * Returns the <code>exception-type</code> element
    * @return the node defined for the element <code>exception-type</code> 
    */
   public String getExceptionType()
   {
      return childNode.textValue("exception-type");
   }

}
