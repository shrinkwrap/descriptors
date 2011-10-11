package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.AdminObjectType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.impl.ConfigPropertyTypeImpl;

/**
 * This class implements the <code> admin-objectType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public class AdminObjectTypeImpl<T> implements Child<T>, AdminObjectType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AdminObjectTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AdminObjectTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> attribute
    * @param className the value for the attribute <code>class-name</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> className(String className)
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
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removeClassName()
   {
      childNode.removeAttribute("class-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:token ElementType : jndi-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jndi-name</code> attribute
    * @param jndiName the value for the attribute <code>jndi-name</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> jndiName(String jndiName)
   {
      childNode.attribute("jndi-name", jndiName);
      return this;
   }

   /**
    * Returns the <code>jndi-name</code> attribute
    * @return the value defined for the attribute <code>jndi-name</code> 
    */
      public String getJndiName()
   {
      return childNode.getAttribute("jndi-name");
   }

   /**
    * Removes the <code>jndi-name</code> attribute 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removeJndiName()
   {
      childNode.removeAttribute("jndi-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:boolean ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> attribute
    * @param enabled the value for the attribute <code>enabled</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> enabled(Boolean enabled)
   {
      childNode.attribute("enabled", enabled);
      return this;
   }

   /**
    * Returns the <code>enabled</code> attribute
    * @return the value defined for the attribute <code>enabled</code> 
    */
   public Boolean isEnabled()
   {
      return Strings.isTrue(childNode.getAttribute("enabled"));
   }

   /**
    * Removes the <code>enabled</code> attribute 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removeEnabled()
   {
      childNode.removeAttribute("enabled");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:boolean ElementType : use-java-context
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-java-context</code> attribute
    * @param useJavaContext the value for the attribute <code>use-java-context</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> useJavaContext(Boolean useJavaContext)
   {
      childNode.attribute("use-java-context", useJavaContext);
      return this;
   }

   /**
    * Returns the <code>use-java-context</code> attribute
    * @return the value defined for the attribute <code>use-java-context</code> 
    */
   public Boolean isUseJavaContext()
   {
      return Strings.isTrue(childNode.getAttribute("use-java-context"));
   }

   /**
    * Removes the <code>use-java-context</code> attribute 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removeUseJavaContext()
   {
      childNode.removeAttribute("use-java-context");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:token ElementType : pool-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pool-name</code> attribute
    * @param poolName the value for the attribute <code>pool-name</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> poolName(String poolName)
   {
      childNode.attribute("pool-name", poolName);
      return this;
   }

   /**
    * Returns the <code>pool-name</code> attribute
    * @return the value defined for the attribute <code>pool-name</code> 
    */
      public String getPoolName()
   {
      return childNode.getAttribute("pool-name");
   }

   /**
    * Removes the <code>pool-name</code> attribute 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removePoolName()
   {
      childNode.removeAttribute("pool-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<AdminObjectType<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ConfigPropertyTypeImpl<AdminObjectType<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<AdminObjectType<T>></code> 
    */
   public ConfigPropertyType<AdminObjectType<T>> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<AdminObjectType<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<AdminObjectType<T>>> getAllConfigProperty()
   {
      List<ConfigPropertyType<AdminObjectType<T>>> list = new ArrayList<ConfigPropertyType<AdminObjectType<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<AdminObjectType<T>>  type = new ConfigPropertyTypeImpl<AdminObjectType<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<AdminObjectType<T>></code> 
    */
   public AdminObjectType<T> removeAllConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }
}
