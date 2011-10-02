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
package org.jboss.shrinkwrap.descriptor.impl.ironjacamar10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.AdminObjectsType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.AdminObjectType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.AdminObjectTypeImpl;

/**
 * This class implements the <code> admin-objectsType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class AdminObjectsTypeImpl<T> implements Child<T>, AdminObjectsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AdminObjectsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AdminObjectsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectsType ElementName: ironjacamar:admin-objectType ElementType : admin-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>admin-object</code> element will be created and returned.
    * Otherwise, the first existing <code>admin-object</code> element will be returned.
    * @return the instance defined for the element <code>admin-object</code> 
    */
   public AdminObjectType<AdminObjectsType<T>> getOrCreateAdminObject()
   {
      List<Node> nodeList = childNode.get("admin-object");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new AdminObjectTypeImpl<AdminObjectsType<T>>(this, "admin-object", childNode, nodeList.get(0));
      }
      return createAdminObject();
   }

   /**
    * Creates a new <code>admin-object</code> element 
    * @return the new created instance of <code>AdminObjectType<AdminObjectsType<T>></code> 
    */
   public AdminObjectType<AdminObjectsType<T>> createAdminObject()
   {
      return new AdminObjectTypeImpl<AdminObjectsType<T>>(this, "admin-object", childNode);
   }

   /**
    * Returns all <code>admin-object</code> elements
    * @return list of <code>admin-object</code> 
    */
   public List<AdminObjectType<AdminObjectsType<T>>> getAllAdminObject()
   {
      List<AdminObjectType<AdminObjectsType<T>>> list = new ArrayList<AdminObjectType<AdminObjectsType<T>>>();
      List<Node> nodeList = childNode.get("admin-object");
      for(Node node: nodeList)
      {
         AdminObjectType<AdminObjectsType<T>>  type = new AdminObjectTypeImpl<AdminObjectsType<T>>(this, "admin-object", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>admin-object</code> elements 
    * @return the current instance of <code>AdminObjectType<AdminObjectsType<T>></code> 
    */
   public AdminObjectsType<T> removeAllAdminObject()
   {
      childNode.removeChildren("admin-object");
      return this;
   }
}
