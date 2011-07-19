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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.StatefulTimeoutType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimeUnitTypeType;

public class StatefulTimeoutTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      StatefulTimeoutType<TestDescriptorImpl> type = new StatefulTimeoutTypeImpl<TestDescriptorImpl>(provider, "stateful-timeoutType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      StatefulTimeoutType<TestDescriptorImpl> type = new StatefulTimeoutTypeImpl<TestDescriptorImpl>(provider, "stateful-timeoutType", provider.getRootNode());
      type.setTimeout(8);
      assertTrue(type.getTimeout() == 8);
      type.removeTimeout();
      assertNull(type.getTimeout());
   }

   
   @Test
   public void testUnit() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      StatefulTimeoutType<TestDescriptorImpl> type = new StatefulTimeoutTypeImpl<TestDescriptorImpl>(provider, "stateful-timeoutType", provider.getRootNode());
      for(TimeUnitTypeType e: TimeUnitTypeType.values())
      {
         type.setUnit(e);
         assertEquals(type.getUnit(), e);
         type.setUnit(e.toString());
         assertEquals(type.getUnitAsString(), e.toString());
      }
   }
}
