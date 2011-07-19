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

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AccessTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimeUnitTypeType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> access-timeoutType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The access-timeoutType represents the maximum amount of <br> 
 * time (in a given time unit) that the container should wait for <br> 
 * a concurrency lock before throwing a timeout exception to the <br> 
 * client. <br> 
 *<br>
 * A timeout value of 0 means concurrent access is not permitted. <br> 
 *<br>
 * A timeout value of -1 means wait indefinitely to acquire a lock. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class AccessTimeoutTypeImpl<T> implements Child<T>, AccessTimeoutType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AccessTimeoutTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public AccessTimeoutTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout</code> element will be updated with the given value.
    * @return the current instance of {@link AccessTimeoutType<T>} 
    */
   public AccessTimeoutType<T> setTimeout(Integer timeout)
   {
      childNode.getOrCreate("timeout").text(timeout);
      return this;
   }

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of {@link AccessTimeoutType<T>} 
    */
   public AccessTimeoutType<T> removeTimeout()
   {
      childNode.remove("timeout");
      return this;
   }

   /**
    * Returns the <code>timeout</code> element
    * @return the node defined for the element <code>timeout</code> 
    */
   public Integer getTimeout()
   {
      if (childNode.textValue("timeout") != null && !childNode.textValue("timeout").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("timeout"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : unit
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unit</code> element with the given value will be created.
    * Otherwise, the existing <code>unit</code> element will be updated with the given value.
    * @return the current instance of {@link AccessTimeoutType<T>} 
    */
   public AccessTimeoutType<T> setUnit(TimeUnitTypeType unit)
   {
      childNode.getOrCreate("unit").text(unit);
      return this;
   }

   /**
    * If not already created, a new <code>unit</code> element with the given value will be created.
    * Otherwise, the existing <code>unit</code> element will be updated with the given value.
    * @return the current instance of {@link AccessTimeoutType<T>} 
    */
   public AccessTimeoutType<T> setUnit(String unit)
   {
      childNode.getOrCreate("unit").text(unit);
      return this;
   }

   /**
    * Returns the <code>unit</code> element
    * @return the node defined for the element <code>unit</code> 
    */
   public TimeUnitTypeType getUnit()
   {
      return TimeUnitTypeType.getFromStringValue(childNode.textValue("unit"));
   }

   /**
    * Returns the <code>unit</code> element
    * @return the node defined for the element <code>unit</code> 
    */
   public String getUnitAsString()
   {
      return childNode.textValue("unit");
   }

}
