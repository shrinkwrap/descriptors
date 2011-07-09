package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The annotationType is used to add annotations to a bean class,
 * method, or field.
 *
 *
 *
 */
public interface AnnotationType<T> extends Child<T>
{

   public AnnotationType<T> setDescription(String description);

   public AnnotationType<T> setDescriptionList(String... values);

   public AnnotationType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public AnnotationType<T> setAnnotationClass(String annotationClass);

   public AnnotationType<T> removeAnnotationClass();

   public String getAnnotationClass();

   public AnnotationType<T> setAnnotationImplementationClass(String annotationImplementationClass);

   public AnnotationType<T> removeAnnotationImplementationClass();

   public String getAnnotationImplementationClass();

   public AnnotationType<T> removeInjectionTarget();

   public InjectionTargetType<AnnotationType<T>> injectionTarget();

   public AnnotationType<T> removeAllProperty();

   public AnnotationPropertyType<AnnotationType<T>> property();

   public List<AnnotationPropertyType<AnnotationType<T>>> getPropertyList();

}
