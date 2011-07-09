package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The assembly-descriptorType defines
 * application-assembly information.
 *
 * The application-assembly information consists of the
 * following parts: the definition of security roles, the
 * definition of method permissions, the definition of
 * transaction attributes for enterprise beans with
 * container-managed transaction demarcation, the definition
 * of interceptor bindings, a list of
 * methods to be excluded from being invoked, and a list of
 * exception types that should be treated as application exceptions.
 *
 * All the parts are optional in the sense that they are
 * omitted if the lists represented by them are empty.
 *
 * Providing an assembly-descriptor in the deployment
 * descriptor is optional for the ejb-jar or .war file producer.
 *
 *
 *
 */
public interface AssemblyDescriptorType<T> extends Child<T>
{

   public AssemblyDescriptorType<T> removeAllSecurityRole();

   public SecurityRoleType<AssemblyDescriptorType<T>> securityRole();

   public List<SecurityRoleType<AssemblyDescriptorType<T>>> getSecurityRoleList();

   public AssemblyDescriptorType<T> removeAllMethodPermission();

   public MethodPermissionType<AssemblyDescriptorType<T>> methodPermission();

   public List<MethodPermissionType<AssemblyDescriptorType<T>>> getMethodPermissionList();

   public AssemblyDescriptorType<T> removeAllContainerTransaction();

   public ContainerTransactionType<AssemblyDescriptorType<T>> containerTransaction();

   public List<ContainerTransactionType<AssemblyDescriptorType<T>>> getContainerTransactionList();

   public AssemblyDescriptorType<T> removeAllInterceptorBinding();

   public InterceptorBindingType<AssemblyDescriptorType<T>> interceptorBinding();

   public List<InterceptorBindingType<AssemblyDescriptorType<T>>> getInterceptorBindingList();

   public AssemblyDescriptorType<T> removeAllMessageDestination();

   public MessageDestinationType<AssemblyDescriptorType<T>> messageDestination();

   public List<MessageDestinationType<AssemblyDescriptorType<T>>> getMessageDestinationList();

   public AssemblyDescriptorType<T> removeExcludeList();

   public ExcludeListType<AssemblyDescriptorType<T>> excludeList();

   public AssemblyDescriptorType<T> removeAllApplicationException();

   public ApplicationExceptionType<AssemblyDescriptorType<T>> applicationException();

   public List<ApplicationExceptionType<AssemblyDescriptorType<T>>> getApplicationExceptionList();

}
