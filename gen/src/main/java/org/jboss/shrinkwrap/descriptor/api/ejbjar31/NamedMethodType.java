package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 */
public interface NamedMethodType<T> extends Child<T> {

	public NamedMethodType<T> setMethodName(String methodName);

	public NamedMethodType<T> removeMethodName();

	public String getMethodName();

	public NamedMethodType<T> removeMethodParams();

	public MethodParamsType<NamedMethodType<T>> methodParams();

}
