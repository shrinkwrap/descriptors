package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface UserDataConstraintType<T> extends Child<T>
{
   public UserDataConstraintType<T> setDescription(String description);
   public String getDescription();

   public UserDataConstraintType<T> setTransportGuarantee(TransportGuaranteeType transportGuarantee);
   public TransportGuaranteeType getTransportGuarantee();
}
