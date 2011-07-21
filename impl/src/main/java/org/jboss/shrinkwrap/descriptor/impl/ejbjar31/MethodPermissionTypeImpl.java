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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodPermissionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> method-permissionType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The method-permissionType specifies that one or more <br> 
 * security roles are allowed to invoke one or more enterprise <br> 
 * bean methods. The method-permissionType consists of an <br> 
 * optional description, a list of security role names or an <br> 
 * indicator to state that the method is unchecked for <br> 
 * authorization, and a list of method elements. <br> 
 *<br>
 * The security roles used in the method-permissionType <br> 
 * must be defined in the security-role elements of the <br> 
 * deployment descriptor, and the methods must be methods <br> 
 * defined in the enterprise bean's business, home, component <br> 
 * and/or web service endpoint interfaces. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class MethodPermissionTypeImpl<T> implements Child<T>, MethodPermissionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MethodPermissionTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MethodPermissionTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> removeAllDescription()
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
   // Element type : method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> removeAllMethod()
   {
      childNode.remove("method");
      return this;
   }

   /**
    * Returns the <code>method</code> element
    * @return the node defined for the element <code>method</code> 
    */
   public MethodType<MethodPermissionType<T>> method()
   {
      return new MethodTypeImpl<MethodPermissionType<T>>(this, "method", childNode);
   }

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<MethodPermissionType<T>>> getMethodList()
   {
      List<MethodType<MethodPermissionType<T>>> list = new ArrayList<MethodType<MethodPermissionType<T>>>();
      List<Node> nodeList = childNode.get("method");
      for (Node node : nodeList)
      {
         MethodType<MethodPermissionType<T>> type = new MethodTypeImpl<MethodPermissionType<T>>(this, "method",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : role-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>role-name</code> element 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> setRoleName(String roleName)
   {
      childNode.create("role-name").text(roleName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>role-name</code> elements, 
    * a new <code>role-name</code> element 
    * @param list of <code>role-name</code> objects 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> setRoleNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setRoleName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of {@link MethodPermissionType<T>} 
    */
   public MethodPermissionType<T> removeAllRoleName()
   {
      childNode.remove("role-name");
      return this;
   }

   /**
    * Returns all <code>role-name</code> elements
    * @return list of <code>role-name</code> 
    */
   public List<String> getRoleNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("role-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : unchecked
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodPermissionType<T> unchecked()
   {
      childNode.getOrCreate("unchecked");
      return this;
   }

   public Boolean isUnchecked()
   {
      return childNode.getSingle("unchecked") != null;
   }

}
