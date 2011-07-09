package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LocaleEncodingMappingTypeImpl;

public class LocaleEncodingMappingListTypeImplTestCase
{   
   @Test
   public void testLocaleEncodingMapping() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LocaleEncodingMappingListType<TestDescriptorImpl> type = new LocaleEncodingMappingListTypeImpl<TestDescriptorImpl>(provider, "locale-encoding-mapping-listType", provider.getRootNode());
      type.localeEncodingMapping().up();
      type.localeEncodingMapping().up();
      assertTrue(type.getLocaleEncodingMappingList().size() == 2);
      type.removeAllLocaleEncodingMapping();
      assertTrue(type.getLocaleEncodingMappingList().size() == 0);
   }
}
