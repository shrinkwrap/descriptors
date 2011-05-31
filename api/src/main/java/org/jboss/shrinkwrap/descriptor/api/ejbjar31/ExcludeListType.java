package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface ExcludeListType<T> extends Child<T>
{
   public ExcludeListType<T> setDescription(String description);
   public String getDescription();

   public ExcludeListType<T> setMethod(MethodType<ExcludeListType<T>> method);
   public MethodType<ExcludeListType<T>> getMethod();
}
