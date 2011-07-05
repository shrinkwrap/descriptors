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
 *
 * Original Documentation:
 *
 * [
 * The methodType is used to denote a method of an enterprise
 * bean's business, home, component, and/or web service endpoint
 * interface, or, in the case of a message-driven bean, the
 * bean's message listener method, or a set of such
 * methods. The ejb-name element must be the name of one of the
 * enterprise beans declared in the deployment descriptor; the
 * optional method-intf element allows to distinguish between a
 * method with the same signature that is multiply defined
 * across the business, home, component, and/or web service
 * endpoint nterfaces; the method-name element specifies the
 * method name; and the optional method-params elements identify
 * a single method among multiple methods with an overloaded
 * method name.
 *
 * There are three possible styles of using methodType element
 * within a method element:
 *
 * 1.
 * <method>
 * <ejb-name>EJBNAME</ejb-name>
 * <method-name>*</method-name>
 * </method>
 *
 * This style is used to refer to all the methods of the
 * specified enterprise bean's business, home, component,
 * and/or web service endpoint interfaces.
 *
 * 2.
 * <method>
 * <ejb-name>EJBNAME</ejb-name>
 * <method-name>METHOD</method-name>
 * </method>
 *
 * This style is used to refer to the specified method of
 * the specified enterprise bean. If there are multiple
 * methods with the same overloaded name, the element of
 * this style refers to all the methods with the overloaded
 * name.
 *
 * 3.
 * <method>
 * <ejb-name>EJBNAME</ejb-name>
 * <method-name>METHOD</method-name>
 * <method-params>
 * <method-param>PARAM-1</method-param>
 * <method-param>PARAM-2</method-param>
 * ...
 * <method-param>PARAM-n</method-param>
 * </method-params>
 * </method>
 *
 * This style is used to refer to a single method within a
 * set of methods with an overloaded name. PARAM-1 through
 * PARAM-n are the fully-qualified Java types of the
 * method's input parameters (if the method has no input
 * arguments, the method-params element contains no
 * method-param elements). Arrays are specified by the
 * array element's type, followed by one or more pair of
 * square brackets (e.g. int[][]). If there are multiple
 * methods with the same overloaded name, this style refers
 * to all of the overloaded methods.
 *
 * Examples:
 *
 * Style 1: The following method element refers to all the
 * methods of the EmployeeService bean's business, home,
 * component, and/or web service endpoint interfaces:
 *
 * <method>
 * <ejb-name>EmployeeService</ejb-name>
 * <method-name>*</method-name>
 * </method>
 *
 * Style 2: The following method element refers to all the
 * create methods of the EmployeeService bean's home
 * interface(s).
 *
 * <method>
 * <ejb-name>EmployeeService</ejb-name>
 * <method-name>create</method-name>
 * </method>
 *
 * Style 3: The following method element refers to the
 * create(String firstName, String LastName) method of the
 * EmployeeService bean's home interface(s).
 *
 * <method>
 * <ejb-name>EmployeeService</ejb-name>
 * <method-name>create</method-name>
 * <method-params>
 * <method-param>java.lang.String</method-param>
 * <method-param>java.lang.String</method-param>
 * </method-params>
 * </method>
 *
 * The following example illustrates a Style 3 element with
 * more complex parameter types. The method
 * foobar(char s, int i, int[] iar, mypackage.MyClass mycl,
 * mypackage.MyClass[][] myclaar) would be specified as:
 *
 * <method>
 * <ejb-name>EmployeeService</ejb-name>
 * <method-name>foobar</method-name>
 * <method-params>
 * <method-param>char</method-param>
 * <method-param>int</method-param>
 * <method-param>int[]</method-param>
 * <method-param>mypackage.MyClass</method-param>
 * <method-param>mypackage.MyClass[][]</method-param>
 * </method-params>
 * </method>
 *
 * The optional method-intf element can be used when it becomes
 * necessary to differentiate between a method that is multiply
 * defined across the enterprise bean's business, home, component,
 * and/or web service endpoint interfaces with the same name and
 * signature. However, if the same method is a method of both the
 * local business interface, and the local component interface,
 * the same attribute applies to the method for both interfaces.
 * Likewise, if the same method is a method of both the remote
 * business interface and the remote component interface, the same
 * attribute applies to the method for both interfaces.
 *
 * For example, the method element
 *
 * <method>
 * <ejb-name>EmployeeService</ejb-name>
 * <method-intf>Remote</method-intf>
 * <method-name>create</method-name>
 * <method-params>
 * <method-param>java.lang.String</method-param>
 * <method-param>java.lang.String</method-param>
 * </method-params>
 * </method>
 *
 * can be used to differentiate the create(String, String)
 * method defined in the remote interface from the
 * create(String, String) method defined in the remote home
 * interface, which would be defined as
 *
 * <method>
 * <ejb-name>EmployeeService</ejb-name>
 * <method-intf>Home</method-intf>
 * <method-name>create</method-name>
 * <method-params>
 * <method-param>java.lang.String</method-param>
 * <method-param>java.lang.String</method-param>
 * </method-params>
 * </method>
 *
 * and the create method that is defined in the local home
 * interface which would be defined as
 *
 * <method>
 * <ejb-name>EmployeeService</ejb-name>
 * <method-intf>LocalHome</method-intf>
 * <method-name>create</method-name>
 * <method-params>
 * <method-param>java.lang.String</method-param>
 * <method-param>java.lang.String</method-param>
 * </method-params>
 * </method>
 *
 * The method-intf element can be used with all three Styles
 * of the method element usage. For example, the following
 * method element example could be used to refer to all the
 * methods of the EmployeeService bean's remote home interface
 * and the remote business interface.
 *
 * <method>
 * <ejb-name>EmployeeService</ejb-name>
 * <method-intf>Home</method-intf>
 * <method-name>*</method-name>
 * </method>
 *
 *
 *
 *
 */
public class MethodTypeImpl<T> implements Child<T>, MethodType<T>
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

   public MethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public MethodType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public MethodType<T> removeAllDescription()
   {
      childNode.remove("description");
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



   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }
   public MethodType<T> removeEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   public String getEjbName()
   {
      return childNode.textValue("ejb-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : method-intf
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodType<T> setMethodIntf(MethodIntfType methodIntf)
   {
      childNode.getOrCreate("method-intf").text(methodIntf);
      return this;
   }
   public MethodType<T> setMethodIntf(String methodIntf)
   {
      childNode.getOrCreate("method-intf").text(methodIntf);
      return this;
   }

   public MethodIntfType getMethodIntf()
   {
      return MethodIntfType.getFromStringValue(childNode.textValue("method-intf"));
   }

   public String  getMethodIntfAsString()
   {
      return childNode.textValue("method-intf");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodType<T> setMethodName(String methodName)
   {
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }
   public MethodType<T> removeMethodName()
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
   public MethodType<T> removeMethodParams()
   {
      childNode.remove("method-params");
      return this;
   }

   public MethodParamsType<MethodType<T>> methodParams()
   {
      Node node = childNode.getOrCreate("method-params");
      MethodParamsType<MethodType<T>> methodParams = new MethodParamsTypeImpl<MethodType<T>>(this, "method-params", childNode, node);
      return methodParams;
   }


}
