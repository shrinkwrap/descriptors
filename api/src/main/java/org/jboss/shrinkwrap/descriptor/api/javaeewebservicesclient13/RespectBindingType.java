package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface RespectBindingType<T> extends Child<T>
{
   public RespectBindingType<T> setEnabled(Boolean enabled);

   public Boolean getEnabled();
}
