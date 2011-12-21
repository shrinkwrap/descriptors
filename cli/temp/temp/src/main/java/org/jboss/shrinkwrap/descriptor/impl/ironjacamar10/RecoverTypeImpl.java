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
package org.jboss.shrinkwrap.descriptor.impl.ironjacamar10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.RecoverType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.CredentialType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.CredentialTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.ExtensionTypeImpl;

/**
 * This class implements the <code> recoverType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class RecoverTypeImpl<T> implements Child<T>, RecoverType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public RecoverTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public RecoverTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: ironjacamar:credentialType ElementType : recover-credential
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recover-credential</code> element with the given value will be created.
    * Otherwise, the existing <code>recover-credential</code> element will be returned.
    * @return  a new or existing instance of <code>CredentialType<RecoverType<T>></code> 
    */
   public CredentialType<RecoverType<T>> getOrCreateRecoverCredential()
   {
      Node node = childNode.getOrCreate("recover-credential");
      CredentialType<RecoverType<T>> recoverCredential = new CredentialTypeImpl<RecoverType<T>>(this, "recover-credential", childNode, node);
      return recoverCredential;
   }

   /**
    * Removes the <code>recover-credential</code> element 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeRecoverCredential()
   {
      childNode.removeChildren("recover-credential");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: ironjacamar:extensionType ElementType : recover-plugin
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recover-plugin</code> element with the given value will be created.
    * Otherwise, the existing <code>recover-plugin</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensionType<RecoverType<T>></code> 
    */
   public ExtensionType<RecoverType<T>> getOrCreateRecoverPlugin()
   {
      Node node = childNode.getOrCreate("recover-plugin");
      ExtensionType<RecoverType<T>> recoverPlugin = new ExtensionTypeImpl<RecoverType<T>>(this, "recover-plugin", childNode, node);
      return recoverPlugin;
   }

   /**
    * Removes the <code>recover-plugin</code> element 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeRecoverPlugin()
   {
      childNode.removeChildren("recover-plugin");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RecoverType ElementName: xsd:boolean ElementType : no-recovery
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>no-recovery</code> attribute
    * @param noRecovery the value for the attribute <code>no-recovery</code> 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> noRecovery(Boolean noRecovery)
   {
      childNode.attribute("no-recovery", noRecovery);
      return this;
   }

   /**
    * Returns the <code>no-recovery</code> attribute
    * @return the value defined for the attribute <code>no-recovery</code> 
    */
   public Boolean isNoRecovery()
   {
      return Strings.isTrue(childNode.getAttribute("no-recovery"));
   }

   /**
    * Removes the <code>no-recovery</code> attribute 
    * @return the current instance of <code>RecoverType<T></code> 
    */
   public RecoverType<T> removeNoRecovery()
   {
      childNode.removeAttribute("no-recovery");
      return this;
   }
}
