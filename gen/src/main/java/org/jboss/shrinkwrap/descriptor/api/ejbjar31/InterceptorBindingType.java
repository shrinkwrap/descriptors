package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * [ The interceptor-bindingType element describes the binding of interceptor
 * classes to beans within the ejb-jar or .war. It consists of :
 * 
 * - An optional description. - The name of an ejb within the module or the
 * wildcard value "*", which is used to define interceptors that are bound to
 * all beans in the ejb-jar or .war. - A list of interceptor classes that are
 * bound to the contents of the ejb-name element or a specification of the total
 * ordering over the interceptors defined for the given level and above. - An
 * optional exclude-default-interceptors element. If set to true, specifies that
 * default interceptors are not to be applied to a bean-class and/or business
 * method. - An optional exclude-class-interceptors element. If set to true,
 * specifies that class interceptors are not to be applied to a business method.
 * - An optional set of method elements for describing the name/params of a
 * method-level interceptor.
 * 
 * Interceptors bound to all classes using the wildcard syntax "*" are default
 * interceptors for the components in the ejb-jar or .war. In addition,
 * interceptors may be bound at the level of the bean class (class-level
 * interceptors) or business methods (method-level interceptors ).
 * 
 * The binding of interceptors to classes is additive. If interceptors are bound
 * at the class-level and/or default-level as well as the method-level, both
 * class-level and/or default-level as well as method-level will apply.
 * 
 * There are four possible styles of the interceptor element syntax :
 * 
 * 1. <interceptor-binding> <ejb-name>*</ejb-name>
 * <interceptor-class>INTERCEPTOR</interceptor-class> </interceptor-binding>
 * 
 * Specifying the ejb-name as the wildcard value "*" designates default
 * interceptors (interceptors that apply to all session and message-driven beans
 * contained in the ejb-jar or .war).
 * 
 * 2. <interceptor-binding> <ejb-name>EJBNAME</ejb-name>
 * <interceptor-class>INTERCEPTOR</interceptor-class> </interceptor-binding>
 * 
 * This style is used to refer to interceptors associated with the specified
 * enterprise bean(class-level interceptors).
 * 
 * 3. <interceptor-binding> <ejb-name>EJBNAME</ejb-name>
 * <interceptor-class>INTERCEPTOR</interceptor-class> <method>
 * <method-name>METHOD</method-name> </method> </interceptor-binding>
 * 
 * This style is used to associate a method-level interceptor with the specified
 * enterprise bean. If there are multiple methods with the same overloaded name,
 * the element of this style refers to all the methods with the overloaded name.
 * Method-level interceptors can only be associated with business methods of the
 * bean class. Note that the wildcard value "*" cannot be used to specify
 * method-level interceptors.
 * 
 * 4. <interceptor-binding> <ejb-name>EJBNAME</ejb-name>
 * <interceptor-class>INTERCEPTOR</interceptor-class> <method>
 * <method-name>METHOD</method-name> <method-params>
 * <method-param>PARAM-1</method-param> <method-param>PARAM-2</method-param> ...
 * <method-param>PARAM-N</method-param> </method-params> </method>
 * </interceptor-binding>
 * 
 * This style is used to associate a method-level interceptor with the specified
 * method of the specified enterprise bean. This style is used to refer to a
 * single method within a set of methods with an overloaded name. The values
 * PARAM-1 through PARAM-N are the fully-qualified Java types of the method's
 * input parameters (if the method has no input arguments, the method-params
 * element contains no method-param elements). Arrays are specified by the array
 * element's type, followed by one or more pair of square brackets (e.g.
 * int[][]).
 * 
 * 
 * 
 * 
 */
public interface InterceptorBindingType<T> extends Child<T> {

	public InterceptorBindingType<T> setDescription(String description);

	public InterceptorBindingType<T> setDescriptionList(String... values);

	public InterceptorBindingType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public InterceptorBindingType<T> setEjbName(String ejbName);

	public InterceptorBindingType<T> removeEjbName();

	public String getEjbName();

	public InterceptorBindingType<T> setExcludeDefaultInterceptors(
			Boolean excludeDefaultInterceptors);

	public InterceptorBindingType<T> removeExcludeDefaultInterceptors();

	public Boolean isExcludeDefaultInterceptors();

	public InterceptorBindingType<T> setExcludeClassInterceptors(
			Boolean excludeClassInterceptors);

	public InterceptorBindingType<T> removeExcludeClassInterceptors();

	public Boolean isExcludeClassInterceptors();

	public InterceptorBindingType<T> removeMethod();

	public NamedMethodType<InterceptorBindingType<T>> method();

	public InterceptorBindingType<T> setInterceptorClass(String interceptorClass);

	public InterceptorBindingType<T> setInterceptorClassList(String... values);

	public InterceptorBindingType<T> removeAllInterceptorClass();

	public List<String> getInterceptorClassList();

	public InterceptorBindingType<T> removeInterceptorOrder();

	public InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder();

}
