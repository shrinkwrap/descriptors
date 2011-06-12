package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface RunAsType<T> extends Child<T>
{

   public RunAsType<T> setDescription(String description);

   public RunAsType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public RunAsType<T> setRoleName(String roleName);

   public String getRoleName();

}
