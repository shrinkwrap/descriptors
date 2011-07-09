package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The jboss element is the root element of the jboss.xml file. It contains
 * all the information used by jboss but not described in the ejb-jar.xml file. All of it is
 * optional. 1- the application assembler can define custom container configurations for the
 * beans. Standard configurations are provided in standardjboss.xml 2- the deployer can
 * override the jndi names under which the beans are deployed 3- the deployer can specify
 * runtime jndi names for resource managers.
 *
 */
public interface JbossType<T> extends Child<T>
{

   public JbossType<T> setDescription(String description);

   public JbossType<T> setDescriptionList(String... values);

   public JbossType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public JbossType<T> setDisplayName(String displayName);

   public JbossType<T> setDisplayNameList(String... values);

   public JbossType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();

   public JbossType<T> removeAllIcon();

   public IconType<JbossType<T>> icon();

   public List<IconType<JbossType<T>>> getIconList();

   public JbossType<T> removeLoaderRepository();

   public LoaderRepositoryType<JbossType<T>> loaderRepository();

   public JbossType<T> setJmxName(String jmxName);

   public JbossType<T> removeJmxName();

   public String getJmxName();

   public JbossType<T> setSecurityDomain(String securityDomain);

   public JbossType<T> removeSecurityDomain();

   public String getSecurityDomain();

   public JbossType<T> setMissingMethodPermissionsExcludedMode(Boolean missingMethodPermissionsExcludedMode);

   public JbossType<T> removeMissingMethodPermissionsExcludedMode();

   public Boolean isMissingMethodPermissionsExcludedMode();

   public JbossType<T> setUnauthenticatedPrincipal(String unauthenticatedPrincipal);

   public JbossType<T> removeUnauthenticatedPrincipal();

   public String getUnauthenticatedPrincipal();

   public JbossType<T> setJndiBindingPolicy(String jndiBindingPolicy);

   public JbossType<T> removeJndiBindingPolicy();

   public String getJndiBindingPolicy();

   public JbossType<T> setJaccContextId(String jaccContextId);

   public JbossType<T> removeJaccContextId();

   public String getJaccContextId();

   public JbossType<T> removeWebservices();

   public WebservicesType<JbossType<T>> webservices();

   public JbossType<T> removeEnterpriseBeans();

   public EnterpriseBeansType<JbossType<T>> enterpriseBeans();

   public JbossType<T> removeAssemblyDescriptor();

   public AssemblyDescriptorType<JbossType<T>> assemblyDescriptor();

   public JbossType<T> removeResourceManagers();

   public ResourceManagersType<JbossType<T>> resourceManagers();

   public JbossType<T> setVersion(String version);

   public JbossType<T> removeVersion();

   public String getVersion();

   public JbossType<T> setMetadataComplete(Boolean metadataComplete);

   public JbossType<T> removeMetadataComplete();

   public Boolean isMetadataComplete();

}
