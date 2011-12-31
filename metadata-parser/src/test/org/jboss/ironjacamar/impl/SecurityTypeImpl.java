package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.SecurityType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> securityType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-12-13T22:30:01.697+01:00
 */
public class SecurityTypeImpl<T> implements Child<T>, SecurityType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecurityTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SecurityTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: ironjacamar:boolean-presenceType ElementType : application
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>application</code> element with the given value will be created.
    * Otherwise, the existing <code>application</code> element will be returned.
    * @return  a new or existing instance of <code>BooleanPresenceType<SecurityType<T>></code> 
    */
   public BooleanPresenceType<SecurityType<T>> getOrCreateApplication()
   {
      Node node = childNode.getOrCreate("application");
      BooleanPresenceType<SecurityType<T>> application = new BooleanPresenceTypeImpl<SecurityType<T>>(this, "application", childNode, node);
      return application;
   }

   /**
    * Removes the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeApplication()
   {
      childNode.removeChildren("application");
      return this;
   }
}
