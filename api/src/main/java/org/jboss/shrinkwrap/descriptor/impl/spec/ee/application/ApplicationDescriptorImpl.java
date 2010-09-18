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

import org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.impl.base.SchemaDescriptorImplBase;

/**
 * ApplicationDescriptorImpl
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class ApplicationDescriptorImpl extends SchemaDescriptorImplBase<ApplicationModel> implements ApplicationDescriptor
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private ApplicationModel model;
   
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public ApplicationDescriptorImpl()
   {
      this(new ApplicationModel());
      
   }
   
   public ApplicationDescriptorImpl(ApplicationModel model)
   {
      this.model = model;
   }
   
   //-------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#description()
    */
   @Override
   public ApplicationDescriptor description(String description)
   {
      model.setDescription(description);
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#displayName(java.lang.String)
    */
   @Override
   public ApplicationDescriptor displayName(String displayName)
   {
      model.setDisplayName(displayName);
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#libraryDirectory(java.lang.String)
    */
   @Override
   public ApplicationDescriptor libraryDirectory(String libraryDirectory)
   {
      model.setLibraryDirectory(libraryDirectory);
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#ejbModule(java.lang.String)
    */
   public ApplicationDescriptor ejbModule(String uri) 
   {
      model.getEjbModules().add(uri);
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#javaModule(java.lang.String)
    */
   @Override
   public ApplicationDescriptor javaModule(String uri)
   {
      model.getJavaModules().add(uri);
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#connectorModule(java.lang.String)
    */
   @Override
   public ApplicationDescriptor connectorModule(String uri)
   {
      model.getConnectorModules().add(uri);
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#webModule(java.lang.String, java.lang.String)
    */
   @Override
   public ApplicationDescriptor webModule(String uri, String contextRoot)
   {
      model.getWebModules().add(new WebModuleImpl(uri, contextRoot));
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#version(java.lang.String)
    */
   @Override
   public ApplicationDescriptor version(String version)
   {
      model.setVersion(version);
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#securityRole(java.lang.String)
    */
   @Override
   public ApplicationDescriptor securityRole(String roleName)
   {
      model.getSecurityRoles().add(new SecurityRole(roleName));
      return this;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.spec.ee.application.ApplicationDescriptor#securityRole(java.lang.String, java.lang.String)
    */
   @Override
   public ApplicationDescriptor securityRole(String roleName, String description)
   {
      model.getSecurityRoles().add(new SecurityRole(roleName, description));
      return this;
   }
   
   //-------------------------------------------------------------------------------------||
   // Required Implementations - SchemaDescriptorImplBase --------------------------------||
   //-------------------------------------------------------------------------------------||

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.spi.SchemaDescriptorProvider#getSchemaModel()
    */
   @Override
   public ApplicationModel getSchemaModel()
   {
      return model;
   }
}
