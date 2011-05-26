package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigBehaviorType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigBehaviorType<T> setBehaviorId(String behaviorId);

   public String getBehaviorId();

   public FacesConfigBehaviorType<T> setBehaviorClazz(String behaviorClass);

   public String getBehaviorClazz();

   public FacesConfigBehaviorType<T> setAttribute(FacesConfigAttributeType<T> attribute);

   public FacesConfigAttributeType<FacesConfigBehaviorType<T>> getAttribute();

   public FacesConfigBehaviorType<T> setProperty(FacesConfigPropertyType<T> property);

   public FacesConfigPropertyType<FacesConfigBehaviorType<T>> getProperty();

   public FacesConfigBehaviorType<T> setBehaviorExtension(FacesConfigBehaviorExtensionType<T> behaviorExtension);

   public FacesConfigBehaviorExtensionType<FacesConfigBehaviorType<T>> getBehaviorExtension();
}
