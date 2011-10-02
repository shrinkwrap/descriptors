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
package org.jboss.shrinkwrap.descriptor.impl.resourceadapters10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.XaPoolType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class XaPoolTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testIsSameRmOverride() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.isSameRmOverride(true);
      assertTrue(type.isIsSameRmOverride());
      type.removeIsSameRmOverride();
      assertFalse(type.isIsSameRmOverride());
   }

   
   @Test
   public void testInterleaving() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.interleaving();
      assertTrue(type.isInterleaving());
      type.removeInterleaving();
      assertFalse(type.isInterleaving());
   }

   
   @Test
   public void testNoTxSeparatePools() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.noTxSeparatePools();
      assertTrue(type.isNoTxSeparatePools());
      type.removeNoTxSeparatePools();
      assertFalse(type.isNoTxSeparatePools());
   }

   
   @Test
   public void testPadXid() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.padXid(true);
      assertTrue(type.isPadXid());
      type.removePadXid();
      assertFalse(type.isPadXid());
   }

   
   @Test
   public void testWrapXaResource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.wrapXaResource(true);
      assertTrue(type.isWrapXaResource());
      type.removeWrapXaResource();
      assertFalse(type.isWrapXaResource());
   }
}
