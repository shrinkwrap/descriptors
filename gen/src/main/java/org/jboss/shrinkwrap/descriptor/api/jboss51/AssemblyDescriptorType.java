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
package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.SecurityRoleType;

/**
 * This interface defines the contract for the <code> assembly-descriptorType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The assembly-descriptor element contains application-assembly information. <br> 
 * The definition of security roles allows you to map assembly roles to one or more principals. <br> 
 * For example, you may define a run-as principal in the security-identity element and include <br> 
 * that principal in one or more security-role(s) in the assembly descriptor. When called with <br> 
 * a run-as role, the callee will see all those roles in ctx.isCallerInRole(...) Used in: jboss <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface AssemblyDescriptorType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of {@link AssemblyDescriptorType<T>} 
    */
   public AssemblyDescriptorType<T> removeAllSecurityRole();

   /**
    * Returns the <code>security-role</code> element
    * @return the node defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<AssemblyDescriptorType<T>> securityRole();

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<AssemblyDescriptorType<T>>> getSecurityRoleList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of {@link AssemblyDescriptorType<T>} 
    */
   public AssemblyDescriptorType<T> removeAllMessageDestination();

   /**
    * Returns the <code>message-destination</code> element
    * @return the node defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<AssemblyDescriptorType<T>> messageDestination();

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<AssemblyDescriptorType<T>>> getMessageDestinationList();

}
