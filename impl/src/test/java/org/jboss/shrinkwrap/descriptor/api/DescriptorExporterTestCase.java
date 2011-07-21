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

import java.io.ByteArrayOutputStream;

import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Verify behavior of {@link DescriptorExporter}
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class DescriptorExporterTestCase
{

   @Test
   public void shouldBeAbleToExportToStream() throws Exception
   {
      final String name = DescriptorExporterTestCase.class.getName();
      final WebAppDescriptor descriptor = Descriptors.create(WebAppDescriptor.class).displayName(name);

      final ByteArrayOutputStream output = new ByteArrayOutputStream();
      descriptor.exportTo(output);

      Assert.assertTrue("Verify content has been exported", output.size() > 0);

      Assert.assertTrue("Verify name is a part of content", output.toString().contains(name));
   }

   @Test(expected = IllegalArgumentException.class)
   public void shouldThrowExceptionOnMissingOutputStream() throws Exception
   {
      final WebAppDescriptor descriptor = Descriptors.create(WebAppDescriptor.class);
      descriptor.exportTo(null);
   }
}
