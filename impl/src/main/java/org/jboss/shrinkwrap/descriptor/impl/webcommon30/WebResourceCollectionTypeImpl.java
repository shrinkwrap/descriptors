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

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebResourceCollectionType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> web-resource-collectionType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The web-resource-collectionType is used to identify the <br> 
 * resources and HTTP methods on those resources to which a <br> 
 * security constraint applies. If no HTTP methods are specified, <br> 
 * then the security constraint applies to all HTTP methods. <br> 
 * If HTTP methods are specified by http-method-omission <br> 
 * elements, the security constraint applies to all methods <br> 
 * except those identified in the collection. <br> 
 * http-method-omission and http-method elements are never <br> 
 * mixed in the same collection. <br> 
 *<br>
 * Used in: security-constraint <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class WebResourceCollectionTypeImpl<T> implements Child<T>, WebResourceCollectionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebResourceCollectionTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public WebResourceCollectionTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : web-resource-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>web-resource-name</code> element with the given value will be created.
    * Otherwise, the existing <code>web-resource-name</code> element will be updated with the given value.
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setWebResourceName(String webResourceName)
   {
      childNode.getOrCreate("web-resource-name").text(webResourceName);
      return this;
   }

   /**
    * Removes the <code>web-resource-name</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeWebResourceName()
   {
      childNode.remove("web-resource-name");
      return this;
   }

   /**
    * Returns the <code>web-resource-name</code> element
    * @return the node defined for the element <code>web-resource-name</code> 
    */
   public String getWebResourceName()
   {
      return childNode.textValue("web-resource-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : url-pattern
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>url-pattern</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setUrlPattern(String urlPattern)
   {
      childNode.create("url-pattern").text(urlPattern);
      return this;
   }

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param list of <code>url-pattern</code> objects 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setUrlPatternList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setUrlPattern(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeAllUrlPattern()
   {
      childNode.remove("url-pattern");
      return this;
   }

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getUrlPatternList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("url-pattern");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : http-method
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>http-method</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setHttpMethod(String httpMethod)
   {
      childNode.create("http-method").text(httpMethod);
      return this;
   }

   /**
    * Creates for all String objects representing <code>http-method</code> elements, 
    * a new <code>http-method</code> element 
    * @param list of <code>http-method</code> objects 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setHttpMethodList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setHttpMethod(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>http-method</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeAllHttpMethod()
   {
      childNode.remove("http-method");
      return this;
   }

   /**
    * Returns all <code>http-method</code> elements
    * @return list of <code>http-method</code> 
    */
   public List<String> getHttpMethodList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("http-method");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : http-method-omission
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>http-method-omission</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setHttpMethodOmission(String httpMethodOmission)
   {
      childNode.create("http-method-omission").text(httpMethodOmission);
      return this;
   }

   /**
    * Creates for all String objects representing <code>http-method-omission</code> elements, 
    * a new <code>http-method-omission</code> element 
    * @param list of <code>http-method-omission</code> objects 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> setHttpMethodOmissionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setHttpMethodOmission(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>http-method-omission</code> element 
    * @return the current instance of {@link WebResourceCollectionType<T>} 
    */
   public WebResourceCollectionType<T> removeAllHttpMethodOmission()
   {
      childNode.remove("http-method-omission");
      return this;
   }

   /**
    * Returns all <code>http-method-omission</code> elements
    * @return list of <code>http-method-omission</code> 
    */
   public List<String> getHttpMethodOmissionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("http-method-omission");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
