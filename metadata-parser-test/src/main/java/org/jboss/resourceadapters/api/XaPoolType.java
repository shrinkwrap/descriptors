package org.jboss.resourceadapters.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> xa-poolType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:31.029-07:00
 */
public interface XaPoolType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:nonNegativeInteger ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> minPoolSize(Integer minPoolSize);

   /**
    * Returns the <code>min-pool-size</code> element
    * @return the node defined for the element <code>min-pool-size</code> 
    */
   public Integer getMinPoolSize();

   /**
    * Removes the <code>min-pool-size</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeMinPoolSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:nonNegativeInteger ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> maxPoolSize(Integer maxPoolSize);

   /**
    * Returns the <code>max-pool-size</code> element
    * @return the node defined for the element <code>max-pool-size</code> 
    */
   public Integer getMaxPoolSize();

   /**
    * Removes the <code>max-pool-size</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeMaxPoolSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : prefill
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>prefill</code> element
    * @param prefill the value for the element <code>prefill</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> prefill(Boolean prefill);

   /**
    * Returns the <code>prefill</code> element
    * @return the node defined for the element <code>prefill</code> 
    */
   public Boolean isPrefill();

   /**
    * Removes the <code>prefill</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removePrefill();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : use-strict-min
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-strict-min</code> element
    * @param useStrictMin the value for the element <code>use-strict-min</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> useStrictMin(Boolean useStrictMin);

   /**
    * Returns the <code>use-strict-min</code> element
    * @return the node defined for the element <code>use-strict-min</code> 
    */
   public Boolean isUseStrictMin();

   /**
    * Removes the <code>use-strict-min</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeUseStrictMin();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:token ElementType : flush-strategy
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>flush-strategy</code> element
    * @param flushStrategy the value for the element <code>flush-strategy</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> flushStrategy(String flushStrategy);

   /**
    * Returns the <code>flush-strategy</code> element
    * @return the node defined for the element <code>flush-strategy</code> 
    */
   public String getFlushStrategy();

   /**
    * Removes the <code>flush-strategy</code> element 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeFlushStrategy();

 
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
