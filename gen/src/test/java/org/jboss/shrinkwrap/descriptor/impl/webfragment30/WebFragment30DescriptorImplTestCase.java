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
package org.jboss.shrinkwrap.descriptor.impl.webfragment30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.WebFragment30Descriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.OrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ServletTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ServletMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.SessionConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.MimeMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.WelcomeFileListTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ErrorPageTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.JspConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.SecurityConstraintTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LoginConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LocaleEncodingMappingListTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;

public class WebFragment30DescriptorImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testName() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.setName("value1");
      type.setName("value2");
      type.setNameList("value3", "value4");
      assertTrue(type.getNameList().size() == 4);
      assertEquals(type.getNameList().get(0), "value1");
      assertEquals(type.getNameList().get(1), "value2");
      assertEquals(type.getNameList().get(2), "value3");
      assertEquals(type.getNameList().get(3), "value4");
      type.removeAllName();
      assertTrue(type.getNameList().size() == 0);
   }
   
   @Test
   public void testOrdering() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.ordering().up();
      type.ordering().up();
      assertTrue(type.getOrderingList().size() == 2);
      type.removeAllOrdering();
      assertTrue(type.getOrderingList().size() == 0);
   }
   
   @Test
   public void testDistributable() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.distributable();
      assertTrue(type.isDistributable());
   }
   
   @Test
   public void testContextParam() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.contextParam().up();
      type.contextParam().up();
      assertTrue(type.getContextParamList().size() == 2);
      type.removeAllContextParam();
      assertTrue(type.getContextParamList().size() == 0);
   }
   
   @Test
   public void testFilter() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.filter().up();
      type.filter().up();
      assertTrue(type.getFilterList().size() == 2);
      type.removeAllFilter();
      assertTrue(type.getFilterList().size() == 0);
   }
   
   @Test
   public void testFilterMapping() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.filterMapping().up();
      type.filterMapping().up();
      assertTrue(type.getFilterMappingList().size() == 2);
      type.removeAllFilterMapping();
      assertTrue(type.getFilterMappingList().size() == 0);
   }
   
   @Test
   public void testListener() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.listener().up();
      type.listener().up();
      assertTrue(type.getListenerList().size() == 2);
      type.removeAllListener();
      assertTrue(type.getListenerList().size() == 0);
   }
   
   @Test
   public void testServlet() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.servlet().up();
      type.servlet().up();
      assertTrue(type.getServletList().size() == 2);
      type.removeAllServlet();
      assertTrue(type.getServletList().size() == 0);
   }
   
   @Test
   public void testServletMapping() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.servletMapping().up();
      type.servletMapping().up();
      assertTrue(type.getServletMappingList().size() == 2);
      type.removeAllServletMapping();
      assertTrue(type.getServletMappingList().size() == 0);
   }
   
   @Test
   public void testSessionConfig() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.sessionConfig().up();
      type.sessionConfig().up();
      assertTrue(type.getSessionConfigList().size() == 2);
      type.removeAllSessionConfig();
      assertTrue(type.getSessionConfigList().size() == 0);
   }
   
   @Test
   public void testMimeMapping() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.mimeMapping().up();
      type.mimeMapping().up();
      assertTrue(type.getMimeMappingList().size() == 2);
      type.removeAllMimeMapping();
      assertTrue(type.getMimeMappingList().size() == 0);
   }
   
   @Test
   public void testWelcomeFileList() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.welcomeFileList().up();
      type.welcomeFileList().up();
      assertTrue(type.getWelcomeFileListList().size() == 2);
      type.removeAllWelcomeFileList();
      assertTrue(type.getWelcomeFileListList().size() == 0);
   }
   
   @Test
   public void testErrorPage() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.errorPage().up();
      type.errorPage().up();
      assertTrue(type.getErrorPageList().size() == 2);
      type.removeAllErrorPage();
      assertTrue(type.getErrorPageList().size() == 0);
   }
   
   @Test
   public void testJspConfig() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.jspConfig().up();
      type.jspConfig().up();
      assertTrue(type.getJspConfigList().size() == 2);
      type.removeAllJspConfig();
      assertTrue(type.getJspConfigList().size() == 0);
   }
   
   @Test
   public void testSecurityConstraint() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.securityConstraint().up();
      type.securityConstraint().up();
      assertTrue(type.getSecurityConstraintList().size() == 2);
      type.removeAllSecurityConstraint();
      assertTrue(type.getSecurityConstraintList().size() == 0);
   }
   
   @Test
   public void testLoginConfig() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.loginConfig().up();
      type.loginConfig().up();
      assertTrue(type.getLoginConfigList().size() == 2);
      type.removeAllLoginConfig();
      assertTrue(type.getLoginConfigList().size() == 0);
   }
   
   @Test
   public void testSecurityRole() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.securityRole().up();
      type.securityRole().up();
      assertTrue(type.getSecurityRoleList().size() == 2);
      type.removeAllSecurityRole();
      assertTrue(type.getSecurityRoleList().size() == 0);
   }
   
   @Test
   public void testMessageDestination() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.messageDestination().up();
      type.messageDestination().up();
      assertTrue(type.getMessageDestinationList().size() == 2);
      type.removeAllMessageDestination();
      assertTrue(type.getMessageDestinationList().size() == 0);
   }
   
   @Test
   public void testLocaleEncodingMappingList() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.localeEncodingMappingList().up();
      type.localeEncodingMappingList().up();
      assertTrue(type.getLocaleEncodingMappingListList().size() == 2);
      type.removeAllLocaleEncodingMappingList();
      assertTrue(type.getLocaleEncodingMappingListList().size() == 0);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
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
   public void testDisplayName() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.setDisplayName("value1");
      type.setDisplayName("value2");
      type.setDisplayNameList("value3", "value4");
      assertTrue(type.getDisplayNameList().size() == 4);
      assertEquals(type.getDisplayNameList().get(0), "value1");
      assertEquals(type.getDisplayNameList().get(1), "value2");
      assertEquals(type.getDisplayNameList().get(2), "value3");
      assertEquals(type.getDisplayNameList().get(3), "value4");
      type.removeAllDisplayName();
      assertTrue(type.getDisplayNameList().size() == 0);
   }
   
   @Test
   public void testIcon() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }
   
   @Test
   public void testEnvEntry() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.envEntry().up();
      type.envEntry().up();
      assertTrue(type.getEnvEntryList().size() == 2);
      type.removeAllEnvEntry();
      assertTrue(type.getEnvEntryList().size() == 0);
   }
   
   @Test
   public void testEjbRef() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.ejbRef().up();
      type.ejbRef().up();
      assertTrue(type.getEjbRefList().size() == 2);
      type.removeAllEjbRef();
      assertTrue(type.getEjbRefList().size() == 0);
   }
   
   @Test
   public void testEjbLocalRef() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.ejbLocalRef().up();
      type.ejbLocalRef().up();
      assertTrue(type.getEjbLocalRefList().size() == 2);
      type.removeAllEjbLocalRef();
      assertTrue(type.getEjbLocalRefList().size() == 0);
   }
   
   @Test
   public void testResourceRef() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.resourceRef().up();
      type.resourceRef().up();
      assertTrue(type.getResourceRefList().size() == 2);
      type.removeAllResourceRef();
      assertTrue(type.getResourceRefList().size() == 0);
   }
   
   @Test
   public void testResourceEnvRef() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.resourceEnvRef().up();
      type.resourceEnvRef().up();
      assertTrue(type.getResourceEnvRefList().size() == 2);
      type.removeAllResourceEnvRef();
      assertTrue(type.getResourceEnvRefList().size() == 0);
   }
   
   @Test
   public void testMessageDestinationRef() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.messageDestinationRef().up();
      type.messageDestinationRef().up();
      assertTrue(type.getMessageDestinationRefList().size() == 2);
      type.removeAllMessageDestinationRef();
      assertTrue(type.getMessageDestinationRefList().size() == 0);
   }
   
   @Test
   public void testPersistenceContextRef() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.persistenceContextRef().up();
      type.persistenceContextRef().up();
      assertTrue(type.getPersistenceContextRefList().size() == 2);
      type.removeAllPersistenceContextRef();
      assertTrue(type.getPersistenceContextRefList().size() == 0);
   }
   
   @Test
   public void testPersistenceUnitRef() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.persistenceUnitRef().up();
      type.persistenceUnitRef().up();
      assertTrue(type.getPersistenceUnitRefList().size() == 2);
      type.removeAllPersistenceUnitRef();
      assertTrue(type.getPersistenceUnitRefList().size() == 0);
   }
   
   @Test
   public void testPostConstruct() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.postConstruct().up();
      type.postConstruct().up();
      assertTrue(type.getPostConstructList().size() == 2);
      type.removeAllPostConstruct();
      assertTrue(type.getPostConstructList().size() == 0);
   }
   
   @Test
   public void testPreDestroy() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.preDestroy().up();
      type.preDestroy().up();
      assertTrue(type.getPreDestroyList().size() == 2);
      type.removeAllPreDestroy();
      assertTrue(type.getPreDestroyList().size() == 0);
   }
   
   @Test
   public void testDataSource() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.dataSource().up();
      type.dataSource().up();
      assertTrue(type.getDataSourceList().size() == 2);
      type.removeAllDataSource();
      assertTrue(type.getDataSourceList().size() == 0);
   }
   
   @Test
   public void testVersion() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      for(WebAppVersionType e: WebAppVersionType.values())
      {
         type.setVersion(e);
         assertEquals(type.getVersion(), e);
         type.setVersion(e.toString());
         assertEquals(type.getVersionAsString(), e.toString());
      }
   }
   
   @Test
   public void testMetadataComplete() throws Exception
   {
      WebFragment30Descriptor type = Descriptors.create(WebFragment30Descriptor.class);
      type.setMetadataComplete(true);
      assertTrue(type.isMetadataComplete());
      type.removeMetadataComplete();
      assertFalse(type.isMetadataComplete());
   }
}
