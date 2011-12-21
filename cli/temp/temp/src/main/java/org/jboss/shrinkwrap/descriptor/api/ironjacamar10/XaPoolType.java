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
 * This interface defines the contract for the <code> xa-poolType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface XaPoolType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : is-same-rm-override
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>is-same-rm-override</code> element
    * @param isSameRmOverride the value for the element <code>is-same-rm-override</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> isSameRmOverride(Boolean isSameRmOverride);

   /**
    * Returns the <code>is-same-rm-override</code> element
    * @return the node defined for the element <code>is-same-rm-override</code> 
    */
   public Boolean isIsSameRmOverride();

   /**
    * Removes the <code>is-same-rm-override</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeIsSameRmOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: javaee:emptyType ElementType : interleaving
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interleaving</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> interleaving();

   /**
    * Removes the <code>interleaving</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public Boolean isInterleaving();

   /**
    * Removes the <code>interleaving</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeInterleaving();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: javaee:emptyType ElementType : no-tx-separate-pools
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>no-tx-separate-pools</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> noTxSeparatePools();

   /**
    * Removes the <code>no-tx-separate-pools</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public Boolean isNoTxSeparatePools();

   /**
    * Removes the <code>no-tx-separate-pools</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeNoTxSeparatePools();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : pad-xid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pad-xid</code> element
    * @param padXid the value for the element <code>pad-xid</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> padXid(Boolean padXid);

   /**
    * Returns the <code>pad-xid</code> element
    * @return the node defined for the element <code>pad-xid</code> 
    */
   public Boolean isPadXid();

   /**
    * Removes the <code>pad-xid</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removePadXid();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : wrap-xa-resource
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>wrap-xa-resource</code> element
    * @param wrapXaResource the value for the element <code>wrap-xa-resource</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> wrapXaResource(Boolean wrapXaResource);

   /**
    * Returns the <code>wrap-xa-resource</code> element
    * @return the node defined for the element <code>wrap-xa-resource</code> 
    */
   public Boolean isWrapXaResource();

   /**
    * Removes the <code>wrap-xa-resource</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeWrapXaResource();
}
