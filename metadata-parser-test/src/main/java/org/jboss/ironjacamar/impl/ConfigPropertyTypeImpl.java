package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public class ConfigPropertyTypeImpl<T> implements Child<T>, ConfigPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConfigPropertyTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConfigPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: text ElementType : config-propertyType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the body text for the element <code>config-propertyType</code> 
    * @param configPropertyType the value for the body text <code>config-propertyType</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> text(String value)
   {
      childNode.text(value);
      return this;
   }

   /**
    * Returns the body text of the element <code>config-propertyType</code> 
    * @return the value defined for the text <code>config-propertyType</code> 
    */
   public String getText()
   {
      return childNode.getText();
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
