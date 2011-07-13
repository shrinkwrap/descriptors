package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * The interceptor-orderType element describes a total ordering of interceptor
 * classes.
 * 
 * 
 */
public interface InterceptorOrderType<T> extends Child<T> {

	public InterceptorOrderType<T> setInterceptorClass(String interceptorClass);

	public InterceptorOrderType<T> setInterceptorClassList(String... values);

	public InterceptorOrderType<T> removeAllInterceptorClass();

	public List<String> getInterceptorClassList();

}
