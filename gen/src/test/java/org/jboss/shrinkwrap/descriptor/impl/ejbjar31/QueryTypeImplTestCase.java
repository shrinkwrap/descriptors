package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.QueryMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ResultTypeMappingType;

public class QueryTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      QueryType<TestDescriptorImpl> type = new QueryTypeImpl<TestDescriptorImpl>(provider, "queryType", provider.getRootNode());
      type.setDescription("test");
      assertEquals(type.getDescription(), "test");
      type.removeDescription();
      assertNull(type.getDescription());
   }

   
   @Test
   public void testQueryMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      QueryType<TestDescriptorImpl> type = new QueryTypeImpl<TestDescriptorImpl>(provider, "queryType", provider.getRootNode());
      type.queryMethod().up();
      type.removeQueryMethod();
      assertNull(provider.getRootNode().getSingle("query-method"));
   }

   
   @Test
   public void testResultTypeMapping() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      QueryType<TestDescriptorImpl> type = new QueryTypeImpl<TestDescriptorImpl>(provider, "queryType", provider.getRootNode());
      for(ResultTypeMappingType e: ResultTypeMappingType.values())
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
      QueryType<TestDescriptorImpl> type = new QueryTypeImpl<TestDescriptorImpl>(provider, "queryType", provider.getRootNode());
      type.setEjbQl("test");
      assertEquals(type.getEjbQl(), "test");
      type.removeEjbQl();
      assertNull(type.getEjbQl());
   }
}
