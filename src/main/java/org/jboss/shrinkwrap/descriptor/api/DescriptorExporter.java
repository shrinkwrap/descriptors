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

import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

/**
 * DescriptorExporter
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public final class DescriptorExporter
{
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /*
    * Private Constructor, not constructible.
    */
   private DescriptorExporter() {}
   
   //-------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * @param descriptor
    * @param output
    */
   public static void to(final Descriptor descriptor, final OutputStream output) 
   {
      try
      {
         JAXBContext context = JAXBContext.newInstance(descriptor.getClass());
         Marshaller m = context.createMarshaller();
         m.setProperty(Marshaller.JAXB_ENCODING, Charset.UTF8.name());
         m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, descriptor.getSchemaLocation());
         m.marshal(descriptor, output);
      }
      catch (PropertyException e)
      {
         throw new DescriptorExportException("Could not export descriptor " + descriptor, e);
      }
      catch (JAXBException e)
      {
         throw new DescriptorExportException("Could not export descriptor " + descriptor, e);
      }
   }
}
