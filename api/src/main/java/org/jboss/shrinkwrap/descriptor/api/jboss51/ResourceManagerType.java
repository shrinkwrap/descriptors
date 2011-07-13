package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The resource-manager element is used to provide a
 * mapping between the "xml name" of a resource (res-name) and its "runtime jndi
 * name" (res-jndi-name or res-url according to the type of the resource). If it
 * is not provided, and if the type of the resource is javax.sql.DataSource,
 * jboss will look for a javax.sql.DataSource in the jndi tree. See
 * resource-managers. Used in: resource-managers
 * 
 */
public interface ResourceManagerType<T> extends Child<T> {

	public ResourceManagerType<T> setDescription(String description);

	public ResourceManagerType<T> setDescriptionList(String... values);

	public ResourceManagerType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ResourceManagerType<T> setResName(String resName);

	public ResourceManagerType<T> removeResName();

	public String getResName();

	public ResourceManagerType<T> setResJndiName(String resJndiName);

	public ResourceManagerType<T> removeResJndiName();

	public String getResJndiName();

	public ResourceManagerType<T> setResUrl(String resUrl);

	public ResourceManagerType<T> removeResUrl();

	public String getResUrl();

	public ResourceManagerType<T> setResClass(String resClass);

	public ResourceManagerType<T> removeResClass();

	public String getResClass();

}
