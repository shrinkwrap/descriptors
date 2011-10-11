package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.datasources.api.PoolType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> poolType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
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
   // ClassName: PoolType ElementName: xsd:nonNegativeInteger ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> minPoolSize(Integer minPoolSize)
   {
      childNode.getOrCreate("min-pool-size").text(minPoolSize);
      return this;
   }

   /**
    * Returns the <code>min-pool-size</code> element
    * @return the node defined for the element <code>min-pool-size</code> 
    */
   public Integer getMinPoolSize()
   {
      if (childNode.getTextValueForPatternName("min-pool-size") != null && !childNode.getTextValueForPatternName("min-pool-size").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("min-pool-size"));
      }
      return null;
   }

   /**
    * Removes the <code>min-pool-size</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removeMinPoolSize()
   {
      childNode.removeChildren("min-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xsd:nonNegativeInteger ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> maxPoolSize(Integer maxPoolSize)
   {
      childNode.getOrCreate("max-pool-size").text(maxPoolSize);
      return this;
   }

   /**
    * Returns the <code>max-pool-size</code> element
    * @return the node defined for the element <code>max-pool-size</code> 
    */
   public Integer getMaxPoolSize()
   {
      if (childNode.getTextValueForPatternName("max-pool-size") != null && !childNode.getTextValueForPatternName("max-pool-size").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("max-pool-size"));
      }
      return null;
   }

   /**
    * Removes the <code>max-pool-size</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removeMaxPoolSize()
   {
      childNode.removeChildren("max-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xsd:boolean ElementType : prefill
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>prefill</code> element
    * @param prefill the value for the element <code>prefill</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> prefill(Boolean prefill)
   {
      childNode.getOrCreate("prefill").text(prefill);
      return this;
   }

   /**
    * Returns the <code>prefill</code> element
    * @return the node defined for the element <code>prefill</code> 
    */
   public Boolean isPrefill()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("prefill"));
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
   // ClassName: PoolType ElementName: xsd:boolean ElementType : use-strict-min
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-strict-min</code> element
    * @param useStrictMin the value for the element <code>use-strict-min</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> useStrictMin(Boolean useStrictMin)
   {
      childNode.getOrCreate("use-strict-min").text(useStrictMin);
      return this;
   }

   /**
    * Returns the <code>use-strict-min</code> element
    * @return the node defined for the element <code>use-strict-min</code> 
    */
   public Boolean isUseStrictMin()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("use-strict-min"));
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

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PoolType ElementName: xsd:token ElementType : flush-strategy
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>flush-strategy</code> element
    * @param flushStrategy the value for the element <code>flush-strategy</code> 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> flushStrategy(String flushStrategy)
   {
      childNode.getOrCreate("flush-strategy").text(flushStrategy);
      return this;
   }

   /**
    * Returns the <code>flush-strategy</code> element
    * @return the node defined for the element <code>flush-strategy</code> 
    */
   public String getFlushStrategy()
   {
      return childNode.getTextValueForPatternName("flush-strategy");
   }

   /**
    * Removes the <code>flush-strategy</code> element 
    * @return the current instance of <code>PoolType<T></code> 
    */
   public PoolType<T> removeFlushStrategy()
   {
      childNode.removeChildren("flush-strategy");
      return this;
   }
}
