package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface IconType<T> extends Child<T>
{
   public IconType<T> setSmallIcon(String smallIcon);

   public String getSmallIcon();

   public IconType<T> setLargeIcon(String largeIcon);

   public String getLargeIcon();
}
