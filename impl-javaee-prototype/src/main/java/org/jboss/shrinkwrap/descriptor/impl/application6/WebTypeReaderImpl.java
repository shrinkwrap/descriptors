package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application5.WebTypeReader;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;


/**
 * This class implements the <code> webType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public class WebTypeReaderImpl<T> implements Child<T>, WebTypeReader<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebTypeReaderImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public WebTypeReaderImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public  T  up()
   {
      return  t ;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebTypeReader ElementName: xsd:token ElementType : web-uri
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>web-uri</code> element
    * @return the node defined for the element <code>web-uri</code> 
    */
   public String getWebUri()
   {
      return childNode.getTextValueForPatternName("web-uri");
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebTypeReader ElementName: xsd:token ElementType : context-root
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>context-root</code> element
    * @return the node defined for the element <code>context-root</code> 
    */
   public String getContextRoot()
   {
      return childNode.getTextValueForPatternName("context-root");
   }
}
