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
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.CredentialType;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ExtensionType;
/**
 * This interface defines the contract for the <code> recoverType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface RecoverType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: ironjacamar:credentialType ElementType : recover-credential
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recover-credential</code> element with the given value will be created.
    * Otherwise, the existing <code>recover-credential</code> element will be returned.
    * @return  a new or existing instance of <code>CredentialType<RecoverType<T>></code> 
    */
   public CredentialType<RecoverType<T>> getOrCreateRecoverCredential();

   /**
    * Removes the <code>recover-credential</code> element 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeRecoverCredential();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: ironjacamar:extensionType ElementType : recover-plugin
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recover-plugin</code> element with the given value will be created.
    * Otherwise, the existing <code>recover-plugin</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<RecoverType<T>></code> 
    */
   public ExtensionType<RecoverType<T>> getOrCreateRecoverPlugin();

   /**
    * Removes the <code>recover-plugin</code> element 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeRecoverPlugin();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: xsd:boolean ElementType : no-recovery
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>no-recovery</code> attribute
    * @param noRecovery the value for the attribute <code>no-recovery</code> 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> noRecovery(Boolean noRecovery);

   /**
    * Returns the <code>no-recovery</code> attribute
    * @return the value defined for the attribute <code>no-recovery</code> 
    */
public Boolean isNoRecovery();

   /**
    * Removes the <code>no-recovery</code> attribute 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeNoRecovery();
}
