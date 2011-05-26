package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface SecurityIdentityType<T> extends Child<T>
{
   public SecurityIdentityType<T> setDescription(String description);

   public String getDescription();
}
