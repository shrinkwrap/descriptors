package org.jboss.shrinkwrap.descriptor.spec.web;

public class SecurityConstraintDef extends WebAppDef
{
   protected SecurityConstraint securityConstraint;
   
   public SecurityConstraintDef(WebApp webApp, SecurityConstraint securityConstraint)
   {
      super(webApp);
      this.securityConstraint = securityConstraint;
   }
   
   public WebResourceCollectionDef webResourceCollection()
   {
      WebResourceCollection webResourceCollection = new WebResourceCollection();
      securityConstraint.getWebResourceCollections().add(webResourceCollection);
      return new WebResourceCollectionDef(webApp, securityConstraint, webResourceCollection);
   }
   
   public WebResourceCollectionDef webResourceCollection(String name)
   {
      WebResourceCollection webResourceCollection = new WebResourceCollection(name);
      securityConstraint.getWebResourceCollections().add(webResourceCollection);
      return new WebResourceCollectionDef(webApp, securityConstraint, webResourceCollection);
   }
   
   // TODO maybe remove this
   public SecurityConstraintDef webResourceCollection(String name, String urlPattern, String... httpMethods)
   {
      securityConstraint.getWebResourceCollections().add(new WebResourceCollection(name, new String[] { urlPattern }, httpMethods));
      return this;
   }
   
   // TODO maybe remove this
   public SecurityConstraintDef webResourceCollection(String name, String[] urlPatterns, String... httpMethods)
   {
      securityConstraint.getWebResourceCollections().add(new WebResourceCollection(name, urlPatterns, httpMethods));
      return this;
   }
   
   public SecurityConstraintDef authConstraint(String... roleNames)
   {
      securityConstraint.setAuthConstraint(new AuthConstraint(roleNames));
      return this;
   }
   
   public SecurityConstraintDef userDataConstraint(String transportGuarantee)
   {
      securityConstraint.setUserDataConstraint(new UserDataConstraint(transportGuarantee));
      return this;
   }
}
