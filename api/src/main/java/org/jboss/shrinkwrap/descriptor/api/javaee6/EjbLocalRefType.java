package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface EjbLocalRefType<T> extends Child<T>, ResourceGroup<T>
{
   public EjbLocalRefType<T> description(String description);

   public EjbLocalRefType<T> ejbRefName(String ejbRefName);

   public EjbLocalRefType<T> ejbRefType(EjbRefTypeType ejbRefType);

   public EjbLocalRefType<T> localHome(String localHome);

   public EjbLocalRefType<T> local(String local);

   public EjbLocalRefType<T> ejbLink(String ejbLink);
}
