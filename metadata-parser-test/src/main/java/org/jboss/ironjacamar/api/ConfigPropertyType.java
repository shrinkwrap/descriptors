package org.jboss.ironjacamar.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public interface ConfigPropertyType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: text ElementType : config-propertyType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the body text for the element <code>config-propertyType</code> 
    * @param configPropertyType the value for the body text <code>config-propertyType</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> text(String value);

   /**
    * Returns the body text of the element <code>config-propertyType</code> 
    * @return the value defined for the text <code>config-propertyType</code> 
    */
   public String getText();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeName();
}
