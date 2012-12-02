/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
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

package org.jboss.shrinkwrap.descriptor.metadata;


/**
 * Mojo configuration class for the Shrinkwrap Descriptors CLI Mojo task.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataParserPath
{
   /**
    * Full path to the API folder in which the interfaces are generated.
    * 
    */
   protected String pathToApi;

   /**
    * Full path to the implementation folder in which the classes are
    * generated.
    * 
    */
   protected String pathToImpl;

   /**
    * Full path to the test folder in which the unit tests are generated.
    * 
    */
   protected String pathToTest;

   /**
    * Full path to the service folder in which the service files are generated.
    * 
    */
   protected String pathToServices;

   /**
    * Full path to the resource folder in which schemas are copied.
    * 
    */
   protected String pathToResources;
  

   public String getPathToApi()
   {
      return pathToApi;
   }

   public void setPathToApi(final String pathToApi)
   {
      this.pathToApi = pathToApi;
   }

   public String getPathToImpl()
   {
      return pathToImpl;
   }

   public void setPathToImpl(final String pathToImpl)
   {
      this.pathToImpl = pathToImpl;
   }

   public String getPathToTest()
   {
      return pathToTest;
   }

   public void setPathToTest(final String pathToTest)
   {
      this.pathToTest = pathToTest;
   }

   public String getPathToServices()
   {
      return pathToServices;
   }

   public void setPathToServices(final String pathToServices)
   {
      this.pathToServices = pathToServices;
   }

   public String getPathToResources() 
   {
	  return pathToResources;
   }

   public void setPathToResources(final String pathToResources) 
   {
	  this.pathToResources = pathToResources;
   }   
   
}
