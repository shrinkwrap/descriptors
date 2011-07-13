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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> cookie-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The cookie-configType defines the configuration for the <br> 
 * session tracking cookies of this web application. <br> 
 *<br>
 * Used in: session-config <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class CookieConfigTypeImpl<T> implements Child<T>, CookieConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public CookieConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public CookieConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>name</code> element with the given value will be created.
    * Otherwise, the existing <code>name</code> element will be updated with the given value.
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> setName(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> removeName()
   {
      childNode.remove("name");
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.textValue("name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>domain</code> element with the given value will be created.
    * Otherwise, the existing <code>domain</code> element will be updated with the given value.
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> setDomain(String domain)
   {
      childNode.getOrCreate("domain").text(domain);
      return this;
   }

   /**
    * Removes the <code>domain</code> element 
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> removeDomain()
   {
      childNode.remove("domain");
      return this;
   }

   /**
    * Returns the <code>domain</code> element
    * @return the node defined for the element <code>domain</code> 
    */
   public String getDomain()
   {
      return childNode.textValue("domain");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : path
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>path</code> element with the given value will be created.
    * Otherwise, the existing <code>path</code> element will be updated with the given value.
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> setPath(String path)
   {
      childNode.getOrCreate("path").text(path);
      return this;
   }

   /**
    * Removes the <code>path</code> element 
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> removePath()
   {
      childNode.remove("path");
      return this;
   }

   /**
    * Returns the <code>path</code> element
    * @return the node defined for the element <code>path</code> 
    */
   public String getPath()
   {
      return childNode.textValue("path");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : comment
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>comment</code> element with the given value will be created.
    * Otherwise, the existing <code>comment</code> element will be updated with the given value.
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> setComment(String comment)
   {
      childNode.getOrCreate("comment").text(comment);
      return this;
   }

   /**
    * Removes the <code>comment</code> element 
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> removeComment()
   {
      childNode.remove("comment");
      return this;
   }

   /**
    * Returns the <code>comment</code> element
    * @return the node defined for the element <code>comment</code> 
    */
   public String getComment()
   {
      return childNode.textValue("comment");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : http-only
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>http-only</code> element with the given value will be created.
    * Otherwise, the existing <code>http-only</code> element will be updated with the given value.
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> setHttpOnly(Boolean httpOnly)
   {
      childNode.getOrCreate("http-only").text(httpOnly);
      return this;
   }

   /**
    * Removes the <code>http-only</code> element 
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> removeHttpOnly()
   {
      childNode.remove("http-only");
      return this;
   }

   /**
    * Returns the <code>http-only</code> element
    * @return the node defined for the element <code>http-only</code> 
    */
   public Boolean isHttpOnly()
   {
      return Strings.isTrue(childNode.textValue("http-only"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : secure
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>secure</code> element with the given value will be created.
    * Otherwise, the existing <code>secure</code> element will be updated with the given value.
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> setSecure(Boolean secure)
   {
      childNode.getOrCreate("secure").text(secure);
      return this;
   }

   /**
    * Removes the <code>secure</code> element 
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> removeSecure()
   {
      childNode.remove("secure");
      return this;
   }

   /**
    * Returns the <code>secure</code> element
    * @return the node defined for the element <code>secure</code> 
    */
   public Boolean isSecure()
   {
      return Strings.isTrue(childNode.textValue("secure"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : max-age
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-age</code> element with the given value will be created.
    * Otherwise, the existing <code>max-age</code> element will be updated with the given value.
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> setMaxAge(Integer maxAge)
   {
      childNode.getOrCreate("max-age").text(maxAge);
      return this;
   }

   /**
    * Removes the <code>max-age</code> element 
    * @return the current instance of {@link CookieConfigType<T>} 
    */
   public CookieConfigType<T> removeMaxAge()
   {
      childNode.remove("max-age");
      return this;
   }

   /**
    * Returns the <code>max-age</code> element
    * @return the node defined for the element <code>max-age</code> 
    */
   public Integer getMaxAge()
   {
      if (childNode.textValue("max-age") != null && !childNode.textValue("max-age").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("max-age"));
      }
      return null;
   }

}
