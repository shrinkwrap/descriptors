package org.jboss.shrinkwrap.descriptor.api.webfacelettaglibrary20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FaceletTaglibTagConverterType<T> extends Child<T>, DescriptionGroup<T>
{
   public FaceletTaglibTagConverterType<T> setConverterId(String converterId);

   public String getConverterId();

   public FaceletTaglibTagConverterType<T> setHandlerClazz(String handlerClass);

   public String getHandlerClazz();

   public FaceletTaglibTagConverterType<T> setConverterExtension(
         FaceletTaglibTagConverterExtensionType<T> converterExtension);

   public FaceletTaglibTagConverterExtensionType<FaceletTaglibTagConverterType<T>> getConverterExtension();
}
