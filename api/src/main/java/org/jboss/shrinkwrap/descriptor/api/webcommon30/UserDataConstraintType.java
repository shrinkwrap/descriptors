package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface UserDataConstraintType<T> extends Child<T>
{
   public UserDataConstraintType<T> setDescription(String description);

   public String getDescription();

   public UserDataConstraintType<T> setTransportGuarantee(String transportGuarantee);

   public String getTransportGuarantee();
}
