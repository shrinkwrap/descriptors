package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public interface AuthConstraintType<T> extends Child<T>
{

   public AuthConstraintType<T> setDescription(String description);
   public AuthConstraintType<T> setDescriptionList(String ... values);
   public AuthConstraintType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public AuthConstraintType<T> setRoleName(String roleName);
   public AuthConstraintType<T> setRoleNameList(String ... values);
   public AuthConstraintType<T> removeAllRoleName();

   public List<String> getRoleNameList();

}
