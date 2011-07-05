package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

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
public interface MethodType<T> extends Child<T>
{

   public MethodType<T> setDescription(String description);
   public MethodType<T> setDescriptionList(String ... values);
   public MethodType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public MethodType<T> setEjbName(String ejbName);
   public MethodType<T> removeEjbName();

   public String getEjbName();



   public MethodType<T> setMethodIntf(MethodIntfType methodIntf);
   public MethodType<T> setMethodIntf(String methodIntf);

   public MethodIntfType getMethodIntf();
   public String  getMethodIntfAsString();



   public MethodType<T> setMethodName(String methodName);
   public MethodType<T> removeMethodName();

   public String getMethodName();



   public MethodType<T> removeMethodParams();

   public MethodParamsType<MethodType<T>> methodParams();


}
