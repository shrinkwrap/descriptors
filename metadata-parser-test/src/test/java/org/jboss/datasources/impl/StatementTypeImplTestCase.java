package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.StatementType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.TrackStatementsType;

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
