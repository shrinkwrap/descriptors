package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class ParamValueTypeImpl<T> implements Child<T>, ParamValueType<T>
{
   public final static String nodeName = "context-param";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String paramName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String paramValue;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ParamValueTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ParamValueTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ParamValueType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ParamValueType<T> setDescription(String ... values)
   {
      for(String name: values)
      {
         setDescription(description);
      }
         return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ParamValueType<T> setParamName(String paramName)   {
      this.paramName = paramName;
      childNode.getOrCreate("param-name").text(paramName);
      return this;
   }

   public String getParamName()
   {
      return childNode.textValue("param-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ParamValueType<T> setParamValue(String paramValue)   {
      this.paramValue = paramValue;
      childNode.getOrCreate("param-value").text(paramValue);
      return this;
   }

   public String getParamValue()
   {
      return childNode.textValue("param-value");
   }

}
