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
package org.jboss.shrinkwrap.descriptor.api.datasources10; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.datasources10.ExtensionType;
/**
 * This interface defines the contract for the <code> dsSecurityType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface DsSecurityType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: xsd:token ElementType : user-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user-name</code> element
    * @param userName the value for the element <code>user-name</code> 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> userName(String userName);

   /**
    * Returns the <code>user-name</code> element
    * @return the node defined for the element <code>user-name</code> 
    */
   public String getUserName();

   /**
    * Removes the <code>user-name</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removeUserName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> password(String password);

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword();

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removePassword();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: xsd:token ElementType : security-domain
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain</code> element
    * @param securityDomain the value for the element <code>security-domain</code> 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> securityDomain(String securityDomain);

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain();

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removeSecurityDomain();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DsSecurityType ElementName: datasources:extensionType ElementType : reauth-plugin
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>reauth-plugin</code> element with the given value will be created.
    * Otherwise, the existing <code>reauth-plugin</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<DsSecurityType<T>></code> 
    */
   public ExtensionType<DsSecurityType<T>> getOrCreateReauthPlugin();

   /**
    * Removes the <code>reauth-plugin</code> element 
    * @return the current instance of <code>DsSecurityType<T></code> 
    */
   public DsSecurityType<T> removeReauthPlugin();
}
