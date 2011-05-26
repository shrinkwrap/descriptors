package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20; 
public interface FacesConfigNavigationCaseType<T> extends Child<T>
, DescriptionGroup<T>
{
   public FacesConfigNavigationCaseType<T> setFromAction(FacesConfigElExpressionType<T> fromAction);
   public FacesConfigElExpressionType<FacesConfigNavigationCaseType<T>> getFromAction();
   public FacesConfigNavigationCaseType<T> setFromOutcome(String fromOutcome);
   public String getFromOutcome();
   public FacesConfigNavigationCaseType<T> setIf(FacesConfigElExpressionType<T> if);
   public FacesConfigElExpressionType<FacesConfigNavigationCaseType<T>> getIf();
   public FacesConfigNavigationCaseType<T> setToViewId(FacesConfigValueType<T> toViewId);
   public FacesConfigValueType<FacesConfigNavigationCaseType<T>> getToViewId();
   public FacesConfigNavigationCaseType<T> setRedirect(FacesConfigRedirectType<T> redirect);
   public FacesConfigRedirectType<FacesConfigNavigationCaseType<T>> getRedirect();
}
