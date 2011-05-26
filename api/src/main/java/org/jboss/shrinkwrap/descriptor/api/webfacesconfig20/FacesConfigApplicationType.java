package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigApplicationType<T> extends Child<T>
{
   public FacesConfigApplicationType<T> setActionListener(String actionListener);

   public String getActionListener();

   public FacesConfigApplicationType<T> setDefaultRenderKitId(String defaultRenderKitId);

   public String getDefaultRenderKitId();

   public FacesConfigApplicationType<T> setMessageBundle(String messageBundle);

   public String getMessageBundle();

   public FacesConfigApplicationType<T> setNavigationHandler(String navigationHandler);

   public String getNavigationHandler();

   public FacesConfigApplicationType<T> setViewHandler(String viewHandler);

   public String getViewHandler();

   public FacesConfigApplicationType<T> setStateManager(String stateManager);

   public String getStateManager();

   public FacesConfigApplicationType<T> setElResolver(String elResolver);

   public String getElResolver();

   public FacesConfigApplicationType<T> setPropertyResolver(String propertyResolver);

   public String getPropertyResolver();

   public FacesConfigApplicationType<T> setVariableResolver(String variableResolver);

   public String getVariableResolver();

   public FacesConfigApplicationType<T> setResourceHandler(String resourceHandler);

   public String getResourceHandler();

   public FacesConfigApplicationType<T> setSystemEventListener(FacesConfigSystemEventListenerType<T> systemEventListener);

   public FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>> getSystemEventListener();

   public FacesConfigApplicationType<T> setLocaleConfig(FacesConfigLocaleConfigType<T> localeConfig);

   public FacesConfigLocaleConfigType<FacesConfigApplicationType<T>> getLocaleConfig();

   public FacesConfigApplicationType<T> setResourceBundle(FacesConfigApplicationResourceBundleType<T> resourceBundle);

   public FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>> getResourceBundle();

   public FacesConfigApplicationType<T> setApplicationExtension(
         FacesConfigApplicationExtensionType<T> applicationExtension);

   public FacesConfigApplicationExtensionType<FacesConfigApplicationType<T>> getApplicationExtension();

   public FacesConfigApplicationType<T> setDefaultValidators(FacesConfigDefaultValidatorsType<T> defaultValidators);

   public FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>> getDefaultValidators();
}
