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
package org.jboss.shrinkwrap.descriptors.test.jca16;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;

import junit.framework.Assert;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.jca15.Connector15Descriptor;
import org.jboss.shrinkwrap.descriptor.api.jca16.Connector16Descriptor;
import org.junit.Before;
import org.junit.Test;


public class Connector16DescriptorTestCase
{
   
   @Before
   public void init()
   {
      XMLUnit.setIgnoreWhitespace(true);
      XMLUnit.setIgnoreComments(true);
      XMLUnit.setNormalizeWhitespace(true);
   }
   
   //-------------------------------------------------------------------------------------||
   // Basic API --------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test
   public void testDefaultName() throws Exception
   {
      Assert.assertEquals("ra.xml", create().getDescriptorName());
   }

   @Test
   public void testSetName() throws Exception
   {
      Assert.assertEquals("test.xml", Descriptors.create(Connector16Descriptor.class, "test.xml").getDescriptorName());
   }
   
   @Test
   public void testGenExample() throws Exception 
   {
      Connector16Descriptor jca16Descr = create()
         .addDefaultNamespaces()
         .setVersion("1.6")
         .setModuleName("module-name0")
         .setDescription("description0")
         .setDisplayName("display-name0")
         .icon()
            .setSmallIcon("small-icon0")
            .setLargeIcon("large-icon0").up()
         .setVendorName("vendor-name0")
         .setEisType("eis-type0")
         .setResourceadapterVersion("resourceadapter-version0")
         .license()
            .setDescription("description1")
            .setLicenseRequired(false).up()
         .resourceadapter()
            .setResourceadapterClass("resourceadapter-class0")
            .configProperty()
               .setDescription("description2")
               .setConfigPropertyName("config-property-name0")
               .setConfigPropertyType("java.lang.Boolean")
               .setConfigPropertyValue("config-property-value0")
               .setConfigPropertyIgnore(false)
               .setConfigPropertySupportsDynamicUpdates(false)
               .setConfigPropertyConfidential(false).up()
            .outboundResourceadapter()
               .connectionDefinition()
                  .setManagedconnectionfactoryClass("managedconnectionfactory-class0")
                  .configProperty()
                     .setDescription("description3")
                     .setConfigPropertyName("config-property-name1")
                     .setConfigPropertyType("java.lang.Boolean")
                     .setConfigPropertyValue("config-property-value1")
                     .setConfigPropertyIgnore(false)
                     .setConfigPropertySupportsDynamicUpdates(false)
                     .setConfigPropertyConfidential(false).up()
                  .setConnectionfactoryInterface("connectionfactory-interface0")
                  .setConnectionfactoryImplClass("connectionfactory-impl-class0")
                  .setConnectionInterface("connection-interface0")
                  .setConnectionImplClass("connection-impl-class0").up()
               .setTransactionSupport("NoTransaction")
               .authenticationMechanism()
                  .setDescription("description4")
                  .setAuthenticationMechanismType("authentication-mechanism-type0")
                  .setCredentialInterface("javax.resource.spi.security.PasswordCredential").up()
               .setReauthenticationSupport(false).up()
            .inboundResourceadapter()
               .messageadapter()
                  .messagelistener()
                     .setMessagelistenerType("messagelistener-type0")
                     .activationspec()
                        .setActivationspecClass("activationspec-class0").up().up().up().up()
            .adminobject()
               .setAdminobjectInterface("adminobject-interface0")
               .setAdminobjectClass("adminobject-class0")
               .configProperty()
                  .setDescription("description5")
                  .setConfigPropertyName("config-property-name2")
                  .setConfigPropertyType("java.lang.Boolean")
                  .setConfigPropertyValue("config-property-value2")
                  .setConfigPropertyIgnore(false)
                  .setConfigPropertySupportsDynamicUpdates(false)
                  .setConfigPropertyConfidential(false).up().up()
            .securityPermission()
               .setDescription("description6")
               .setSecurityPermissionSpec("security-permission-spec0").up().up()
        .setRequiredWorkContext("required-work-context0");
         
       String createdRaXml = jca16Descr.exportAsString();
       String generatedRaXml = getResourceContents("src/test/resources/test-gen-connector16.xml");
 
       Diff myDiff = new Diff(generatedRaXml, createdRaXml);
       assertTrue("pieces of XML are similar " + myDiff, myDiff.similar());
       assertTrue("but are they identical? " + myDiff, myDiff.identical());       
   }
   
 
   //-------------------------------------------------------------------------------------||
   // Internal Helper --------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private String getResourceContents(String resource) throws Exception
   {
      assert resource != null && resource.length() > 0 : "Resource must be specified";
      final BufferedReader reader = new BufferedReader(new FileReader(resource));
      final StringBuilder builder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null)
      {
         builder.append(line);
         builder.append("\n");
      }
      return builder.toString();
   }
   
   private Connector16Descriptor create()
   {
      return Descriptors.create(Connector16Descriptor.class);
   }
   
}
