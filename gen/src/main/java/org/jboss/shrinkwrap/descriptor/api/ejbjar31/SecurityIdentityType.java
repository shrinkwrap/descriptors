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
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The security-identityType specifies whether the caller's
 * security identity is to be used for the execution of the
 * methods of the enterprise bean or whether a specific run-as
 * identity is to be used. It contains an optional description
 * and a specification of the security identity to be used.
 *
 *
 *
 */
public interface SecurityIdentityType<T> extends Child<T>
{

   public SecurityIdentityType<T> setDescription(String description);
   public SecurityIdentityType<T> setDescriptionList(String ... values);
   public SecurityIdentityType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public SecurityIdentityType<T> useCallerIdentity();
   public Boolean isUseCallerIdentity();


   public SecurityIdentityType<T> removeRunAs();

   public RunAsType<SecurityIdentityType<T>> runAs();


}
