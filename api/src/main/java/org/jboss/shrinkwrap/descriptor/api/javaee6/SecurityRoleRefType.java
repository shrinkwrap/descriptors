package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * SecurityRoleRefType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface SecurityRoleRefType<T> extends Child<T>
{
   public SecurityRoleRefType<T> description(String description);

   public SecurityRoleRefType<T> roleName(String roleName);

   public SecurityRoleRefType<T> roleLink(String roleLink);
}