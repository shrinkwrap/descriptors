package org.jboss.shrinkwrap.descriptor.metadata;



import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

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
