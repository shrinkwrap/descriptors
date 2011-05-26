package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface WebAppType<T> extends Child<T>
{
   public WebAppType<T> setModuleName(String moduleName);

   public String getModuleName();

   public WebAppType<T> setAbsoluteOrdering(AbsoluteOrderingType<T> absoluteOrdering);

   public AbsoluteOrderingType<WebAppType<T>> getAbsoluteOrdering();
}
