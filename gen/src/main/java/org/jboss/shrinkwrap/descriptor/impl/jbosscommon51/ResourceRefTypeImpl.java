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
package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResAuthType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResSharingScopeType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> resource-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The resource-ref element gives a mapping between the "code name" of a <br> 
 * resource (res-ref-name, provided by the Bean Developer) and its "xml name" (resource-name, <br> 
 * provided by the Application Assembler). If no resource-ref is provided, jboss will assume <br> 
 * that "xml-name" = "code name" See resource-managers. <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class ResourceRefTypeImpl<T> implements Child<T>, ResourceRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ResourceRefTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeAllDescription()
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
   // Element type : res-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>res-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResRefName(String resRefName)
   {
      childNode.getOrCreate("res-ref-name").text(resRefName);
      return this;
   }

   /**
    * Removes the <code>res-ref-name</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeResRefName()
   {
      childNode.remove("res-ref-name");
      return this;
   }

   /**
    * Returns the <code>res-ref-name</code> element
    * @return the node defined for the element <code>res-ref-name</code> 
    */
   public String getResRefName()
   {
      return childNode.textValue("res-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : res-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-type</code> element with the given value will be created.
    * Otherwise, the existing <code>res-type</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResType(String resType)
   {
      childNode.getOrCreate("res-type").text(resType);
      return this;
   }

   /**
    * Removes the <code>res-type</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeResType()
   {
      childNode.remove("res-type");
      return this;
   }

   /**
    * Returns the <code>res-type</code> element
    * @return the node defined for the element <code>res-type</code> 
    */
   public String getResType()
   {
      return childNode.textValue("res-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : res-auth
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-auth</code> element with the given value will be created.
    * Otherwise, the existing <code>res-auth</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResAuth(ResAuthType resAuth)
   {
      childNode.getOrCreate("res-auth").text(resAuth);
      return this;
   }

   /**
    * If not already created, a new <code>res-auth</code> element with the given value will be created.
    * Otherwise, the existing <code>res-auth</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResAuth(String resAuth)
   {
      childNode.getOrCreate("res-auth").text(resAuth);
      return this;
   }

   /**
    * Returns the <code>res-auth</code> element
    * @return the node defined for the element <code>res-auth</code> 
    */
   public ResAuthType getResAuth()
   {
      return ResAuthType.getFromStringValue(childNode.textValue("res-auth"));
   }

   /**
    * Returns the <code>res-auth</code> element
    * @return the node defined for the element <code>res-auth</code> 
    */
   public String getResAuthAsString()
   {
      return childNode.textValue("res-auth");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : res-sharing-scope
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-sharing-scope</code> element with the given value will be created.
    * Otherwise, the existing <code>res-sharing-scope</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResSharingScope(ResSharingScopeType resSharingScope)
   {
      childNode.getOrCreate("res-sharing-scope").text(resSharingScope);
      return this;
   }

   /**
    * If not already created, a new <code>res-sharing-scope</code> element with the given value will be created.
    * Otherwise, the existing <code>res-sharing-scope</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResSharingScope(String resSharingScope)
   {
      childNode.getOrCreate("res-sharing-scope").text(resSharingScope);
      return this;
   }

   /**
    * Returns the <code>res-sharing-scope</code> element
    * @return the node defined for the element <code>res-sharing-scope</code> 
    */
   public ResSharingScopeType getResSharingScope()
   {
      return ResSharingScopeType.getFromStringValue(childNode.textValue("res-sharing-scope"));
   }

   /**
    * Returns the <code>res-sharing-scope</code> element
    * @return the node defined for the element <code>res-sharing-scope</code> 
    */
   public String getResSharingScopeAsString()
   {
      return childNode.textValue("res-sharing-scope");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<ResourceRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<ResourceRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<ResourceRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<ResourceRefType<T>>> list = new ArrayList<InjectionTargetType<ResourceRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<ResourceRefType<T>> type = new InjectionTargetTypeImpl<ResourceRefType<T>>(this,
               "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ResourceRefType<T> ignoreDependency()
   {
      childNode.getOrCreate("ignore-dependency");
      return this;
   }

   public Boolean isIgnoreDependency()
   {
      return childNode.getSingle("ignore-dependency") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-name</code> element with the given value will be created.
    * Otherwise, the existing <code>resource-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResourceName(String resourceName)
   {
      childNode.getOrCreate("resource-name").text(resourceName);
      return this;
   }

   /**
    * Removes the <code>resource-name</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeResourceName()
   {
      childNode.remove("resource-name");
      return this;
   }

   /**
    * Returns the <code>resource-name</code> element
    * @return the node defined for the element <code>resource-name</code> 
    */
   public String getResourceName()
   {
      return childNode.textValue("resource-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setJndiName(String jndiName)
   {
      childNode.getOrCreate("jndi-name").text(jndiName);
      return this;
   }

   /**
    * Removes the <code>jndi-name</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeJndiName()
   {
      childNode.remove("jndi-name");
      return this;
   }

   /**
    * Returns the <code>jndi-name</code> element
    * @return the node defined for the element <code>jndi-name</code> 
    */
   public String getJndiName()
   {
      return childNode.textValue("jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : res-url
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>res-url</code> element with the given value will be created.
    * Otherwise, the existing <code>res-url</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> setResUrl(String resUrl)
   {
      childNode.getOrCreate("res-url").text(resUrl);
      return this;
   }

   /**
    * Removes the <code>res-url</code> element 
    * @return the current instance of {@link ResourceRefType<T>} 
    */
   public ResourceRefType<T> removeResUrl()
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

}
