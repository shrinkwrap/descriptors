package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface UserDataConstraintType<T> extends Child<T>
{
   public UserDataConstraintType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public UserDataConstraintType<T> setTransportGuarantee(TransportGuaranteeType transportGuarantee);

   public UserDataConstraintType<T> setTransportGuarantee(String transportGuarantee);

   @NodeInfo(xmlName = "transport-guarantee")
   public String getTransportGuarantee();
}
