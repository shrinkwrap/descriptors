package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public interface LifecycleCallbackType<T> extends Child<T> {

	public LifecycleCallbackType<T> setLifecycleCallbackClass(
			String lifecycleCallbackClass);

	public LifecycleCallbackType<T> removeLifecycleCallbackClass();

	public String getLifecycleCallbackClass();

	public LifecycleCallbackType<T> setLifecycleCallbackMethod(
			String lifecycleCallbackMethod);

	public LifecycleCallbackType<T> removeLifecycleCallbackMethod();

	public String getLifecycleCallbackMethod();

}
