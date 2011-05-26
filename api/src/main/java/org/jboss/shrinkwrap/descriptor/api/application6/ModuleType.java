package org.jboss.shrinkwrap.descriptor.api.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ModuleType<T> extends Child<T>
{
   public ModuleType<T> setAltDd(String altDd);

   public String getAltDd();
}
