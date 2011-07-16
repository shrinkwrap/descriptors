package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The ejb-jarType defines the root element of the EJB deployment descriptor. It
 * contains
 * 
 * - an optional description of the ejb-jar file - an optional display name - an
 * optional icon that contains a small and a large icon file name - structural
 * information about all included enterprise beans that is not specified through
 * annotations - structural information about interceptor classes - a descriptor
 * for container managed relationships, if any. - an optional
 * application-assembly descriptor - an optional name of an ejb-client-jar file
 * for the ejb-jar.
 * 
 * 
 * 
 */
public interface EjbJarType<T> extends Child<T> {

	public EjbJarType<T> setDescription(String description);

	public EjbJarType<T> setDescriptionList(String... values);

	public EjbJarType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public EjbJarType<T> setDisplayName(String displayName);

	public EjbJarType<T> setDisplayNameList(String... values);

	public EjbJarType<T> removeAllDisplayName();

	public List<String> getDisplayNameList();

	public EjbJarType<T> removeAllIcon();

	public IconType<EjbJarType<T>> icon();

	public List<IconType<EjbJarType<T>>> getIconList();

	public EjbJarType<T> removeEnterpriseBeans();

	public EnterpriseBeansType<EjbJarType<T>> enterpriseBeans();

	public EjbJarType<T> removeInterceptors();

	public InterceptorsType<EjbJarType<T>> interceptors();

	public EjbJarType<T> removeRelationships();

	public RelationshipsType<EjbJarType<T>> relationships();

	public EjbJarType<T> removeAssemblyDescriptor();

	public AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor();

	public EjbJarType<T> setEjbClientJar(String ejbClientJar);

	public EjbJarType<T> removeEjbClientJar();

	public String getEjbClientJar();

	public EjbJarType<T> setVersion(String version);

	public EjbJarType<T> removeVersion();

	public String getVersion();

	public EjbJarType<T> setMetadataComplete(Boolean metadataComplete);

	public EjbJarType<T> removeMetadataComplete();

	public Boolean isMetadataComplete();

}
