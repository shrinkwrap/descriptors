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
package org.jboss.shrinkwrap.descriptor.api.application5;


import org.junit.Ignore;
import org.junit.Test;


/**
 * Tests to ensure that the API contract for {@link ApplicationDescriptor}
 * is working as expected
 *
 */
@Ignore
public class ApplicationDescriptorTestCase
{
 
   @Test
   public void subElementRoundtrip() 
   { 
      final ApplicationDescriptor appDescriptor = null;
      final MutableApplicationDescriptor appDescriptorMutable = null;

      // test all nested elements are immutable by default
      appDescriptor.getAllModule().get(0).getWeb().getContextRoot();
      appDescriptor.getAllModule().get(0).getWeb().getWebUri();
      appDescriptor.getAllDescription();
      appDescriptor.getAllDisplayName();
      appDescriptor.getLibraryDirectory();
      appDescriptor.getAllModule().get(0).getWeb().up().up();
      
      appDescriptorMutable.createModule();
      
      
      // test toMutable() and traversing back to the original descriptor
//      appDescriptor.getAllModule().get(0).toMutable().getOrCreateWeb().removeContextRoot().removeWebUri().up().up();
      
      appDescriptorMutable.createModule().altDd("").connector("").ejb("").getOrCreateWeb().up().up();
      
      
//      appTypeImmutable.;
//      appTypeMutable.toImmutable().toMutable();
      
//      appTypeMutable.createModule().
   }
   
//   @Test
//   public void subElementRoundtripCopy() 
//   { 
//      final org.jboss.shrinkwrap.descriptor.api.application5.copy.ModuleTypeMutable moduleType = null;
//      moduleType.
//      
//      
//      
//      
//      final ApplicationTypeMutable appTypeMutable = null;
//      final ApplicationTypeImmutable appTypeImmutable;
//      
//      appTypeMutable.toImmutable().toMutable();
//      
//      appTypeMutable.createModule().getOrCreateWeb().
//   }
   
   
   @Test
   public void mutableRoundtrip() 
   {      
       // Make a new descriptor
       final ApplicationDescriptor readonly = null;
       
       // Get a mutable view
       final MutableApplicationDescriptor mutable = readonly.toMutable();

       mutable.getOrCreateModule().getOrCreateWeb().webUri("two").up().up();

       // Roundtrip to immutable
       final ApplicationDescriptor roundtrip = mutable.toImmutable();

       roundtrip.getAllModule().get(0).getWeb().getWebUri();
//       roundtrip.getAllModule().get(0).getWeb().removeWebUri(); // not allowed ...
       
       System.out.println("Roundtrip: "+roundtrip.exportAsString());

       // Ensure the roundtrip still has a filter w/ two descriptions
//       Assert.assertEquals(2, roundtrip..getAllFilter().get(0).getAllDescription().size());


   }
   
// This experiment shows that there are fundamental design issues not solved ... I believe
// that after the API change this will be easier to solve.
   
//   private class ApplicationDescriptorImpl implements ApplicationDescriptor, MutableApplicationDescriptor 
//   {
//
//      @Override
//      public String getDescriptorName()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public String exportAsString() throws DescriptorExportException
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public void exportTo(OutputStream output) throws DescriptorExportException, IllegalArgumentException
//      {
//         // TODO Auto-generated method stub
//         
//      }
//
//      @Override
//      public MutableApplicationType<ApplicationDescriptor> toMutable()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public List<String> getAllDescription()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public List<String> getAllDisplayName()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public List<ModuleType<ApplicationDescriptor>> getAllModule()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//      
//      public List<MutableModuleType<MutableApplicationDescriptor>> getAllModule() {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public String getLibraryDirectory()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public String getVersion()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public ApplicationType<MutableApplicationDescriptor> toImmutable()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableApplicationDescriptor description(String... values)
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableApplicationDescriptor removeAllDescription()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableApplicationDescriptor displayName(String... values)
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableApplicationDescriptor removeAllDisplayName()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableModuleType<MutableApplicationDescriptor> getOrCreateModule()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableModuleType<MutableApplicationDescriptor> createModule()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableApplicationDescriptor removeAllModule()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableApplicationDescriptor libraryDirectory(String libraryDirectory)
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableApplicationDescriptor removeLibraryDirectory()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableApplicationDescriptor version(String version)
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//      @Override
//      public MutableApplicationDescriptor removeVersion()
//      {
//         // TODO Auto-generated method stub
//         return null;
//      }
//
//   }
}
