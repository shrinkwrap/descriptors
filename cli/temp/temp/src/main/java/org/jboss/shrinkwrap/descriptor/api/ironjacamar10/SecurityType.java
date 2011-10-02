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
package org.jboss.shrinkwrap.descriptor.api.ironjacamar10; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> securityType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface SecurityType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: javaee:emptyType ElementType : application
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> application();

   /**
    * Removes the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public Boolean isApplication();

   /**
    * Removes the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeApplication();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: xsd:token ElementType : security-domain
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain</code> element
    * @param securityDomain the value for the element <code>security-domain</code> 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> securityDomain(String securityDomain);

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain();

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeSecurityDomain();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: xsd:token ElementType : security-domain-and-application
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain-and-application</code> element
    * @param securityDomainAndApplication the value for the element <code>security-domain-and-application</code> 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> securityDomainAndApplication(String securityDomainAndApplication);

   /**
    * Returns the <code>security-domain-and-application</code> element
    * @return the node defined for the element <code>security-domain-and-application</code> 
    */
   public String getSecurityDomainAndApplication();

   /**
    * Removes the <code>security-domain-and-application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeSecurityDomainAndApplication();
}
