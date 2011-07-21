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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.webcommon30.TransportGuaranteeType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.UserDataConstraintType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class UserDataConstraintTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      UserDataConstraintType<TestDescriptorImpl> type = new UserDataConstraintTypeImpl<TestDescriptorImpl>(provider,
            "user-data-constraintType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      UserDataConstraintType<TestDescriptorImpl> type = new UserDataConstraintTypeImpl<TestDescriptorImpl>(provider,
            "user-data-constraintType", provider.getRootNode());
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
   public void testTransportGuarantee() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      UserDataConstraintType<TestDescriptorImpl> type = new UserDataConstraintTypeImpl<TestDescriptorImpl>(provider,
            "user-data-constraintType", provider.getRootNode());
      for (TransportGuaranteeType e : TransportGuaranteeType.values())
      {
         type.setTransportGuarantee(e);
         assertEquals(type.getTransportGuarantee(), e);
         type.setTransportGuarantee(e.toString());
         assertEquals(type.getTransportGuaranteeAsString(), e.toString());
      }
   }
}
