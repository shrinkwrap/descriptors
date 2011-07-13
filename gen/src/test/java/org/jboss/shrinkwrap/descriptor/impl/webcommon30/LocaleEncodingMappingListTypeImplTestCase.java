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
package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LocaleEncodingMappingTypeImpl;

public class LocaleEncodingMappingListTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LocaleEncodingMappingListType<TestDescriptorImpl> type = new LocaleEncodingMappingListTypeImpl<TestDescriptorImpl>(provider, "locale-encoding-mapping-listType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testLocaleEncodingMapping() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LocaleEncodingMappingListType<TestDescriptorImpl> type = new LocaleEncodingMappingListTypeImpl<TestDescriptorImpl>(provider, "locale-encoding-mapping-listType", provider.getRootNode());
      type.localeEncodingMapping().up();
      type.localeEncodingMapping().up();
      assertTrue(type.getLocaleEncodingMappingList().size() == 2);
      type.removeAllLocaleEncodingMapping();
      assertTrue(type.getLocaleEncodingMappingList().size() == 0);
   }
}
