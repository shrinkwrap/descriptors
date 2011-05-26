package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;

public interface AssemblyDescriptorType<T> extends Child<T>
{
   public AssemblyDescriptorType<T> setSecurityRole(SecurityRoleType<T> securityRole);

   public SecurityRoleType<AssemblyDescriptorType<T>> getSecurityRole();

   public AssemblyDescriptorType<T> setMethodPermission(MethodPermissionType<T> methodPermission);

   public MethodPermissionType<AssemblyDescriptorType<T>> getMethodPermission();

   public AssemblyDescriptorType<T> setContainerTransaction(ContainerTransactionType<T> containerTransaction);

   public ContainerTransactionType<AssemblyDescriptorType<T>> getContainerTransaction();

   public AssemblyDescriptorType<T> setInterceptorBinding(InterceptorBindingType<T> interceptorBinding);

   public InterceptorBindingType<AssemblyDescriptorType<T>> getInterceptorBinding();

   public AssemblyDescriptorType<T> setMessageDestination(MessageDestinationType<T> messageDestination);

   public MessageDestinationType<AssemblyDescriptorType<T>> getMessageDestination();

   public AssemblyDescriptorType<T> setExcludeList(ExcludeListType<T> excludeList);

   public ExcludeListType<AssemblyDescriptorType<T>> getExcludeList();

   public AssemblyDescriptorType<T> setApplicationException(ApplicationExceptionType<T> applicationException);

   public ApplicationExceptionType<AssemblyDescriptorType<T>> getApplicationException();
}
