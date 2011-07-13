/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodIntfType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> methodType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 *<br>
 * The methodType is used to denote a method of an enterprise <br> 
 * bean's business, home, component, and/or web service endpoint <br> 
 * interface, or, in the case of a message-driven bean, the <br> 
 * bean's message listener method, or a set of such <br> 
 * methods. The ejb-name element must be the name of one of the <br> 
 * enterprise beans declared in the deployment descriptor; the <br> 
 * optional method-intf element allows to distinguish between a <br> 
 * method with the same signature that is multiply defined <br> 
 * across the business, home, component, and/or web service <br> 
 * endpoint nterfaces; the method-name element specifies the <br> 
 * method name; and the optional method-params elements identify <br> 
 * a single method among multiple methods with an overloaded <br> 
 * method name. <br> 
 *<br>
 * There are three possible styles of using methodType element <br> 
 * within a method element: <br> 
 *<br>
 * 1. <br> 
 * <method> <br> 
 * <ejb-name>EJBNAME</ejb-name> <br> 
 * <method-name>*</method-name> <br> 
 * </method> <br> 
 *<br>
 * This style is used to refer to all the methods of the <br> 
 * specified enterprise bean's business, home, component, <br> 
 * and/or web service endpoint interfaces. <br> 
 *<br>
 * 2. <br> 
 * <method> <br> 
 * <ejb-name>EJBNAME</ejb-name> <br> 
 * <method-name>METHOD</method-name> <br> 
 * </method> <br> 
 *<br>
 * This style is used to refer to the specified method of <br> 
 * the specified enterprise bean. If there are multiple <br> 
 * methods with the same overloaded name, the element of <br> 
 * this style refers to all the methods with the overloaded <br> 
 * name. <br> 
 *<br>
 * 3. <br> 
 * <method> <br> 
 * <ejb-name>EJBNAME</ejb-name> <br> 
 * <method-name>METHOD</method-name> <br> 
 * <method-params> <br> 
 * <method-param>PARAM-1</method-param> <br> 
 * <method-param>PARAM-2</method-param> <br> 
 * ... <br> 
 * <method-param>PARAM-n</method-param> <br> 
 * </method-params> <br> 
 * </method> <br> 
 *<br>
 * This style is used to refer to a single method within a <br> 
 * set of methods with an overloaded name. PARAM-1 through <br> 
 * PARAM-n are the fully-qualified Java types of the <br> 
 * method's input parameters (if the method has no input <br> 
 * arguments, the method-params element contains no <br> 
 * method-param elements). Arrays are specified by the <br> 
 * array element's type, followed by one or more pair of <br> 
 * square brackets (e.g. int[][]). If there are multiple <br> 
 * methods with the same overloaded name, this style refers <br> 
 * to all of the overloaded methods. <br> 
 *<br>
 * Examples: <br> 
 *<br>
 * Style 1: The following method element refers to all the <br> 
 * methods of the EmployeeService bean's business, home, <br> 
 * component, and/or web service endpoint interfaces: <br> 
 *<br>
 * <method> <br> 
 * <ejb-name>EmployeeService</ejb-name> <br> 
 * <method-name>*</method-name> <br> 
 * </method> <br> 
 *<br>
 * Style 2: The following method element refers to all the <br> 
 * create methods of the EmployeeService bean's home <br> 
 * interface(s). <br> 
 *<br>
 * <method> <br> 
 * <ejb-name>EmployeeService</ejb-name> <br> 
 * <method-name>create</method-name> <br> 
 * </method> <br> 
 *<br>
 * Style 3: The following method element refers to the <br> 
 * create(String firstName, String LastName) method of the <br> 
 * EmployeeService bean's home interface(s). <br> 
 *<br>
 * <method> <br> 
 * <ejb-name>EmployeeService</ejb-name> <br> 
 * <method-name>create</method-name> <br> 
 * <method-params> <br> 
 * <method-param>java.lang.String</method-param> <br> 
 * <method-param>java.lang.String</method-param> <br> 
 * </method-params> <br> 
 * </method> <br> 
 *<br>
 * The following example illustrates a Style 3 element with <br> 
 * more complex parameter types. The method <br> 
 * foobar(char s, int i, int[] iar, mypackage.MyClass mycl, <br> 
 * mypackage.MyClass[][] myclaar) would be specified as: <br> 
 *<br>
 * <method> <br> 
 * <ejb-name>EmployeeService</ejb-name> <br> 
 * <method-name>foobar</method-name> <br> 
 * <method-params> <br> 
 * <method-param>char</method-param> <br> 
 * <method-param>int</method-param> <br> 
 * <method-param>int[]</method-param> <br> 
 * <method-param>mypackage.MyClass</method-param> <br> 
 * <method-param>mypackage.MyClass[][]</method-param> <br> 
 * </method-params> <br> 
 * </method> <br> 
 *<br>
 * The optional method-intf element can be used when it becomes <br> 
 * necessary to differentiate between a method that is multiply <br> 
 * defined across the enterprise bean's business, home, component, <br> 
 * and/or web service endpoint interfaces with the same name and <br> 
 * signature. However, if the same method is a method of both the <br> 
 * local business interface, and the local component interface, <br> 
 * the same attribute applies to the method for both interfaces. <br> 
 * Likewise, if the same method is a method of both the remote <br> 
 * business interface and the remote component interface, the same <br> 
 * attribute applies to the method for both interfaces. <br> 
 *<br>
 * For example, the method element <br> 
 *<br>
 * <method> <br> 
 * <ejb-name>EmployeeService</ejb-name> <br> 
 * <method-intf>Remote</method-intf> <br> 
 * <method-name>create</method-name> <br> 
 * <method-params> <br> 
 * <method-param>java.lang.String</method-param> <br> 
 * <method-param>java.lang.String</method-param> <br> 
 * </method-params> <br> 
 * </method> <br> 
 *<br>
 * can be used to differentiate the create(String, String) <br> 
 * method defined in the remote interface from the <br> 
 * create(String, String) method defined in the remote home <br> 
 * interface, which would be defined as <br> 
 *<br>
 * <method> <br> 
 * <ejb-name>EmployeeService</ejb-name> <br> 
 * <method-intf>Home</method-intf> <br> 
 * <method-name>create</method-name> <br> 
 * <method-params> <br> 
 * <method-param>java.lang.String</method-param> <br> 
 * <method-param>java.lang.String</method-param> <br> 
 * </method-params> <br> 
 * </method> <br> 
 *<br>
 * and the create method that is defined in the local home <br> 
 * interface which would be defined as <br> 
 *<br>
 * <method> <br> 
 * <ejb-name>EmployeeService</ejb-name> <br> 
 * <method-intf>LocalHome</method-intf> <br> 
 * <method-name>create</method-name> <br> 
 * <method-params> <br> 
 * <method-param>java.lang.String</method-param> <br> 
 * <method-param>java.lang.String</method-param> <br> 
 * </method-params> <br> 
 * </method> <br> 
 *<br>
 * The method-intf element can be used with all three Styles <br> 
 * of the method element usage. For example, the following <br> 
 * method element example could be used to refer to all the <br> 
 * methods of the EmployeeService bean's remote home interface <br> 
 * and the remote business interface. <br> 
 *<br>
 * <method> <br> 
 * <ejb-name>EmployeeService</ejb-name> <br> 
 * <method-intf>Home</method-intf> <br> 
 * <method-name>*</method-name> <br> 
 * </method> <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class MethodTypeImpl<T> implements Child<T>, MethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MethodTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MethodTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
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

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
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

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName()
   {
      return childNode.textValue("ejb-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-intf
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-intf</code> element with the given value will be created.
    * Otherwise, the existing <code>method-intf</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setMethodIntf(MethodIntfType methodIntf)
   {
      childNode.getOrCreate("method-intf").text(methodIntf);
      return this;
   }

   /**
    * If not already created, a new <code>method-intf</code> element with the given value will be created.
    * Otherwise, the existing <code>method-intf</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setMethodIntf(String methodIntf)
   {
      childNode.getOrCreate("method-intf").text(methodIntf);
      return this;
   }

   /**
    * Returns the <code>method-intf</code> element
    * @return the node defined for the element <code>method-intf</code> 
    */
   public MethodIntfType getMethodIntf()
   {
      return MethodIntfType.getFromStringValue(childNode.textValue("method-intf"));
   }

   /**
    * Returns the <code>method-intf</code> element
    * @return the node defined for the element <code>method-intf</code> 
    */
   public String getMethodIntfAsString()
   {
      return childNode.textValue("method-intf");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-name</code> element with the given value will be created.
    * Otherwise, the existing <code>method-name</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setMethodName(String methodName)
   {
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeMethodName()
   {
      childNode.remove("method-name");
      return this;
   }

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName()
   {
      return childNode.textValue("method-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-params
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method-params</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeMethodParams()
   {
      childNode.remove("method-params");
      return this;
   }

   /**
    * If not already created, a new <code>method-params</code> element will be created and returned.
    * Otherwise, the existing <code>method-params</code> element will be returned.
    * @return the node defined for the element <code>method-params</code> 
    */
   public MethodParamsType<MethodType<T>> methodParams()
   {
      Node node = childNode.getOrCreate("method-params");
      MethodParamsType<MethodType<T>> methodParams = new MethodParamsTypeImpl<MethodType<T>>(this, "method-params",
            childNode, node);
      return methodParams;
   }

}
