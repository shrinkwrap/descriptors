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
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The access-timeoutType represents the maximum amount of
 * time (in a given time unit) that the container should wait for
 * a concurrency lock before throwing a timeout exception to the
 * client.
 *
 * A timeout value of 0 means concurrent access is not permitted.
 *
 * A timeout value of -1 means wait indefinitely to acquire a lock.
 *
 *
 *
 */
public class AccessTimeoutTypeImpl<T> implements Child<T>, AccessTimeoutType<T>
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

   public AccessTimeoutTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public AccessTimeoutTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public AccessTimeoutType<T> setTimeout(Integer timeout)
   {
      childNode.getOrCreate("timeout").text(timeout);
      return this;
   }
   public AccessTimeoutType<T> removeTimeout()
   {
      childNode.remove("timeout");
      return this;
   }

   public Integer getTimeout()
   {
      return Integer.valueOf(childNode.textValue("timeout"));
   }



   // -------------------------------------------------------------------------------------||
   // Element type : unit
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public AccessTimeoutType<T> setUnit(TimeUnitTypeType unit)
   {
      childNode.getOrCreate("unit").text(unit);
      return this;
   }
   public AccessTimeoutType<T> setUnit(String unit)
   {
      childNode.getOrCreate("unit").text(unit);
      return this;
   }

   public TimeUnitTypeType getUnit()
   {
      return TimeUnitTypeType.getFromStringValue(childNode.textValue("unit"));
   }

   public String  getUnitAsString()
   {
      return childNode.textValue("unit");
   }

}
