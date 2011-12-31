package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> poolType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
 */
public interface PoolType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xs:boolean ElementType : prefill
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>prefill</code> element with the given value will be created.
    * Otherwise, the existing <code>prefill</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<PoolType<T>></code> 
    */
   public Boolean<PoolType<T>> getOrCreatePrefill();

   /**
    * Removes the <code>prefill</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removePrefill();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xs:boolean ElementType : use-strict-min
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>use-strict-min</code> element with the given value will be created.
    * Otherwise, the existing <code>use-strict-min</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<PoolType<T>></code> 
    */
   public Boolean<PoolType<T>> getOrCreateUseStrictMin();

   /**
    * Removes the <code>use-strict-min</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removeUseStrictMin();
}
