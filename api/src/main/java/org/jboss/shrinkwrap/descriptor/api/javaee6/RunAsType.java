package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:26:42.686-04:00
 *
 * Original Documentation:
 *
 *
 * The run-asType specifies the run-as identity to be
 * used for the execution of a component. It contains an
 * optional description, and the name of a security role.
 *
 *
 *
 */
public interface RunAsType<T> extends Child<T>
{

   public RunAsType<T> setDescription(String description);

   public RunAsType<T> setDescriptionList(String... values);

   public RunAsType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public RunAsType<T> setRoleName(String roleName);

   public RunAsType<T> removeRoleName();

   public String getRoleName();

}
