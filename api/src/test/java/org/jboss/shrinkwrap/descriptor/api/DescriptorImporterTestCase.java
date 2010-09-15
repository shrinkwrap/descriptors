/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.api;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor;
import org.junit.Assert;
import org.junit.Test;


/**
 * Verify behavior of {@link SchemaDescriptorImporter}
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class DescriptorImporterTestCase
{
   private static final String SOURCE = "" +
                     "<web-app " +
                     "      xmlns=\"http://java.sun.com/xml/ns/javaee\" " +
                     "      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                     "      version=\"3.0\" " +
                     "      xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd\">\n" + 
                     "    <filter>\n" + 
                     "        <filter-name>UrlRewriteFilter</filter-name>\n" + 
                     "        <filter-class>org.tuckey.web.filters.urlrewrite.UrlRewriteFilter</filter-class>\n" + 
                     "    </filter>\n" + 
                     "    <filter-mapping>\n" + 
                     "        <url-pattern>/*</url-pattern>\n" + 
                     "        <filter-name>UrlRewriteFilter</filter-name>\n" + 
                     "    </filter-mapping>\n" + 
                     "</web-app>"; 

   @Test
   public void shouldBeAbleToImportFromStream() throws Exception
   {
      
      WebAppDescriptor descriptor = Descriptors.importAs(WebAppDescriptor.class).from(new ByteArrayInputStream(SOURCE.getBytes()));
      
      Assert.assertNotNull(
            "Verify the descriptor was created", 
            descriptor);
      
      Assert.assertEquals(
            "Verify 1 filter was imported", 
            1, descriptor.getFilters().size());
      
      Assert.assertEquals(
            "Verify 1 FilterMapping was imported", 
            1, descriptor.getFilterMappings().size());
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void shouldThrowExceptionOnMissingDescriptor() throws Exception
   {
      Descriptors.importAs(null);
   }

   @Test(expected = IllegalArgumentException.class)
   public void shouldThrowExceptionOnMissingInputStream() throws Exception
   {
      Descriptors.importAs(WebAppDescriptor.class).from((InputStream) null);
   }
}