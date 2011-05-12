package org.jboss.shrinkwrap.descriptor.impl.spec.servlet.web;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.junit.Test;

public class MyWebAppTestCase
{

   @Test
   public void myFirstTest() throws Exception
   {
      final String webApp = Descriptors.create(WebAppDescriptor.class)
         .absoluteOrdering().name("name1").name("name2").up()
         .securityConstraint().displayName("displayName").authConstraint().description("description").roleName("manager").up().up()
         .filter().filterName("").filterClass("").asyncSupported(false).up()
         .exportAsString();
   }
}
