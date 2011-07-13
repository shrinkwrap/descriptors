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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AuthConstraintType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> auth-constraintType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The auth-constraintType indicates the user roles that <br> 
 * should be permitted access to this resource <br> 
 * collection. The role-name used here must either correspond <br> 
 * to the role-name of one of the security-role elements <br> 
 * defined for this web application, or be the specially <br> 
 * reserved role-name "*" that is a compact syntax for <br> 
 * indicating all roles in the web application. If both "*" <br> 
 * and rolenames appear, the container interprets this as all <br> 
 * roles. If no roles are defined, no user is allowed access <br> 
 * to the portion of the web application described by the <br> 
 * containing security-constraint. The container matches <br> 
 * role names case sensitively when determining access. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class AuthConstraintTypeImpl<T> implements Child<T>, AuthConstraintType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AuthConstraintTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public AuthConstraintTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> removeAllDescription()
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
   // Element type : role-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>role-name</code> element 
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> setRoleName(String roleName)
   {
      childNode.create("role-name").text(roleName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>role-name</code> elements, 
    * a new <code>role-name</code> element 
    * @param list of <code>role-name</code> objects 
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> setRoleNameList(String... values)
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
    * @return the current instance of {@link AuthConstraintType<T>} 
    */
   public AuthConstraintType<T> removeAllRoleName()
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

}
