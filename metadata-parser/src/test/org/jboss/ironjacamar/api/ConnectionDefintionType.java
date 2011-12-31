package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.api.PoolType;
import org.jboss.ironjacamar.api.XaPoolType;
import org.jboss.ironjacamar.api.SecurityType;
import org.jboss.ironjacamar.api.ValidationType;
import org.jboss.ironjacamar.api.RecoverType;
/**
 * This interface defines the contract for the <code> connection-defintionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
 */
public interface ConnectionDefintionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ConnectionDefintionType<T>> getOrCreateConfigProperty();

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ConnectionDefintionType<T>></code> 
    */
   public ConfigPropertyType<ConnectionDefintionType<T>> createConfigProperty();

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ConnectionDefintionType<T>>> getAllConfigProperty();

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ConnectionDefintionType<T>></code> 
    */
   public ConnectionDefintionType<T> removeAllConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:poolType ElementType : pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool</code> element with the given value will be created.
    * Otherwise, the existing <code>pool</code> element will be returned.
    * @return  a new or existing instance of <code>PoolType<ConnectionDefintionType<T>></code> 
    */
   public PoolType<ConnectionDefintionType<T>> getOrCreatePool();

   /**
    * Removes the <code>pool</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removePool();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:xa-poolType ElementType : xa-pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-pool</code> element with the given value will be created.
    * Otherwise, the existing <code>xa-pool</code> element will be returned.
    * @return  a new or existing instance of <code>XaPoolType<ConnectionDefintionType<T>></code> 
    */
   public XaPoolType<ConnectionDefintionType<T>> getOrCreateXaPool();

   /**
    * Removes the <code>xa-pool</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeXaPool();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:securityType ElementType : security
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security</code> element with the given value will be created.
    * Otherwise, the existing <code>security</code> element will be returned.
    * @return  a new or existing instance of <code>SecurityType<ConnectionDefintionType<T>></code> 
    */
   public SecurityType<ConnectionDefintionType<T>> getOrCreateSecurity();

   /**
    * Removes the <code>security</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeSecurity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:timeoutType ElementType : timeout
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout</code> element will be returned.
    * @return  a new or existing instance of <code>TimeoutType<ConnectionDefintionType<T>></code> 
    */
   public TimeoutType<ConnectionDefintionType<T>> getOrCreateTimeout();

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:validationType ElementType : validation
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validation</code> element with the given value will be created.
    * Otherwise, the existing <code>validation</code> element will be returned.
    * @return  a new or existing instance of <code>ValidationType<ConnectionDefintionType<T>></code> 
    */
   public ValidationType<ConnectionDefintionType<T>> getOrCreateValidation();

   /**
    * Removes the <code>validation</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeValidation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: ironjacamar:recoverType ElementType : recovery
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recovery</code> element with the given value will be created.
    * Otherwise, the existing <code>recovery</code> element will be returned.
    * @return  a new or existing instance of <code>RecoverType<ConnectionDefintionType<T>></code> 
    */
   public RecoverType<ConnectionDefintionType<T>> getOrCreateRecovery();

   /**
    * Removes the <code>recovery</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeRecovery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: xs:boolean ElementType : use-ccm
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>use-ccm</code> element with the given value will be created.
    * Otherwise, the existing <code>use-ccm</code> element will be returned.
    * @return  a new or existing instance of <code>Boolean<ConnectionDefintionType<T>></code> 
    */
   public Boolean<ConnectionDefintionType<T>> getOrCreateUseCcm();

   /**
    * Removes the <code>use-ccm</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeUseCcm();
}
