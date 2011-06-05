package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class ParamValueTypeImpl<T> implements Child<T>, ParamValueType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String paramName;
   private String paramValue;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ParamValueTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("context-param");   }


   public T up()
   {
      return t;
   }



   public ParamValueType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public ParamValueType<T> setParamName(String paramName)
   {
      this.paramName = paramName;
      childNode.getOrCreate("param-name").text(paramName);
      return this;
   }

   public String getParamName()
   {
      return paramName;
   }



   public ParamValueType<T> setParamValue(String paramValue)
   {
      this.paramValue = paramValue;
      childNode.getOrCreate("param-value").text(paramValue);
      return this;
   }

   public String getParamValue()
   {
      return paramValue;
   }

}
