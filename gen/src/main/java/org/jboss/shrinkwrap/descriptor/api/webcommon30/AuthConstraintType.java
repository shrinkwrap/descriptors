package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface AuthConstraintType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public AuthConstraintType<T> setDescription(String description);
   public AuthConstraintType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public AuthConstraintType<T> setRoleName(String roleName);
   public AuthConstraintType<T> setRoleName(String ... values);

   public List<String> getRoleNameList();

}
