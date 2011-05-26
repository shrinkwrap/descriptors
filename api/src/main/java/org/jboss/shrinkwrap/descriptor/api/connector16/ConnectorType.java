package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface ConnectorType<T> extends Child<T>, DescriptionGroup<T>
{
   public ConnectorType<T> setModuleName(String moduleName);

   public String getModuleName();

   public ConnectorType<T> setVendorName(String vendorName);

   public String getVendorName();

   public ConnectorType<T> setEisType(String eisType);

   public String getEisType();

   public ConnectorType<T> setResourceadapterVersion(String resourceadapterVersion);

   public String getResourceadapterVersion();

   public ConnectorType<T> setLicense(LicenseType<T> license);

   public LicenseType<ConnectorType<T>> getLicense();

   public ConnectorType<T> setResourceadapter(ResourceadapterType<T> resourceadapter);

   public ResourceadapterType<ConnectorType<T>> getResourceadapter();

   public ConnectorType<T> setRequiredWorkContext(String requiredWorkContext);

   public String getRequiredWorkContext();
}
