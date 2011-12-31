package org.jboss.shrinkwrap.descriptor.metadata;



import org.junit.Test;

public class MetadataParserTestCase
{

    @Test
    public void generateTestCase() throws Exception
    {
        final MetadataParser parser = new MetadataParser(
                "src/test/resources/xsd/ironjacamar_1_0.xsd",
                "ironjacamar",
                "org.jboss.shrinkwrap.descriptor.api.ironjacamar",
                "org.jboss.shrinkwrap.descriptor.impl.ironjacamar", 
                "ironjacamar", 
                "ironjacamar:ironjacamarType", "src1/java","src1/java","src1/test","src1/services", false);

        parser.parse();
//        Metadata metadata = parser.getMetadata();
//        CodeGen codeGen = new CodeGen(metadata);
//        codeGen.generateEnums();
//        codeGen.generateInferfaces();
    }
}
