package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ExcludeListType<T> extends Child<T>
{
   public ExcludeListType<T> setDescription(String description);

   public String getDescription();

   public ExcludeListType<T> setMethod(MethodType<T> method);

   public MethodType<ExcludeListType<T>> getMethod();
}
