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

import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * DescriptorsTestCase
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
@Ignore // To be moved
public class DescriptorsTestCase
{
   private final String source = ""
         + "<web-app "
         + "      xmlns=\"http://java.sun.com/xml/ns/javaee\" "
         + "      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
         + "      version=\"3.0\" "
         + "      xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd\">\n"
         + "    <filter>\n" + "        <filter-name>UrlRewriteFilter</filter-name>\n"
         + "        <filter-class>org.tuckey.web.filters.urlrewrite.UrlRewriteFilter</filter-class>\n"
         + "    </filter>\n" + "    <filter-mapping>\n" + "        <url-pattern>/*</url-pattern>\n"
         + "        <filter-name>UrlRewriteFilter</filter-name>\n" + "    </filter-mapping>\n" + "</web-app>";

   @Test
   public void shouldBeAbleToContructDescriptor() throws Exception
   {
      WebAppDescriptor web = Descriptors.create(WebAppDescriptor.class);
      Assert.assertNotNull(web);
   }

   @Test
   public void shouldBeAbleToConstructDescriptorFromString() throws Exception
   {
      final WebAppDescriptor web = Descriptors.importAs(WebAppDescriptor.class).from(
            new ByteArrayInputStream(source.getBytes()));

      Assert.assertNotNull(web);

      Assert.assertEquals(1, web.getFilters().size());
      Assert.assertEquals(1, web.getFilterMappings().size());
   }
}
