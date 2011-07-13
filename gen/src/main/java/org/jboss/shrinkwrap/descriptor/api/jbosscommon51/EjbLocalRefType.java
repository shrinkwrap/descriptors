package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefTypeType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The ejb-local-ref element is used to give the
 * jndi-name of an external ejb reference. In the case of an external ejb
 * reference, you don't provide a ejb-link element in ejb-jar.xml, but you
 * provide a jndi-name in jboss.xml
 * 
 */
public interface EjbLocalRefType<T> extends Child<T> {

	public EjbLocalRefType<T> setJndiName(String jndiName);

	public EjbLocalRefType<T> removeJndiName();

	public String getJndiName();

	public EjbLocalRefType<T> setMappedName(String mappedName);

	public EjbLocalRefType<T> removeMappedName();

	public String getMappedName();

	public EjbLocalRefType<T> removeAllInjectionTarget();

	public InjectionTargetType<EjbLocalRefType<T>> injectionTarget();

	public List<InjectionTargetType<EjbLocalRefType<T>>> getInjectionTargetList();

	public EjbLocalRefType<T> ignoreDependency();

	public Boolean isIgnoreDependency();

	public EjbLocalRefType<T> setDescription(String description);

	public EjbLocalRefType<T> setDescriptionList(String... values);

	public EjbLocalRefType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public EjbLocalRefType<T> setEjbRefName(String ejbRefName);

	public EjbLocalRefType<T> removeEjbRefName();

	public String getEjbRefName();

	public EjbLocalRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);

	public EjbLocalRefType<T> setEjbRefType(String ejbRefType);

	public EjbRefTypeType getEjbRefType();

	public String getEjbRefTypeAsString();

	public EjbLocalRefType<T> setLocalHome(String localHome);

	public EjbLocalRefType<T> removeLocalHome();

	public String getLocalHome();

	public EjbLocalRefType<T> setLocal(String local);

	public EjbLocalRefType<T> removeLocal();

	public String getLocal();

	public EjbLocalRefType<T> setEjbLink(String ejbLink);

	public EjbLocalRefType<T> removeEjbLink();

	public String getEjbLink();

	public EjbLocalRefType<T> setLocalJndiName(String localJndiName);

	public EjbLocalRefType<T> removeLocalJndiName();

	public String getLocalJndiName();

}
