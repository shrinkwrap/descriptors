package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The interceptorsType element declares one or more interceptor classes used by
 * components within this ejb-jar. The declaration consists of :
 * 
 * - An optional description. - One or more interceptor elements.
 * 
 * 
 * 
 */
public interface InterceptorsType<T> extends Child<T> {

	public InterceptorsType<T> setDescription(String description);

	public InterceptorsType<T> setDescriptionList(String... values);

	public InterceptorsType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public InterceptorsType<T> removeAllInterceptor();

	public InterceptorType<InterceptorsType<T>> interceptor();

	public List<InterceptorType<InterceptorsType<T>>> getInterceptorList();

}
