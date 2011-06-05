package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ApplicationExceptionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ContainerTransactionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ExcludeListType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorBindingType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodPermissionType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class AssemblyDescriptorTypeImpl<T> implements Child<T>, AssemblyDescriptorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private SecurityRoleType<AssemblyDescriptorType<T>> securityRole;
   private MethodPermissionType<AssemblyDescriptorType<T>> methodPermission;
   private ContainerTransactionType<AssemblyDescriptorType<T>> containerTransaction;
   private InterceptorBindingType<AssemblyDescriptorType<T>> interceptorBinding;
   private MessageDestinationType<AssemblyDescriptorType<T>> messageDestination;
   private ExcludeListType<AssemblyDescriptorType<T>> excludeList;
   private ApplicationExceptionType<AssemblyDescriptorType<T>> applicationException;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public AssemblyDescriptorTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("assembly-descriptor");   }


   public T up()
   {
      return t;
   }



   public AssemblyDescriptorType<T> setSecurityRole(SecurityRoleType<AssemblyDescriptorType<T>> securityRole)
   {
      this.securityRole = securityRole;
      childNode.getOrCreate("security-role").text(securityRole);
      return this;
   }

   public SecurityRoleType<AssemblyDescriptorType<T>> getSecurityRole()
   {
      if( securityRole == null)
      {
          securityRole = new SecurityRoleTypeImpl<AssemblyDescriptorType<T>>(this, "", childNode);
      }
      return securityRole;
   }




   public AssemblyDescriptorType<T> setMethodPermission(MethodPermissionType<AssemblyDescriptorType<T>> methodPermission)
   {
      this.methodPermission = methodPermission;
      childNode.getOrCreate("method-permission").text(methodPermission);
      return this;
   }

   public MethodPermissionType<AssemblyDescriptorType<T>> getMethodPermission()
   {
      if( methodPermission == null)
      {
          methodPermission = new MethodPermissionTypeImpl<AssemblyDescriptorType<T>>(this, "", childNode);
      }
      return methodPermission;
   }




   public AssemblyDescriptorType<T> setContainerTransaction(ContainerTransactionType<AssemblyDescriptorType<T>> containerTransaction)
   {
      this.containerTransaction = containerTransaction;
      childNode.getOrCreate("container-transaction").text(containerTransaction);
      return this;
   }

   public ContainerTransactionType<AssemblyDescriptorType<T>> getContainerTransaction()
   {
      if( containerTransaction == null)
      {
          containerTransaction = new ContainerTransactionTypeImpl<AssemblyDescriptorType<T>>(this, "", childNode);
      }
      return containerTransaction;
   }




   public AssemblyDescriptorType<T> setInterceptorBinding(InterceptorBindingType<AssemblyDescriptorType<T>> interceptorBinding)
   {
      this.interceptorBinding = interceptorBinding;
      childNode.getOrCreate("interceptor-binding").text(interceptorBinding);
      return this;
   }

   public InterceptorBindingType<AssemblyDescriptorType<T>> getInterceptorBinding()
   {
      if( interceptorBinding == null)
      {
          interceptorBinding = new InterceptorBindingTypeImpl<AssemblyDescriptorType<T>>(this, "", childNode);
      }
      return interceptorBinding;
   }




   public AssemblyDescriptorType<T> setMessageDestination(MessageDestinationType<AssemblyDescriptorType<T>> messageDestination)
   {
      this.messageDestination = messageDestination;
      childNode.getOrCreate("message-destination").text(messageDestination);
      return this;
   }

   public MessageDestinationType<AssemblyDescriptorType<T>> getMessageDestination()
   {
      if( messageDestination == null)
      {
          messageDestination = new MessageDestinationTypeImpl<AssemblyDescriptorType<T>>(this, "", childNode);
      }
      return messageDestination;
   }




   public AssemblyDescriptorType<T> setExcludeList(ExcludeListType<AssemblyDescriptorType<T>> excludeList)
   {
      this.excludeList = excludeList;
      childNode.getOrCreate("exclude-list").text(excludeList);
      return this;
   }

   public ExcludeListType<AssemblyDescriptorType<T>> getExcludeList()
   {
      if( excludeList == null)
      {
          excludeList = new ExcludeListTypeImpl<AssemblyDescriptorType<T>>(this, "", childNode);
      }
      return excludeList;
   }




   public AssemblyDescriptorType<T> setApplicationException(ApplicationExceptionType<AssemblyDescriptorType<T>> applicationException)
   {
      this.applicationException = applicationException;
      childNode.getOrCreate("application-exception").text(applicationException);
      return this;
   }

   public ApplicationExceptionType<AssemblyDescriptorType<T>> getApplicationException()
   {
      if( applicationException == null)
      {
          applicationException = new ApplicationExceptionTypeImpl<AssemblyDescriptorType<T>>(this, "", childNode);
      }
      return applicationException;
   }


}
