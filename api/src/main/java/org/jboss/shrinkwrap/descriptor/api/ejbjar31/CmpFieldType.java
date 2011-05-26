package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface CmpFieldType<T> extends Child<T>
{
   public CmpFieldType<T> setDescription(String description);

   public String getDescription();

   public CmpFieldType<T> setFieldName(String fieldName);

   public String getFieldName();
}
