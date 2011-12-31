package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.ironjacamar.api.ConfigPropertyType;
/**
 * This interface defines the contract for the <code> extensionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
 */
public interface ExtensionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensionType ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element with the given value will be created.
    * Otherwise, the existing <code>config-property</code> element will be returned.
    * @return  a new or existing instance of <code>ConfigPropertyType<ExtensionType<T>></code> 
    */
   public ConfigPropertyType<ExtensionType<T>> getOrCreateConfigProperty();

   /**
    * Removes the <code>config-property</code> element 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> removeConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensionType ElementName: xs:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class-name</code> element with the given value will be created.
    * Otherwise, the existing <code>class-name</code> element will be returned.
    * @return  a new or existing instance of <code>Token<ExtensionType<T>></code> 
    */
   public Token<ExtensionType<T>> getOrCreateClassName();

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> removeClassName();
}
