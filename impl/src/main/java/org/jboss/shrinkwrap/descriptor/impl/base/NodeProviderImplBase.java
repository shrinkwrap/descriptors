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
package org.jboss.shrinkwrap.descriptor.impl.base;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import org.jboss.shrinkwrap.descriptor.api.DescriptorExportException;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.NodeProvider;

/**
 * NodeProviderImplBase
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public abstract class NodeProviderImplBase extends DescriptorImplBase implements NodeProvider
{
   public NodeProviderImplBase(String name)
   {
      super(name);
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.Descriptor#exportAsString()
    */
   @Override
   public String exportAsString() throws DescriptorExportException
   {
      // Export as bytes
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      this.exportTo(baos);

      // Make a String out of the bytes
      final String content;
      try
      {
         content = baos.toString(Charset.UTF8.name());
      }
      catch (final UnsupportedEncodingException e)
      {
         throw new DescriptorExportException("Inconsistent encoding used during export", e);
      }

      // Return
      return content;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.Descriptor#exportTo(java.io.OutputStream)
    */
   @Override
   public void exportTo(OutputStream output) throws DescriptorExportException, IllegalArgumentException
   {
      if(output == null)
      {
         throw new IllegalArgumentException("Can not export to null stream");
      }
      getExporter().to(getRootNode(), output);
   }
   
   protected abstract DescriptorExporter getExporter();
}
