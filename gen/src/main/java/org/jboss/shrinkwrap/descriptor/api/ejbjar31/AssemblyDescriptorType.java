package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface AssemblyDescriptorType<T> extends Child<T>
{

   public AssemblyDescriptorType<T> setSecurityRole(SecurityRoleType<AssemblyDescriptorType<T>> securityRole);
   public SecurityRoleType<AssemblyDescriptorType<T>> getSecurityRole();



   public AssemblyDescriptorType<T> setMethodPermission(MethodPermissionType<AssemblyDescriptorType<T>> methodPermission);
   public MethodPermissionType<AssemblyDescriptorType<T>> getMethodPermission();



   public AssemblyDescriptorType<T> setContainerTransaction(ContainerTransactionType<AssemblyDescriptorType<T>> containerTransaction);
   public ContainerTransactionType<AssemblyDescriptorType<T>> getContainerTransaction();



   public AssemblyDescriptorType<T> setInterceptorBinding(InterceptorBindingType<AssemblyDescriptorType<T>> interceptorBinding);
   public InterceptorBindingType<AssemblyDescriptorType<T>> getInterceptorBinding();



   public AssemblyDescriptorType<T> setMessageDestination(MessageDestinationType<AssemblyDescriptorType<T>> messageDestination);
   public MessageDestinationType<AssemblyDescriptorType<T>> getMessageDestination();



   public AssemblyDescriptorType<T> setExcludeList(ExcludeListType<AssemblyDescriptorType<T>> excludeList);
   public ExcludeListType<AssemblyDescriptorType<T>> getExcludeList();



   public AssemblyDescriptorType<T> setApplicationException(ApplicationExceptionType<AssemblyDescriptorType<T>> applicationException);
   public ApplicationExceptionType<AssemblyDescriptorType<T>> getApplicationException();

}
