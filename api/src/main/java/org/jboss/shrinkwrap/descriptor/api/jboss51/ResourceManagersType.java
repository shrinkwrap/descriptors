package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The resource-managers element is used to declare
 * resource managers. A resource has 3 names: - the "code name" is the name used
 * in the code of the bean, supplied by the Bean Developer in the resource-ref
 * section of the ejb-jar.xml file - the "xml name" is an intermediary name used
 * by the Application Assembler to identify resources in the XML file. - the
 * "runtime jndi name" is the actual jndi-name or url of the deployed resource,
 * it is supplied by the Deployer. The mapping between the "code name" and the
 * "xml name" is given in the resource-ref section for the bean. If not, jboss
 * will assume that "xml name" = "code name". The mapping between the "xml
 * name" and the "runtime jndi name" is given in a resource-manager section. If
 * not, and if the datasource is of type javax.sql.DataSource, jboss will look
 * for a javax.sql.DataSource in the jndi tree. Used in: jboss
 * 
 * 
 */
public interface ResourceManagersType<T> extends Child<T> {

	public ResourceManagersType<T> setDescription(String description);

	public ResourceManagersType<T> setDescriptionList(String... values);

	public ResourceManagersType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ResourceManagersType<T> removeAllResourceManager();

	public ResourceManagerType<ResourceManagersType<T>> resourceManager();

	public List<ResourceManagerType<ResourceManagersType<T>>> getResourceManagerList();

}
