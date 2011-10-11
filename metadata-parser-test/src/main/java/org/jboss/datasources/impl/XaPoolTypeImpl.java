package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.datasources.api.XaPoolType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> xa-poolType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
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
   // ClassName: XaPoolType ElementName: xsd:nonNegativeInteger ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> minPoolSize(Integer minPoolSize)
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
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeMinPoolSize()
   {
      childNode.removeChildren("min-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:nonNegativeInteger ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> maxPoolSize(Integer maxPoolSize)
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
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeMaxPoolSize()
   {
      childNode.removeChildren("max-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : prefill
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>prefill</code> element
    * @param prefill the value for the element <code>prefill</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> prefill(Boolean prefill)
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
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removePrefill()
   {
      childNode.removeChildren("prefill");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:boolean ElementType : use-strict-min
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-strict-min</code> element
    * @param useStrictMin the value for the element <code>use-strict-min</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> useStrictMin(Boolean useStrictMin)
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
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeUseStrictMin()
   {
      childNode.removeChildren("use-strict-min");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaPoolType ElementName: xsd:token ElementType : flush-strategy
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>flush-strategy</code> element
    * @param flushStrategy the value for the element <code>flush-strategy</code> 
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> flushStrategy(String flushStrategy)
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
    * @return the current instance of <code>XaPoolType<T></code> 
    */
   public XaPoolType<T> removeFlushStrategy()
   {
      childNode.removeChildren("flush-strategy");
      return this;
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
