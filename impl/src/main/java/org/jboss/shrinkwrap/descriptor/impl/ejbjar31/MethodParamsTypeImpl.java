package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The method-paramsType defines a list of the
 * fully-qualified Java type names of the method parameters.
 *
 *
 *
 */
public class MethodParamsTypeImpl<T> implements Child<T>, MethodParamsType<T>
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

   public MethodParamsTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MethodParamsTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : method-param
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodParamsType<T> setMethodParam(String methodParam)
   {
      childNode.create("method-param").text(methodParam);
      return this;
   }

   public MethodParamsType<T> setMethodParamList(String... values)
   {
      for (String name : values)
      {
         setMethodParam(name);
      }
      return this;
   }

   public MethodParamsType<T> removeAllMethodParam()
   {
      childNode.remove("method-param");
      return this;
   }

   public List<String> getMethodParamList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("method-param");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
