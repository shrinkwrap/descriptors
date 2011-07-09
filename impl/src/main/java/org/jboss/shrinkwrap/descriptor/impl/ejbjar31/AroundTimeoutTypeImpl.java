package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The around-timeout type specifies a method on a
 * class to be called during the around-timeout portion of
 * a timer timeout callback. Note that each class may have
 * only one around-timeout method and that the method may not
 * be overloaded.
 *
 * If the class element is missing then
 * the class defining the callback is assumed to be the
 * interceptor class or component class in scope at the
 * location in the descriptor in which the around-timeout
 * definition appears.
 *
 *
 *
 */
public class AroundTimeoutTypeImpl<T> implements Child<T>, AroundTimeoutType<T>
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

   public AroundTimeoutTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public AroundTimeoutTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public AroundTimeoutType<T> setClazz(String clazz)
   {
      childNode.getOrCreate("class").text(clazz);
      return this;
   }

   public AroundTimeoutType<T> removeClazz()
   {
      childNode.remove("class");
      return this;
   }

   public String getClazz()
   {
      return childNode.textValue("class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public AroundTimeoutType<T> setMethodName(String methodName)
   {
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   public AroundTimeoutType<T> removeMethodName()
   {
      childNode.remove("method-name");
      return this;
   }

   public String getMethodName()
   {
      return childNode.textValue("method-name");
   }

}
