package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The method-permissionType specifies that one or more
 * security roles are allowed to invoke one or more enterprise
 * bean methods. The method-permissionType consists of an
 * optional description, a list of security role names or an
 * indicator to state that the method is unchecked for
 * authorization, and a list of method elements.
 *
 * The security roles used in the method-permissionType
 * must be defined in the security-role elements of the
 * deployment descriptor, and the methods must be methods
 * defined in the enterprise bean's business, home, component
 * and/or web service endpoint interfaces.
 *
 *
 *
 */
public interface MethodPermissionType<T> extends Child<T>
{

   public MethodPermissionType<T> setDescription(String description);
   public MethodPermissionType<T> setDescriptionList(String ... values);
   public MethodPermissionType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public MethodPermissionType<T> removeAllMethod();

   public MethodType<MethodPermissionType<T>> method();
   public List<MethodType<MethodPermissionType<T>>> getMethodList();




   public MethodPermissionType<T> setRoleName(String roleName);
   public MethodPermissionType<T> setRoleNameList(String ... values);
   public MethodPermissionType<T> removeAllRoleName();

   public List<String> getRoleNameList();


   public MethodPermissionType<T> unchecked();
   public Boolean isUnchecked();
}
