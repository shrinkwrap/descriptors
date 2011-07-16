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
 * The resource-env-refType is used to define resource-env-type elements. It
 * contains a declaration of a Deployment Component's reference to an
 * administered object associated with a resource in the Deployment Component's
 * environment. It consists of an optional description, the resource environment
 * reference name, and an optional indication of the resource environment
 * reference type expected by the Deployment Component code.
 * 
 * It also includes optional elements to define injection of the named resource
 * into fields or JavaBeans properties.
 * 
 * The resource environment type must be supplied unless an injection target is
 * specified, in which case the type of the target is used. If both are
 * specified, the type must be assignment compatible with the type of the
 * injection target.
 * 
 * Example:
 * 
 * <resource-env-ref> <resource-env-ref-name>jms/StockQueue
 * </resource-env-ref-name> <resource-env-ref-type>javax.jms.Queue
 * </resource-env-ref-type> </resource-env-ref>
 * 
 * 
 * 
 * 
 */
public interface ResourceEnvRefType<T> extends Child<T> {

	public ResourceEnvRefType<T> setMappedName(String mappedName);

	public ResourceEnvRefType<T> removeMappedName();

	public String getMappedName();

	public ResourceEnvRefType<T> removeAllInjectionTarget();

	public InjectionTargetType<ResourceEnvRefType<T>> injectionTarget();

	public List<InjectionTargetType<ResourceEnvRefType<T>>> getInjectionTargetList();

	public ResourceEnvRefType<T> setDescription(String description);

	public ResourceEnvRefType<T> setDescriptionList(String... values);

	public ResourceEnvRefType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName);

	public ResourceEnvRefType<T> removeResourceEnvRefName();

	public String getResourceEnvRefName();

	public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType);

	public ResourceEnvRefType<T> removeResourceEnvRefType();

	public String getResourceEnvRefType();

}
