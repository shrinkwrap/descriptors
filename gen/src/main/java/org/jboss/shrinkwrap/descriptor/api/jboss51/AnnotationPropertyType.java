package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * Used to set property values for annotations
 *
 *
 *
 */
public interface AnnotationPropertyType<T> extends Child<T>
{

   public AnnotationPropertyType<T> setDescription(String description);

   public AnnotationPropertyType<T> setDescriptionList(String... values);

   public AnnotationPropertyType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public AnnotationPropertyType<T> setPropertyName(String propertyName);

   public AnnotationPropertyType<T> removePropertyName();

   public String getPropertyName();

   public AnnotationPropertyType<T> setPropertyValue(String propertyValue);

   public AnnotationPropertyType<T> removePropertyValue();

   public String getPropertyValue();

}
