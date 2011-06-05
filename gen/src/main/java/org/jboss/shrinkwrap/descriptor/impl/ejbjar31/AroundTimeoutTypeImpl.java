package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class AroundTimeoutTypeImpl<T> implements Child<T>, AroundTimeoutType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String clazz;
   private String methodName;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public AroundTimeoutTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("around-timeout");   }


   public T up()
   {
      return t;
   }



   public AroundTimeoutType<T> setClazz(String clazz)
   {
      this.clazz = clazz;
      childNode.getOrCreate("class").text(clazz);
      return this;
   }

   public String getClazz()
   {
      return clazz;
   }



   public AroundTimeoutType<T> setMethodName(String methodName)
   {
      this.methodName = methodName;
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   public String getMethodName()
   {
      return methodName;
   }

}
