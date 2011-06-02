package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface SecurityIdentityType<T> extends Child<T>
{
   public SecurityIdentityType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   @NodeInfo(xmlName = "use-caller-identity")
   public SecurityIdentityType<T> useCallerIdentity();

   @NodeInfo(xmlName = "run-as")
   public RunAsType<SecurityIdentityType<T>> runAs();
}
