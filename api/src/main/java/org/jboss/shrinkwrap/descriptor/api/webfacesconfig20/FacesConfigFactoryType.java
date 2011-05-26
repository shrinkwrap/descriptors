package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigFactoryType<T> extends Child<T>
{
   public FacesConfigFactoryType<T> setApplicationFactory(String applicationFactory);

   public String getApplicationFactory();

   public FacesConfigFactoryType<T> setExceptionHandlerFactory(String exceptionHandlerFactory);

   public String getExceptionHandlerFactory();

   public FacesConfigFactoryType<T> setExternalContextFactory(String externalContextFactory);

   public String getExternalContextFactory();

   public FacesConfigFactoryType<T> setFacesContextFactory(String facesContextFactory);

   public String getFacesContextFactory();

   public FacesConfigFactoryType<T> setPartialViewContextFactory(String partialViewContextFactory);

   public String getPartialViewContextFactory();

   public FacesConfigFactoryType<T> setLifecycleFactory(String lifecycleFactory);

   public String getLifecycleFactory();

   public FacesConfigFactoryType<T> setViewDeclarationLanguageFactory(String viewDeclarationLanguageFactory);

   public String getViewDeclarationLanguageFactory();

   public FacesConfigFactoryType<T> setTagHandlerDelegateFactory(String tagHandlerDelegateFactory);

   public String getTagHandlerDelegateFactory();

   public FacesConfigFactoryType<T> setRenderKitFactory(String renderKitFactory);

   public String getRenderKitFactory();

   public FacesConfigFactoryType<T> setVisitContextFactory(String visitContextFactory);

   public String getVisitContextFactory();

   public FacesConfigFactoryType<T> setFactoryExtension(FacesConfigFactoryExtensionType<T> factoryExtension);

   public FacesConfigFactoryExtensionType<FacesConfigFactoryType<T>> getFactoryExtension();
}
