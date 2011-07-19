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
package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> ejb-local-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The ejb-local-refType is used by ejb-local-ref elements for <br> 
 * the declaration of a reference to an enterprise bean's local <br> 
 * home or to the local business interface of a 3.0 bean. <br> 
 * The declaration consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - the EJB reference name used in the code of the Deployment <br> 
 * Component that's referencing the enterprise bean. <br> 
 * - the optional expected type of the referenced enterprise bean <br> 
 * - the optional expected local interface of the referenced <br> 
 * enterprise bean or the local business interface of the <br> 
 * referenced enterprise bean. <br> 
 * - the optional expected local home interface of the referenced <br> 
 * enterprise bean. Not applicable if this ejb-local-ref refers <br> 
 * to the local business interface of a 3.0 bean. <br> 
 * - optional ejb-link information, used to specify the <br> 
 * referenced enterprise bean <br> 
 * - optional elements to define injection of the named enterprise <br> 
 * bean into a component field or property. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class EjbLocalRefTypeImpl<T> implements Child<T>, EjbLocalRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbLocalRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public EjbLocalRefTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : lookup-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lookup-name</code> element with the given value will be created.
    * Otherwise, the existing <code>lookup-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setLookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeLookupName()
   {
      childNode.remove("lookup-name");
      return this;
   }

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeMappedName()
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
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<EjbLocalRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<EjbLocalRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<EjbLocalRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<EjbLocalRefType<T>>> list = new ArrayList<InjectionTargetType<EjbLocalRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<EjbLocalRefType<T>> type = new InjectionTargetTypeImpl<EjbLocalRefType<T>>(this,
               "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeAllDescription()
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
   // Element type : ejb-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setEjbRefName(String ejbRefName)
   {
      childNode.getOrCreate("ejb-ref-name").text(ejbRefName);
      return this;
   }

   /**
    * Removes the <code>ejb-ref-name</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeEjbRefName()
   {
      childNode.remove("ejb-ref-name");
      return this;
   }

   /**
    * Returns the <code>ejb-ref-name</code> element
    * @return the node defined for the element <code>ejb-ref-name</code> 
    */
   public String getEjbRefName()
   {
      return childNode.textValue("ejb-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref-type</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-ref-type</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setEjbRefType(EjbRefTypeType ejbRefType)
   {
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }

   /**
    * If not already created, a new <code>ejb-ref-type</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-ref-type</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setEjbRefType(String ejbRefType)
   {
      childNode.getOrCreate("ejb-ref-type").text(ejbRefType);
      return this;
   }

   /**
    * Returns the <code>ejb-ref-type</code> element
    * @return the node defined for the element <code>ejb-ref-type</code> 
    */
   public EjbRefTypeType getEjbRefType()
   {
      return EjbRefTypeType.getFromStringValue(childNode.textValue("ejb-ref-type"));
   }

   /**
    * Returns the <code>ejb-ref-type</code> element
    * @return the node defined for the element <code>ejb-ref-type</code> 
    */
   public String getEjbRefTypeAsString()
   {
      return childNode.textValue("ejb-ref-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local-home</code> element with the given value will be created.
    * Otherwise, the existing <code>local-home</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setLocalHome(String localHome)
   {
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeLocalHome()
   {
      childNode.remove("local-home");
      return this;
   }

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome()
   {
      return childNode.textValue("local-home");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local</code> element with the given value will be created.
    * Otherwise, the existing <code>local</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setLocal(String local)
   {
      childNode.getOrCreate("local").text(local);
      return this;
   }

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeLocal()
   {
      childNode.remove("local");
      return this;
   }

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal()
   {
      return childNode.textValue("local");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-link</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-link</code> element will be updated with the given value.
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> setEjbLink(String ejbLink)
   {
      childNode.getOrCreate("ejb-link").text(ejbLink);
      return this;
   }

   /**
    * Removes the <code>ejb-link</code> element 
    * @return the current instance of {@link EjbLocalRefType<T>} 
    */
   public EjbLocalRefType<T> removeEjbLink()
   {
      childNode.remove("ejb-link");
      return this;
   }

   /**
    * Returns the <code>ejb-link</code> element
    * @return the node defined for the element <code>ejb-link</code> 
    */
   public String getEjbLink()
   {
      return childNode.textValue("ejb-link");
   }

}
