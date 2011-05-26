package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigValidatorType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigValidatorType<T> setValidatorId(String validatorId);

   public String getValidatorId();

   public FacesConfigValidatorType<T> setValidatorClazz(String validatorClass);

   public String getValidatorClazz();

   public FacesConfigValidatorType<T> setAttribute(FacesConfigAttributeType<T> attribute);

   public FacesConfigAttributeType<FacesConfigValidatorType<T>> getAttribute();

   public FacesConfigValidatorType<T> setProperty(FacesConfigPropertyType<T> property);

   public FacesConfigPropertyType<FacesConfigValidatorType<T>> getProperty();

   public FacesConfigValidatorType<T> setValidatorExtension(FacesConfigValidatorExtensionType<T> validatorExtension);

   public FacesConfigValidatorExtensionType<FacesConfigValidatorType<T>> getValidatorExtension();
}
