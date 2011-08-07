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
package org.jboss.shrinkwrap.descriptors.test.jca15;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;

import junit.framework.Assert;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.cdi10.Beans10Descriptor;
import org.jboss.shrinkwrap.descriptor.api.jca15.Connector15Descriptor;
import org.junit.Before;
import org.junit.Test;


public class Connector15DescriptorTestCase
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
      Assert.assertEquals("test.xml", Descriptors.create(Beans10Descriptor.class, "test.xml").getDescriptorName());
   }
   
   @Test
   public void testHornetQExample() throws Exception 
   {
      Connector15Descriptor jca15Generated = create()
         .addDefaultNamespaces()
         .setVersion("1.5")
         .setDescription("HornetQ 2.0 Resource Adapter")
         .setDisplayName("HornetQ 2.0 Resource Adapter")
         .setVendorName("Red Hat Middleware LLC")
         .setEisType("JMS 1.1 Server")
         .setResourceadapterVersion("1.0")
         .license()
            .setDescription("Copyright 2009 Red Hat, Inc. " +
 "Red Hat licenses this file to you under the Apache License, version " +
 "2.0 (the \"License\"); you may not use this file except in compliance " +
 "with the License.  You may obtain a copy of the License at " +
 "  http://www.apache.org/licenses/LICENSE-2.0 " +
 "Unless required by applicable law or agreed to in writing, software " +
 "distributed under the License is distributed on an \"AS IS\" BASIS, " +
 "WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or " +
 "implied.  See the License for the specific language governing " +
 "permissions and limitations under the License.")
            .setLicenseRequired(true).up()         
         .resourceadapter()
            .setResourceadapterClass("org.hornetq.ra.HornetQResourceAdapter")
            .configProperty()
               .setDescription("The transport type. Multiple connectors can be configured by using a comma separated list, "+
                  "i.e. org.hornetq.core.remoting.impl.invm.InVMConnectorFactory,org.hornetq.core.remoting.impl.invm.InVMConnectorFactory.")
               .setConfigPropertyName("ConnectorClassName")
               .setConfigPropertyType("java.lang.String")
               .setConfigPropertyValue("org.hornetq.core.remoting.impl.invm.InVMConnectorFactory").up()
            .configProperty()
               .setDescription("The transport configuration. These values must be in the form of key=val;key=val;, "+
                     "if multiple connectors are used then each set must be separated by a comma i.e. host=host1;port=5445,host=host2;port=5446. "+
                     "Each set of params maps to the connector classname specified.")
               .setConfigPropertyName("ConnectionParameters")
               .setConfigPropertyType("java.lang.String")
               .setConfigPropertyValue("server-id=0").up()
            .outboundResourceadapter()
               .connectionDefinition()
                  .setManagedconnectionfactoryClass("org.hornetq.ra.HornetQRAManagedConnectionFactory")
                  .configProperty()
                     .setDescription("The default session type")
                     .setConfigPropertyName("SessionDefaultType")
                     .setConfigPropertyType("java.lang.String")
                     .setConfigPropertyValue("javax.jms.Queue").up()
                  .configProperty()
                     .setDescription("Try to obtain a lock within specified number of seconds; less than or equal to 0 disable this functionality")
                     .setConfigPropertyName("UseTryLock")
                     .setConfigPropertyType("java.lang.Integer")
                     .setConfigPropertyValue("0").up()
                  .setConnectionfactoryInterface("org.hornetq.ra.HornetQRAConnectionFactory")
                  .setConnectionfactoryImplClass("org.hornetq.ra.HornetQRAConnectionFactoryImpl")
                  .setConnectionInterface("javax.jms.Session")
                  .setConnectionImplClass("org.hornetq.ra.HornetQRASession")
                  .up()
              .setTransactionSupport("XATransaction")
              .authenticationMechanism()
                 .setAuthenticationMechanismType("BasicPassword")
                 .setCredentialInterface("javax.resource.spi.security.PasswordCredential")
                 .up()
              .setReauthenticationSupport(false)
              .up()
           .inboundResourceadapter()
              .messageadapter()
                 .messagelistener()
                    .setMessagelistenerType("javax.jms.MessageListener")
                    .activationspec()
                       .setActivationspecClass("org.hornetq.ra.inflow.HornetQActivationSpec")
                       .requiredConfigProperty()
                          .setConfigPropertyName("destination").up()
                    .up()
                 .up()
              .up()
           .up()
       .up();
        
       String generatedRaXml = jca15Generated.exportAsString();
       String hornetQRaXml = this.getResourceContents("src/test/resources/test-orig-connector15.xml");
 
       Diff myDiff = new Diff(hornetQRaXml, generatedRaXml);
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
   
   private Connector15Descriptor create()
   {
      return Descriptors.create(Connector15Descriptor.class);
   }
   
}
