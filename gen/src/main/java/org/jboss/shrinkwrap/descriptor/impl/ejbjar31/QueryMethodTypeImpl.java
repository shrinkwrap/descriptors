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
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 * [
 * The query-method specifies the method for a finder or select
 * query.
 *
 * The method-name element specifies the name of a finder or select
 * method in the entity bean's implementation class.
 *
 * Each method-param must be defined for a query-method using the
 * method-params element.
 *
 * It is used by the query-method element.
 *
 * Example:
 *
 * <query>
 * <description>Method finds large orders</description>
 * <query-method>
 * <method-name>findLargeOrders</method-name>
 * <method-params></method-params>
 * </query-method>
 * <ejb-ql>
 * SELECT OBJECT(o) FROM Order o
 * WHERE o.amount &gt; 1000
 * </ejb-ql>
 * </query>
 *
 *
 *
 *
 */
public class QueryMethodTypeImpl<T> implements Child<T>, QueryMethodType<T>
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

   public QueryMethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public QueryMethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
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
   public QueryMethodType<T> setMethodName(String methodName)
   {
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }
   public QueryMethodType<T> removeMethodName()
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
   public QueryMethodType<T> removeMethodParams()
   {
      childNode.remove("method-params");
      return this;
   }

   public MethodParamsType<QueryMethodType<T>> methodParams()
   {
      Node node = childNode.getOrCreate("method-params");
      MethodParamsType<QueryMethodType<T>> methodParams = new MethodParamsTypeImpl<QueryMethodType<T>>(this, "method-params", childNode, node);
      return methodParams;
   }


}
