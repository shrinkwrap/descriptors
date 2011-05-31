package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface AssemblyDescriptorType<T> extends Child<T>
{
   public AssemblyDescriptorType<T> setSecurityRole(SecurityRoleType<T> securityRole);
   public SecurityRoleType<T> getSecurityRole();

   public AssemblyDescriptorType<T> setMethodPermission(MethodPermissionType<T> methodPermission);
   public MethodPermissionType<T> getMethodPermission();

   public AssemblyDescriptorType<T> setContainerTransaction(ContainerTransactionType<T> containerTransaction);
   public ContainerTransactionType<T> getContainerTransaction();

   public AssemblyDescriptorType<T> setInterceptorBinding(InterceptorBindingType<T> interceptorBinding);
   public InterceptorBindingType<T> getInterceptorBinding();

   public AssemblyDescriptorType<T> setMessageDestination(MessageDestinationType<T> messageDestination);
   public MessageDestinationType<T> getMessageDestination();

   public AssemblyDescriptorType<T> setExcludeList(ExcludeListType<T> excludeList);
   public ExcludeListType<T> getExcludeList();

   public AssemblyDescriptorType<T> setApplicationException(ApplicationExceptionType<T> applicationException);
   public ApplicationExceptionType<T> getApplicationException();
}
