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
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;

/**
 * This interface defines the contract for the <code> assembly-descriptorType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The assembly-descriptorType defines <br> 
 * application-assembly information. <br> 
 *<br>
 * The application-assembly information consists of the <br> 
 * following parts: the definition of security roles, the <br> 
 * definition of method permissions, the definition of <br> 
 * transaction attributes for enterprise beans with <br> 
 * container-managed transaction demarcation, the definition <br> 
 * of interceptor bindings, a list of <br> 
 * methods to be excluded from being invoked, and a list of <br> 
 * exception types that should be treated as application exceptions. <br> 
 *<br>
 * All the parts are optional in the sense that they are <br> 
 * omitted if the lists represented by them are empty. <br> 
 *<br>
 * Providing an assembly-descriptor in the deployment <br> 
 * descriptor is optional for the ejb-jar file producer. <br> 
 *<br>
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
   // Element type : method-permission
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>method-permission</code> elements 
    * @return the current instance of {@link AssemblyDescriptorType<T>} 
    */
   public AssemblyDescriptorType<T> removeAllMethodPermission();

   /**
    * Returns the <code>method-permission</code> element
    * @return the node defined for the element <code>method-permission</code> 
    */
   public MethodPermissionType<AssemblyDescriptorType<T>> methodPermission();

   /**
    * Returns all <code>method-permission</code> elements
    * @return list of <code>method-permission</code> 
    */
   public List<MethodPermissionType<AssemblyDescriptorType<T>>> getMethodPermissionList();

   // -------------------------------------------------------------------------------------||
   // Element type : container-transaction
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>container-transaction</code> elements 
    * @return the current instance of {@link AssemblyDescriptorType<T>} 
    */
   public AssemblyDescriptorType<T> removeAllContainerTransaction();

   /**
    * Returns the <code>container-transaction</code> element
    * @return the node defined for the element <code>container-transaction</code> 
    */
   public ContainerTransactionType<AssemblyDescriptorType<T>> containerTransaction();

   /**
    * Returns all <code>container-transaction</code> elements
    * @return list of <code>container-transaction</code> 
    */
   public List<ContainerTransactionType<AssemblyDescriptorType<T>>> getContainerTransactionList();

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-binding
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>interceptor-binding</code> elements 
    * @return the current instance of {@link AssemblyDescriptorType<T>} 
    */
   public AssemblyDescriptorType<T> removeAllInterceptorBinding();

   /**
    * Returns the <code>interceptor-binding</code> element
    * @return the node defined for the element <code>interceptor-binding</code> 
    */
   public InterceptorBindingType<AssemblyDescriptorType<T>> interceptorBinding();

   /**
    * Returns all <code>interceptor-binding</code> elements
    * @return list of <code>interceptor-binding</code> 
    */
   public List<InterceptorBindingType<AssemblyDescriptorType<T>>> getInterceptorBindingList();

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

   // -------------------------------------------------------------------------------------||
   // Element type : exclude-list
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>exclude-list</code> element 
    * @return the current instance of {@link AssemblyDescriptorType<T>} 
    */
   public AssemblyDescriptorType<T> removeExcludeList();

   /**
    * If not already created, a new <code>exclude-list</code> element will be created and returned.
    * Otherwise, the existing <code>exclude-list</code> element will be returned.
    * @return the node defined for the element <code>exclude-list</code> 
    */
   public ExcludeListType<AssemblyDescriptorType<T>> excludeList();

   // -------------------------------------------------------------------------------------||
   // Element type : application-exception
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>application-exception</code> elements 
    * @return the current instance of {@link AssemblyDescriptorType<T>} 
    */
   public AssemblyDescriptorType<T> removeAllApplicationException();

   /**
    * Returns the <code>application-exception</code> element
    * @return the node defined for the element <code>application-exception</code> 
    */
   public ApplicationExceptionType<AssemblyDescriptorType<T>> applicationException();

   /**
    * Returns all <code>application-exception</code> elements
    * @return list of <code>application-exception</code> 
    */
   public List<ApplicationExceptionType<AssemblyDescriptorType<T>>> getApplicationExceptionList();

}
