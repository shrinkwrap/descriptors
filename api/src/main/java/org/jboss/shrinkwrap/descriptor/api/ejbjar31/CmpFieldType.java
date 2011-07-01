package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The cmp-fieldType describes a container-managed field. The
 * cmp-fieldType contains an optional description of the field,
 * and the name of the field.
 *
 *
 *
 */
public interface CmpFieldType<T> extends Child<T>
{

   public CmpFieldType<T> setDescription(String description);

   public CmpFieldType<T> setDescriptionList(String... values);

   public CmpFieldType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public CmpFieldType<T> setFieldName(String fieldName);

   public CmpFieldType<T> removeFieldName();

   public String getFieldName();

}
