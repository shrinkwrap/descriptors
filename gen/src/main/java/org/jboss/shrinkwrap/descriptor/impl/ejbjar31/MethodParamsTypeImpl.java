package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class MethodParamsTypeImpl<T> implements Child<T>, MethodParamsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String methodParam;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MethodParamsTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("method-params");   }


   public T up()
   {
      return t;
   }



   public MethodParamsType<T> setMethodParam(String methodParam)
   {
      this.methodParam = methodParam;
      childNode.getOrCreate("method-param").text(methodParam);
      return this;
   }

   public String getMethodParam()
   {
      return methodParam;
   }

}
