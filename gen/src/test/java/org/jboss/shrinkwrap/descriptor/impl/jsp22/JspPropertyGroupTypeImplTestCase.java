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
package org.jboss.shrinkwrap.descriptor.impl.jsp22; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspPropertyGroupType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;

public class JspPropertyGroupTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setDescription("value1");
      type.setDescription("value2");
      type.setDescriptionList("value3", "value4");
      assertTrue(type.getDescriptionList().size() == 4);
      assertEquals(type.getDescriptionList().get(0), "value1");
      assertEquals(type.getDescriptionList().get(1), "value2");
      assertEquals(type.getDescriptionList().get(2), "value3");
      assertEquals(type.getDescriptionList().get(3), "value4");
      type.removeAllDescription();
      assertTrue(type.getDescriptionList().size() == 0);
   }
   
   @Test
   public void testDisplayName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setDisplayName("value1");
      type.setDisplayName("value2");
      type.setDisplayNameList("value3", "value4");
      assertTrue(type.getDisplayNameList().size() == 4);
      assertEquals(type.getDisplayNameList().get(0), "value1");
      assertEquals(type.getDisplayNameList().get(1), "value2");
      assertEquals(type.getDisplayNameList().get(2), "value3");
      assertEquals(type.getDisplayNameList().get(3), "value4");
      type.removeAllDisplayName();
      assertTrue(type.getDisplayNameList().size() == 0);
   }
   
   @Test
   public void testIcon() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }
   
   @Test
   public void testUrlPattern() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setUrlPattern("value1");
      type.setUrlPattern("value2");
      type.setUrlPatternList("value3", "value4");
      assertTrue(type.getUrlPatternList().size() == 4);
      assertEquals(type.getUrlPatternList().get(0), "value1");
      assertEquals(type.getUrlPatternList().get(1), "value2");
      assertEquals(type.getUrlPatternList().get(2), "value3");
      assertEquals(type.getUrlPatternList().get(3), "value4");
      type.removeAllUrlPattern();
      assertTrue(type.getUrlPatternList().size() == 0);
   }

   
   @Test
   public void testElIgnored() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setElIgnored(true);
      assertTrue(type.isElIgnored());
      type.removeElIgnored();
      assertFalse(type.isElIgnored());
   }

   
   @Test
   public void testPageEncoding() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setPageEncoding("test");
      assertEquals(type.getPageEncoding(), "test");
      type.removePageEncoding();
      assertNull(type.getPageEncoding());
   }

   
   @Test
   public void testScriptingInvalid() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setScriptingInvalid(true);
      assertTrue(type.isScriptingInvalid());
      type.removeScriptingInvalid();
      assertFalse(type.isScriptingInvalid());
   }

   
   @Test
   public void testIsXml() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setIsXml(true);
      assertTrue(type.isIsXml());
      type.removeIsXml();
      assertFalse(type.isIsXml());
   }

   
   @Test
   public void testIncludePrelude() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setIncludePrelude("value1");
      type.setIncludePrelude("value2");
      type.setIncludePreludeList("value3", "value4");
      assertTrue(type.getIncludePreludeList().size() == 4);
      assertEquals(type.getIncludePreludeList().get(0), "value1");
      assertEquals(type.getIncludePreludeList().get(1), "value2");
      assertEquals(type.getIncludePreludeList().get(2), "value3");
      assertEquals(type.getIncludePreludeList().get(3), "value4");
      type.removeAllIncludePrelude();
      assertTrue(type.getIncludePreludeList().size() == 0);
   }

   
   @Test
   public void testIncludeCoda() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setIncludeCoda("value1");
      type.setIncludeCoda("value2");
      type.setIncludeCodaList("value3", "value4");
      assertTrue(type.getIncludeCodaList().size() == 4);
      assertEquals(type.getIncludeCodaList().get(0), "value1");
      assertEquals(type.getIncludeCodaList().get(1), "value2");
      assertEquals(type.getIncludeCodaList().get(2), "value3");
      assertEquals(type.getIncludeCodaList().get(3), "value4");
      type.removeAllIncludeCoda();
      assertTrue(type.getIncludeCodaList().size() == 0);
   }

   
   @Test
   public void testDeferredSyntaxAllowedAsLiteral() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setDeferredSyntaxAllowedAsLiteral(true);
      assertTrue(type.isDeferredSyntaxAllowedAsLiteral());
      type.removeDeferredSyntaxAllowedAsLiteral();
      assertFalse(type.isDeferredSyntaxAllowedAsLiteral());
   }

   
   @Test
   public void testTrimDirectiveWhitespaces() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setTrimDirectiveWhitespaces(true);
      assertTrue(type.isTrimDirectiveWhitespaces());
      type.removeTrimDirectiveWhitespaces();
      assertFalse(type.isTrimDirectiveWhitespaces());
   }

   
   @Test
   public void testDefaultContentType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setDefaultContentType("test");
      assertEquals(type.getDefaultContentType(), "test");
      type.removeDefaultContentType();
      assertNull(type.getDefaultContentType());
   }

   
   @Test
   public void testBuffer() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setBuffer("test");
      assertEquals(type.getBuffer(), "test");
      type.removeBuffer();
      assertNull(type.getBuffer());
   }

   
   @Test
   public void testErrorOnUndeclaredNamespace() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JspPropertyGroupType<TestDescriptorImpl> type = new JspPropertyGroupTypeImpl<TestDescriptorImpl>(provider, "jsp-property-groupType", provider.getRootNode());
      type.setErrorOnUndeclaredNamespace(true);
      assertTrue(type.isErrorOnUndeclaredNamespace());
      type.removeErrorOnUndeclaredNamespace();
      assertFalse(type.isErrorOnUndeclaredNamespace());
   }
}
