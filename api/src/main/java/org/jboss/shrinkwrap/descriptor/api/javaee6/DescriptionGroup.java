package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface DescriptionGroup<T> extends Child<T>
{
   public T setDescription(String description);
   public String getDescription();

   public T setDisplayName(String displayName);
   public String getDisplayName();

   public DescriptionGroup<T> setIcon(IconType<T> icon);
   public IconType<DescriptionGroup<T>> getIcon();
}
