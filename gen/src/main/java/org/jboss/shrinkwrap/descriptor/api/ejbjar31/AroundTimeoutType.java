package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The around-timeout type specifies a method on a class to be called during the
 * around-timeout portion of a timer timeout callback. Note that each class may
 * have only one around-timeout method and that the method may not be
 * overloaded.
 * 
 * If the class element is missing then the class defining the callback is
 * assumed to be the interceptor class or component class in scope at the
 * location in the descriptor in which the around-timeout definition appears.
 * 
 * 
 * 
 */
public interface AroundTimeoutType<T> extends Child<T> {

	public AroundTimeoutType<T> setClazz(String clazz);

	public AroundTimeoutType<T> removeClazz();

	public String getClazz();

	public AroundTimeoutType<T> setMethodName(String methodName);

	public AroundTimeoutType<T> removeMethodName();

	public String getMethodName();

}
