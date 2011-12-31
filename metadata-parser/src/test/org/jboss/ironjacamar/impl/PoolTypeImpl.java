package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.PoolType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> poolType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
 */
public class PoolTypeImpl<T> implements Child<T>, PoolType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PoolTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PoolTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xs:boolean ElementType : prefill
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>prefill</code> element with the given value will be created.
    * Otherwise, the existing <code>prefill</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<PoolType<T>></code> 
    */
   public Boolean<PoolType<T>> getOrCreatePrefill()
   {
      Node node = childNode.getOrCreate("prefill");
      Boolean<PoolType<T>> prefill = new BooleanImpl<PoolType<T>>(this, "prefill", childNode, node);
      return prefill;
   }

   /**
    * Removes the <code>prefill</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removePrefill()
   {
      childNode.removeChildren("prefill");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xs:boolean ElementType : use-strict-min
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>use-strict-min</code> element with the given value will be created.
    * Otherwise, the existing <code>use-strict-min</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<PoolType<T>></code> 
    */
   public Boolean<PoolType<T>> getOrCreateUseStrictMin()
   {
      Node node = childNode.getOrCreate("use-strict-min");
      Boolean<PoolType<T>> useStrictMin = new BooleanImpl<PoolType<T>>(this, "use-strict-min", childNode, node);
      return useStrictMin;
   }

   /**
    * Removes the <code>use-strict-min</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removeUseStrictMin()
   {
      childNode.removeChildren("use-strict-min");
      return this;
   }
}
