package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface DescriptionGroup<T> extends Child<T>
{
   public DescriptionGroup<T> setDescription(String description);

   public String getDescription();

   public DescriptionGroup<T> setDisplayName(String displayName);

   public String getDisplayName();

   public IconType<DescriptionGroup<T>> setIcon(IconType<T> icon);

   public IconType<DescriptionGroup<T>> getIcon();
}
