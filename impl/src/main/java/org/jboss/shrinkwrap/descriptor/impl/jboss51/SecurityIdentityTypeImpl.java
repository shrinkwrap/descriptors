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
import org.jboss.shrinkwrap.descriptor.api.jboss51.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> security-identityType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The security-identity element specifies whether a specific run-as identity <br> 
 * is to be used. If there is a run-as role defined for an enterprise bean, there can also be a <br> 
 * run-as-principal define here. If you don't define a run-as principal the callee will see <br> 
 * ctx.getCallerPrincipal() == 'anonymous' Used in: entity, message-driven, session <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class SecurityIdentityTypeImpl<T> implements Child<T>, SecurityIdentityType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecurityIdentityTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public SecurityIdentityTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link SecurityIdentityType<T>} 
    */
   public SecurityIdentityType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link SecurityIdentityType<T>} 
    */
   public SecurityIdentityType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link SecurityIdentityType<T>} 
    */
   public SecurityIdentityType<T> removeAllDescription()
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
   // Element type : run-as-principal
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>run-as-principal</code> element with the given value will be created.
    * Otherwise, the existing <code>run-as-principal</code> element will be updated with the given value.
    * @return the current instance of {@link SecurityIdentityType<T>} 
    */
   public SecurityIdentityType<T> setRunAsPrincipal(String runAsPrincipal)
   {
      childNode.getOrCreate("run-as-principal").text(runAsPrincipal);
      return this;
   }

   /**
    * Removes the <code>run-as-principal</code> element 
    * @return the current instance of {@link SecurityIdentityType<T>} 
    */
   public SecurityIdentityType<T> removeRunAsPrincipal()
   {
      childNode.remove("run-as-principal");
      return this;
   }

   /**
    * Returns the <code>run-as-principal</code> element
    * @return the node defined for the element <code>run-as-principal</code> 
    */
   public String getRunAsPrincipal()
   {
      return childNode.textValue("run-as-principal");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : use-caller-identity
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SecurityIdentityType<T> useCallerIdentity()
   {
      childNode.getOrCreate("use-caller-identity");
      return this;
   }

   public Boolean isUseCallerIdentity()
   {
      return childNode.getSingle("use-caller-identity") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : run-as
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>run-as</code> element 
    * @return the current instance of {@link SecurityIdentityType<T>} 
    */
   public SecurityIdentityType<T> removeRunAs()
   {
      childNode.remove("run-as");
      return this;
   }

   /**
    * If not already created, a new <code>run-as</code> element will be created and returned.
    * Otherwise, the existing <code>run-as</code> element will be returned.
    * @return the node defined for the element <code>run-as</code> 
    */
   public RunAsType<SecurityIdentityType<T>> runAs()
   {
      Node node = childNode.getOrCreate("run-as");
      RunAsType<SecurityIdentityType<T>> runAs = new RunAsTypeImpl<SecurityIdentityType<T>>(this, "run-as", childNode,
            node);
      return runAs;
   }

}
