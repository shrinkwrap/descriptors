package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The method-paramsType defines a list of the fully-qualified Java type names
 * of the method parameters.
 * 
 * 
 * 
 */
public interface MethodParamsType<T> extends Child<T> {

	public MethodParamsType<T> setMethodParam(String methodParam);

	public MethodParamsType<T> setMethodParamList(String... values);

	public MethodParamsType<T> removeAllMethodParam();

	public List<String> getMethodParamList();

}
