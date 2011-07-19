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
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.WebservicesType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.WebserviceDescriptionType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.WebserviceDescriptionTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> webservicesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class WebservicesTypeImpl<T> implements Child<T>, WebservicesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebservicesTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public WebservicesTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : context-root
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-root</code> element with the given value will be created.
    * Otherwise, the existing <code>context-root</code> element will be updated with the given value.
    * @return the current instance of {@link WebservicesType<T>} 
    */
   public WebservicesType<T> setContextRoot(String contextRoot)
   {
      childNode.getOrCreate("context-root").text(contextRoot);
      return this;
   }

   /**
    * Removes the <code>context-root</code> element 
    * @return the current instance of {@link WebservicesType<T>} 
    */
   public WebservicesType<T> removeContextRoot()
   {
      childNode.remove("context-root");
      return this;
   }

   /**
    * Returns the <code>context-root</code> element
    * @return the node defined for the element <code>context-root</code> 
    */
   public String getContextRoot()
   {
      return childNode.textValue("context-root");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : webservice-description
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>webservice-description</code> elements 
    * @return the current instance of {@link WebservicesType<T>} 
    */
   public WebservicesType<T> removeAllWebserviceDescription()
   {
      childNode.remove("webservice-description");
      return this;
   }

   /**
    * Returns the <code>webservice-description</code> element
    * @return the node defined for the element <code>webservice-description</code> 
    */
   public WebserviceDescriptionType<WebservicesType<T>> webserviceDescription()
   {
      return new WebserviceDescriptionTypeImpl<WebservicesType<T>>(this, "webservice-description", childNode);
   }

   /**
    * Returns all <code>webservice-description</code> elements
    * @return list of <code>webservice-description</code> 
    */
   public List<WebserviceDescriptionType<WebservicesType<T>>> getWebserviceDescriptionList()
   {
      List<WebserviceDescriptionType<WebservicesType<T>>> list = new ArrayList<WebserviceDescriptionType<WebservicesType<T>>>();
      List<Node> nodeList = childNode.get("webservice-description");
      for (Node node : nodeList)
      {
         WebserviceDescriptionType<WebservicesType<T>> type = new WebserviceDescriptionTypeImpl<WebservicesType<T>>(
               this, "webservice-description", childNode, node);
         list.add(type);
      }
      return list;
   }

}
