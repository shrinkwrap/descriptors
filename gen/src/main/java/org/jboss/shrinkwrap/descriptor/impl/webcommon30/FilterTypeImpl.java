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
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> filterType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The filterType is used to declare a filter in the web <br> 
 * application. The filter is mapped to either a servlet or a <br> 
 * URL pattern in the filter-mapping element, using the <br> 
 * filter-name value to reference. Filters can access the <br> 
 * initialization parameters declared in the deployment <br> 
 * descriptor at runtime via the FilterConfig interface. <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class FilterTypeImpl<T> implements Child<T>, FilterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FilterTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public FilterTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAllDescription()
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
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setDisplayNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDisplayName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<FilterType<T>> icon()
   {
      return new IconTypeImpl<FilterType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FilterType<T>>> getIconList()
   {
      List<IconType<FilterType<T>>> list = new ArrayList<IconType<FilterType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<FilterType<T>> type = new IconTypeImpl<FilterType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-name</code> element with the given value will be created.
    * Otherwise, the existing <code>filter-name</code> element will be updated with the given value.
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setFilterName(String filterName)
   {
      childNode.getOrCreate("filter-name").text(filterName);
      return this;
   }

   /**
    * Removes the <code>filter-name</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeFilterName()
   {
      childNode.remove("filter-name");
      return this;
   }

   /**
    * Returns the <code>filter-name</code> element
    * @return the node defined for the element <code>filter-name</code> 
    */
   public String getFilterName()
   {
      return childNode.textValue("filter-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : filter-class
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-class</code> element with the given value will be created.
    * Otherwise, the existing <code>filter-class</code> element will be updated with the given value.
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setFilterClass(String filterClass)
   {
      childNode.getOrCreate("filter-class").text(filterClass);
      return this;
   }

   /**
    * Removes the <code>filter-class</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeFilterClass()
   {
      childNode.remove("filter-class");
      return this;
   }

   /**
    * Returns the <code>filter-class</code> element
    * @return the node defined for the element <code>filter-class</code> 
    */
   public String getFilterClass()
   {
      return childNode.textValue("filter-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : async-supported
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>async-supported</code> element with the given value will be created.
    * Otherwise, the existing <code>async-supported</code> element will be updated with the given value.
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> setAsyncSupported(Boolean asyncSupported)
   {
      childNode.getOrCreate("async-supported").text(asyncSupported);
      return this;
   }

   /**
    * Removes the <code>async-supported</code> element 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAsyncSupported()
   {
      childNode.remove("async-supported");
      return this;
   }

   /**
    * Returns the <code>async-supported</code> element
    * @return the node defined for the element <code>async-supported</code> 
    */
   public Boolean isAsyncSupported()
   {
      return Strings.isTrue(childNode.textValue("async-supported"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : init-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of {@link FilterType<T>} 
    */
   public FilterType<T> removeAllInitParam()
   {
      childNode.remove("init-param");
      return this;
   }

   /**
    * Returns the <code>init-param</code> element
    * @return the node defined for the element <code>init-param</code> 
    */
   public ParamValueType<FilterType<T>> initParam()
   {
      return new ParamValueTypeImpl<FilterType<T>>(this, "init-param", childNode);
   }

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<FilterType<T>>> getInitParamList()
   {
      List<ParamValueType<FilterType<T>>> list = new ArrayList<ParamValueType<FilterType<T>>>();
      List<Node> nodeList = childNode.get("init-param");
      for (Node node : nodeList)
      {
         ParamValueType<FilterType<T>> type = new ParamValueTypeImpl<FilterType<T>>(this, "init-param", childNode, node);
         list.add(type);
      }
      return list;
   }

}
