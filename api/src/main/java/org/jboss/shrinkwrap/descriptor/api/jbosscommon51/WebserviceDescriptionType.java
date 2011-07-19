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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> webservice-descriptionType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * Runtime information about a web service. <br> 
 * wsdl-publish-location is optionally used to specify <br> 
 * where the final wsdl and any dependent files should be stored. This location <br> 
 * resides on the file system from which deployment is initiated. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface WebserviceDescriptionType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : webservice-description-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>webservice-description-name</code> element with the given value will be created.
    * Otherwise, the existing <code>webservice-description-name</code> element will be updated with the given value.
    * @return the current instance of {@link WebserviceDescriptionType<T>} 
    */
   public WebserviceDescriptionType<T> setWebserviceDescriptionName(String webserviceDescriptionName);

   /**
    * Removes the <code>webservice-description-name</code> element 
    * @return the current instance of {@link WebserviceDescriptionType<T>} 
    */
   public WebserviceDescriptionType<T> removeWebserviceDescriptionName();

   /**
    * Returns the <code>webservice-description-name</code> element
    * @return the node defined for the element <code>webservice-description-name</code> 
    */
   public String getWebserviceDescriptionName();

   // -------------------------------------------------------------------------------------||
   // Element type : config-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-name</code> element with the given value will be created.
    * Otherwise, the existing <code>config-name</code> element will be updated with the given value.
    * @return the current instance of {@link WebserviceDescriptionType<T>} 
    */
   public WebserviceDescriptionType<T> setConfigName(String configName);

   /**
    * Removes the <code>config-name</code> element 
    * @return the current instance of {@link WebserviceDescriptionType<T>} 
    */
   public WebserviceDescriptionType<T> removeConfigName();

   /**
    * Returns the <code>config-name</code> element
    * @return the node defined for the element <code>config-name</code> 
    */
   public String getConfigName();

   // -------------------------------------------------------------------------------------||
   // Element type : config-file
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-file</code> element with the given value will be created.
    * Otherwise, the existing <code>config-file</code> element will be updated with the given value.
    * @return the current instance of {@link WebserviceDescriptionType<T>} 
    */
   public WebserviceDescriptionType<T> setConfigFile(String configFile);

   /**
    * Removes the <code>config-file</code> element 
    * @return the current instance of {@link WebserviceDescriptionType<T>} 
    */
   public WebserviceDescriptionType<T> removeConfigFile();

   /**
    * Returns the <code>config-file</code> element
    * @return the node defined for the element <code>config-file</code> 
    */
   public String getConfigFile();

   // -------------------------------------------------------------------------------------||
   // Element type : wsdl-publish-location
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>wsdl-publish-location</code> element with the given value will be created.
    * Otherwise, the existing <code>wsdl-publish-location</code> element will be updated with the given value.
    * @return the current instance of {@link WebserviceDescriptionType<T>} 
    */
   public WebserviceDescriptionType<T> setWsdlPublishLocation(String wsdlPublishLocation);

   /**
    * Removes the <code>wsdl-publish-location</code> element 
    * @return the current instance of {@link WebserviceDescriptionType<T>} 
    */
   public WebserviceDescriptionType<T> removeWsdlPublishLocation();

   /**
    * Returns the <code>wsdl-publish-location</code> element
    * @return the node defined for the element <code>wsdl-publish-location</code> 
    */
   public String getWsdlPublishLocation();

}
