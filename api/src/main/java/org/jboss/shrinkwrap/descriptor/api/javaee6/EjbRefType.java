package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface EjbRefType<T> extends Child<T>, ResourceGroup<T>
{
   public EjbRefType<T> description(String description);

   public EjbRefType<T> ejbRefName(String ejbRefName);

   public EjbRefType<T> ejbRefType(EjbRefTypeType ejbRefType);

   public EjbRefType<T> home(String home);

   public EjbRefType<T> remote(String remote);

   public EjbRefType<T> ejbLink(String ejbLink);
}
