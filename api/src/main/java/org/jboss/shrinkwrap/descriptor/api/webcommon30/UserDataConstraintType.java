package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * UserDataConstraintType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface UserDataConstraintType<T> extends Child<T>
{
   public UserDataConstraintType<T> description(String description);

   public UserDataConstraintType<T> TransportGuarantee(String TransportGuarantee);
}