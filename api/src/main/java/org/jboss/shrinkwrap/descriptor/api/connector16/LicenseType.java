package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface LicenseType<T> extends Child<T>
{
   public LicenseType<T> setDescription(String description);

   public String getDescription();

   public LicenseType<T> setLicenseRequired(Boolean licenseRequired);

   public Boolean getLicenseRequired();
}
