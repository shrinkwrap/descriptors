/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.spec.ee.application;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.spec.cdi.beans.BeansDescriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor;
import org.junit.Test;

/**
 * ApplicationDescriptorTestCase
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class ApplicationDescriptorTestCase
{
   private String description = "description";
   private String moduleName = "test.jar";
   private String contextRoot = "/";

   @Test
   public void shouldCreateDefaultName() throws Exception
   {
      Assert.assertEquals("application.xml", create().getDescriptorName());
   }

   @Test
   public void shouldBeAbleToSetName() throws Exception
   {
      Assert.assertEquals("test.xml", Descriptors.create(ApplicationDescriptor.class, "test.xml").getDescriptorName());
   }

   @Test
   public void shouldBeAbleToAddDescription() throws Exception
   {
      String desc = create()
                     .description(moduleName)
                     .exportAsString();
      
      assertXPath(desc, "/application/description", moduleName);
   }

   @Test
   public void shouldBeAbleToAddDisplayName() throws Exception
   {
      String desc = create()
                     .displayName(moduleName)
                     .exportAsString();
      
      assertXPath(desc, "/application/display-name", moduleName);
   }

   @Test
   public void shouldBeAbleToAddLibraryDirectory() throws Exception
   {
      String desc = create()
                     .libraryDirectory(moduleName)
                     .exportAsString();
      
      assertXPath(desc, "/application/library-directory", moduleName);
   }

   @Test
   public void shouldBeAbleToAddAEJBModule() throws Exception
   {
      String desc = create()
                     .ejbModule(moduleName)
                     .exportAsString();
      
      assertXPath(desc, "/application/module/ejb", moduleName);
   }
   
   @Test
   public void shouldBeAbleToAddAConnectorModule() throws Exception
   {
      String desc = create()
                     .connectorModule(moduleName)
                     .exportAsString();
      
      assertXPath(desc, "/application/module/connector", moduleName);
   }
   
   @Test
   public void shouldBeAbleToAddAJavaModule() throws Exception
   {
      String desc = create()
                     .javaModule(moduleName)
                     .exportAsString();
      
      assertXPath(desc, "/application/module/java", moduleName);
   }
   
   @Test
   public void shouldBeAbleToAddAWebModule() throws Exception
   {
      String desc = create()
                     .webModule(moduleName, contextRoot)
                     .exportAsString();

      assertXPath(desc, "/application/module/web/web-uri", moduleName);
      assertXPath(desc, "/application/module/web/context-root", contextRoot);
   }

   @Test
   public void shouldBeAbleToAddASecurityRole() throws Exception
   {
      String desc = create()
                     .securityRole(moduleName)
                     .exportAsString();

      assertXPath(desc, "/application/security-role/role-name", moduleName);
   }

   @Test
   public void shouldBeAbleToAddASecurityRoleWithDescription() throws Exception
   {
      String desc = create()
                     .securityRole(moduleName, description)
                     .exportAsString();

      assertXPath(desc, "/application/security-role/role-name", moduleName);
      assertXPath(desc, "/application/security-role/description", description);
   }

   private ApplicationDescriptor create() 
   {
      return Descriptors.create(ApplicationDescriptor.class);
   }
}
