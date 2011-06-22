package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T14:39:12.971-04:00
 *
 * Original Documentation:
 *
 *
 * The icon type contains small-icon and large-icon elements
 * that specify the file names for small and large GIF, JPEG,
 * or PNG icon images used to represent the parent element in a
 * GUI tool.
 *
 * The xml:lang attribute defines the language that the
 * icon file names are provided in. Its value is "en" (English)
 * by default.
 *
 *
 *
 */
public interface IconType<T> extends Child<T>
{

   public IconType<T> setSmallIcon(String smallIcon);

   public IconType<T> removeSmallIcon();

   public String getSmallIcon();

   public IconType<T> setLargeIcon(String largeIcon);

   public IconType<T> removeLargeIcon();

   public String getLargeIcon();

}
