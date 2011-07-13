package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationPropertyType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class AnnotationPropertyTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationPropertyType<TestDescriptorImpl> type = new AnnotationPropertyTypeImpl<TestDescriptorImpl>(provider, "annotation-propertyType", provider.getRootNode());
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
   public void testPropertyName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationPropertyType<TestDescriptorImpl> type = new AnnotationPropertyTypeImpl<TestDescriptorImpl>(provider, "annotation-propertyType", provider.getRootNode());
      type.setPropertyName("test");
      assertEquals(type.getPropertyName(), "test");
      type.removePropertyName();
      assertNull(type.getPropertyName());
   }

   
   @Test
   public void testPropertyValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationPropertyType<TestDescriptorImpl> type = new AnnotationPropertyTypeImpl<TestDescriptorImpl>(provider, "annotation-propertyType", provider.getRootNode());
      type.setPropertyValue("test");
      assertEquals(type.getPropertyValue(), "test");
      type.removePropertyValue();
      assertNull(type.getPropertyValue());
   }
}
