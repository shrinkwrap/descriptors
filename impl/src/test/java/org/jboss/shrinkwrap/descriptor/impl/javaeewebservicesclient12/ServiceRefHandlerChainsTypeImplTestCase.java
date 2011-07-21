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
package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12;

import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainsType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class ServiceRefHandlerChainsTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerChainsType<TestDescriptorImpl> type = new ServiceRefHandlerChainsTypeImpl<TestDescriptorImpl>(
            provider, "service-ref_handler-chainsType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testHandlerChain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerChainsType<TestDescriptorImpl> type = new ServiceRefHandlerChainsTypeImpl<TestDescriptorImpl>(
            provider, "service-ref_handler-chainsType", provider.getRootNode());
      type.handlerChain().up();
      type.handlerChain().up();
      assertTrue(type.getHandlerChainList().size() == 2);
      type.removeAllHandlerChain();
      assertTrue(type.getHandlerChainList().size() == 0);
   }
}