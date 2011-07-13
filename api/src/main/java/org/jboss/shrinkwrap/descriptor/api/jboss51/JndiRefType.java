package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * Used to inject generic types based on JNDI name
 * 
 * 
 * 
 */
public interface JndiRefType<T> extends Child<T> {

	public JndiRefType<T> setJndiName(String jndiName);

	public JndiRefType<T> removeJndiName();

	public String getJndiName();

	public JndiRefType<T> setMappedName(String mappedName);

	public JndiRefType<T> removeMappedName();

	public String getMappedName();

	public JndiRefType<T> removeAllInjectionTarget();

	public InjectionTargetType<JndiRefType<T>> injectionTarget();

	public List<InjectionTargetType<JndiRefType<T>>> getInjectionTargetList();

	public JndiRefType<T> ignoreDependency();

	public Boolean isIgnoreDependency();

	public JndiRefType<T> setDescription(String description);

	public JndiRefType<T> setDescriptionList(String... values);

	public JndiRefType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public JndiRefType<T> setJndiRefName(String jndiRefName);

	public JndiRefType<T> removeJndiRefName();

	public String getJndiRefName();

}
