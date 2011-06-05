package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface SecurityIdentityType<T> extends Child<T>
{

   public SecurityIdentityType<T> setDescription(String description);
   public String getDescription();


   public SecurityIdentityType<T> setUseCallerIdentity(Boolean useCallerIdentity);
   public Boolean getUseCallerIdentity();


   public SecurityIdentityType<T> setRunAs(RunAsType<SecurityIdentityType<T>> runAs);
   public RunAsType<SecurityIdentityType<T>> getRunAs();

}
