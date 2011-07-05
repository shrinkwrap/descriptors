package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.*;
import org.jboss.shrinkwrap.descriptor.impl.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.*;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The activation-config-propertyType contains a name/value
 * configuration property pair for a message-driven bean.
 *
 * The properties that are recognized for a particular
 * message-driven bean are determined by the messaging type.
 *
 *
 *
 */
public class ActivationConfigPropertyTypeImpl<T> implements Child<T>, ActivationConfigPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ActivationConfigPropertyTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ActivationConfigPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : activation-config-property-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ActivationConfigPropertyType<T> setActivationConfigPropertyName(String activationConfigPropertyName)
   {
      childNode.getOrCreate("activation-config-property-name").text(activationConfigPropertyName);
      return this;
   }
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyName()
   {
      childNode.remove("activation-config-property-name");
      return this;
   }

   public String getActivationConfigPropertyName()
   {
      return childNode.textValue("activation-config-property-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : activation-config-property-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ActivationConfigPropertyType<T> setActivationConfigPropertyValue(String activationConfigPropertyValue)
   {
      childNode.getOrCreate("activation-config-property-value").text(activationConfigPropertyValue);
      return this;
   }
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyValue()
   {
      childNode.remove("activation-config-property-value");
      return this;
   }

   public String getActivationConfigPropertyValue()
   {
      return childNode.textValue("activation-config-property-value");
   }

}