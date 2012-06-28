package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.application5.WebType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;


/**
 * This class implements the <code> moduleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public class ModuleTypeImpl<T> implements Child<T>, ModuleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ModuleTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ModuleTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public  T  up()
   {
      return  t ;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: xsd:token ElementType : connector
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connector</code> element
    * @param connector the value for the element <code>connector</code> 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> connector(String connector)
   {
      childNode.getOrCreate("connector").text(connector);
      return this;
   }

   /**
    * Returns the <code>connector</code> element
    * @return the node defined for the element <code>connector</code> 
    */
   public String getConnector()
   {
      return childNode.getTextValueForPatternName("connector");
   }

   /**
    * Removes the <code>connector</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeConnector()
   {
      childNode.removeChildren("connector");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: xsd:token ElementType : ejb
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb</code> element
    * @param ejb the value for the element <code>ejb</code> 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> ejb(String ejb)
   {
      childNode.getOrCreate("ejb").text(ejb);
      return this;
   }

   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public String getEjb()
   {
      return childNode.getTextValueForPatternName("ejb");
   }

   /**
    * Removes the <code>ejb</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeEjb()
   {
      childNode.removeChildren("ejb");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: xsd:token ElementType : java
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>java</code> element
    * @param java the value for the element <code>java</code> 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> java(String java)
   {
      childNode.getOrCreate("java").text(java);
      return this;
   }

   /**
    * Returns the <code>java</code> element
    * @return the node defined for the element <code>java</code> 
    */
   public String getJava()
   {
      return childNode.getTextValueForPatternName("java");
   }

   /**
    * Removes the <code>java</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeJava()
   {
      childNode.removeChildren("java");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: javaee:webType ElementType : web
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>web</code> element.
    * @return  the existing instance of <code>WebType<ModuleType<T>></code>, or null if not found
    */
   public WebType<ModuleType<T>> getWeb()
   {
      Node node = childNode.getSingle("web");
      if (node != null)
      {
         return new WebTypeImpl<ModuleType<T>>(this, "web", childNode, node);
      }
      return null;
   }

   /**
    * If not already created, a new <code>web</code> element with the given value will be created.
    * Otherwise, the existing <code>web</code> element will be returned.
    * @return  a new or existing instance of <code>WebType<ModuleType<T>></code> 
    */
   public WebType<ModuleType<T>> getOrCreateWeb()
   {
      Node node = childNode.getOrCreate("web");
      WebType<ModuleType<T>> web = new WebTypeImpl<ModuleType<T>>(this, "web", childNode, node);
      return web;
   }

   /**
    * Removes the <code>web</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeWeb()
   {
      childNode.removeChildren("web");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleType ElementName: xsd:token ElementType : alt-dd
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>alt-dd</code> element
    * @param altDd the value for the element <code>alt-dd</code> 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> altDd(String altDd)
   {
      childNode.getOrCreate("alt-dd").text(altDd);
      return this;
   }

   /**
    * Returns the <code>alt-dd</code> element
    * @return the node defined for the element <code>alt-dd</code> 
    */
   public String getAltDd()
   {
      return childNode.getTextValueForPatternName("alt-dd");
   }

   /**
    * Removes the <code>alt-dd</code> element 
    * @return the current instance of <code>ModuleType<T></code> 
    */
   public ModuleType<T> removeAltDd()
   {
      childNode.removeChildren("alt-dd");
      return this;
   }
}
