package org.jboss.shrinkwrap.descriptor.api.webfacelettaglibrary20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FaceletTaglibTagValidatorType<T> extends Child<T>, DescriptionGroup<T>
{
   public FaceletTaglibTagValidatorType<T> setValidatorId(String validatorId);

   public String getValidatorId();

   public FaceletTaglibTagValidatorType<T> setHandlerClazz(String handlerClass);

   public String getHandlerClazz();

   public FaceletTaglibTagValidatorType<T> setValidatorExtension(
         FaceletTaglibTagValidatorExtensionType<T> validatorExtension);

   public FaceletTaglibTagValidatorExtensionType<FaceletTaglibTagValidatorType<T>> getValidatorExtension();
}
