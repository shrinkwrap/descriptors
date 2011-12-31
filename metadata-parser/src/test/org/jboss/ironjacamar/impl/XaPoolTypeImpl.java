package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.XaPoolType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> xa-poolType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
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
   // ClassName: XaPoolType ElementName: xs:boolean ElementType : is-same-rm-override
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>is-same-rm-override</code> element with the given value will be created.
    * Otherwise, the existing <code>is-same-rm-override</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<XaPoolType<T>></code> 
    */
   public Boolean<XaPoolType<T>> getOrCreateIsSameRmOverride()
   {
      Node node = childNode.getOrCreate("is-same-rm-override");
      Boolean<XaPoolType<T>> isSameRmOverride = new BooleanImpl<XaPoolType<T>>(this, "is-same-rm-override", childNode, node);
      return isSameRmOverride;
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
   // ClassName: XaPoolType ElementName: ironjacamar:boolean-presenceType ElementType : interleaving
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interleaving</code> element with the given value will be created.
    * Otherwise, the existing <code>interleaving</code> element will be returned.
    * @return  a new or existing instance of <code>BooleanPresenceType<XaPoolType<T>></code> 
    */
   public BooleanPresenceType<XaPoolType<T>> getOrCreateInterleaving()
   {
      Node node = childNode.getOrCreate("interleaving");
      BooleanPresenceType<XaPoolType<T>> interleaving = new BooleanPresenceTypeImpl<XaPoolType<T>>(this, "interleaving", childNode, node);
      return interleaving;
   }

   /**
    * Removes the <code>interleaving</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeInterleaving()
   {
      childNode.removeChildren("interleaving");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: ironjacamar:boolean-presenceType ElementType : no-tx-separate-pools
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>no-tx-separate-pools</code> element with the given value will be created.
    * Otherwise, the existing <code>no-tx-separate-pools</code> element will be returned.
    * @return  a new or existing instance of <code>BooleanPresenceType<XaPoolType<T>></code> 
    */
   public BooleanPresenceType<XaPoolType<T>> getOrCreateNoTxSeparatePools()
   {
      Node node = childNode.getOrCreate("no-tx-separate-pools");
      BooleanPresenceType<XaPoolType<T>> noTxSeparatePools = new BooleanPresenceTypeImpl<XaPoolType<T>>(this, "no-tx-separate-pools", childNode, node);
      return noTxSeparatePools;
   }

   /**
    * Removes the <code>no-tx-separate-pools</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeNoTxSeparatePools()
   {
      childNode.removeChildren("no-tx-separate-pools");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xs:boolean ElementType : pad-xid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pad-xid</code> element with the given value will be created.
    * Otherwise, the existing <code>pad-xid</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<XaPoolType<T>></code> 
    */
   public Boolean<XaPoolType<T>> getOrCreatePadXid()
   {
      Node node = childNode.getOrCreate("pad-xid");
      Boolean<XaPoolType<T>> padXid = new BooleanImpl<XaPoolType<T>>(this, "pad-xid", childNode, node);
      return padXid;
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
   // ClassName: XaPoolType ElementName: xs:boolean ElementType : wrap-xa-resource
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>wrap-xa-resource</code> element with the given value will be created.
    * Otherwise, the existing <code>wrap-xa-resource</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<XaPoolType<T>></code> 
    */
   public Boolean<XaPoolType<T>> getOrCreateWrapXaResource()
   {
      Node node = childNode.getOrCreate("wrap-xa-resource");
      Boolean<XaPoolType<T>> wrapXaResource = new BooleanImpl<XaPoolType<T>>(this, "wrap-xa-resource", childNode, node);
      return wrapXaResource;
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
