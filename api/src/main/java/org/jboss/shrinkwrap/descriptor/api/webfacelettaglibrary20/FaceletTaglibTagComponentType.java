package org.jboss.shrinkwrap.descriptor.api.webfacelettaglibrary20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FaceletTaglibTagComponentType<T> extends Child<T>, DescriptionGroup<T>
{
   public FaceletTaglibTagComponentType<T> setComponentType(String componentType);

   public String getComponentType();

   public FaceletTaglibTagComponentType<T> setRendererType(String rendererType);

   public String getRendererType();

   public FaceletTaglibTagComponentType<T> setHandlerClazz(String handlerClass);

   public String getHandlerClazz();

   public FaceletTaglibTagComponentType<T> setComponentExtension(
         FaceletTaglibTagComponentExtensionType<T> componentExtension);

   public FaceletTaglibTagComponentExtensionType<FaceletTaglibTagComponentType<T>> getComponentExtension();
}
