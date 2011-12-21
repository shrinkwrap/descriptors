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
package org.jboss.shrinkwrap.descriptor.impl.datasources10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.datasources10.StatementType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.datasources10.TrackStatementsType;

public class StatementTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      StatementType<TestDescriptorImpl> type = new StatementTypeImpl<TestDescriptorImpl>(provider, "statementType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testTrackStatements() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      StatementType<TestDescriptorImpl> type = new StatementTypeImpl<TestDescriptorImpl>(provider, "statementType", provider.getRootNode());
      for(TrackStatementsType e: TrackStatementsType.values())
      {
         type.trackStatements(e);
         assertEquals(type.getTrackStatements(), e);
         type.trackStatements(e.toString());
         assertEquals(type.getTrackStatementsAsString(), e.toString());
      }
   }

   
   @Test
   public void testPreparedStatementCacheSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      StatementType<TestDescriptorImpl> type = new StatementTypeImpl<TestDescriptorImpl>(provider, "statementType", provider.getRootNode());
      type.preparedStatementCacheSize(8);
      assertTrue(type.getPreparedStatementCacheSize() == 8);
      type.removePreparedStatementCacheSize();
      assertNull(type.getPreparedStatementCacheSize());
   }

   
   @Test
   public void testSharePreparedStatements() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      StatementType<TestDescriptorImpl> type = new StatementTypeImpl<TestDescriptorImpl>(provider, "statementType", provider.getRootNode());
      type.sharePreparedStatements();
      assertTrue(type.isSharePreparedStatements());
      type.removeSharePreparedStatements();
      assertFalse(type.isSharePreparedStatements());
   }
}
