package org.jboss.shrinkwrap.descriptor.api.persistence20;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * A name-value pair.
 * 
 * 
 */
public interface Property<T> extends Child<T> {

	public Property<T> setName(String name);

	public Property<T> removeName();

	public String getName();

	public Property<T> setValue(String value);

	public Property<T> removeValue();

	public String getValue();

}
