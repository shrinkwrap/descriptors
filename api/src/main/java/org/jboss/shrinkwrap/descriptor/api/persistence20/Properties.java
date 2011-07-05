package org.jboss.shrinkwrap.descriptor.api.persistence20;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * A list of standard and vendor-specific properties
 * and hints.
 *
 *
 *
 */
public interface Properties<T> extends Child<T>
{

   public Properties<T> removeAllProperty();

   public Property<Properties<T>> property();

   public List<Property<Properties<T>>> getPropertyList();

}
