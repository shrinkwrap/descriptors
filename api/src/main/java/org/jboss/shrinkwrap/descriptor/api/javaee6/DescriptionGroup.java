package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface DescriptionGroup<T> extends Child<T>
{
   public DescriptionGroup<T> setDescription(String description);

   public String getDescription();

   public DescriptionGroup<T> setDisplayName(String displayName);

   public String getDisplayName();

   public DescriptionGroup<T> setIcon(IconType<T> icon);

   public IconType<DescriptionGroup<T>> getIcon();
}
