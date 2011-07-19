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
package org.jboss.shrinkwrap.descriptor.impl.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application6.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.application6.WebType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> moduleType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The moduleType defines a single Java EE module and contains a <br> 
 * connector, ejb, java, or web element, which indicates the <br> 
 * module type and contains a path to the module file, and an <br> 
 * optional alt-dd element, which specifies an optional URI to <br> 
 * the post-assembly version of the deployment descriptor. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class ModuleTypeImpl<T> implements Child<T>, ModuleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ModuleTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ModuleTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : alt-dd
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alt-dd</code> element with the given value will be created.
    * Otherwise, the existing <code>alt-dd</code> element will be updated with the given value.
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> setAltDd(String altDd)
   {
      childNode.getOrCreate("alt-dd").text(altDd);
      return this;
   }

   /**
    * Removes the <code>alt-dd</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeAltDd()
   {
      childNode.remove("alt-dd");
      return this;
   }

   /**
    * Returns the <code>alt-dd</code> element
    * @return the node defined for the element <code>alt-dd</code> 
    */
   public String getAltDd()
   {
      return childNode.textValue("alt-dd");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : connector
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connector</code> element with the given value will be created.
    * Otherwise, the existing <code>connector</code> element will be updated with the given value.
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> setConnector(String connector)
   {
      childNode.getOrCreate("connector").text(connector);
      return this;
   }

   /**
    * Removes the <code>connector</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeConnector()
   {
      childNode.remove("connector");
      return this;
   }

   /**
    * Returns the <code>connector</code> element
    * @return the node defined for the element <code>connector</code> 
    */
   public String getConnector()
   {
      return childNode.textValue("connector");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb</code> element will be updated with the given value.
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> setEjb(String ejb)
   {
      childNode.getOrCreate("ejb").text(ejb);
      return this;
   }

   /**
    * Removes the <code>ejb</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeEjb()
   {
      childNode.remove("ejb");
      return this;
   }

   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public String getEjb()
   {
      return childNode.textValue("ejb");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : java
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>java</code> element with the given value will be created.
    * Otherwise, the existing <code>java</code> element will be updated with the given value.
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> setJava(String java)
   {
      childNode.getOrCreate("java").text(java);
      return this;
   }

   /**
    * Removes the <code>java</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeJava()
   {
      childNode.remove("java");
      return this;
   }

   /**
    * Returns the <code>java</code> element
    * @return the node defined for the element <code>java</code> 
    */
   public String getJava()
   {
      return childNode.textValue("java");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : web
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>web</code> element 
    * @return the current instance of {@link ModuleType<T>} 
    */
   public ModuleType<T> removeWeb()
   {
      childNode.remove("web");
      return this;
   }

   /**
    * If not already created, a new <code>web</code> element will be created and returned.
    * Otherwise, the existing <code>web</code> element will be returned.
    * @return the node defined for the element <code>web</code> 
    */
   public WebType<ModuleType<T>> web()
   {
      Node node = childNode.getOrCreate("web");
      WebType<ModuleType<T>> web = new WebTypeImpl<ModuleType<T>>(this, "web", childNode, node);
      return web;
   }

}
