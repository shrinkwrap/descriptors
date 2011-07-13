package org.jboss.shrinkwrap.descriptor.api.application5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The applicationType defines the structure of the application.
 * 
 * 
 * 
 */
public interface ApplicationType<T> extends Child<T> {

	public ApplicationType<T> setDescription(String description);

	public ApplicationType<T> setDescriptionList(String... values);

	public ApplicationType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ApplicationType<T> setDisplayName(String displayName);

	public ApplicationType<T> setDisplayNameList(String... values);

	public ApplicationType<T> removeAllDisplayName();

	public List<String> getDisplayNameList();

	public ApplicationType<T> removeAllIcon();

	public IconType<ApplicationType<T>> icon();

	public List<IconType<ApplicationType<T>>> getIconList();

	public ApplicationType<T> removeAllModule();

	public ModuleType<ApplicationType<T>> module();

	public List<ModuleType<ApplicationType<T>>> getModuleList();

	public ApplicationType<T> removeAllSecurityRole();

	public SecurityRoleType<ApplicationType<T>> securityRole();

	public List<SecurityRoleType<ApplicationType<T>>> getSecurityRoleList();

	public ApplicationType<T> setLibraryDirectory(String libraryDirectory);

	public ApplicationType<T> removeLibraryDirectory();

	public String getLibraryDirectory();

	public ApplicationType<T> setVersion(String version);

	public ApplicationType<T> removeVersion();

	public String getVersion();

}
