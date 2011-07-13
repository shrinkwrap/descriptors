package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public interface EjbJar30Descriptor extends Descriptor,
		DescriptorNamespace<EjbJar30Descriptor> {

	public EjbJar30Descriptor setDescription(String description);

	public EjbJar30Descriptor setDescriptionList(String... values);

	public EjbJar30Descriptor removeAllDescription();

	public List<String> getDescriptionList();

	public EjbJar30Descriptor setDisplayName(String displayName);

	public EjbJar30Descriptor setDisplayNameList(String... values);

	public EjbJar30Descriptor removeAllDisplayName();

	public List<String> getDisplayNameList();

	public EjbJar30Descriptor removeAllIcon();

	public IconType<EjbJar30Descriptor> icon();

	public List<IconType<EjbJar30Descriptor>> getIconList();

	public EjbJar30Descriptor removeEnterpriseBeans();

	public EnterpriseBeansType<EjbJar30Descriptor> enterpriseBeans();

	public EjbJar30Descriptor removeInterceptors();

	public InterceptorsType<EjbJar30Descriptor> interceptors();

	public EjbJar30Descriptor removeRelationships();

	public RelationshipsType<EjbJar30Descriptor> relationships();

	public EjbJar30Descriptor removeAssemblyDescriptor();

	public AssemblyDescriptorType<EjbJar30Descriptor> assemblyDescriptor();

	public EjbJar30Descriptor setEjbClientJar(String ejbClientJar);

	public EjbJar30Descriptor removeEjbClientJar();

	public String getEjbClientJar();

	public EjbJar30Descriptor setVersion(String version);

	public EjbJar30Descriptor removeVersion();

	public String getVersion();

	public EjbJar30Descriptor setMetadataComplete(Boolean metadataComplete);

	public EjbJar30Descriptor removeMetadataComplete();

	public Boolean isMetadataComplete();

}
