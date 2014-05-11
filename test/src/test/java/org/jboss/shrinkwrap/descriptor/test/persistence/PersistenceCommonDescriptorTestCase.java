package org.jboss.shrinkwrap.descriptor.test.persistence;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.persistence.PersistenceCommonDescriptor;
import org.jboss.shrinkwrap.descriptor.api.persistence10.PersistenceDescriptor;
import org.junit.Test;

public class PersistenceCommonDescriptorTestCase {

    @Test
    public void testPersistenceCommonDescriptorAPI() throws Exception {
        final PersistenceCommonDescriptor persistence = (PersistenceCommonDescriptor)create()
        		 .version("1.0")
                 .createPersistenceUnit()
                 .name("name1")
                 .description("description0")
                 .provider("provider0")
                 .jtaDataSource("jta-data-source0")
                 .nonJtaDataSource("non-jta-data-source0")
                 .mappingFile("mapping-file0")
                 .mappingFile("mapping-file1")
                 .jarFile("jar-file0")
                 .jarFile("jar-file1")
                 .clazz("class0")
                 .clazz("class1")
                 .excludeUnlistedClasses(true)
                 .transactionType("")
                 .up();
             
             persistence.getOrCreatePersistenceUnit().getOrCreateProperties()
                 .createProperty().name("name3").value("value1").up();
             
             
             persistence.getOrCreatePersistenceUnit()
             	 .name("name7")
                 .description("description1")
                 .provider("provider1")
                 .jtaDataSource("jta-data-source1")
                 .nonJtaDataSource("non-jta-data-source1")
                 .mappingFile("mapping-file2")
                 .mappingFile("mapping-file3")
                 .jarFile("jar-file2")
                 .jarFile("jar-file3")
                 .clazz("class2")
                 .clazz("class3")
                 .excludeUnlistedClasses(false)
                 .up();	  
    }

    // -------------------------------------------------------------------------------------||
    // Internal Helper ---------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||
    
    private PersistenceCommonDescriptor create() {
        return Descriptors.create(PersistenceDescriptor.class);
    }
}
