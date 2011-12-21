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
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.XaPoolType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> xa-poolType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class XaPoolTypeImpl<T> implements Child<T>, XaPoolType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public XaPoolTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public XaPoolTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : is-same-rm-override
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>is-same-rm-override</code> element
    * @param isSameRmOverride the value for the element <code>is-same-rm-override</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> isSameRmOverride(Boolean isSameRmOverride)
   {
      childNode.getOrCreate("is-same-rm-override").text(isSameRmOverride);
      return this;
   }

   /**
    * Returns the <code>is-same-rm-override</code> element
    * @return the node defined for the element <code>is-same-rm-override</code> 
    */
   public Boolean isIsSameRmOverride()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("is-same-rm-override"));
   }

   /**
    * Removes the <code>is-same-rm-override</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeIsSameRmOverride()
   {
      childNode.removeChildren("is-same-rm-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: javaee:emptyType ElementType : interleaving
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interleaving</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> interleaving()
   {
      childNode.getOrCreate("interleaving");
      return this;
   }

   /**
    * Removes the <code>interleaving</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public Boolean isInterleaving()
   {
      return childNode.getSingle("interleaving") != null;
   }

   /**
    * Removes the <code>interleaving</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeInterleaving()
   {
      childNode.removeChild("interleaving");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: javaee:emptyType ElementType : no-tx-separate-pools
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>no-tx-separate-pools</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> noTxSeparatePools()
   {
      childNode.getOrCreate("no-tx-separate-pools");
      return this;
   }

   /**
    * Removes the <code>no-tx-separate-pools</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public Boolean isNoTxSeparatePools()
   {
      return childNode.getSingle("no-tx-separate-pools") != null;
   }

   /**
    * Removes the <code>no-tx-separate-pools</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeNoTxSeparatePools()
   {
      childNode.removeChild("no-tx-separate-pools");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : pad-xid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pad-xid</code> element
    * @param padXid the value for the element <code>pad-xid</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> padXid(Boolean padXid)
   {
      childNode.getOrCreate("pad-xid").text(padXid);
      return this;
   }

   /**
    * Returns the <code>pad-xid</code> element
    * @return the node defined for the element <code>pad-xid</code> 
    */
   public Boolean isPadXid()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("pad-xid"));
   }

   /**
    * Removes the <code>pad-xid</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removePadXid()
   {
      childNode.removeChildren("pad-xid");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : wrap-xa-resource
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>wrap-xa-resource</code> element
    * @param wrapXaResource the value for the element <code>wrap-xa-resource</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> wrapXaResource(Boolean wrapXaResource)
   {
      childNode.getOrCreate("wrap-xa-resource").text(wrapXaResource);
      return this;
   }

   /**
    * Returns the <code>wrap-xa-resource</code> element
    * @return the node defined for the element <code>wrap-xa-resource</code> 
    */
   public Boolean isWrapXaResource()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("wrap-xa-resource"));
   }

   /**
    * Removes the <code>wrap-xa-resource</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeWrapXaResource()
   {
      childNode.removeChildren("wrap-xa-resource");
      return this;
   }
}
