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
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagerType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> resource-managerType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The resource-manager element is used to provide a mapping between the "xml <br> 
 * name" of a resource (res-name) and its "runtime jndi name" (res-jndi-name or res-url <br> 
 * according to the type of the resource). If it is not provided, and if the type of the <br> 
 * resource is javax.sql.DataSource, jboss will look for a javax.sql.DataSource in the jndi <br> 
 * tree. See resource-managers. Used in: resource-managers <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class ResourceManagerTypeImpl<T> implements Child<T>, ResourceManagerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceManagerTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ResourceManagerTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> removeAllDescription()
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
   // Element type : res-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-name</code> element with the given value will be created.
    * Otherwise, the existing <code>res-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> setResName(String resName)
   {
      childNode.getOrCreate("res-name").text(resName);
      return this;
   }

   /**
    * Removes the <code>res-name</code> element 
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> removeResName()
   {
      childNode.remove("res-name");
      return this;
   }

   /**
    * Returns the <code>res-name</code> element
    * @return the node defined for the element <code>res-name</code> 
    */
   public String getResName()
   {
      return childNode.textValue("res-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : res-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>res-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> setResJndiName(String resJndiName)
   {
      childNode.getOrCreate("res-jndi-name").text(resJndiName);
      return this;
   }

   /**
    * Removes the <code>res-jndi-name</code> element 
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> removeResJndiName()
   {
      childNode.remove("res-jndi-name");
      return this;
   }

   /**
    * Returns the <code>res-jndi-name</code> element
    * @return the node defined for the element <code>res-jndi-name</code> 
    */
   public String getResJndiName()
   {
      return childNode.textValue("res-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : res-url
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-url</code> element with the given value will be created.
    * Otherwise, the existing <code>res-url</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> setResUrl(String resUrl)
   {
      childNode.getOrCreate("res-url").text(resUrl);
      return this;
   }

   /**
    * Removes the <code>res-url</code> element 
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> removeResUrl()
   {
      childNode.remove("res-url");
      return this;
   }

   /**
    * Returns the <code>res-url</code> element
    * @return the node defined for the element <code>res-url</code> 
    */
   public String getResUrl()
   {
      return childNode.textValue("res-url");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : res-class
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>res-class</code> attribute
    * @param resClass the value for the attribute <code>res-class</code> 
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> setResClass(String resClass)
   {
      childNode.attribute("res-class", resClass);
      return this;
   }

   /**
    * Removes the <code>res-class</code> attribute 
    * @return the current instance of {@link ResourceManagerType<T>} 
    */
   public ResourceManagerType<T> removeResClass()
   {
      childNode.attributes().remove("res-class");
      return this;
   }

   /**
    * Returns the <code>res-class</code> element
    * @return the node defined for the element <code>res-class</code> 
    */
   public String getResClass()
   {
      return childNode.attributes().get("res-class");
   }

}
