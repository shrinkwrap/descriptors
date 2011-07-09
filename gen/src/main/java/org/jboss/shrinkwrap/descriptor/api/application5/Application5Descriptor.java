package org.jboss.shrinkwrap.descriptor.api.application5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 */
public interface Application5Descriptor extends Descriptor, DescriptorNamespace<Application5Descriptor>
{

   public Application5Descriptor setDescription(String description);

   public Application5Descriptor setDescriptionList(String... values);

   public Application5Descriptor removeAllDescription();

   public List<String> getDescriptionList();

   public Application5Descriptor setDisplayName(String displayName);

   public Application5Descriptor setDisplayNameList(String... values);

   public Application5Descriptor removeAllDisplayName();

   public List<String> getDisplayNameList();

   public Application5Descriptor removeAllIcon();

   public IconType<Application5Descriptor> icon();

   public List<IconType<Application5Descriptor>> getIconList();

   public Application5Descriptor removeAllModule();

   public ModuleType<Application5Descriptor> module();

   public List<ModuleType<Application5Descriptor>> getModuleList();

   public Application5Descriptor removeAllSecurityRole();

   public SecurityRoleType<Application5Descriptor> securityRole();

   public List<SecurityRoleType<Application5Descriptor>> getSecurityRoleList();

   public Application5Descriptor setLibraryDirectory(String libraryDirectory);

   public Application5Descriptor removeLibraryDirectory();

   public String getLibraryDirectory();

   public Application5Descriptor setVersion(String version);

   public Application5Descriptor removeVersion();

   public String getVersion();

}
