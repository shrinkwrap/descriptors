package org.jboss.shrinkwrap.descriptor.impl.spec.servlet.web;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.javaee6.webapp.WebAppDescriptor;
import org.junit.Test;

public class MyWebAppTestCase
{

   @Test
   public void myFirstTest() throws Exception
   {
      final String webApp = Descriptors.create(WebAppDescriptor.class)
         .version("3.0")
         .absoluteOrdering().name("", "", "").others().up()
         .securityConstraint().displayName("").authConstraint().description("").roleName("").up().up()
         .filter().filterName("").filterClass("").asyncSupported(false).up()
         .exportAsString();
   }
}
