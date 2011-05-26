package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ErrorPageType<T> extends Child<T>
{
   public ErrorPageType<T> setLocation(String location);

   public String getLocation();
}
