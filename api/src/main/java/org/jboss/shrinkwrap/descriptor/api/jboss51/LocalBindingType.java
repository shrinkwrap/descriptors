package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * Element for specifying the local jndi binding for a bean.
 *
 *
 *
 */
public interface LocalBindingType<T> extends Child<T>
{

   public LocalBindingType<T> setDescription(String description);

   public LocalBindingType<T> setDescriptionList(String... values);

   public LocalBindingType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public LocalBindingType<T> setJndiName(String jndiName);

   public LocalBindingType<T> removeJndiName();

   public String getJndiName();

}
