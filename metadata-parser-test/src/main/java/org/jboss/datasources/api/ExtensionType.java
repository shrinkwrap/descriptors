package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.datasources.api.ConfigPropertyType;
/**
 * This interface defines the contract for the <code> extensionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public interface ExtensionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensionType ElementName: datasources:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ExtensionType<T>> getOrCreateConfigProperty();

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ExtensionType<T>></code> 
    */
   public ConfigPropertyType<ExtensionType<T>> createConfigProperty();

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ExtensionType<T>>> getAllConfigProperty();

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ExtensionType<T>></code> 
    */
   public ExtensionType<T> removeAllConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensionType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> attribute
    * @param className the value for the attribute <code>class-name</code> 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> className(String className);

   /**
    * Returns the <code>class-name</code> attribute
    * @return the value defined for the attribute <code>class-name</code> 
    */
   public String getClassName();

   /**
    * Removes the <code>class-name</code> attribute 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> removeClassName();
}
