package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.ExtensionType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.impl.ConfigPropertyTypeImpl;

/**
 * This class implements the <code> extensionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public class ExtensionTypeImpl<T> implements Child<T>, ExtensionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ExtensionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ExtensionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensionType ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element with the given value will be created.
    * Otherwise, the existing <code>config-property</code> element will be returned.
    * @return  a new or existing instance of <code>ConfigPropertyType<ExtensionType<T>></code> 
    */
   public ConfigPropertyType<ExtensionType<T>> getOrCreateConfigProperty()
   {
      Node node = childNode.getOrCreate("config-property");
      ConfigPropertyType<ExtensionType<T>> configProperty = new ConfigPropertyTypeImpl<ExtensionType<T>>(this, "config-property", childNode, node);
      return configProperty;
   }

   /**
    * Removes the <code>config-property</code> element 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> removeConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensionType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> attribute
    * @param className the value for the attribute <code>class-name</code> 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> className(String className)
   {
      childNode.attribute("class-name", className);
      return this;
   }

   /**
    * Returns the <code>class-name</code> attribute
    * @return the value defined for the attribute <code>class-name</code> 
    */
      public String getClassName()
   {
      return childNode.getAttribute("class-name");
   }

   /**
    * Removes the <code>class-name</code> attribute 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> removeClassName()
   {
      childNode.removeAttribute("class-name");
      return this;
   }
}
