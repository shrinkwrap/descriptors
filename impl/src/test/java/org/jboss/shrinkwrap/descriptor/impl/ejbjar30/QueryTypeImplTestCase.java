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
import static org.junit.Assert.assertNull;

import org.jboss.shrinkwrap.descriptor.api.ejbjar30.QueryType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ResultTypeMappingType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class QueryTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      QueryType<TestDescriptorImpl> type = new QueryTypeImpl<TestDescriptorImpl>(provider, "queryType", provider
            .getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      QueryType<TestDescriptorImpl> type = new QueryTypeImpl<TestDescriptorImpl>(provider, "queryType", provider
            .getRootNode());
      type.setDescription("test");
      assertEquals(type.getDescription(), "test");
      type.removeDescription();
      assertNull(type.getDescription());
   }

   @Test
   public void testQueryMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      QueryType<TestDescriptorImpl> type = new QueryTypeImpl<TestDescriptorImpl>(provider, "queryType", provider
            .getRootNode());
      type.queryMethod().up();
      type.removeQueryMethod();
      assertNull(provider.getRootNode().getSingle("query-method"));
   }

   @Test
   public void testResultTypeMapping() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      QueryType<TestDescriptorImpl> type = new QueryTypeImpl<TestDescriptorImpl>(provider, "queryType", provider
            .getRootNode());
      for (ResultTypeMappingType e : ResultTypeMappingType.values())
      {
         type.setResultTypeMapping(e);
         assertEquals(type.getResultTypeMapping(), e);
         type.setResultTypeMapping(e.toString());
         assertEquals(type.getResultTypeMappingAsString(), e.toString());
      }
   }

   @Test
   public void testEjbQl() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      QueryType<TestDescriptorImpl> type = new QueryTypeImpl<TestDescriptorImpl>(provider, "queryType", provider
            .getRootNode());
      type.setEjbQl("test");
      assertEquals(type.getEjbQl(), "test");
      type.removeEjbQl();
      assertNull(type.getEjbQl());
   }
}
