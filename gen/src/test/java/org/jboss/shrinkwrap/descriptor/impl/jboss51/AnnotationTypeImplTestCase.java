package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.InjectionTargetTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.AnnotationPropertyTypeImpl;

public class AnnotationTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType", provider.getRootNode());
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
   public void testAnnotationClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType", provider.getRootNode());
      type.setAnnotationClass("test");
      assertEquals(type.getAnnotationClass(), "test");
      type.removeAnnotationClass();
      assertNull(type.getAnnotationClass());
   }

   
   @Test
   public void testAnnotationImplementationClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType", provider.getRootNode());
      type.setAnnotationImplementationClass("test");
      assertEquals(type.getAnnotationImplementationClass(), "test");
      type.removeAnnotationImplementationClass();
      assertNull(type.getAnnotationImplementationClass());
   }

   
   @Test
   public void testInjectionTarget() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType", provider.getRootNode());
      type.injectionTarget().up();
      type.removeInjectionTarget();
      assertNull(provider.getRootNode().getSingle("injection-target"));
   }

   
   @Test
   public void testProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType", provider.getRootNode());
      type.property().up();
      type.property().up();
      assertTrue(type.getPropertyList().size() == 2);
      type.removeAllProperty();
      assertTrue(type.getPropertyList().size() == 0);
   }
}
