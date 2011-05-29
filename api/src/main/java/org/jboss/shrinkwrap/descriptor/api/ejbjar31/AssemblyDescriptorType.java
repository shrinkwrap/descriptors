package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface AssemblyDescriptorType<T> extends Child<T>
{
   public SecurityRoleType<AssemblyDescriptorType<T>> setSecurityRole(SecurityRoleType<T> securityRole);

   public SecurityRoleType<AssemblyDescriptorType<T>> getSecurityRole();

   public MethodPermissionType<AssemblyDescriptorType<T>> setMethodPermission(MethodPermissionType<T> methodPermission);

   public MethodPermissionType<AssemblyDescriptorType<T>> getMethodPermission();

   public ContainerTransactionType<AssemblyDescriptorType<T>> setContainerTransaction(
         ContainerTransactionType<T> containerTransaction);

   public ContainerTransactionType<AssemblyDescriptorType<T>> getContainerTransaction();

   public InterceptorBindingType<AssemblyDescriptorType<T>> setInterceptorBinding(
         InterceptorBindingType<T> interceptorBinding);

   public InterceptorBindingType<AssemblyDescriptorType<T>> getInterceptorBinding();

   public MessageDestinationType<AssemblyDescriptorType<T>> setMessageDestination(
         MessageDestinationType<T> messageDestination);

   public MessageDestinationType<AssemblyDescriptorType<T>> getMessageDestination();

   public ExcludeListType<AssemblyDescriptorType<T>> setExcludeList(ExcludeListType<T> excludeList);

   public ExcludeListType<AssemblyDescriptorType<T>> getExcludeList();

   public ApplicationExceptionType<AssemblyDescriptorType<T>> setApplicationException(
         ApplicationExceptionType<T> applicationException);

   public ApplicationExceptionType<AssemblyDescriptorType<T>> getApplicationException();
}
