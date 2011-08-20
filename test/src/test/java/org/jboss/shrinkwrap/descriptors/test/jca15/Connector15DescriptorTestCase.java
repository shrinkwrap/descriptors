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
         .version("1.5")
         .description("HornetQ 2.0 Resource Adapter")
         .displayName("HornetQ 2.0 Resource Adapter")
         .vendorName("Red Hat Middleware LLC")
         .eisType("JMS 1.1 Server")
         .resourceadapterVersion("1.0")
         .getOrCreateLicense()
            .description("Copyright 2009 Red Hat, Inc. " +
 "Red Hat licenses this file to you under the Apache License, version " +
 "2.0 (the \"License\"); you may not use this file except in compliance " +
 "with the License.  You may obtain a copy of the License at " +
 "  http://www.apache.org/licenses/LICENSE-2.0 " +
 "Unless required by applicable law or agreed to in writing, software " +
 "distributed under the License is distributed on an \"AS IS\" BASIS, " +
 "WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or " +
 "implied.  See the License for the specific language governing " +
 "permissions and limitations under the License.")
            .licenseRequired(true).up()         
         .getOrCreateResourceadapter()
            .resourceadapterClass("org.hornetq.ra.HornetQResourceAdapter")
            .createConfigProperty()
               .description("The transport type. Multiple connectors can be configured by using a comma separated list, "+
                  "i.e. org.hornetq.core.remoting.impl.invm.InVMConnectorFactory,org.hornetq.core.remoting.impl.invm.InVMConnectorFactory.")
               .configPropertyName("ConnectorClassName")
               .configPropertyType("java.lang.String")
               .configPropertyValue("org.hornetq.core.remoting.impl.invm.InVMConnectorFactory").up()
            .createConfigProperty()
               .description("The transport configuration. These values must be in the form of key=val;key=val;, "+
                     "if multiple connectors are used then each set must be separated by a comma i.e. host=host1;port=5445,host=host2;port=5446. "+
                     "Each set of params maps to the connector classname specified.")
               .configPropertyName("ConnectionParameters")
               .configPropertyType("java.lang.String")
               .configPropertyValue("server-id=0").up()
            .getOrCreateOutboundResourceadapter()
               .createConnectionDefinition()
                  .managedconnectionfactoryClass("org.hornetq.ra.HornetQRAManagedConnectionFactory")
                  .createConfigProperty()
                     .description("The default session type")
                     .configPropertyName("SessionDefaultType")
                     .configPropertyType("java.lang.String")
                     .configPropertyValue("javax.jms.Queue").up()
                  .createConfigProperty()
                     .description("Try to obtain a lock within specified number of seconds; less than or equal to 0 disable this functionality")
                     .configPropertyName("UseTryLock")
                     .configPropertyType("java.lang.Integer")
                     .configPropertyValue("0").up()
                  .connectionfactoryInterface("org.hornetq.ra.HornetQRAConnectionFactory")
                  .connectionfactoryImplClass("org.hornetq.ra.HornetQRAConnectionFactoryImpl")
                  .connectionInterface("javax.jms.Session")
                  .connectionImplClass("org.hornetq.ra.HornetQRASession")
                  .up()
              .transactionSupport("XATransaction")
              .createAuthenticationMechanism()
                 .authenticationMechanismType("BasicPassword")
                 .credentialInterface("javax.resource.spi.security.PasswordCredential")
                 .up()
              .reauthenticationSupport(false)
              .up()
           .getOrCreateInboundResourceadapter()
              .getOrCreateMessageadapter()
                 .createMessagelistener()
                    .messagelistenerType("javax.jms.MessageListener")
                    .getOrCreateActivationspec()
                       .activationspecClass("org.hornetq.ra.inflow.HornetQActivationSpec")
                       .createRequiredConfigProperty()
                          .configPropertyName("destination").up()
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
