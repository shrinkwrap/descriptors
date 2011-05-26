package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ContainerTransactionType<T> extends Child<T>
{
   public ContainerTransactionType<T> setDescription(String description);

   public String getDescription();

   public ContainerTransactionType<T> setMethod(MethodType<T> method);

   public MethodType<ContainerTransactionType<T>> getMethod();

   public ContainerTransactionType<T> setTransAttribute(String transAttribute);

   public String getTransAttribute();
}
