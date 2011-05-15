package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;


public interface IconType<T> extends Child<T>
{
   public IconType<T> smallIcon(String smallIcon);
   public IconType<T> largeIcon(String largeIcon);
}
