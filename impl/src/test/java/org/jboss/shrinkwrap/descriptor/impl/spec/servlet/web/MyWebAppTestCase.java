package org.jboss.shrinkwrap.descriptor.impl.spec.servlet.web;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.junit.Test;

public class MyWebAppTestCase
{

   @Test
   public void myFirstTest() throws Exception
   {
      final String webApp = Descriptors.create(WebAppDescriptor.class)
         .distributable()
//         .addEnvEntries(EnvEntryType.envEntryName(""))
//         .envEntry().envEntryName("entryName1").envEntryType("java.lang.Integer").envEntryValue("2")
         
//         .ejbLocalRef().local("local").ejbRefName("refName").injectionTarget().injectionTargetClass("class").up().mappedName("mappedName").up()
         .absoluteOrdering().name("name1").name("name2").up()
         .securityConstraint().displayName("displayName").authConstraint().description("description").roleName("manager").up().up()
//         .filter().filterName("").filterClass("").asyncSupported(false).up()
         .exportAsString();
   }
}
