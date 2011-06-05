package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface ContainerTransactionType<T> extends Child<T>
{

   public ContainerTransactionType<T> setDescription(String description);
   public String getDescription();


   public ContainerTransactionType<T> setMethod(MethodType<ContainerTransactionType<T>> method);
   public MethodType<ContainerTransactionType<T>> getMethod();



   public ContainerTransactionType<T> setTransAttribute(String transAttribute);
   public String getTransAttribute();
}
