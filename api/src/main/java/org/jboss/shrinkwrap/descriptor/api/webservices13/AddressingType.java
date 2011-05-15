package org.jboss.shrinkwrap.descriptor.api.webservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AddressingType<T> extends Child<T>
{
   public AddressingType<T> enabled(boolean enabled);

   public AddressingType<T> required(boolean enabled);

   public AddressingType<T> responses(String responses);
}
