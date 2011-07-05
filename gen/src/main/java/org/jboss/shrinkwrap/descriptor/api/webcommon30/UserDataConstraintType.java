package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

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
   public UserDataConstraintType<T> setDescriptionList(String ... values);
   public UserDataConstraintType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public UserDataConstraintType<T> setTransportGuarantee(TransportGuaranteeType transportGuarantee);
   public UserDataConstraintType<T> setTransportGuarantee(String transportGuarantee);

   public TransportGuaranteeType getTransportGuarantee();
   public String  getTransportGuaranteeAsString();

}