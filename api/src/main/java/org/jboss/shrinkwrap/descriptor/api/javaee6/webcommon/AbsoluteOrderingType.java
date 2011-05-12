package org.jboss.shrinkwrap.descriptor.api.javaee6.webcommon;

import org.jboss.shrinkwrap.descriptor.api.javaee6.Child;

public interface AbsoluteOrderingType<T> extends Child<T>
{
   public AbsoluteOrderingType<T> name(String... names);

   public AbsoluteOrderingType<T> others();
}
