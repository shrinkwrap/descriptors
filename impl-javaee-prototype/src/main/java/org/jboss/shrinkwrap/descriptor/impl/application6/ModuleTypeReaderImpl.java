package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleTypeReader;
import org.jboss.shrinkwrap.descriptor.api.application5.WebTypeReader;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;


/**
 * This class implements the <code> moduleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public class ModuleTypeReaderImpl<T> implements Child<T>, ModuleTypeReader<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ModuleTypeReaderImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ModuleTypeReaderImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public  T  up()
   {
      return  t ;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: xsd:token ElementType : connector
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>connector</code> element
    * @return the node defined for the element <code>connector</code> 
    */
   public String getConnector()
   {
      return childNode.getTextValueForPatternName("connector");
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: xsd:token ElementType : ejb
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public String getEjb()
   {
      return childNode.getTextValueForPatternName("ejb");
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: xsd:token ElementType : java
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>java</code> element
    * @return the node defined for the element <code>java</code> 
    */
   public String getJava()
   {
      return childNode.getTextValueForPatternName("java");
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: javaee:webType ElementType : web
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>web</code> element.
    * @return  the existing instance of <code>WebTypeReader<ModuleTypeReader<T>></code>, or null if not found
    */
   public WebTypeReader<ModuleTypeReader<T>> getWeb()
   {
      Node node = childNode.getSingle("web");
      if (node != null)
      {
         return new WebTypeReaderImpl<ModuleTypeReader<T>>(this, "web", childNode, node);
      }
      return null;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ModuleTypeReader ElementName: xsd:token ElementType : alt-dd
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>alt-dd</code> element
    * @return the node defined for the element <code>alt-dd</code> 
    */
   public String getAltDd()
   {
      return childNode.getTextValueForPatternName("alt-dd");
   }
}
