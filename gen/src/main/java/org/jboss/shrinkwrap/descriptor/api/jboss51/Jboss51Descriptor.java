package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public interface Jboss51Descriptor extends Descriptor,
		DescriptorNamespace<Jboss51Descriptor> {

	public Jboss51Descriptor setDescription(String description);

	public Jboss51Descriptor setDescriptionList(String... values);

	public Jboss51Descriptor removeAllDescription();

	public List<String> getDescriptionList();

	public Jboss51Descriptor setDisplayName(String displayName);

	public Jboss51Descriptor setDisplayNameList(String... values);

	public Jboss51Descriptor removeAllDisplayName();

	public List<String> getDisplayNameList();

	public Jboss51Descriptor removeAllIcon();

	public IconType<Jboss51Descriptor> icon();

	public List<IconType<Jboss51Descriptor>> getIconList();

	public Jboss51Descriptor removeLoaderRepository();

	public LoaderRepositoryType<Jboss51Descriptor> loaderRepository();

	public Jboss51Descriptor setJmxName(String jmxName);

	public Jboss51Descriptor removeJmxName();

	public String getJmxName();

	public Jboss51Descriptor setSecurityDomain(String securityDomain);

	public Jboss51Descriptor removeSecurityDomain();

	public String getSecurityDomain();

	public Jboss51Descriptor setMissingMethodPermissionsExcludedMode(
			Boolean missingMethodPermissionsExcludedMode);

	public Jboss51Descriptor removeMissingMethodPermissionsExcludedMode();

	public Boolean isMissingMethodPermissionsExcludedMode();

	public Jboss51Descriptor setUnauthenticatedPrincipal(
			String unauthenticatedPrincipal);

	public Jboss51Descriptor removeUnauthenticatedPrincipal();

	public String getUnauthenticatedPrincipal();

	public Jboss51Descriptor setJndiBindingPolicy(String jndiBindingPolicy);

	public Jboss51Descriptor removeJndiBindingPolicy();

	public String getJndiBindingPolicy();

	public Jboss51Descriptor setJaccContextId(String jaccContextId);

	public Jboss51Descriptor removeJaccContextId();

	public String getJaccContextId();

	public Jboss51Descriptor removeWebservices();

	public WebservicesType<Jboss51Descriptor> webservices();

	public Jboss51Descriptor removeEnterpriseBeans();

	public EnterpriseBeansType<Jboss51Descriptor> enterpriseBeans();

	public Jboss51Descriptor removeAssemblyDescriptor();

	public AssemblyDescriptorType<Jboss51Descriptor> assemblyDescriptor();

	public Jboss51Descriptor removeResourceManagers();

	public ResourceManagersType<Jboss51Descriptor> resourceManagers();

	public Jboss51Descriptor setVersion(String version);

	public Jboss51Descriptor removeVersion();

	public String getVersion();

	public Jboss51Descriptor setMetadataComplete(Boolean metadataComplete);

	public Jboss51Descriptor removeMetadataComplete();

	public Boolean isMetadataComplete();

}
