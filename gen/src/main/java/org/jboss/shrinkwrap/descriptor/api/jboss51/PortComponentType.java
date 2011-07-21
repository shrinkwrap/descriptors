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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> port-componentType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The port-component element specifies a mapping from a webservice <br> 
 * port-component whose service-impl-bean/ejb-link value maps to an ejb. <br> 
 * Used in: session <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface PortComponentType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : port-component-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-component-name</code> element with the given value will be created.
    * Otherwise, the existing <code>port-component-name</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> setPortComponentName(String portComponentName);

   /**
    * Removes the <code>port-component-name</code> element 
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> removePortComponentName();

   /**
    * Returns the <code>port-component-name</code> element
    * @return the node defined for the element <code>port-component-name</code> 
    */
   public String getPortComponentName();

   // -------------------------------------------------------------------------------------||
   // Element type : port-component-uri
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-component-uri</code> element with the given value will be created.
    * Otherwise, the existing <code>port-component-uri</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> setPortComponentUri(String portComponentUri);

   /**
    * Removes the <code>port-component-uri</code> element 
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> removePortComponentUri();

   /**
    * Returns the <code>port-component-uri</code> element
    * @return the node defined for the element <code>port-component-uri</code> 
    */
   public String getPortComponentUri();

   // -------------------------------------------------------------------------------------||
   // Element type : auth-method
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>auth-method</code> element with the given value will be created.
    * Otherwise, the existing <code>auth-method</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> setAuthMethod(String authMethod);

   /**
    * Removes the <code>auth-method</code> element 
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> removeAuthMethod();

   /**
    * Returns the <code>auth-method</code> element
    * @return the node defined for the element <code>auth-method</code> 
    */
   public String getAuthMethod();

   // -------------------------------------------------------------------------------------||
   // Element type : transport-guarantee
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transport-guarantee</code> element with the given value will be created.
    * Otherwise, the existing <code>transport-guarantee</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> setTransportGuarantee(String transportGuarantee);

   /**
    * Removes the <code>transport-guarantee</code> element 
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> removeTransportGuarantee();

   /**
    * Returns the <code>transport-guarantee</code> element
    * @return the node defined for the element <code>transport-guarantee</code> 
    */
   public String getTransportGuarantee();

   // -------------------------------------------------------------------------------------||
   // Element type : secure-wsdl-access
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>secure-wsdl-access</code> element with the given value will be created.
    * Otherwise, the existing <code>secure-wsdl-access</code> element will be updated with the given value.
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> setSecureWsdlAccess(Boolean secureWsdlAccess);

   /**
    * Removes the <code>secure-wsdl-access</code> element 
    * @return the current instance of {@link PortComponentType<T>} 
    */
   public PortComponentType<T> removeSecureWsdlAccess();

   /**
    * Returns the <code>secure-wsdl-access</code> element
    * @return the node defined for the element <code>secure-wsdl-access</code> 
    */
   public Boolean isSecureWsdlAccess();

}
