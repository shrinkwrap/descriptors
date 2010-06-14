package org.jboss.shrinkwrap.descriptor.spec.web;

public class WebResourceCollectionDef extends SecurityConstraintDef
{
   private WebResourceCollection webResourceCollection;
   
   public WebResourceCollectionDef(WebApp webApp, SecurityConstraint securityConstraint, WebResourceCollection webResourceCollection)
   {
      super(webApp, securityConstraint);
      this.webResourceCollection = webResourceCollection;
   }
   
   public WebResourceCollectionDef urlPatterns(String... urlPatterns)
   {
      for (String p : urlPatterns)
      {
         webResourceCollection.getUrlPatterns().add(p);
      }
      return this;
   }
   
   public WebResourceCollectionDef httpMethods(String... httpMethods)
   {
      for (String m : httpMethods)
      {
         webResourceCollection.getHttpMethods().add(m);
      }
      return this;
   }
}
