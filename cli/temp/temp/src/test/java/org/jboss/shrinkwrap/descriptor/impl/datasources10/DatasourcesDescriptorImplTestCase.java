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
import org.jboss.shrinkwrap.descriptor.api.datasources10.DatasourcesDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DriversType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.DriversTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DatasourceType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.DatasourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.XaDatasourceType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.XaDatasourceTypeImpl;

public class DatasourcesDescriptorImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      DatasourcesDescriptor type = Descriptors.create(DatasourcesDescriptor.class);
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDrivers() throws Exception
   {
      DatasourcesDescriptor type = Descriptors.create(DatasourcesDescriptor.class);
      type.getOrCreateDrivers().up();
      type.removeDrivers();
      assertNull(((DatasourcesDescriptorImpl)type).getRootNode().getSingle("drivers"));
   }
   
   @Test
   public void testDatasource() throws Exception
   {
      DatasourcesDescriptor type = Descriptors.create(DatasourcesDescriptor.class);
      type.getOrCreateDatasource().up();
      type.removeDatasource();
      assertNull(((DatasourcesDescriptorImpl)type).getRootNode().getSingle("datasource"));
   }
   
   @Test
   public void testXaDatasource() throws Exception
   {
      DatasourcesDescriptor type = Descriptors.create(DatasourcesDescriptor.class);
      type.getOrCreateXaDatasource().up();
      type.removeXaDatasource();
      assertNull(((DatasourcesDescriptorImpl)type).getRootNode().getSingle("xa-datasource"));
   }
}
