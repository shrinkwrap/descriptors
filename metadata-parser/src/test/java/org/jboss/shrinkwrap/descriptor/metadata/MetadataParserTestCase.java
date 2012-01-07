package org.jboss.shrinkwrap.descriptor.metadata;



import org.junit.Test;

public class MetadataParserTestCase
{

    @Test
    public void generateTestCase() throws Exception
    {
       
//       <pathToXsd>${basedir}/src/test/resources/xsd/datasources_1_0.xsd</pathToXsd>
//       <nameSpace>datasources</nameSpace>
//       <packageApi>org.jboss.datasources.api</packageApi>
//       <packageImpl>org.jboss.datasources.impl</packageImpl>
//       <elementName>datasources</elementName>
//       <elementType>datasources:datasourcesType</elementType>
//       <pathToApi>${basedir}/src/main/java</pathToApi>
//       <pathToImpl>${basedir}/src/main/java</pathToImpl>
//       <pathToTest>${basedir}/src/test/java</pathToTest>
//       <pathToServices>${basedir}/src/main/resources/META-INF/services</pathToServices>
       
        final MetadataParser parser = new MetadataParser(
                "src/test/resources/xsd/datasources_1_0.xsd",
                "datasources",
                "org.jboss.shrinkwrap.descriptor.api.datasources",
                "org.jboss.shrinkwrap.descriptor.impl.datasources", 
                "datasources", 
                "datasources:datasourcesType", "src1/java","src1/java","src1/test","src1/services", true);

        parser.parse();
        
        
//        experimental:
//        Metadata metadata = parser.getMetadata();
//        CodeGen codeGen = new CodeGen(metadata);
//        codeGen.generateEnums();
//        codeGen.generateInferfaces();
    }
}
