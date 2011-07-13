package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public interface InjectionTargetType<T> extends Child<T> {

	public InjectionTargetType<T> setInjectionTargetClass(
			String injectionTargetClass);

	public InjectionTargetType<T> removeInjectionTargetClass();

	public String getInjectionTargetClass();

	public InjectionTargetType<T> setInjectionTargetName(
			String injectionTargetName);

	public InjectionTargetType<T> removeInjectionTargetName();

	public String getInjectionTargetName();

}
