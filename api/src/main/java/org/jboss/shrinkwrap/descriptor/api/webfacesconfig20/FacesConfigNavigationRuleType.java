package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigNavigationRuleType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigNavigationRuleType<T> setFromViewId(String fromViewId);

   public String getFromViewId();

   public FacesConfigNavigationRuleType<T> setNavigationCase(FacesConfigNavigationCaseType<T> navigationCase);

   public FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>> getNavigationCase();

   public FacesConfigNavigationRuleType<T> setNavigationRuleExtension(
         FacesConfigNavigationRuleExtensionType<T> navigationRuleExtension);

   public FacesConfigNavigationRuleExtensionType<FacesConfigNavigationRuleType<T>> getNavigationRuleExtension();
}
