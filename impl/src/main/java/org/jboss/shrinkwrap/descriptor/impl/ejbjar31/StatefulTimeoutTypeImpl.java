package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.StatefulTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimeUnitTypeType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The stateful-timeoutType represents the amount of time
 * a stateful session bean can be idle(not receive any client
 * invocations) before it is eligible for removal by the container.
 *
 * A timeout value of 0 means the bean is immediately eligible for removal.
 *
 * A timeout value of -1 means the bean will never be removed due to timeout.
 *
 *
 *
 */
public class StatefulTimeoutTypeImpl<T> implements Child<T>, StatefulTimeoutType<T>
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

   public StatefulTimeoutTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public StatefulTimeoutTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
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
   public StatefulTimeoutType<T> setTimeout(Integer timeout)
   {
      childNode.getOrCreate("timeout").text(timeout);
      return this;
   }

   public StatefulTimeoutType<T> removeTimeout()
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
   public StatefulTimeoutType<T> setUnit(TimeUnitTypeType unit)
   {
      childNode.getOrCreate("unit").text(unit);
      return this;
   }

   public StatefulTimeoutType<T> setUnit(String unit)
   {
      childNode.getOrCreate("unit").text(unit);
      return this;
   }

   public TimeUnitTypeType getUnit()
   {
      return TimeUnitTypeType.getFromStringValue(childNode.textValue("unit"));
   }

   public String getUnitAsString()
   {
      return childNode.textValue("unit");
   }

}
