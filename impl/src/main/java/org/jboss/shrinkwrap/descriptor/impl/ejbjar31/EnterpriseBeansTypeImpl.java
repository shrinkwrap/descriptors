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
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EntityBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> enterprise-beansType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The enterprise-beansType declares one or more enterprise <br> 
 * beans. Each bean can be a session, entity or message-driven <br> 
 * bean. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class EnterpriseBeansTypeImpl<T> implements Child<T>, EnterpriseBeansType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>session</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllSession()
   {
      childNode.remove("session");
      return this;
   }

   /**
    * Returns the <code>session</code> element
    * @return the node defined for the element <code>session</code> 
    */
   public SessionBeanType<EnterpriseBeansType<T>> session()
   {
      return new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this, "session", childNode);
   }

   /**
    * Returns all <code>session</code> elements
    * @return list of <code>session</code> 
    */
   public List<SessionBeanType<EnterpriseBeansType<T>>> getSessionList()
   {
      List<SessionBeanType<EnterpriseBeansType<T>>> list = new ArrayList<SessionBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("session");
      for (Node node : nodeList)
      {
         SessionBeanType<EnterpriseBeansType<T>> type = new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this,
               "session", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : entity
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>entity</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllEntity()
   {
      childNode.remove("entity");
      return this;
   }

   /**
    * Returns the <code>entity</code> element
    * @return the node defined for the element <code>entity</code> 
    */
   public EntityBeanType<EnterpriseBeansType<T>> entity()
   {
      return new EntityBeanTypeImpl<EnterpriseBeansType<T>>(this, "entity", childNode);
   }

   /**
    * Returns all <code>entity</code> elements
    * @return list of <code>entity</code> 
    */
   public List<EntityBeanType<EnterpriseBeansType<T>>> getEntityList()
   {
      List<EntityBeanType<EnterpriseBeansType<T>>> list = new ArrayList<EntityBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("entity");
      for (Node node : nodeList)
      {
         EntityBeanType<EnterpriseBeansType<T>> type = new EntityBeanTypeImpl<EnterpriseBeansType<T>>(this, "entity",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-driven
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-driven</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllMessageDriven()
   {
      childNode.remove("message-driven");
      return this;
   }

   /**
    * Returns the <code>message-driven</code> element
    * @return the node defined for the element <code>message-driven</code> 
    */
   public MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven()
   {
      return new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(this, "message-driven", childNode);
   }

   /**
    * Returns all <code>message-driven</code> elements
    * @return list of <code>message-driven</code> 
    */
   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getMessageDrivenList()
   {
      List<MessageDrivenBeanType<EnterpriseBeansType<T>>> list = new ArrayList<MessageDrivenBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("message-driven");
      for (Node node : nodeList)
      {
         MessageDrivenBeanType<EnterpriseBeansType<T>> type = new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(
               this, "message-driven", childNode, node);
         list.add(type);
      }
      return list;
   }

}
