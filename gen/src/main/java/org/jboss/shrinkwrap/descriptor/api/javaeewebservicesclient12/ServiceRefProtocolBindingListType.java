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
package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> service-ref_protocol-bindingListType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 * Defines the type used for specifying a list of <br> 
 * protocol-bindingType(s). For e.g. <br> 
 *<br>
 * ##SOAP11_HTTP ##SOAP12_HTTP ##XML_HTTP <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ServiceRefProtocolBindingListType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : protocol-bindingType
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>protocol-bindingType</code> element 
    * @return the current instance of {@link ServiceRefProtocolBindingListType<T>} 
    */
   public ServiceRefProtocolBindingListType<T> setProtocolBindingType(String protocolBindingType);

   /**
    * Creates for all String objects representing <code>protocol-bindingType</code> elements, 
    * a new <code>protocol-bindingType</code> element 
    * @param list of <code>protocol-bindingType</code> objects 
    * @return the current instance of {@link ServiceRefProtocolBindingListType<T>} 
    */
   public ServiceRefProtocolBindingListType<T> setProtocolBindingTypeList(String... values);

   /**
    * Removes the <code>protocol-bindingType</code> element 
    * @return the current instance of {@link ServiceRefProtocolBindingListType<T>} 
    */
   public ServiceRefProtocolBindingListType<T> removeAllProtocolBindingType();

   /**
    * Returns all <code>protocol-bindingType</code> elements
    * @return list of <code>protocol-bindingType</code> 
    */
   public List<String> getProtocolBindingTypeList();

}
