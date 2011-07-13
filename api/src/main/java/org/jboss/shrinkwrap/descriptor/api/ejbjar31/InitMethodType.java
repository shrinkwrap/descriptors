package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 */
public interface InitMethodType<T> extends Child<T> {

	public InitMethodType<T> removeCreateMethod();

	public NamedMethodType<InitMethodType<T>> createMethod();

	public InitMethodType<T> removeBeanMethod();

	public NamedMethodType<InitMethodType<T>> beanMethod();

}
