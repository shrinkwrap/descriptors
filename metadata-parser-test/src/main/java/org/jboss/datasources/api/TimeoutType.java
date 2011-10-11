package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> timeoutType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public interface TimeoutType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : blocking-timeout-millis
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>blocking-timeout-millis</code> element
    * @param blockingTimeoutMillis the value for the element <code>blocking-timeout-millis</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> blockingTimeoutMillis(Integer blockingTimeoutMillis);

   /**
    * Returns the <code>blocking-timeout-millis</code> element
    * @return the node defined for the element <code>blocking-timeout-millis</code> 
    */
   public Integer getBlockingTimeoutMillis();

   /**
    * Removes the <code>blocking-timeout-millis</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeBlockingTimeoutMillis();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : idle-timeout-minutes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>idle-timeout-minutes</code> element
    * @param idleTimeoutMinutes the value for the element <code>idle-timeout-minutes</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> idleTimeoutMinutes(Integer idleTimeoutMinutes);

   /**
    * Returns the <code>idle-timeout-minutes</code> element
    * @return the node defined for the element <code>idle-timeout-minutes</code> 
    */
   public Integer getIdleTimeoutMinutes();

   /**
    * Removes the <code>idle-timeout-minutes</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeIdleTimeoutMinutes();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: javaee:emptyType ElementType : set-tx-query-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>set-tx-query-timeout</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> setTxQueryTimeout();

   /**
    * Removes the <code>set-tx-query-timeout</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public Boolean isSetTxQueryTimeout();

   /**
    * Removes the <code>set-tx-query-timeout</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeSetTxQueryTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : query-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>query-timeout</code> element
    * @param queryTimeout the value for the element <code>query-timeout</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> queryTimeout(Integer queryTimeout);

   /**
    * Returns the <code>query-timeout</code> element
    * @return the node defined for the element <code>query-timeout</code> 
    */
   public Integer getQueryTimeout();

   /**
    * Removes the <code>query-timeout</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeQueryTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : use-try-lock
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-try-lock</code> element
    * @param useTryLock the value for the element <code>use-try-lock</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> useTryLock(Integer useTryLock);

   /**
    * Returns the <code>use-try-lock</code> element
    * @return the node defined for the element <code>use-try-lock</code> 
    */
   public Integer getUseTryLock();

   /**
    * Removes the <code>use-try-lock</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeUseTryLock();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : allocation-retry
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allocation-retry</code> element
    * @param allocationRetry the value for the element <code>allocation-retry</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> allocationRetry(Integer allocationRetry);

   /**
    * Returns the <code>allocation-retry</code> element
    * @return the node defined for the element <code>allocation-retry</code> 
    */
   public Integer getAllocationRetry();

   /**
    * Removes the <code>allocation-retry</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeAllocationRetry();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : allocation-retry-wait-millis
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allocation-retry-wait-millis</code> element
    * @param allocationRetryWaitMillis the value for the element <code>allocation-retry-wait-millis</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> allocationRetryWaitMillis(Integer allocationRetryWaitMillis);

   /**
    * Returns the <code>allocation-retry-wait-millis</code> element
    * @return the node defined for the element <code>allocation-retry-wait-millis</code> 
    */
   public Integer getAllocationRetryWaitMillis();

   /**
    * Removes the <code>allocation-retry-wait-millis</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeAllocationRetryWaitMillis();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:token ElementType : xa-resource-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>xa-resource-timeout</code> element
    * @param xaResourceTimeout the value for the element <code>xa-resource-timeout</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> xaResourceTimeout(String xaResourceTimeout);

   /**
    * Returns the <code>xa-resource-timeout</code> element
    * @return the node defined for the element <code>xa-resource-timeout</code> 
    */
   public String getXaResourceTimeout();

   /**
    * Removes the <code>xa-resource-timeout</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeXaResourceTimeout();
}
