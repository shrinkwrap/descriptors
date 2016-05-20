package org.jboss.shrinkwrap.descriptor.api.connector10; 

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

public interface ConnectorDescriptor extends Descriptor, DescriptorNamespace<ConnectorDescriptor> {
 
//   public ConnectorDescriptor specVersion(String specVersion);
//   public String getSpecVersion();
//   public ConnectorDescriptor removeSpecVersion(); 
//  
//   public ConnectorDescriptor setIcon(final Icon icon);
//   public Icon getIcon();
//   public ConnectorDescriptor removeIcon(); 
   
//   public ConnectorDescriptor displayName(String displayName);
//   public String getDisplayName();
//   public ConnectorDescriptor removeDisplayName(); 
//  
//   public ConnectorDescriptor vendorName(String vendorName);
//   public String getVendorName();
//   public ConnectorDescriptor removeVendorName(); 
   
	public Factory getFactory();
	
   public ConnectorDescriptor description(String description);
   public String getDescription();
   public ConnectorDescriptor removeDescription(); 
   
//   public ConnectorDescriptor eisType(String eisType);
//   public String getEisType();
//   public ConnectorDescriptor removeEisType(); 
//  
//   public ConnectorDescriptor setLicense(final License license);
//   public License getLicence();
//   public ConnectorDescriptor removeLicense();
 
   public ConnectorDescriptor setResourceadapter(final Resourceadapter resourceadapter);
   public Resourceadapter getResourceadapter();
   public ConnectorDescriptor removeResourceadapter(); 
  
//   public ConnectorDescriptor version(String version);
//   public String getVersion();
//   public ConnectorDescriptor removeVersion();
}
