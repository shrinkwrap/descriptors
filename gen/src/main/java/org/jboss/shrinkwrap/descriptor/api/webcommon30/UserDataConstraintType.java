package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public interface UserDataConstraintType<T> extends Child<T>
{

   public UserDataConstraintType<T> setDescription(String description);

   public UserDataConstraintType<T> setDescriptionList(String... values);

   public UserDataConstraintType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public UserDataConstraintType<T> setTransportGuarantee(String transportGuarantee);

   public UserDataConstraintType<T> removeTransportGuarantee();

   public String getTransportGuarantee();

}
