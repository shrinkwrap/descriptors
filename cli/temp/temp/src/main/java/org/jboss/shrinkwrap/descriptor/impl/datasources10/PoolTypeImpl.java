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
package org.jboss.shrinkwrap.descriptor.impl.datasources10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.datasources10.PoolType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> poolType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class PoolTypeImpl<T> implements Child<T>, PoolType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PoolTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PoolTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xsd:nonNegativeInteger ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> minPoolSize(Integer minPoolSize)
   {
      childNode.getOrCreate("min-pool-size").text(minPoolSize);
      return this;
   }

   /**
    * Returns the <code>min-pool-size</code> element
    * @return the node defined for the element <code>min-pool-size</code> 
    */
   public Integer getMinPoolSize()
   {
      if (childNode.getTextValueForPatternName("min-pool-size") != null && !childNode.getTextValueForPatternName("min-pool-size").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("min-pool-size"));
      }
      return null;
   }

   /**
    * Removes the <code>min-pool-size</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removeMinPoolSize()
   {
      childNode.removeChildren("min-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xsd:nonNegativeInteger ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> maxPoolSize(Integer maxPoolSize)
   {
      childNode.getOrCreate("max-pool-size").text(maxPoolSize);
      return this;
   }

   /**
    * Returns the <code>max-pool-size</code> element
    * @return the node defined for the element <code>max-pool-size</code> 
    */
   public Integer getMaxPoolSize()
   {
      if (childNode.getTextValueForPatternName("max-pool-size") != null && !childNode.getTextValueForPatternName("max-pool-size").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("max-pool-size"));
      }
      return null;
   }

   /**
    * Removes the <code>max-pool-size</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removeMaxPoolSize()
   {
      childNode.removeChildren("max-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xsd:boolean ElementType : prefill
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>prefill</code> element
    * @param prefill the value for the element <code>prefill</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> prefill(Boolean prefill)
   {
      childNode.getOrCreate("prefill").text(prefill);
      return this;
   }

   /**
    * Returns the <code>prefill</code> element
    * @return the node defined for the element <code>prefill</code> 
    */
   public Boolean isPrefill()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("prefill"));
   }

   /**
    * Removes the <code>prefill</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removePrefill()
   {
      childNode.removeChildren("prefill");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xsd:boolean ElementType : use-strict-min
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-strict-min</code> element
    * @param useStrictMin the value for the element <code>use-strict-min</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> useStrictMin(Boolean useStrictMin)
   {
      childNode.getOrCreate("use-strict-min").text(useStrictMin);
      return this;
   }

   /**
    * Returns the <code>use-strict-min</code> element
    * @return the node defined for the element <code>use-strict-min</code> 
    */
   public Boolean isUseStrictMin()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("use-strict-min"));
   }

   /**
    * Removes the <code>use-strict-min</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removeUseStrictMin()
   {
      childNode.removeChildren("use-strict-min");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xsd:token ElementType : flush-strategy
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>flush-strategy</code> element
    * @param flushStrategy the value for the element <code>flush-strategy</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> flushStrategy(String flushStrategy)
   {
      childNode.getOrCreate("flush-strategy").text(flushStrategy);
      return this;
   }

   /**
    * Returns the <code>flush-strategy</code> element
    * @return the node defined for the element <code>flush-strategy</code> 
    */
   public String getFlushStrategy()
   {
      return childNode.getTextValueForPatternName("flush-strategy");
   }

   /**
    * Removes the <code>flush-strategy</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removeFlushStrategy()
   {
      childNode.removeChildren("flush-strategy");
      return this;
   }
}
