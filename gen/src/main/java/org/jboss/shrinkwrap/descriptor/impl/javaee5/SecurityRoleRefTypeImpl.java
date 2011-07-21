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
package org.jboss.shrinkwrap.descriptor.impl.javaee5;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> security-role-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The security-role-refType contains the declaration of a <br> 
 * security role reference in a component's or a <br> 
 * Deployment Component's code. The declaration consists of an <br> 
 * optional description, the security role name used in the <br> 
 * code, and an optional link to a security role. If the <br> 
 * security role is not specified, the Deployer must choose an <br> 
 * appropriate security role. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class SecurityRoleRefTypeImpl<T> implements Child<T>, SecurityRoleRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecurityRoleRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public SecurityRoleRefTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> removeAllDescription()
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
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>role-name</code> element with the given value will be created.
    * Otherwise, the existing <code>role-name</code> element will be updated with the given value.
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> setRoleName(String roleName)
   {
      childNode.getOrCreate("role-name").text(roleName);
      return this;
   }

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> removeRoleName()
   {
      childNode.remove("role-name");
      return this;
   }

   /**
    * Returns the <code>role-name</code> element
    * @return the node defined for the element <code>role-name</code> 
    */
   public String getRoleName()
   {
      return childNode.textValue("role-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : role-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>role-link</code> element with the given value will be created.
    * Otherwise, the existing <code>role-link</code> element will be updated with the given value.
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> setRoleLink(String roleLink)
   {
      childNode.getOrCreate("role-link").text(roleLink);
      return this;
   }

   /**
    * Removes the <code>role-link</code> element 
    * @return the current instance of {@link SecurityRoleRefType<T>} 
    */
   public SecurityRoleRefType<T> removeRoleLink()
   {
      childNode.remove("role-link");
      return this;
   }

   /**
    * Returns the <code>role-link</code> element
    * @return the node defined for the element <code>role-link</code> 
    */
   public String getRoleLink()
   {
      return childNode.textValue("role-link");
   }

}
