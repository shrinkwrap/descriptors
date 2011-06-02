package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface RespectBindingType<T> extends Child<T>
{
   public RespectBindingType<T> setEnabled(Boolean enabled);

   @NodeInfo(xmlName = "enabled")
   public Boolean getEnabled();
}
