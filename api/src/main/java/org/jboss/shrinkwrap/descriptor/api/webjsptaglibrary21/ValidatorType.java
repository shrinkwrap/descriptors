package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

public interface ValidatorType<T> extends Child<T>
{
   public ValidatorType<T> setDescription(String description);

   public String getDescription();

   public ValidatorType<T> setValidatorClazz(String validatorClass);

   public String getValidatorClazz();

   public ValidatorType<T> setInitParam(ParamValueType<T> initParam);

   public ParamValueType<ValidatorType<T>> getInitParam();
}
