package org.jboss.shrinkwrap.descriptor.api.application5; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> moduleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-04-28T09:04:01.259+02:00
 */
public interface MutableModuleType<P> extends Child<P>
{
   public ModuleType<P> toImmutable();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeMutable ElementName: xsd:token ElementType : connector
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connector</code> element
    * @param connector the value for the element <code>connector</code> 
    * @return the current instance of <code>ModuleTypeMutable<RETURNTYPE, P></code> 
    */
   public MutableModuleType<P> connector(String connector);

   /**
    * Returns the <code>connector</code> element
    * @return the node defined for the element <code>connector</code> 
    */
   public String getConnector();

   /**
    * Removes the <code>connector</code> element 
    * @return the current instance of <code>ModuleTypeMutable<RETURNTYPE, P></code> 
    */
   public MutableModuleType<P> removeConnector();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeMutable ElementName: xsd:token ElementType : ejb
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb</code> element
    * @param ejb the value for the element <code>ejb</code> 
    * @return the current instance of <code>ModuleTypeMutable<RETURNTYPE, P></code> 
    */
   public MutableModuleType<P> ejb(String ejb);

   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public String getEjb();

   /**
    * Removes the <code>ejb</code> element 
    * @return the current instance of <code>ModuleTypeMutable<RETURNTYPE, P></code> 
    */
   public MutableModuleType<P> removeEjb();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeMutable ElementName: xsd:token ElementType : java
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>java</code> element
    * @param java the value for the element <code>java</code> 
    * @return the current instance of <code>ModuleTypeMutable<RETURNTYPE, P></code> 
    */
   public MutableModuleType<P> java(String java);

   /**
    * Returns the <code>java</code> element
    * @return the node defined for the element <code>java</code> 
    */
   public String getJava();

   /**
    * Removes the <code>java</code> element 
    * @return the current instance of <code>ModuleTypeMutable<RETURNTYPE, P></code> 
    */
   public MutableModuleType<P> removeJava();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeMutable ElementName: javaee:webType ElementType : web
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>web</code> element.
    * @return  the existing instance of <code>WebType<ModuleTypeMutable<RETURNTYPE, P>></code>, or null if not found
    */
   public MutableWebType<MutableModuleType<P>> getWeb();

   /**
    * If not already created, a new <code>web</code> element with the given value will be created.
    * Otherwise, the existing <code>web</code> element will be returned.
    * @return 
    * @return  a new or existing instance of <code>WebType<ModuleTypeMutable<RETURNTYPE, P>></code> 
    */
   public MutableWebType<MutableModuleType<P>> getOrCreateWeb();
   
   /**
    * Removes the <code>web</code> element 
    * @return the current instance of <code>ModuleTypeMutable<RETURNTYPE, P></code> 
    */
   public MutableModuleType<P> removeWeb();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeMutable ElementName: xsd:token ElementType : alt-dd
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>alt-dd</code> element
    * @param altDd the value for the element <code>alt-dd</code> 
    * @return the current instance of <code>ModuleTypeMutable<RETURNTYPE, P></code> 
    */
   public MutableModuleType<P> altDd(String altDd);

   /**
    * Returns the <code>alt-dd</code> element
    * @return the node defined for the element <code>alt-dd</code> 
    */
   public String getAltDd();

   /**
    * Removes the <code>alt-dd</code> element 
    * @return the current instance of <code>ModuleTypeMutable<RETURNTYPE, P></code> 
    */
   public MutableModuleType<P> removeAltDd();
}
