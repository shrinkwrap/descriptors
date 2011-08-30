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
package org.jboss.shrinkwrap.descriptor.api;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestCommonDef.CREATED_BY;
import static org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestCommonDef.JAVA_BEAN;
import static org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestCommonDef.MAGIC;
import static org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestCommonDef.X_DIGEST_Y;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.jar.Attributes.Name;
import java.util.jar.Manifest;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestDescriptor;
import org.junit.Test;

/**
 * @author Davide D'Alto
 */
public class ManifestDescriptorTestCase
{

   @Test
   public void shouldBeAbleToCreateDescriptor() throws Exception
   {
      assertFirstLineIsVersion(createDescriptor());
   }
   
   @Test
   public void shouldBeAbleToGetDescriptorName() throws Exception
   {
      assertEquals("Unexpected descriptor name", "MANIFEST.MF", createDescriptor().getDescriptorName());
   }

   @Test
   public void shouldBeAbleToGetDescriptorNameFromEntry() throws Exception
   {
      ManifestDescriptor manifest = createDescriptor().entry("Entry1").main();
      assertEquals("Unexpected descriptor name", "MANIFEST.MF", manifest.getDescriptorName());
   }

   @Test
   public void shouldBeAbleToGetDescriptorNameFromApplet() throws Exception
   {
      ManifestDescriptor manifest = createDescriptor().applet("Applet").main();
      assertEquals("Unexpected descriptor name", "MANIFEST.MF", manifest.getDescriptorName());
   }

   @Test
   public void shouldContainCreator() throws Exception
   {
      String expectedValue = "creator";
      ManifestDescriptor manifest = createDescriptor().createdBy(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, CREATED_BY, expectedValue);

      String entryName = "Entry1";
      manifest.entry(entryName).createdBy(entryName + expectedValue);
      assertContainsAttribute(manifest, CREATED_BY, entryName + expectedValue);
      assertContainsAttribute(manifest, CREATED_BY, expectedValue);
   }

   @Test
   public void shouldContainSignatureVersion() throws Exception
   {
      String expectedValue = "1.0";
      Name attributeName = Name.SIGNATURE_VERSION;
      ManifestDescriptor manifest = createDescriptor().signatureVersion(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, attributeName, expectedValue);

      String entryName = "Entry1";
      manifest.entry(entryName).signatureVersion(entryName + expectedValue);
      assertContainsAttribute(manifest, attributeName, entryName + expectedValue);
      assertContainsAttribute(manifest, attributeName, expectedValue);
   }

   @Test
   public void shouldContainClassPath() throws Exception
   {
      String[] expectedValueArray = {"jar1.jar", "jar2.jar", "/1/2/3/jar3.jar"};
      String expectedValue = "jar1.jar jar2.jar /1/2/3/jar3.jar";
      Name attributeName = Name.CLASS_PATH;
      
      ManifestDescriptor manifest = createDescriptor();
      for (String value : expectedValueArray)
      {
         manifest.addToClassPath(value);
      }
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, attributeName, expectedValue);

      String entryName = "Entry1";
      manifest.entry(entryName).addToClassPath(entryName);
      for (String value : expectedValueArray)
      {
         manifest.entry(entryName).addToClassPath(value);
      }
      assertContainsAttribute(manifest, attributeName, entryName +" " + expectedValue);
      assertContainsAttribute(manifest, attributeName, expectedValue);
   }

   @Test
   public void shouldContainImplementationVersion() throws Exception
   {
      String expectedValue = "2.0";
      ManifestDescriptor manifest = createDescriptor().implementationVersion(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.IMPLEMENTATION_VERSION, expectedValue);
   }

   @Test
   public void shouldContainImplementationVendor() throws Exception
   {
      String expectedValue = "Implementation Vendor";
      ManifestDescriptor manifest = createDescriptor().implementationVendor(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.IMPLEMENTATION_VENDOR, expectedValue);
   }

   @Test
   public void shouldContainImplementationVendorId() throws Exception
   {
      String expectedValue = "VIVID";
      ManifestDescriptor manifest = createDescriptor().implementationVendorId(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.IMPLEMENTATION_VENDOR_ID, expectedValue);
   }

   @Test
   public void shouldContainImplementationUrl() throws Exception
   {
      String expectedValue = "http://test.com";
      ManifestDescriptor manifest = createDescriptor().implementationUrl(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.IMPLEMENTATION_URL, expectedValue);
   }

   @Test
   public void shouldContainSpecificationTitle() throws Exception
   {
      String expectedValue = "Specification Title";
      ManifestDescriptor manifest = createDescriptor().specificationTitle(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.SPECIFICATION_TITLE, expectedValue);
   }

   @Test
   public void shouldContainSpecificationVersion() throws Exception
   {
      String expectedValue = "3.0.GA-SPEC";
      ManifestDescriptor manifest = createDescriptor().specificationVersion(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.SPECIFICATION_VERSION, expectedValue);
   }

   @Test
   public void shouldContainSpecificationVendor() throws Exception
   {
      String expectedValue = "Specification Vendor";
      ManifestDescriptor manifest = createDescriptor().specificationVendor(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.SPECIFICATION_VENDOR, expectedValue);
   }

   @Test
   public void shouldContainSealedAttribute() throws Exception
   {
      ManifestDescriptor manifest = createDescriptor().sealed();
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.SEALED, "true");

      manifest.notSealed();
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.SEALED, "false");
      assertNotContainsAttribute(manifest, Name.SEALED, "true");
   }

   @Test
   public void shouldCustomMainAttribute() throws Exception
   {
      String expectedValue = "Custom Attribute Value";
      ManifestDescriptor manifest = createDescriptor().attribute("Custom", expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, "Custom", expectedValue);
   }

   @Test
   public void shouldContainEntries() throws Exception
   {
      String expectedValue1 = "Entry 1";
      ManifestDescriptor manifest = createDescriptor().entry(expectedValue1).contentType("application/xml").main();
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, "Name", expectedValue1);

      String expectedValue2 = "Entry 2";
      manifest.entry(expectedValue2).contentType("text/html");
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, "Name", expectedValue1);
      assertContainsAttribute(manifest, Name.CONTENT_TYPE, "application/xml");
      assertContainsAttribute(manifest, "Name", expectedValue2);
      assertContainsAttribute(manifest, Name.CONTENT_TYPE, "text/html");
   }

   @Test
   public void shouldContainContentTypeForEntry() throws Exception
   {
      String expectedEntry = "Entry 1";
      String expectedAttributeValue = "application/xml";
      ManifestDescriptor manifest = createDescriptor().entry(expectedEntry).contentType(expectedAttributeValue).main();
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, "Name", expectedEntry);
      assertContainsAttribute(manifest, Name.CONTENT_TYPE, expectedAttributeValue);
   }

   @Test
   public void shouldContainJavaBeanForEntry() throws Exception
   {
      String expectedEntry = "Entry 1";
      ManifestDescriptor manifest = createDescriptor().entry(expectedEntry).javaBean().main();
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, JAVA_BEAN, "true");

      manifest.entry(expectedEntry).notJavaBean();
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, JAVA_BEAN, "false");
      assertNotContainsAttribute(manifest, JAVA_BEAN, "true");
   }

   @Test
   public void shouldContainDigestAlgorithmForEntry() throws Exception
   {
      String expectedEntry = "Entry 1";
      String expectedAttributeValue = "difgestAlg";
      ManifestDescriptor manifest = createDescriptor().entry(expectedEntry).xDigestY(expectedAttributeValue).main();
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, "Name", expectedEntry);
      assertContainsAttribute(manifest, X_DIGEST_Y, expectedAttributeValue);
   }

   @Test
   public void shouldContainMagicForEntry() throws Exception
   {
      String expectedEntry = "Entry 1";
      String expectedAttributeValue = "It's a kind of";
      ManifestDescriptor manifest = createDescriptor().entry(expectedEntry).magic(expectedAttributeValue).main();
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, "Name", expectedEntry);
      assertContainsAttribute(manifest, MAGIC, expectedAttributeValue);
   }

   @Test
   public void shouldContainExtensionList() throws Exception
   {
      ManifestDescriptor manifest = createDescriptor().applet("applet1").appletImplementationVersion("1.1")
            .applet("applet2").appletImplementationVersion("1.2");
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.EXTENSION_LIST, "applet1 applet2");
      assertContainsAttribute(manifest, appletAttribute("applet1", Name.IMPLEMENTATION_VERSION), "1.1");
      assertContainsAttribute(manifest, appletAttribute("applet2", Name.IMPLEMENTATION_VERSION), "1.2");

   }

   @Test
   public void shouldContainAppletExtensionName() throws Exception
   {
      String appletName = "applet1";
      String expectedValue = "applet.name";
      ManifestDescriptor manifest = createDescriptor().applet(appletName).appletExtensionName(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.EXTENSION_LIST, "applet1");
      assertContainsAttribute(manifest, appletAttribute(appletName, Name.EXTENSION_NAME), expectedValue);
   }

   @Test
   public void shouldContainAppletSpecificationVersion() throws Exception
   {
      String appletName = "applet1";
      String expectedValue = "1.0.SPV";
      ManifestDescriptor manifest = createDescriptor().applet(appletName).appletSpecificationVersion(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.EXTENSION_LIST, "applet1");
      assertContainsAttribute(manifest, appletAttribute(appletName, Name.SPECIFICATION_VERSION), expectedValue);
   }

   @Test
   public void shouldContainAppletImplementationVersion() throws Exception
   {
      String appletName = "applet1";
      String expectedValue = "1.1";
      ManifestDescriptor manifest = createDescriptor().applet(appletName).appletImplementationVersion(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.EXTENSION_LIST, "applet1");
      assertContainsAttribute(manifest, appletAttribute(appletName, Name.IMPLEMENTATION_VERSION), expectedValue);
   }

   @Test
   public void shouldContainAppletImplementationVendorId() throws Exception
   {
      String appletName = "applet1";
      String expectedValue = "VIV-ID";
      ManifestDescriptor manifest = createDescriptor().applet(appletName).appletImplementationVendorId(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.EXTENSION_LIST, "applet1");
      assertContainsAttribute(manifest, appletAttribute(appletName, Name.IMPLEMENTATION_VENDOR_ID), expectedValue);
   }

   @Test
   public void shouldContainAppletImplementationUrl() throws Exception
   {
      String appletName = "applet1";
      String expectedValue = "Very Important Vendor";
      ManifestDescriptor manifest = createDescriptor().applet(appletName).appletImplementationUrl(expectedValue);
      assertFirstLineIsVersion(manifest);
      assertContainsAttribute(manifest, Name.EXTENSION_LIST, "applet1");
      assertContainsAttribute(manifest, appletAttribute(appletName, Name.IMPLEMENTATION_URL), expectedValue);
   }

   @Test
   public void shouldBeAbleToCreateComplexManifest() throws Exception
   {
      Descriptor manifestDescriptor = Descriptors.create(ManifestDescriptor.class)
            .version("2.0.0.GA-M")
            .createdBy("Creator")
            .implementationTitle("Implementation Title")
            .implementationUrl("http://test.com")
            .implementationVendor("Very Important Vendor (Main)")
            .implementationVendorId("VIV")
            .implementationVersion("1.0.0.GA-VIV-M")
            .addToClassPath("lib1.jar").addToClassPath("lib2.jar").addToClassPath("/f1/f2/f3/lib3")
            .mainClass("test.manifest.MainClass")
            .sealed()
            .signatureVersion("2.0.0.GA-M-SIG")
            .specificationTitle("Specification Title")
            .specificationVendor("Specfication Vendor")
            .specificationVersion("5.0.0.GA-M-SPEC")
            .attribute("CustomAttribute", "Whatever")
            .entry("Entry1")
               .contentType("application/xml")
               .notJavaBean()
               .xDigestY("digestAlgorithm1")
               .magic("Magic1")
               .version("2.1.0")
               .createdBy("Creator Entry 1")
               .implementationTitle("Implementation Title Entry 1")
               .implementationUrl("http://entry1.test.com")
               .implementationVendor("Very Important Vendor (Entry 1)")
               .implementationVendorId("VIV-E1")
               .implementationVersion("1.0.0.GA-VIV-E1")
               .addToClassPath("entry1-lib1.jar").addToClassPath("entry1-lib2.jar").addToClassPath("/f1/f2/f3/entry1-lib3.jar")
               .mainClass("test.manifest.Entry1MainClass")
               .notSealed()
               .signatureVersion("2.0.0.GA-E1-SIG")
               .specificationTitle("Specification Title Entry1")
               .specificationVendor("Specfication Vendor Entry1")
               .specificationVersion("5.0.0.GA-E1-SPEC")
               .attribute("CustomAttribute", "WhateverEntry1")
            .entry("Entry2")
               .contentType("text/html")
               .javaBean()
               .xDigestY("digestAlgorithm2")
               .magic("Magic2")
               .version("2.1.0")
               .createdBy("Creator Entry 2")
               .implementationTitle("Implementation Title Entry 2")
               .implementationUrl("http://entry2.test.com")
               .implementationVendor("Very Important Vendor (Entry 2)")
               .implementationVendorId("VIV-E2")
               .implementationVersion("1.0.0.GA-VIV-E2")
               .addToClassPath("entry2-lib1.jar").addToClassPath("entry2-lib2.jar").addToClassPath("/f1/f2/f3/entry2-lib3.jar")
               .mainClass("test.manifest.Entry2MainClass")
               .sealed()
               .signatureVersion("2.0.0.GA-E2-SIG")
               .specificationTitle("Specification Title Entry2")
               .specificationVendor("Specfication Vendor Entry2")
               .specificationVersion("5.0.0.GA-E2-SPEC")
               .attribute("CustomAttribute", "WhateverEntry2")
             .applet("applet1")
                .appletExtensionName("applet1-Name")
                .appletImplementationUrl("http://applet1.test.com")
                .appletImplementationVersion("2.0.GA-A1")
                .appletImplementationVendorId("VIV-A1")
                .appletSpecificationVersion("2.0.GA-A1-SPEC")
             .applet("applet2")
                .appletExtensionName("applet2-Name")
                .appletImplementationUrl("http://applet2.test.com")
                .appletImplementationVersion("2.0.GA-A2")
                .appletImplementationVendorId("VIV-A2")
                .appletSpecificationVersion("2.0.GA-A2-SPEC");

      Manifest manifest = new Manifest(new ByteArrayInputStream(manifestDescriptor.exportAsString().getBytes()));
      ByteArrayOutputStream stream = new ByteArrayOutputStream();
      manifest.write(stream);
      String expected = stream.toString();
      String actual = manifestDescriptor.exportAsString();

      // The entry order in the manifest can change so I compare every line
      String[] expectedArray = expected.split("\r\n");
      String[] actualArray = actual.split("\r\n");
      Arrays.sort(expectedArray);
      Arrays.sort(actualArray);
      assertEquals("Corrupted manifest generated,", Arrays.toString(expectedArray), Arrays.toString(actualArray));
   }

   private String appletAttribute(String appletName, Name name)
   {
      return appletName + "-" + name;
   }

   private void assertContainsAttribute(Descriptor manifest, Name name, String value)
   {
      assertContainsAttribute(manifest, name.toString(), value);
   }

   private void assertContainsAttribute(Descriptor manifest, String name, String value)
   {
      String expected = name + ": " + value;
      String actual = manifest.exportAsString();
      assertTrue("Value not found:<" + expected + " >", actual.contains(expected));
   }

   private void assertNotContainsAttribute(Descriptor manifest, Name name, String value)
   {
      assertNotContainsAttribute(manifest, name.toString(), value);
   }

   private void assertNotContainsAttribute(Descriptor manifest, String name, String value)
   {
      String expected = name + ": " + value;
      String actual = manifest.exportAsString();
      assertFalse("Unexpected value found:<" + expected + " >", actual.contains(expected));
   }

   private void assertFirstLineIsVersion(ManifestDescriptor manifest)
   {
      assertTrue("Manifest should start with attribute <" + Name.MANIFEST_VERSION + ">", manifest.exportAsString()
            .startsWith(Name.MANIFEST_VERSION.toString() + ": 1.0"));
   }

   ManifestDescriptor createDescriptor()
   {
      return Descriptors.create(ManifestDescriptor.class);
   }

}
