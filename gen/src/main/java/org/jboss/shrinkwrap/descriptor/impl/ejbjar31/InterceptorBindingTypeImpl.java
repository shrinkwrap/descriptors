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
 * The interceptor-bindingType element describes the binding of
 * interceptor classes to beans within the ejb-jar or .war.
 * It consists of :
 *
 * - An optional description.
 * - The name of an ejb within the module or the wildcard value "*",
 * which is used to define interceptors that are bound to all
 * beans in the ejb-jar or .war.
 * - A list of interceptor classes that are bound to the contents of
 * the ejb-name element or a specification of the total ordering
 * over the interceptors defined for the given level and above.
 * - An optional exclude-default-interceptors element. If set to true,
 * specifies that default interceptors are not to be applied to
 * a bean-class and/or business method.
 * - An optional exclude-class-interceptors element. If set to true,
 * specifies that class interceptors are not to be applied to
 * a business method.
 * - An optional set of method elements for describing the name/params
 * of a method-level interceptor.
 *
 * Interceptors bound to all classes using the wildcard syntax
 * "*" are default interceptors for the components in the ejb-jar or .war.
 * In addition, interceptors may be bound at the level of the bean
 * class (class-level interceptors) or business methods (method-level
 * interceptors ).
 *
 * The binding of interceptors to classes is additive. If interceptors
 * are bound at the class-level and/or default-level as well as the
 * method-level, both class-level and/or default-level as well as
 * method-level will apply.
 *
 * There are four possible styles of the interceptor element syntax :
 *
 * 1.
 * <interceptor-binding>
 * <ejb-name>*</ejb-name>
 * <interceptor-class>INTERCEPTOR</interceptor-class>
 * </interceptor-binding>
 *
 * Specifying the ejb-name as the wildcard value "*" designates
 * default interceptors (interceptors that apply to all session and
 * message-driven beans contained in the ejb-jar or .war).
 *
 * 2.
 * <interceptor-binding>
 * <ejb-name>EJBNAME</ejb-name>
 * <interceptor-class>INTERCEPTOR</interceptor-class>
 * </interceptor-binding>
 *
 * This style is used to refer to interceptors associated with the
 * specified enterprise bean(class-level interceptors).
 *
 * 3.
 * <interceptor-binding>
 * <ejb-name>EJBNAME</ejb-name>
 * <interceptor-class>INTERCEPTOR</interceptor-class>
 * <method>
 * <method-name>METHOD</method-name>
 * </method>
 * </interceptor-binding>
 *
 * This style is used to associate a method-level interceptor with
 * the specified enterprise bean. If there are multiple methods
 * with the same overloaded name, the element of this style refers
 * to all the methods with the overloaded name. Method-level
 * interceptors can only be associated with business methods of the
 * bean class. Note that the wildcard value "*" cannot be used
 * to specify method-level interceptors.
 *
 * 4.
 * <interceptor-binding>
 * <ejb-name>EJBNAME</ejb-name>
 * <interceptor-class>INTERCEPTOR</interceptor-class>
 * <method>
 * <method-name>METHOD</method-name>
 * <method-params>
 * <method-param>PARAM-1</method-param>
 * <method-param>PARAM-2</method-param>
 * ...
 * <method-param>PARAM-N</method-param>
 * </method-params>
 * </method>
 * </interceptor-binding>
 *
 * This style is used to associate a method-level interceptor with
 * the specified method of the specified enterprise bean. This
 * style is used to refer to a single method within a set of methods
 * with an overloaded name. The values PARAM-1 through PARAM-N
 * are the fully-qualified Java types of the method's input parameters
 * (if the method has no input arguments, the method-params element
 * contains no method-param elements). Arrays are specified by the
 * array element's type, followed by one or more pair of square
 * brackets (e.g. int[][]).
 *
 *
 *
 *
 */
public class InterceptorBindingTypeImpl<T> implements Child<T>, InterceptorBindingType<T>
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

   public InterceptorBindingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public InterceptorBindingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
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
   public InterceptorBindingType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }
   public InterceptorBindingType<T> setDescriptionList(String ... values)
   {
      for(String name: values)
      {
         setDescription(name);
      }
      return this;
   }
   public InterceptorBindingType<T> removeAllDescription()
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
   public InterceptorBindingType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }
   public InterceptorBindingType<T> removeEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   public String getEjbName()
   {
      return childNode.textValue("ejb-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : exclude-default-interceptors
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InterceptorBindingType<T> setExcludeDefaultInterceptors(Boolean excludeDefaultInterceptors)
   {
      childNode.getOrCreate("exclude-default-interceptors").text(excludeDefaultInterceptors);
      return this;
   }
   public InterceptorBindingType<T> removeExcludeDefaultInterceptors()
   {
      childNode.remove("exclude-default-interceptors");
      return this;
   }

   public Boolean isExcludeDefaultInterceptors()
   {
      return Strings.isTrue(childNode.textValue("exclude-default-interceptors"));
   }



   // -------------------------------------------------------------------------------------||
   // Element type : exclude-class-interceptors
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InterceptorBindingType<T> setExcludeClassInterceptors(Boolean excludeClassInterceptors)
   {
      childNode.getOrCreate("exclude-class-interceptors").text(excludeClassInterceptors);
      return this;
   }
   public InterceptorBindingType<T> removeExcludeClassInterceptors()
   {
      childNode.remove("exclude-class-interceptors");
      return this;
   }

   public Boolean isExcludeClassInterceptors()
   {
      return Strings.isTrue(childNode.textValue("exclude-class-interceptors"));
   }



   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InterceptorBindingType<T> removeMethod()
   {
      childNode.remove("method");
      return this;
   }

   public NamedMethodType<InterceptorBindingType<T>> method()
   {
      Node node = childNode.getOrCreate("method");
      NamedMethodType<InterceptorBindingType<T>> method = new NamedMethodTypeImpl<InterceptorBindingType<T>>(this, "method", childNode, node);
      return method;
   }




   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-class
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InterceptorBindingType<T> setInterceptorClass(String interceptorClass)
   {
      childNode.create("interceptor-class").text(interceptorClass);
      return this;
   }
   public InterceptorBindingType<T> setInterceptorClassList(String ... values)
   {
      for(String name: values)
      {
         setInterceptorClass(name);
      }
      return this;
   }
   public InterceptorBindingType<T> removeAllInterceptorClass()
   {
      childNode.remove("interceptor-class");
      return this;
   }

public List<String> getInterceptorClassList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("interceptor-class");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-order
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InterceptorBindingType<T> removeInterceptorOrder()
   {
      childNode.remove("interceptor-order");
      return this;
   }

   public InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder()
   {
      Node node = childNode.getOrCreate("interceptor-order");
      InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder = new InterceptorOrderTypeImpl<InterceptorBindingType<T>>(this, "interceptor-order", childNode, node);
      return interceptorOrder;
   }


}
