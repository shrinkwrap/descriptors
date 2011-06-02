package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface CmrFieldType<T> extends Child<T>
{
   public CmrFieldType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public CmrFieldType<T> setCmrFieldName(String cmrFieldName);

   @NodeInfo(xmlName = "cmr-field-name")
   public String getCmrFieldName();

   public CmrFieldType<T> setCmrFieldType(CmrFieldTypeType cmrFieldType);

   public CmrFieldType<T> setCmrFieldType(String cmrFieldType);

   @NodeInfo(xmlName = "cmr-field-type")
   public String getCmrFieldType();
}
