package org.jboss.shrinkwrap.descriptor.api.application5; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> moduleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public interface ModuleTypeReader<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: xsd:token ElementType : connector
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>connector</code> element
    * @return the node defined for the element <code>connector</code> 
    */
   public String getConnector();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: xsd:token ElementType : ejb
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public String getEjb();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: xsd:token ElementType : java
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>java</code> element
    * @return the node defined for the element <code>java</code> 
    */
   public String getJava();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: javaee:webType ElementType : web
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>web</code> element.
    * @return  the existing instance of <code>WebTypeReader<ModuleTypeReader<T>></code>, or null if not found
    */
   public WebTypeReader<ModuleTypeReader<T>> getWeb();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: xsd:token ElementType : alt-dd
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>alt-dd</code> element
    * @return the node defined for the element <code>alt-dd</code> 
    */
   public String getAltDd();
}
