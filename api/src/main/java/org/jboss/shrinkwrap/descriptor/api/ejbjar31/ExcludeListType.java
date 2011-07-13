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
 * The exclude-listType specifies one or more methods which the Assembler marks
 * to be uncallable.
 * 
 * If the method permission relation contains methods that are in the exclude
 * list, the Deployer should consider those methods to be uncallable.
 * 
 * 
 * 
 */
public interface ExcludeListType<T> extends Child<T> {

	public ExcludeListType<T> setDescription(String description);

	public ExcludeListType<T> setDescriptionList(String... values);

	public ExcludeListType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ExcludeListType<T> removeAllMethod();

	public MethodType<ExcludeListType<T>> method();

	public List<MethodType<ExcludeListType<T>>> getMethodList();

}
