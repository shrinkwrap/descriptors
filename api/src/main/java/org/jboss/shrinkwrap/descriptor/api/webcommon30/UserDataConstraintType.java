package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-29T17:02:36.405-04:00
 *
 * Original Documentation:
 *
 *
 * The user-data-constraintType is used to indicate how
 * data communicated between the client and container should be
 * protected.
 *
 * Used in: security-constraint
 *
 *
 *
 */
public interface UserDataConstraintType<T> extends Child<T>
{

   public UserDataConstraintType<T> setDescription(String description);

   public UserDataConstraintType<T> setDescriptionList(String... values);

   public UserDataConstraintType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public UserDataConstraintType<T> setTransportGuarantee(TransportGuaranteeType transportGuarantee);

   public UserDataConstraintType<T> setTransportGuarantee(String transportGuarantee);

   public TransportGuaranteeType getTransportGuarantee();

   public String getTransportGuaranteeAsString();

}
