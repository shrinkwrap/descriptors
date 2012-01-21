package org.jboss.shrinkwrap.descriptor.metadata;



import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class MetadataParserTestCase
{

    @Test
    public void generateTestCase() throws Exception
    {
       
        final MetadataParser parser = new MetadataParser(
                "src/test/resources/dtd/jetty_7_configure.dtd",
                "/tmp/mmmm.xml",
                "datasources",
                "org.jboss.shrinkwrap.descriptor.api.datasources",
                "org.jboss.shrinkwrap.descriptor.impl.datasources", 
                "datasources", 
                "datasources:datasourcesType", 
                "src1/java","src1/java","src1/test","src1/services", true);

//       final MetadataParser parser = new MetadataParser(
//             "src/test/resources/dtd/configure.xsd",
//             "jetty6",
//             "org.jboss.shrinkwrap.descriptor.api.jetty6",
//             "org.jboss.shrinkwrap.descriptor.impl.jetty6", 
//             "Configure", 
//             "jetty6:Configure", "src1/java","src1/java","src1/test","src1/services", true);

       
        parser.parse();
        
//        
//        experimental:
//        Metadata metadata = parser.getMetadata();
//        CodeGen codeGen = new CodeGen(metadata);
//        codeGen.generateEnums();
//        codeGen.generateInferfaces();
    }
}
