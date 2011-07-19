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

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspPropertyGroupType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> jsp-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The jsp-configType is used to provide global configuration <br> 
 * information for the JSP files in a web application. It has <br> 
 * two subelements, taglib and jsp-property-group. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class JspConfigTypeImpl<T> implements Child<T>, JspConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public JspConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public JspConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : taglib
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>taglib</code> elements 
    * @return the current instance of {@link JspConfigType<T>} 
    */
   public JspConfigType<T> removeAllTaglib()
   {
      childNode.remove("taglib");
      return this;
   }

   /**
    * Returns the <code>taglib</code> element
    * @return the node defined for the element <code>taglib</code> 
    */
   public TaglibType<JspConfigType<T>> taglib()
   {
      return new TaglibTypeImpl<JspConfigType<T>>(this, "taglib", childNode);
   }

   /**
    * Returns all <code>taglib</code> elements
    * @return list of <code>taglib</code> 
    */
   public List<TaglibType<JspConfigType<T>>> getTaglibList()
   {
      List<TaglibType<JspConfigType<T>>> list = new ArrayList<TaglibType<JspConfigType<T>>>();
      List<Node> nodeList = childNode.get("taglib");
      for (Node node : nodeList)
      {
         TaglibType<JspConfigType<T>> type = new TaglibTypeImpl<JspConfigType<T>>(this, "taglib", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-property-group
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jsp-property-group</code> elements 
    * @return the current instance of {@link JspConfigType<T>} 
    */
   public JspConfigType<T> removeAllJspPropertyGroup()
   {
      childNode.remove("jsp-property-group");
      return this;
   }

   /**
    * Returns the <code>jsp-property-group</code> element
    * @return the node defined for the element <code>jsp-property-group</code> 
    */
   public JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup()
   {
      return new JspPropertyGroupTypeImpl<JspConfigType<T>>(this, "jsp-property-group", childNode);
   }

   /**
    * Returns all <code>jsp-property-group</code> elements
    * @return list of <code>jsp-property-group</code> 
    */
   public List<JspPropertyGroupType<JspConfigType<T>>> getJspPropertyGroupList()
   {
      List<JspPropertyGroupType<JspConfigType<T>>> list = new ArrayList<JspPropertyGroupType<JspConfigType<T>>>();
      List<Node> nodeList = childNode.get("jsp-property-group");
      for (Node node : nodeList)
      {
         JspPropertyGroupType<JspConfigType<T>> type = new JspPropertyGroupTypeImpl<JspConfigType<T>>(this,
               "jsp-property-group", childNode, node);
         list.add(type);
      }
      return list;
   }

}
