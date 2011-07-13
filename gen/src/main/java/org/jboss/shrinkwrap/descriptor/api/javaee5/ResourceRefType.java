package org.jboss.shrinkwrap.descriptor.api.javaee5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * 
 * The resource-refType contains a declaration of a Deployment Component's
 * reference to an external resource. It consists of an optional description,
 * the resource manager connection factory reference name, an optional
 * indication of the resource manager connection factory type expected by the
 * Deployment Component code, an optional type of authentication (Application or
 * Container), and an optional specification of the shareability of connections
 * obtained from the resource (Shareable or Unshareable).
 * 
 * It also includes optional elements to define injection of the named resource
 * into fields or JavaBeans properties.
 * 
 * The connection factory type must be supplied unless an injection target is
 * specified, in which case the type of the target is used. If both are
 * specified, the type must be assignment compatible with the type of the
 * injection target.
 * 
 * Example:
 * 
 * <resource-ref> <res-ref-name>jdbc/EmployeeAppDB</res-ref-name>
 * <res-type>javax.sql.DataSource</res-type> <res-auth>Container</res-auth>
 * <res-sharing-scope>Shareable</res-sharing-scope> </resource-ref>
 * 
 * 
 * 
 * 
 */
public interface ResourceRefType<T> extends Child<T> {

	public ResourceRefType<T> setMappedName(String mappedName);

	public ResourceRefType<T> removeMappedName();

	public String getMappedName();

	public ResourceRefType<T> removeAllInjectionTarget();

	public InjectionTargetType<ResourceRefType<T>> injectionTarget();

	public List<InjectionTargetType<ResourceRefType<T>>> getInjectionTargetList();

	public ResourceRefType<T> setDescription(String description);

	public ResourceRefType<T> setDescriptionList(String... values);

	public ResourceRefType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ResourceRefType<T> setResRefName(String resRefName);

	public ResourceRefType<T> removeResRefName();

	public String getResRefName();

	public ResourceRefType<T> setResType(String resType);

	public ResourceRefType<T> removeResType();

	public String getResType();

	public ResourceRefType<T> setResAuth(ResAuthType resAuth);

	public ResourceRefType<T> setResAuth(String resAuth);

	public ResAuthType getResAuth();

	public String getResAuthAsString();

	public ResourceRefType<T> setResSharingScope(
			ResSharingScopeType resSharingScope);

	public ResourceRefType<T> setResSharingScope(String resSharingScope);

	public ResSharingScopeType getResSharingScope();

	public String getResSharingScopeAsString();

}
