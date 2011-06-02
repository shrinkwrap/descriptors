package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface CmpFieldType<T> extends Child<T>
{
   public CmpFieldType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public CmpFieldType<T> setFieldName(String fieldName);

   @NodeInfo(xmlName = "field-name")
   public String getFieldName();
}
