package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.ConnectionDefintionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.impl.ConfigPropertyTypeImpl;
import org.jboss.ironjacamar.api.PoolType;
import org.jboss.ironjacamar.impl.PoolTypeImpl;
import org.jboss.ironjacamar.api.XaPoolType;
import org.jboss.ironjacamar.impl.XaPoolTypeImpl;
import org.jboss.ironjacamar.api.SecurityType;
import org.jboss.ironjacamar.impl.SecurityTypeImpl;
import org.jboss.ironjacamar.api.ValidationType;
import org.jboss.ironjacamar.impl.ValidationTypeImpl;
import org.jboss.ironjacamar.api.RecoverType;
import org.jboss.ironjacamar.impl.RecoverTypeImpl;

/**
 * This class implements the <code> connection-defintionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
 */
public class ConnectionDefintionTypeImpl<T> implements Child<T>, ConnectionDefintionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConnectionDefintionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConnectionDefintionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ConnectionDefintionType<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ConfigPropertyTypeImpl<ConnectionDefintionType<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ConnectionDefintionType<T>></code> 
    */
   public ConfigPropertyType<ConnectionDefintionType<T>> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<ConnectionDefintionType<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ConnectionDefintionType<T>>> getAllConfigProperty()
   {
      List<ConfigPropertyType<ConnectionDefintionType<T>>> list = new ArrayList<ConfigPropertyType<ConnectionDefintionType<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<ConnectionDefintionType<T>>  type = new ConfigPropertyTypeImpl<ConnectionDefintionType<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ConnectionDefintionType<T>></code> 
    */
   public ConnectionDefintionType<T> removeAllConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:poolType ElementType : pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool</code> element with the given value will be created.
    * Otherwise, the existing <code>pool</code> element will be returned.
    * @return  a new or existing instance of <code>PoolType<ConnectionDefintionType<T>></code> 
    */
   public PoolType<ConnectionDefintionType<T>> getOrCreatePool()
   {
      Node node = childNode.getOrCreate("pool");
      PoolType<ConnectionDefintionType<T>> pool = new PoolTypeImpl<ConnectionDefintionType<T>>(this, "pool", childNode, node);
      return pool;
   }

   /**
    * Removes the <code>pool</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removePool()
   {
      childNode.removeChildren("pool");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:xa-poolType ElementType : xa-pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-pool</code> element with the given value will be created.
    * Otherwise, the existing <code>xa-pool</code> element will be returned.
    * @return  a new or existing instance of <code>XaPoolType<ConnectionDefintionType<T>></code> 
    */
   public XaPoolType<ConnectionDefintionType<T>> getOrCreateXaPool()
   {
      Node node = childNode.getOrCreate("xa-pool");
      XaPoolType<ConnectionDefintionType<T>> xaPool = new XaPoolTypeImpl<ConnectionDefintionType<T>>(this, "xa-pool", childNode, node);
      return xaPool;
   }

   /**
    * Removes the <code>xa-pool</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeXaPool()
   {
      childNode.removeChildren("xa-pool");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:securityType ElementType : security
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security</code> element with the given value will be created.
    * Otherwise, the existing <code>security</code> element will be returned.
    * @return  a new or existing instance of <code>SecurityType<ConnectionDefintionType<T>></code> 
    */
   public SecurityType<ConnectionDefintionType<T>> getOrCreateSecurity()
   {
      Node node = childNode.getOrCreate("security");
      SecurityType<ConnectionDefintionType<T>> security = new SecurityTypeImpl<ConnectionDefintionType<T>>(this, "security", childNode, node);
      return security;
   }

   /**
    * Removes the <code>security</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeSecurity()
   {
      childNode.removeChildren("security");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:timeoutType ElementType : timeout
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout</code> element will be returned.
    * @return  a new or existing instance of <code>TimeoutType<ConnectionDefintionType<T>></code> 
    */
   public TimeoutType<ConnectionDefintionType<T>> getOrCreateTimeout()
   {
      Node node = childNode.getOrCreate("timeout");
      TimeoutType<ConnectionDefintionType<T>> timeout = new TimeoutTypeImpl<ConnectionDefintionType<T>>(this, "timeout", childNode, node);
      return timeout;
   }

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeTimeout()
   {
      childNode.removeChildren("timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:validationType ElementType : validation
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validation</code> element with the given value will be created.
    * Otherwise, the existing <code>validation</code> element will be returned.
    * @return  a new or existing instance of <code>ValidationType<ConnectionDefintionType<T>></code> 
    */
   public ValidationType<ConnectionDefintionType<T>> getOrCreateValidation()
   {
      Node node = childNode.getOrCreate("validation");
      ValidationType<ConnectionDefintionType<T>> validation = new ValidationTypeImpl<ConnectionDefintionType<T>>(this, "validation", childNode, node);
      return validation;
   }

   /**
    * Removes the <code>validation</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeValidation()
   {
      childNode.removeChildren("validation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:recoverType ElementType : recovery
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recovery</code> element with the given value will be created.
    * Otherwise, the existing <code>recovery</code> element will be returned.
    * @return  a new or existing instance of <code>RecoverType<ConnectionDefintionType<T>></code> 
    */
   public RecoverType<ConnectionDefintionType<T>> getOrCreateRecovery()
   {
      Node node = childNode.getOrCreate("recovery");
      RecoverType<ConnectionDefintionType<T>> recovery = new RecoverTypeImpl<ConnectionDefintionType<T>>(this, "recovery", childNode, node);
      return recovery;
   }

   /**
    * Removes the <code>recovery</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeRecovery()
   {
      childNode.removeChildren("recovery");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: xs:boolean ElementType : use-ccm
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>use-ccm</code> element with the given value will be created.
    * Otherwise, the existing <code>use-ccm</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<ConnectionDefintionType<T>></code> 
    */
   public Boolean<ConnectionDefintionType<T>> getOrCreateUseCcm()
   {
      Node node = childNode.getOrCreate("use-ccm");
      Boolean<ConnectionDefintionType<T>> useCcm = new BooleanImpl<ConnectionDefintionType<T>>(this, "use-ccm", childNode, node);
      return useCcm;
   }

   /**
    * Removes the <code>use-ccm</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeUseCcm()
   {
      childNode.removeChildren("use-ccm");
      return this;
   }
}
