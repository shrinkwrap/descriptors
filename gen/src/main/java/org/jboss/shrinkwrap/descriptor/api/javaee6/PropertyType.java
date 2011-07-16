package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * Specifies a name/value pair.
 * 
 * 
 * 
 */
public interface PropertyType<T> extends Child<T> {

	public PropertyType<T> setName(String name);

	public PropertyType<T> removeName();

	public String getName();

	public PropertyType<T> setValue(String value);

	public PropertyType<T> removeValue();

	public String getValue();

}
