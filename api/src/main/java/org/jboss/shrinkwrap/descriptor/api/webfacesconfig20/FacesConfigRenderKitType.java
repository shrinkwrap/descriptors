package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigRenderKitType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigRenderKitType<T> setRenderKitId(String renderKitId);

   public String getRenderKitId();

   public FacesConfigRenderKitType<T> setRenderKitClazz(String renderKitClass);

   public String getRenderKitClazz();

   public FacesConfigRenderKitType<T> setRenderer(FacesConfigRendererType<T> renderer);

   public FacesConfigRendererType<FacesConfigRenderKitType<T>> getRenderer();

   public FacesConfigRenderKitType<T> setClientBehaviorRenderer(
         FacesConfigClientBehaviorRendererType<T> clientBehaviorRenderer);

   public FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>> getClientBehaviorRenderer();

   public FacesConfigRenderKitType<T> setRenderKitExtension(FacesConfigRenderKitExtensionType<T> renderKitExtension);

   public FacesConfigRenderKitExtensionType<FacesConfigRenderKitType<T>> getRenderKitExtension();
}
