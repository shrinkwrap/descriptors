package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class NamedMethodTypeImpl<T> implements Child<T>, NamedMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String methodName;
   private MethodParamsType<NamedMethodType<T>> methodParams;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public NamedMethodTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("method");   }


   public T up()
   {
      return t;
   }



   public NamedMethodType<T> setMethodName(String methodName)
   {
      this.methodName = methodName;
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   public String getMethodName()
   {
      return methodName;
   }



   public NamedMethodType<T> setMethodParams(MethodParamsType<NamedMethodType<T>> methodParams)
   {
      this.methodParams = methodParams;
      childNode.getOrCreate("method-params").text(methodParams);
      return this;
   }

   public MethodParamsType<NamedMethodType<T>> getMethodParams()
   {
      if( methodParams == null)
      {
          methodParams = new MethodParamsTypeImpl<NamedMethodType<T>>(this, "", childNode);
      }
      return methodParams;
   }


}
