package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigType<T> extends Child<T>
{
   public FacesConfigType<T> setApplication(FacesConfigApplicationType<T> application);

   public FacesConfigApplicationType<FacesConfigType<T>> getApplication();

   public FacesConfigType<T> setOrdering(FacesConfigOrderingType<T> ordering);

   public FacesConfigOrderingType<FacesConfigType<T>> getOrdering();

   public FacesConfigType<T> setAbsoluteOrdering(FacesConfigAbsoluteOrderingType<T> absoluteOrdering);

   public FacesConfigAbsoluteOrderingType<FacesConfigType<T>> getAbsoluteOrdering();

   public FacesConfigType<T> setFactory(FacesConfigFactoryType<T> factory);

   public FacesConfigFactoryType<FacesConfigType<T>> getFactory();

   public FacesConfigType<T> setComponent(FacesConfigComponentType<T> component);

   public FacesConfigComponentType<FacesConfigType<T>> getComponent();

   public FacesConfigType<T> setConverter(FacesConfigConverterType<T> converter);

   public FacesConfigConverterType<FacesConfigType<T>> getConverter();

   public FacesConfigType<T> setManagedBean(FacesConfigManagedBeanType<T> managedBean);

   public FacesConfigManagedBeanType<FacesConfigType<T>> getManagedBean();

   public FacesConfigType<T> setName(String name);

   public String getName();

   public FacesConfigType<T> setNavigationRule(FacesConfigNavigationRuleType<T> navigationRule);

   public FacesConfigNavigationRuleType<FacesConfigType<T>> getNavigationRule();

   public FacesConfigType<T> setReferencedBean(FacesConfigReferencedBeanType<T> referencedBean);

   public FacesConfigReferencedBeanType<FacesConfigType<T>> getReferencedBean();

   public FacesConfigType<T> setRenderKit(FacesConfigRenderKitType<T> renderKit);

   public FacesConfigRenderKitType<FacesConfigType<T>> getRenderKit();

   public FacesConfigType<T> setLifecycle(FacesConfigLifecycleType<T> lifecycle);

   public FacesConfigLifecycleType<FacesConfigType<T>> getLifecycle();

   public FacesConfigType<T> setValidator(FacesConfigValidatorType<T> validator);

   public FacesConfigValidatorType<FacesConfigType<T>> getValidator();

   public FacesConfigType<T> setBehavior(FacesConfigBehaviorType<T> behavior);

   public FacesConfigBehaviorType<FacesConfigType<T>> getBehavior();

   public FacesConfigType<T> setFacesConfigExtension(FacesConfigExtensionType<T> facesConfigExtension);

   public FacesConfigExtensionType<FacesConfigType<T>> getFacesConfigExtension();
}
