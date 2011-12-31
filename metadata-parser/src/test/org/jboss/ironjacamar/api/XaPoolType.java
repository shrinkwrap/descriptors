package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> xa-poolType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
 */
public interface XaPoolType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xs:boolean ElementType : is-same-rm-override
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>is-same-rm-override</code> element with the given value will be created.
    * Otherwise, the existing <code>is-same-rm-override</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<XaPoolType<T>></code> 
    */
   public Boolean<XaPoolType<T>> getOrCreateIsSameRmOverride();

   /**
    * Removes the <code>is-same-rm-override</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeIsSameRmOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: ironjacamar:boolean-presenceType ElementType : interleaving
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interleaving</code> element with the given value will be created.
    * Otherwise, the existing <code>interleaving</code> element will be returned.
    * @return  a new or existing instance of <code>BooleanPresenceType<XaPoolType<T>></code> 
    */
   public BooleanPresenceType<XaPoolType<T>> getOrCreateInterleaving();

   /**
    * Removes the <code>interleaving</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeInterleaving();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: ironjacamar:boolean-presenceType ElementType : no-tx-separate-pools
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>no-tx-separate-pools</code> element with the given value will be created.
    * Otherwise, the existing <code>no-tx-separate-pools</code> element will be returned.
    * @return  a new or existing instance of <code>BooleanPresenceType<XaPoolType<T>></code> 
    */
   public BooleanPresenceType<XaPoolType<T>> getOrCreateNoTxSeparatePools();

   /**
    * Removes the <code>no-tx-separate-pools</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeNoTxSeparatePools();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xs:boolean ElementType : pad-xid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pad-xid</code> element with the given value will be created.
    * Otherwise, the existing <code>pad-xid</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<XaPoolType<T>></code> 
    */
   public Boolean<XaPoolType<T>> getOrCreatePadXid();

   /**
    * Removes the <code>pad-xid</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removePadXid();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xs:boolean ElementType : wrap-xa-resource
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>wrap-xa-resource</code> element with the given value will be created.
    * Otherwise, the existing <code>wrap-xa-resource</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<XaPoolType<T>></code> 
    */
   public Boolean<XaPoolType<T>> getOrCreateWrapXaResource();

   /**
    * Removes the <code>wrap-xa-resource</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeWrapXaResource();
}
