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

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * DescriptorImporter
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public final class DescriptorImporter
{
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /*
    * Private Constructor, not constructible.
    */
   private DescriptorImporter() {}
   
   //-------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public static <T extends Descriptor> T from(Class<T> descriptorClass, InputStream xml)
   {
      if(descriptorClass == null)
      {
         throw new IllegalArgumentException("DescriptorClass must be specified");
      }
      if(xml == null)
      {
         throw new IllegalArgumentException("InputStream must be specified");
      }

      try
      {
         JAXBContext context = JAXBContext.newInstance(descriptorClass);
         Unmarshaller u = context.createUnmarshaller();
         Object descriptor = u.unmarshal(xml);
         
         if(!descriptorClass.isInstance(descriptor))
         {
            throw new DescriptorImportException(
                  "Unmarshalled descriptor not of expected type, " +
                  "expected[" + descriptorClass.getName() + "] but found[" + descriptor.getClass().getName() + "]");
         }
         return descriptorClass.cast(descriptor);
      }
      catch (JAXBException e)
      {
         throw new DescriptorImportException("Could not import descriptor " + descriptorClass, e);
      }
   }
}
