package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.*;
import org.jboss.shrinkwrap.descriptor.impl.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.*;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 */
public class NamedMethodTypeImpl<T> implements Child<T>, NamedMethodType<T>
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

   public NamedMethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public NamedMethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public NamedMethodType<T> setMethodName(String methodName)
   {
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }
   public NamedMethodType<T> removeMethodName()
   {
      childNode.remove("method-name");
      return this;
   }

   public String getMethodName()
   {
      return childNode.textValue("method-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : method-params
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public NamedMethodType<T> removeMethodParams()
   {
      childNode.remove("method-params");
      return this;
   }

   public MethodParamsType<NamedMethodType<T>> methodParams()
   {
      Node node = childNode.getOrCreate("method-params");
      MethodParamsType<NamedMethodType<T>> methodParams = new MethodParamsTypeImpl<NamedMethodType<T>>(this, "method-params", childNode, node);
      return methodParams;
   }


}