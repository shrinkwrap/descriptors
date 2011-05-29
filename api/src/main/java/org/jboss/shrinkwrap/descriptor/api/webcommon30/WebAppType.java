package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface WebAppType<T> extends Child<T>, WebCommonType<T>

{
   public WebAppType<T> setModuleName(String moduleName);

   public String getModuleName();

   public AbsoluteOrderingType<WebAppType<T>> setAbsoluteOrdering(AbsoluteOrderingType<T> absoluteOrdering);

   public AbsoluteOrderingType<WebAppType<T>> getAbsoluteOrdering();
}
