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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> locale-encoding-mapping-listType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The locale-encoding-mapping-list contains one or more <br> 
 * locale-encoding-mapping(s). <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class LocaleEncodingMappingListTypeImpl<T> implements Child<T>, LocaleEncodingMappingListType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public LocaleEncodingMappingListTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public LocaleEncodingMappingListTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>locale-encoding-mapping</code> elements 
    * @return the current instance of {@link LocaleEncodingMappingListType<T>} 
    */
   public LocaleEncodingMappingListType<T> removeAllLocaleEncodingMapping()
   {
      childNode.remove("locale-encoding-mapping");
      return this;
   }

   /**
    * Returns the <code>locale-encoding-mapping</code> element
    * @return the node defined for the element <code>locale-encoding-mapping</code> 
    */
   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> localeEncodingMapping()
   {
      return new LocaleEncodingMappingTypeImpl<LocaleEncodingMappingListType<T>>(this, "locale-encoding-mapping",
            childNode);
   }

   /**
    * Returns all <code>locale-encoding-mapping</code> elements
    * @return list of <code>locale-encoding-mapping</code> 
    */
   public List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> getLocaleEncodingMappingList()
   {
      List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> list = new ArrayList<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>>();
      List<Node> nodeList = childNode.get("locale-encoding-mapping");
      for (Node node : nodeList)
      {
         LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> type = new LocaleEncodingMappingTypeImpl<LocaleEncodingMappingListType<T>>(
               this, "locale-encoding-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

}
