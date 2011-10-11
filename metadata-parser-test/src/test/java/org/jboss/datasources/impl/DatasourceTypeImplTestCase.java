package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.DatasourceType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.ConnectionPropertyType;
import org.jboss.datasources.impl.ConnectionPropertyTypeImpl;
import org.jboss.datasources.api.TransactionIsolationType;
import org.jboss.datasources.api.PoolType;
import org.jboss.datasources.impl.PoolTypeImpl;
import org.jboss.datasources.api.DsSecurityType;
import org.jboss.datasources.impl.DsSecurityTypeImpl;
import org.jboss.datasources.api.ValidationType;
import org.jboss.datasources.impl.ValidationTypeImpl;
import org.jboss.datasources.api.TimeoutType;
import org.jboss.datasources.impl.TimeoutTypeImpl;
import org.jboss.datasources.api.StatementType;
import org.jboss.datasources.impl.StatementTypeImpl;

public class DatasourceTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.jndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }
   
   @Test
   public void testPoolName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.poolName("test");
      assertEquals(type.getPoolName(), "test");
      type.removePoolName();
      assertNull(type.getPoolName());
   }
   
   @Test
   public void testEnabled() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.enabled(true);
      assertTrue(type.isEnabled());
      type.removeEnabled();
      assertFalse(type.isEnabled());
   }
   
   @Test
   public void testUseJavaContext() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.useJavaContext(true);
      assertTrue(type.isUseJavaContext());
      type.removeUseJavaContext();
      assertFalse(type.isUseJavaContext());
   }
   
   @Test
   public void testSpy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.spy(true);
      assertTrue(type.isSpy());
      type.removeSpy();
      assertFalse(type.isSpy());
   }
   
   @Test
   public void testUseCcm() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.useCcm(true);
      assertTrue(type.isUseCcm());
      type.removeUseCcm();
      assertFalse(type.isUseCcm());
   }
   
   @Test
   public void testConnectionUrl() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.connectionUrl("test");
      assertEquals(type.getConnectionUrl(), "test");
      type.removeConnectionUrl();
      assertNull(type.getConnectionUrl());
   }

   
   @Test
   public void testDriverClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.driverClass("test");
      assertEquals(type.getDriverClass(), "test");
      type.removeDriverClass();
      assertNull(type.getDriverClass());
   }

   
   @Test
   public void testDatasourceClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.datasourceClass("test");
      assertEquals(type.getDatasourceClass(), "test");
      type.removeDatasourceClass();
      assertNull(type.getDatasourceClass());
   }

   
   @Test
   public void testDriver() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.driver("test");
      assertEquals(type.getDriver(), "test");
      type.removeDriver();
      assertNull(type.getDriver());
   }

   
   @Test
   public void testConnectionProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.createConnectionProperty().up();
      type.createConnectionProperty().up();
      assertTrue(type.getAllConnectionProperty().size() == 2);
      type.removeAllConnectionProperty();
      assertTrue(type.getAllConnectionProperty().size() == 0);
   }

   
   @Test
   public void testNewConnectionSql() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.newConnectionSql("test");
      assertEquals(type.getNewConnectionSql(), "test");
      type.removeNewConnectionSql();
      assertNull(type.getNewConnectionSql());
   }

   
   @Test
   public void testTransactionIsolation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      for(TransactionIsolationType e: TransactionIsolationType.values())
      {
         type.transactionIsolation(e);
         assertEquals(type.getTransactionIsolation(), e);
         type.transactionIsolation(e.toString());
         assertEquals(type.getTransactionIsolationAsString(), e.toString());
      }
   }

   
   @Test
   public void testUrlDelimiter() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.urlDelimiter("test");
      assertEquals(type.getUrlDelimiter(), "test");
      type.removeUrlDelimiter();
      assertNull(type.getUrlDelimiter());
   }

   
   @Test
   public void testUrlSelectorStrategyClassName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.urlSelectorStrategyClassName("test");
      assertEquals(type.getUrlSelectorStrategyClassName(), "test");
      type.removeUrlSelectorStrategyClassName();
      assertNull(type.getUrlSelectorStrategyClassName());
   }

   
   @Test
   public void testPool() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.getOrCreatePool().up();
      type.removePool();
      assertNull(provider.getRootNode().getSingle("pool"));
   }

   
   @Test
   public void testSecurity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.getOrCreateSecurity().up();
      type.removeSecurity();
      assertNull(provider.getRootNode().getSingle("security"));
   }

   
   @Test
   public void testValidation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.getOrCreateValidation().up();
      type.removeValidation();
      assertNull(provider.getRootNode().getSingle("validation"));
   }

   
   @Test
   public void testTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.getOrCreateTimeout().up();
      type.removeTimeout();
      assertNull(provider.getRootNode().getSingle("timeout"));
   }

   
   @Test
   public void testStatement() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.getOrCreateStatement().up();
      type.removeStatement();
      assertNull(provider.getRootNode().getSingle("statement"));
   }

   
   @Test
   public void testJta() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourceType<TestDescriptorImpl> type = new DatasourceTypeImpl<TestDescriptorImpl>(provider, "datasourceType", provider.getRootNode());
      type.jta(true);
      assertTrue(type.isJta());
      type.removeJta();
      assertFalse(type.isJta());
   }
}
