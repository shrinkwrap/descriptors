package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface CmrFieldType<T> extends Child<T>
{

   public CmrFieldType<T> setDescription(String description);
   public String getDescription();


   public CmrFieldType<T> setCmrFieldName(String cmrFieldName);
   public String getCmrFieldName();


   public CmrFieldType<T> setCmrFieldType(String cmrFieldType);
   public String getCmrFieldType();
}