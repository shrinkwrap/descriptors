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
import java.io.IOException;
import java.io.InputStream;

import org.jboss.shrinkwrap.descriptor.api.spec.cdi.beans.BeansDescriptor;
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

   /*
    * SHRINKDESC-18
    */
   @Test
   public void shouldCloseStreamAfterImport() throws Exception
   {
      MockInputStream mis = new MockInputStream();
      Descriptors.importAs(WebAppDescriptor.class).from(mis); // close as default behaviour
      Assert.assertFalse(mis.isOpen());

      mis = new MockInputStream();
      Descriptors.importAs(WebAppDescriptor.class).from(mis, true);
      Assert.assertFalse(mis.isOpen());
   }

   /*
    * SHRINKDESC-18
    */
   @Test
   public void shouldNotCloseStreamAfterImport() throws Exception
   {
      MockInputStream mis = new MockInputStream();
      Descriptors.importAs(WebAppDescriptor.class).from(mis, false);
      Assert.assertTrue(mis.isOpen());
   }

   /*
    * SHRINKDESC-18
    */
   @Test
   public void shouldHandleUncloseableStreamsGently() throws Exception
   {
      FirstCloseAttemptFailingMockInputStream fmis = new FirstCloseAttemptFailingMockInputStream();
      Assert.assertEquals("Mock object not properly initialized?", 0, fmis.getCloseAttempts());
      Descriptors.importAs(WebAppDescriptor.class).from(fmis, true);
      Assert.assertTrue(fmis.getCloseAttempts() > 0);

      UncloseableMockInputStream umis = new UncloseableMockInputStream();
      Assert.assertEquals("Mock object not properly initialized?", 0, umis.getCloseAttempts());
      Descriptors.importAs(WebAppDescriptor.class).from(umis, true);
      Assert.assertTrue(umis.isOpen());
      Assert.assertTrue(umis.getCloseAttempts() > 0);
   }
   
   /**
    * SHRINKDESC-20
    */
   @Test(expected = IllegalArgumentException.class)
   public void shouldThrowExceptionOnMissingString() throws Exception
   {
      Descriptors.importAs(WebAppDescriptor.class).from((String) null);
   }

   /**
    * SHRINKDESC-20
    */
   @Test
   public void shouldBeAbleToImportWhiteSpaceString()
   {
      BeansDescriptor descriptor = Descriptors.importAs(BeansDescriptor.class).from("  \n  \n  ");
      Assert.assertNotNull("Verify the descriptor was created from an empty string",descriptor);
   }

   /**
    * SHRINKDESC-20
    */
   @Test
   public void shouldBeAbleToImportEmptyString()
   {
      BeansDescriptor descriptor = Descriptors.importAs(BeansDescriptor.class).from("");
      Assert.assertNotNull("Verify the descriptor was created from an empty string",descriptor);
   }
   
   /**
    * SHRINKDESC-20
    */
   @Test
   public void shouldBeAbleToImportEmptyFile()
   {
      BeansDescriptor descriptor = Descriptors.importAs(BeansDescriptor.class).from(getClass().getResourceAsStream("/empty.xml"));
      Assert.assertNotNull("Verify the descriptor was created from and empty file",descriptor);
   }

   //-------------------------------------------------------------------------------------||
   // Private mock classes ---------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private class MockInputStream extends InputStream
   {
      boolean isOpen = true;

      @Override
      public int read() throws IOException
      {
         return 0;
      }

      @Override
      public void close() throws IOException
      {
         super.close();
         isOpen = false;
      }

      public boolean isOpen()
      {
         return isOpen;
      }
   }

   private class UncloseableMockInputStream extends MockInputStream
   {
      protected int closeAttempts = 0;

      @Override
      public void close() throws IOException
      {
         closeAttempts = closeAttempts + 1;
         throw new IOException("This is an uncloseable input stream");
      }

      public int getCloseAttempts()
      {
         return closeAttempts;
      }
   }

   private class FirstCloseAttemptFailingMockInputStream extends UncloseableMockInputStream
   {
      @Override
      public void close() throws IOException
      {
         closeAttempts = closeAttempts + 1;
         if(getCloseAttempts() == 1)
         {
            throw new IOException("Failing first close attempt");
         }
      }
   }
}