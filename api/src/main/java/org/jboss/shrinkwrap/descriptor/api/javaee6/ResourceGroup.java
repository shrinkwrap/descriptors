package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ResourceGroup<T> extends Child<T>, ResourceBaseGroup<T>
{
   public ResourceGroup<T> setLookupName(String lookupName);

   public String getLookupName();
}
