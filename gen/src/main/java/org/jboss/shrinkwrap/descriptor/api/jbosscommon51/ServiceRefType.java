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
package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> service-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * Runtime settings for a web service reference. In the simplest case, <br> 
 * there is no runtime information required for a service ref. Runtime info <br> 
 * is only needed in the following cases : <br> 
 *<br>
 * * to define the port that should be used to resolve a container-managed port <br> 
 * * to define default Stub property settings for Stub objects <br> 
 * * to define the URL of a final WSDL document to be used <br> 
 *<br>
 * Example: <br> 
 *<br>
 * <service-ref> <br> 
 * <service-ref-name>OrganizationService</service-ref-name> <br> 
 * <wsdl-override>file:/wsdlRepository/organization-service.wsdl</wsdl-override> <br> 
 * </service-ref> <br> 
 *<br>
 * <service-ref> <br> 
 * <service-ref-name>OrganizationService</service-ref-name> <br> 
 * <config-name>Secure Client Config</config-name> <br> 
 * <config-file>META-INF/jbossws-client-config.xml</config-file> <br> 
 * <handler-chain>META-INF/jbossws-client-handlers.xml</handler-chain> <br> 
 * </service-ref> <br> 
 *<br>
 * <service-ref> <br> 
 * <service-ref-name>SecureService</service-ref-name> <br> 
 * <service-impl-class>org.jboss.tests.ws.jaxws.webserviceref.SecureEndpointService</service-impl-class> <br> 
 * <service-qname>{http://org.jboss.ws/wsref}SecureEndpointService</service-qname> <br> 
 * <port-component-ref> <br> 
 * <service-endpoint-interface>org.jboss.tests.ws.jaxws.webserviceref.SecureEndpoint</service-endpoint-interface> <br> 
 * <port-qname>{http://org.jboss.ws/wsref}SecureEndpointPort</port-qname> <br> 
 * <stub-property> <br> 
 * <name>javax.xml.ws.security.auth.username</name> <br> 
 * <value>kermit</value> <br> 
 * </stub-property> <br> 
 * <stub-property> <br> 
 * <name>javax.xml.ws.security.auth.password</name> <br> 
 * <value>thefrog</value> <br> 
 * </stub-property> <br> 
 * </port-component-ref> <br> 
 * </service-ref> <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ServiceRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>service-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceRefName(String serviceRefName);

   /**
    * Removes the <code>service-ref-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceRefName();

   /**
    * Returns the <code>service-ref-name</code> element
    * @return the node defined for the element <code>service-ref-name</code> 
    */
   public String getServiceRefName();

   // -------------------------------------------------------------------------------------||
   // Element type : service-impl-class
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-impl-class</code> element with the given value will be created.
    * Otherwise, the existing <code>service-impl-class</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceImplClass(String serviceImplClass);

   /**
    * Removes the <code>service-impl-class</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceImplClass();

   /**
    * Returns the <code>service-impl-class</code> element
    * @return the node defined for the element <code>service-impl-class</code> 
    */
   public String getServiceImplClass();

   // -------------------------------------------------------------------------------------||
   // Element type : service-qname
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-qname</code> element with the given value will be created.
    * Otherwise, the existing <code>service-qname</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setServiceQname(String serviceQname);

   /**
    * Removes the <code>service-qname</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeServiceQname();

   /**
    * Returns the <code>service-qname</code> element
    * @return the node defined for the element <code>service-qname</code> 
    */
   public String getServiceQname();

   // -------------------------------------------------------------------------------------||
   // Element type : config-name
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-name</code> element with the given value will be created.
    * Otherwise, the existing <code>config-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setConfigName(String configName);

   /**
    * Removes the <code>config-name</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeConfigName();

   /**
    * Returns the <code>config-name</code> element
    * @return the node defined for the element <code>config-name</code> 
    */
   public String getConfigName();

   // -------------------------------------------------------------------------------------||
   // Element type : config-file
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-file</code> element with the given value will be created.
    * Otherwise, the existing <code>config-file</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setConfigFile(String configFile);

   /**
    * Removes the <code>config-file</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeConfigFile();

   /**
    * Returns the <code>config-file</code> element
    * @return the node defined for the element <code>config-file</code> 
    */
   public String getConfigFile();

   // -------------------------------------------------------------------------------------||
   // Element type : handler-chain
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-chain</code> element with the given value will be created.
    * Otherwise, the existing <code>handler-chain</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setHandlerChain(String handlerChain);

   /**
    * Removes the <code>handler-chain</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeHandlerChain();

   /**
    * Returns the <code>handler-chain</code> element
    * @return the node defined for the element <code>handler-chain</code> 
    */
   public String getHandlerChain();

   // -------------------------------------------------------------------------------------||
   // Element type : port-component-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>port-component-ref</code> elements 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeAllPortComponentRef();

   /**
    * Returns the <code>port-component-ref</code> element
    * @return the node defined for the element <code>port-component-ref</code> 
    */
   public PortComponentRefType<ServiceRefType<T>> portComponentRef();

   /**
    * Returns all <code>port-component-ref</code> elements
    * @return list of <code>port-component-ref</code> 
    */
   public List<PortComponentRefType<ServiceRefType<T>>> getPortComponentRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : wsdl-override
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>wsdl-override</code> element with the given value will be created.
    * Otherwise, the existing <code>wsdl-override</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> setWsdlOverride(String wsdlOverride);

   /**
    * Removes the <code>wsdl-override</code> element 
    * @return the current instance of {@link ServiceRefType<T>} 
    */
   public ServiceRefType<T> removeWsdlOverride();

   /**
    * Returns the <code>wsdl-override</code> element
    * @return the node defined for the element <code>wsdl-override</code> 
    */
   public String getWsdlOverride();

}
