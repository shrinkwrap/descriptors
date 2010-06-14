package org.jboss.shrinkwrap.descriptor.spec.web;

// TODO could be generic since servlet can use it too
public class FilterDef extends WebAppDef
{
   protected Filter filter;
   
   public FilterDef(WebApp webApp, Filter filter)
   {
      super(webApp);
      this.filter = filter;
   }
   
   public FilterDef initParam(String name, String value)
   {
      filter.getInitParams().add(new Param(name, value));
      return this;
   }
}
