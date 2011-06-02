package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface AssemblyDescriptorType<T> extends Child<T>
{
   @NodeInfo(xmlName = "security-role")
   public SecurityRoleType<AssemblyDescriptorType<T>> securityRole();

   @NodeInfo(xmlName = "method-permission")
   public MethodPermissionType<AssemblyDescriptorType<T>> methodPermission();

   @NodeInfo(xmlName = "container-transaction")
   public ContainerTransactionType<AssemblyDescriptorType<T>> containerTransaction();

   @NodeInfo(xmlName = "interceptor-binding")
   public InterceptorBindingType<AssemblyDescriptorType<T>> interceptorBinding();

   @NodeInfo(xmlName = "message-destination")
   public MessageDestinationType<AssemblyDescriptorType<T>> messageDestination();

   @NodeInfo(xmlName = "exclude-list")
   public ExcludeListType<AssemblyDescriptorType<T>> excludeList();

   @NodeInfo(xmlName = "application-exception")
   public ApplicationExceptionType<AssemblyDescriptorType<T>> applicationException();
}
