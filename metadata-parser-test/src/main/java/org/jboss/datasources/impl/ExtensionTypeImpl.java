package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.datasources.api.ExtensionType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.ConfigPropertyType;
import org.jboss.datasources.impl.ConfigPropertyTypeImpl;

/**
 * This class implements the <code> extensionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
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
   // ClassName: ExtensionType ElementName: datasources:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ExtensionType<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ConfigPropertyTypeImpl<ExtensionType<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ExtensionType<T>></code> 
    */
   public ConfigPropertyType<ExtensionType<T>> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<ExtensionType<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ExtensionType<T>>> getAllConfigProperty()
   {
      List<ConfigPropertyType<ExtensionType<T>>> list = new ArrayList<ConfigPropertyType<ExtensionType<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<ExtensionType<T>>  type = new ConfigPropertyTypeImpl<ExtensionType<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ExtensionType<T>></code> 
    */
   public ExtensionType<T> removeAllConfigProperty()
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
