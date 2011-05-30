package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface WebAppType<T> extends Child<T>, WebCommonType<T>, WebCommonAttributes<T>
{
   public WebAppType<T> setModuleName(String moduleName);
   public String getModuleName();

   public WebAppType<T> setAbsoluteOrdering(AbsoluteOrderingType<T> absoluteOrdering);
   public AbsoluteOrderingType<T> getAbsoluteOrdering();
}
