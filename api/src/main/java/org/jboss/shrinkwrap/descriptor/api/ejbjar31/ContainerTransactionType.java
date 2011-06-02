package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ContainerTransactionType<T> extends Child<T>
{
   public ContainerTransactionType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   @NodeInfo(xmlName = "method")
   public MethodType<ContainerTransactionType<T>> method();

   public ContainerTransactionType<T> setTransAttribute(TransAttributeType transAttribute);

   public ContainerTransactionType<T> setTransAttribute(String transAttribute);

   @NodeInfo(xmlName = "trans-attribute")
   public String getTransAttribute();
}
