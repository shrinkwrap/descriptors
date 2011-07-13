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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class MethodParamsTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodParamsType<TestDescriptorImpl> type = new MethodParamsTypeImpl<TestDescriptorImpl>(provider,
            "method-paramsType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testMethodParam() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodParamsType<TestDescriptorImpl> type = new MethodParamsTypeImpl<TestDescriptorImpl>(provider,
            "method-paramsType", provider.getRootNode());
      type.setMethodParam("value1");
      type.setMethodParam("value2");
      type.setMethodParamList("value3", "value4");
      assertTrue(type.getMethodParamList().size() == 4);
      assertEquals(type.getMethodParamList().get(0), "value1");
      assertEquals(type.getMethodParamList().get(1), "value2");
      assertEquals(type.getMethodParamList().get(2), "value3");
      assertEquals(type.getMethodParamList().get(3), "value4");
      type.removeAllMethodParam();
      assertTrue(type.getMethodParamList().size() == 0);
   }
}
