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

package org.jboss.shrinkwrap.descriptor.metadata;



import java.util.ArrayList;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;


/**
 * Test class mainly for debugging. That's why it is disabled.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
@Ignore
public class MetadataParserTestCase
{

    @Test
    public void generateTestCase() throws Exception
    {
       
//        final MetadataParser parser = new MetadataParser(
//                "src/test/resources/dtd/jetty_7_configure.dtd",
//                "/tmp/mmmm.xml",
//                "datasources",
//                "org.jboss.shrinkwrap.descriptor.api.datasources",
//                "org.jboss.shrinkwrap.descriptor.impl.datasources", 
//                "datasources", 
//                "datasources:datasourcesType", 
//                "src1/java","src1/java","src1/test","src1/services", true);

       final MetadataParserPath path = new MetadataParserPath();
       final MetadataParserConfiguration conf = new MetadataParserConfiguration();
   
       conf.setNameSpace("javaee");
       conf.setDescriptorName("BeansDescriptor");
       conf.setElementName("beans");
       conf.setElementType("javaee:beans");
       conf.setPackageApi("org.jboss.descriptor.test.api");
       conf.setPackageImpl("org.jboss.descriptor.test.impl");
       conf.setPathToXsd("src/test/resources/xsd/testcases.xsd");
    
       final List<MetadataParserConfiguration> confList = new ArrayList<MetadataParserConfiguration>();
       confList.add(conf);
       
       final MetadataParser parser = new MetadataParser();
       parser.parse(path, confList, true);

        
//        
//        experimental:
//        Metadata metadata = parser.getMetadata();
//        CodeGen codeGen = new CodeGen(metadata);
//        codeGen.generateEnums();
//        codeGen.generateInferfaces();
    }
}
