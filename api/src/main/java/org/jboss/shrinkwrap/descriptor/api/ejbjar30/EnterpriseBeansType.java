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
package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> enterprise-beansType </code> xsd type 
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
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface EnterpriseBeansType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : session
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>session</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllSession();

   /**
    * Returns the <code>session</code> element
    * @return the node defined for the element <code>session</code> 
    */
   public SessionBeanType<EnterpriseBeansType<T>> session();

   /**
    * Returns all <code>session</code> elements
    * @return list of <code>session</code> 
    */
   public List<SessionBeanType<EnterpriseBeansType<T>>> getSessionList();

   // -------------------------------------------------------------------------------------||
   // Element type : entity
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>entity</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllEntity();

   /**
    * Returns the <code>entity</code> element
    * @return the node defined for the element <code>entity</code> 
    */
   public EntityBeanType<EnterpriseBeansType<T>> entity();

   /**
    * Returns all <code>entity</code> elements
    * @return list of <code>entity</code> 
    */
   public List<EntityBeanType<EnterpriseBeansType<T>>> getEntityList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-driven
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-driven</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllMessageDriven();

   /**
    * Returns the <code>message-driven</code> element
    * @return the node defined for the element <code>message-driven</code> 
    */
   public MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven();

   /**
    * Returns all <code>message-driven</code> elements
    * @return list of <code>message-driven</code> 
    */
   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getMessageDrivenList();

}
