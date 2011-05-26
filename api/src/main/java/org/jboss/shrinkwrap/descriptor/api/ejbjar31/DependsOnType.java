package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface DependsOnType<T> extends Child<T>
{
   public DependsOnType<T> setEjbName(String ejbName);

   public String getEjbName();
}
