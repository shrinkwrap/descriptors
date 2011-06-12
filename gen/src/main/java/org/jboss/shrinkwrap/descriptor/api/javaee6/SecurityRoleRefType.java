package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface SecurityRoleRefType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public SecurityRoleRefType<T> setDescription(String description);
   public SecurityRoleRefType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public SecurityRoleRefType<T> setRoleName(String roleName);

   public String getRoleName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public SecurityRoleRefType<T> setRoleLink(String roleLink);

   public String getRoleLink();

}
