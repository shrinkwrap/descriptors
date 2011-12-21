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
package org.jboss.shrinkwrap.descriptor.impl.resourceadapters10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.ResourceAdaptersType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.ResourceAdapterType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.ResourceAdapterTypeImpl;

/**
 * This class implements the <code> resource-adaptersType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class ResourceAdaptersTypeImpl<T> implements Child<T>, ResourceAdaptersType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceAdaptersTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ResourceAdaptersTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdaptersType ElementName: resourceadapters:resource-adapterType ElementType : resource-adapter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-adapter</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-adapter</code> element will be returned.
    * @return the instance defined for the element <code>resource-adapter</code> 
    */
   public ResourceAdapterType<ResourceAdaptersType<T>> getOrCreateResourceAdapter()
   {
      List<Node> nodeList = childNode.get("resource-adapter");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ResourceAdapterTypeImpl<ResourceAdaptersType<T>>(this, "resource-adapter", childNode, nodeList.get(0));
      }
      return createResourceAdapter();
   }

   /**
    * Creates a new <code>resource-adapter</code> element 
    * @return the new created instance of <code>ResourceAdapterType<ResourceAdaptersType<T>></code> 
    */
   public ResourceAdapterType<ResourceAdaptersType<T>> createResourceAdapter()
   {
      return new ResourceAdapterTypeImpl<ResourceAdaptersType<T>>(this, "resource-adapter", childNode);
   }

   /**
    * Returns all <code>resource-adapter</code> elements
    * @return list of <code>resource-adapter</code> 
    */
   public List<ResourceAdapterType<ResourceAdaptersType<T>>> getAllResourceAdapter()
   {
      List<ResourceAdapterType<ResourceAdaptersType<T>>> list = new ArrayList<ResourceAdapterType<ResourceAdaptersType<T>>>();
      List<Node> nodeList = childNode.get("resource-adapter");
      for(Node node: nodeList)
      {
         ResourceAdapterType<ResourceAdaptersType<T>>  type = new ResourceAdapterTypeImpl<ResourceAdaptersType<T>>(this, "resource-adapter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-adapter</code> elements 
    * @return the current instance of <code>ResourceAdapterType<ResourceAdaptersType<T>></code> 
    */
   public ResourceAdaptersType<T> removeAllResourceAdapter()
   {
      childNode.removeChildren("resource-adapter");
      return this;
   }
}
