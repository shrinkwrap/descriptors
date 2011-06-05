package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryMethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class QueryMethodTypeImpl<T> implements Child<T>, QueryMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String methodName;
   private MethodParamsType<QueryMethodType<T>> methodParams;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public QueryMethodTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("query-method");   }


   public T up()
   {
      return t;
   }



   public QueryMethodType<T> setMethodName(String methodName)
   {
      this.methodName = methodName;
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   public String getMethodName()
   {
      return methodName;
   }



   public QueryMethodType<T> setMethodParams(MethodParamsType<QueryMethodType<T>> methodParams)
   {
      this.methodParams = methodParams;
      childNode.getOrCreate("method-params").text(methodParams);
      return this;
   }

   public MethodParamsType<QueryMethodType<T>> getMethodParams()
   {
      if( methodParams == null)
      {
          methodParams = new MethodParamsTypeImpl<QueryMethodType<T>>(this, "", childNode);
      }
      return methodParams;
   }


}
