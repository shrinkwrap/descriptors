package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class MethodTypeImpl<T> implements Child<T>, MethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String ejbName;
   private String methodIntf;
   private String methodName;
   private MethodParamsType<MethodType<T>> methodParams;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MethodTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("method");   }


   public T up()
   {
      return t;
   }



   public MethodType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public MethodType<T> setEjbName(String ejbName)
   {
      this.ejbName = ejbName;
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public String getEjbName()
   {
      return ejbName;
   }



   public MethodType<T> setMethodIntf(String methodIntf)
   {
      this.methodIntf = methodIntf;
      childNode.getOrCreate("method-intf").text(methodIntf);
      return this;
   }

   public String getMethodIntf()
   {
      return methodIntf;
   }



   public MethodType<T> setMethodName(String methodName)
   {
      this.methodName = methodName;
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   public String getMethodName()
   {
      return methodName;
   }



   public MethodType<T> setMethodParams(MethodParamsType<MethodType<T>> methodParams)
   {
      this.methodParams = methodParams;
      childNode.getOrCreate("method-params").text(methodParams);
      return this;
   }

   public MethodParamsType<MethodType<T>> getMethodParams()
   {
      if( methodParams == null)
      {
          methodParams = new MethodParamsTypeImpl<MethodType<T>>(this, "", childNode);
      }
      return methodParams;
   }


}
