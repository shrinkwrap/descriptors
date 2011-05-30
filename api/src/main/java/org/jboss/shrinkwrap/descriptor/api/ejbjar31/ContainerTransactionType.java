package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface ContainerTransactionType<T> extends Child<T>
{
   public ContainerTransactionType<T> setDescription(String description);
   public String getDescription();

   public ContainerTransactionType<T> setMethod(MethodType<T> method);
   public MethodType<T> getMethod();

   public ContainerTransactionType<T> setTransAttribute(TransAttributeType transAttribute);
   public TransAttributeType getTransAttribute();
}
